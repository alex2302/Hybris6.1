/*
 * [y] hybris Platform
 *
 * Copyright (c) 2000-2016 SAP SE or an SAP affiliate company.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of SAP
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with SAP.
 *
 *
 */
angular.module('personalizationsmarteditContextMenu', [
        'modalServiceModule',
        'personalizationsmarteditRestServiceModule',
        'personalizationsmarteditCommons',
        'ui.select',
        'genericEditorModule',
        'editorModalServiceModule',
        'gatewayProxyModule',
        'personalizationsmarteditContextServiceModule',
        'personalizationsmarteditcontainermodule'
    ])
    .factory('personalizationsmarteditContextModal', function($controller, modalService, MODAL_BUTTON_ACTIONS, MODAL_BUTTON_STYLES, $filter, personalizationsmarteditMessageHandler, gatewayProxy, personalizationsmarteditContextService, personalizationsmarteditIFrameUtils) {

        var PersonalizationsmarteditContextModal = function() {
            this.gatewayId = "personalizationsmarteditContextModal";
            gatewayProxy.initForService(this);
        };

        var modalButtons = [{
            id: 'cancel',
            label: "personalization.modal.button.cancel",
            style: MODAL_BUTTON_STYLES.SECONDARY,
            action: MODAL_BUTTON_ACTIONS.DISMISS
        }, {
            id: 'submit',
            label: "personalization.modal.button.submit",
            action: MODAL_BUTTON_ACTIONS.CLOSE
        }];

        PersonalizationsmarteditContextModal.prototype.openDeleteAction = function(componentType, componentId, containerId, slotId, actionId) {
            modalService.open({
                size: 'md',
                title: 'personalization.modal.deleteaction.title',
                templateInline: '<div id="confirmationModalDescription">{{ "' + "personalization.modal.deleteaction.content" + '" | translate }}</div>',
                controller: ['$scope', 'modalManager', function($scope, modalManager) {
                    $scope.componentType = componentType;
                    $scope.componentId = componentId;
                    $scope.actionId = actionId;
                    $scope.modalManager = modalManager;
                    angular.extend(this, $controller('modalDeleteActionController', {
                        $scope: $scope
                    }));
                }],
                buttons: [{
                    id: 'confirmCancel',
                    label: 'personalization.modal.button.cancel',
                    style: MODAL_BUTTON_STYLES.SECONDARY,
                    action: MODAL_BUTTON_ACTIONS.DISMISS
                }, {
                    id: 'confirmOk',
                    label: 'personalization.modal.button.ok',
                    action: MODAL_BUTTON_ACTIONS.CLOSE
                }]
            }).then(function(result) {
                var previewData = personalizationsmarteditContextService.getSePreviewData();
                personalizationsmarteditIFrameUtils.reloadPreview(previewData.resourcePath, previewData.previewTicketId);
                personalizationsmarteditContextService.selectedComponents.splice(personalizationsmarteditContextService.selectedComponents.indexOf(containerId), 1);
            });
        };

        PersonalizationsmarteditContextModal.prototype.openAddAction = function(componentType, componentId, containerId, slotId, actionId) {
            modalService.open({
                title: "personalization.modal.addaction.title",
                templateUrl: 'web/features/personalizationsmarteditcontainer/contextMenu/personalizationsmarteditAddEditActionTemplate.html',
                controller: ['$scope', 'modalManager', function($scope, modalManager) {
                    $scope.componentType = componentType;
                    $scope.componentId = componentId;
                    $scope.containerId = containerId;
                    $scope.slotId = slotId;
                    $scope.actionId = actionId;
                    $scope.modalManager = modalManager;
                    angular.extend(this, $controller('modalAddEditActionController', {
                        $scope: $scope
                    }));
                    angular.extend(this, $controller('modalAddActionController', {
                        $scope: $scope
                    }));
                }],
                buttons: modalButtons
            }).then(function(result) {
                var previewData = personalizationsmarteditContextService.getSePreviewData();
                personalizationsmarteditIFrameUtils.reloadPreview(previewData.resourcePath, previewData.previewTicketId);
                personalizationsmarteditContextService.selectedComponents.push(result);
            }, function(failure) {});
        };

        PersonalizationsmarteditContextModal.prototype.openEditAction = function(componentType, componentId, containerId, slotId, actionId) {
            modalService.open({
                title: "personalization.modal.editaction.title",
                templateUrl: 'web/features/personalizationsmarteditcontainer/contextMenu/personalizationsmarteditAddEditActionTemplate.html',
                controller: ['$scope', 'modalManager', function($scope, modalManager) {
                    $scope.componentType = componentType;
                    $scope.componentId = componentId;
                    $scope.containerId = containerId;
                    $scope.slotId = slotId;
                    $scope.actionId = actionId;
                    $scope.modalManager = modalManager;
                    angular.extend(this, $controller('modalAddEditActionController', {
                        $scope: $scope
                    }));
                    angular.extend(this, $controller('modalEditActionController', {
                        $scope: $scope
                    }));
                }],
                buttons: modalButtons
            }).then(function(result) {
                var previewData = personalizationsmarteditContextService.getSePreviewData();
                personalizationsmarteditIFrameUtils.reloadPreview(previewData.resourcePath, previewData.previewTicketId);
            });
        };

        PersonalizationsmarteditContextModal.prototype.openInfoAction = function() {
            personalizationsmarteditMessageHandler.sendError($filter('translate')('personalization.modal.infoaction.content'));
        };

        return new PersonalizationsmarteditContextModal();

    })
    .controller('modalAddEditActionController', function($scope, $filter, $q, editorModalService, personalizationsmarteditContextService, personalizationsmarteditRestService, personalizationsmarteditMessageHandler) {
        $scope.selectedCustomization = personalizationsmarteditContextService.selectedCustomizations;
        $scope.selectedVariation = personalizationsmarteditContextService.selectedVariations;

        $scope.actions = [{
            id: "create",
            name: $filter('translate')("personalization.modal.addeditaction.createnewcomponent")
        }, {
            id: "use",
            name: $filter('translate')("personalization.modal.addeditaction.usecomponent")
        }];

        $scope.newComponentTypes = [{
            id: "paragraph",
            name: $filter('translate')("personalization.modal.addeditaction.createnewcomponent.paragraph"),
            type: "CMSParagraphComponent"
        }, {
            id: "simplebanner",
            name: $filter('translate')("personalization.modal.addeditaction.createnewcomponent.simplebanner"),
            type: "SimpleBannerComponent"
        }, {
            id: "simpleresponsivebanner",
            name: $filter('translate')("personalization.modal.addeditaction.createnewcomponent.simpleresponsivebanner"),
            type: "SimpleResponsiveBannerComponent"
        }];

        $scope.newComponentTypeSelectedEvent = function($item, $model) {
            personalizationsmarteditRestService.createComponent("name", $scope.newComponent.selected.type, personalizationsmarteditContextService.getPageId(), null)
                .then(function(response) {
                    var sourceComponentId = response.uid;
                    editorModalService.open(response.typeCode, sourceComponentId).then(
                        function(response) {
                            personalizationsmarteditRestService.getComponent(response.uid).then(function successCallback(resp) {
                                $scope.component.selected = resp;
                                $scope.components.push(resp);
                            }, function errorCallback(resp) {
                                personalizationsmarteditMessageHandler.sendError($filter('translate')('personalization.error.gettingcomponents'));
                            });

                            $scope.action = {
                                selected: $filter('filter')($scope.actions, {
                                    id: "use"
                                }, true)[0]
                            };
                        },
                        function(response) {
                            $scope.newComponent = {};
                            personalizationsmarteditRestService.removeComponent(sourceComponentId, $scope.slotId).then(function() {}, function() {
                                personalizationsmarteditMessageHandler.sendError($filter('translate')('personalization.error.removingcomponent'));
                            });
                        });
                }, function() {
                    personalizationsmarteditMessageHandler.sendError($filter('translate')('personalization.error.creatingcomponent'));
                });

        };

        $scope.newComponent = {};
        $scope.component = {};
        $scope.components = [];
        personalizationsmarteditRestService.getComponents().then(function successCallback(response) {
            var regExp = /container/i;
            $scope.components = response.componentItems.filter(function(elem) {
                return !elem.typeCode.match(regExp);
            });
            if ($scope.editEnabled) {
                $scope.component = {
                    selected: $filter('filter')($scope.components, {
                        uid: $scope.componentId
                    }, true)[0]
                };
            }
        }, function errorCallback(response) {
            personalizationsmarteditMessageHandler.sendError($filter('translate')('personalization.error.gettingcomponents'));
        });

        var editAction = function(customizationId, variationId, actionId, componentId) {
            var deferred = $q.defer();
            personalizationsmarteditRestService.editAction(customizationId, variationId, actionId, componentId).then(
                function successCallback(response) {
                    personalizationsmarteditMessageHandler.sendInformation($filter('translate')('personalization.info.updatingaction'));
                    deferred.resolve();
                },
                function errorCallback(response) {
                    personalizationsmarteditMessageHandler.sendError($filter('translate')('personalization.error.updatingaction'));
                    deferred.reject();
                });
            return deferred.promise;
        };

        var addActionToContainer = function(componentId, containerId, customizationId, variationId) {
            var deferred = $q.defer();
            personalizationsmarteditRestService.addActionToContainer(componentId, containerId, customizationId, variationId).then(
                function successCallback(response) {
                    personalizationsmarteditMessageHandler.sendInformation($filter('translate')('personalization.info.creationgaction'));
                    deferred.resolve(containerId);
                },
                function errorCallback(response) {
                    personalizationsmarteditMessageHandler.sendError($filter('translate')('personalization.error.creatingaction'));
                    deferred.reject();
                });
            return deferred.promise;
        };

        var buttonHandlerFn = function(buttonId) {
            if (buttonId === 'submit') {
                if ($scope.editEnabled) {
                    return editAction($scope.selectedCustomization.code, $scope.selectedVariation.code, $scope.actionId, $scope.component.selected.uid);
                } else {
                    if ($scope.containerId) {
                        return addActionToContainer($scope.component.selected.uid, $scope.containerId, $scope.selectedCustomization.code, $scope.selectedVariation.code);
                    } else {
                        return personalizationsmarteditRestService.replaceComponentWithContainer($scope.componentId, $scope.slotId).then(
                            function successCallback(result) {
                                return addActionToContainer($scope.component.selected.uid, result.uid, $scope.selectedCustomization.code, $scope.selectedVariation.code);
                            },
                            function errorCallback(response) {
                                personalizationsmarteditMessageHandler.sendError($filter('translate')('personalization.error.replacingcomponent'));
                                return $q.defer().reject();
                            });
                    }
                }
            }
            return $q.defer().reject();
        };
        $scope.modalManager.setButtonHandler(buttonHandlerFn);

        $scope.$watch('action.selected', function(newValue, oldValue) {
            if (newValue !== oldValue) {
                $scope.component.selected = undefined;
            }
        }, true);

        $scope.$watch('component.selected', function(newValue, oldValue) {
            $scope.modalManager.disableButton("submit");
            if (newValue !== undefined) {
                $scope.modalManager.enableButton("submit");
            }
        }, true);

    })
    .controller('modalAddActionController', function($scope) {
        $scope.editEnabled = false;
        $scope.action = {};
    })
    .controller('modalEditActionController', function($scope, $filter) {
        $scope.editEnabled = true;
        $scope.action = {
            selected: $filter('filter')($scope.actions, {
                id: "use"
            }, true)[0]
        };
    })
    .controller('modalDeleteActionController', function($scope, $q, personalizationsmarteditContextService, personalizationsmarteditRestService) {
        $scope.selectedVariation = personalizationsmarteditContextService.selectedVariations;
        $scope.selectedCustomization = personalizationsmarteditContextService.selectedCustomizations;
        var buttonHandlerFn = function(buttonId) {
            if (buttonId === 'confirmOk') {
                return personalizationsmarteditRestService.deleteAction($scope.selectedCustomization.code, $scope.selectedVariation.code, $scope.actionId);
            }
            return $q.defer().reject();
        };
        $scope.modalManager.setButtonHandler(buttonHandlerFn);
    });
