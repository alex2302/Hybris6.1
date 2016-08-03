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
describe('Test Personalizationsmartedit Container Context Menu Module', function() {
    var mockModules = {};
    setupMockModules(mockModules);

    var personalizationsmarteditContextModal, modalService, modalManager, scope, controller;
    var mockComponentList = ['component1', 'component2'];

    beforeEach(function() {
        module(function($provide) {
            $provide.value('translateFilter', function(value) {
                return value;
            });
        });
    });

    beforeEach(module('personalizationsmarteditRestServiceModule', function($provide) {
        mockModules.personalizationsmarteditRestService = jasmine.createSpyObj('personalizationsmarteditRestService', ['getComponents']);
        $provide.value('personalizationsmarteditRestService', mockModules.personalizationsmarteditRestService);
    }));

    beforeEach(module('personalizationsmarteditContextMenu'));
    beforeEach(inject(function(_$rootScope_, _$q_, _$controller_, _personalizationsmarteditContextModal_, _modalService_) {
        personalizationsmarteditContextModal = _personalizationsmarteditContextModal_;
        modalService = _modalService_;
        controller = _$controller_;
        modalManager = {
            setButtonHandler: function(val) {}
        };
        spyOn(modalManager, 'setButtonHandler').andCallThrough();

        mockModules.modalService.open.andCallFake(function() {
            return _$q_.defer().promise;
        });

        scope = _$rootScope_.$new();
        scope.componentId = "mockComponentId";
        scope.modalManager = modalManager;

        mockModules.personalizationsmarteditRestService.getComponents.andCallFake(function() {
            var deferred = _$q_.defer();
            deferred.resolve({
                components: mockComponentList
            });
            return deferred.promise;
        });

    }));

    it('GIVEN that personalizationsmartedit context modal module is instantiated it contains proper functions', function() {
        expect(personalizationsmarteditContextModal.openDeleteAction).toBeDefined();
        expect(personalizationsmarteditContextModal.openAddAction).toBeDefined();
        expect(personalizationsmarteditContextModal.openEditAction).toBeDefined();
    });

    it('GIVEN that modal for delete action is open, proper functions should be called', function() {
        personalizationsmarteditContextModal.openDeleteAction("mockComponentType", "mockComponentId");
        expect(modalService.open).toHaveBeenCalled();
    });

    it('GIVEN that modalDeleteActionController properties in scope are instantiated properly', function() {
        controller('modalDeleteActionController', {
            $scope: scope
        });
        personalizationsmarteditContextModal.openDeleteAction("mockComponentType", "mockComponentId");
        expect(scope.selectedVariation).toBeDefined();
        expect(scope.selectedCustomization).toBeDefined();
        expect(scope.modalManager.setButtonHandler).toHaveBeenCalled();
    });

    it('GIVEN that modal for add action is open, proper functions should be called', function() {
        personalizationsmarteditContextModal.openAddAction("mockComponentType", "mockComponentId");
        expect(modalService.open).toHaveBeenCalled();
    });

    it('GIVEN that modalAddActionController properties in scope are instantiated properly', function() {
        controller('modalAddEditActionController', {
            $scope: scope
        });
        controller('modalAddActionController', {
            $scope: scope
        });
        personalizationsmarteditContextModal.openAddAction("mockComponentType", "mockComponentId");
        expect(scope.selectedVariation).toBeDefined();
        expect(scope.selectedCustomization).toBeDefined();
        expect(scope.actions).toBeDefined();
        expect(scope.newComponentTypeSelectedEvent).toBeDefined();
        expect(scope.component).toBeDefined({});
        expect(scope.newComponent).toBeDefined({});
        expect(scope.newComponentTypes).toBeDefined({});
        expect(scope.components).toBeDefined([]);
        expect(scope.modalManager.setButtonHandler).toHaveBeenCalled();
        expect(scope.editEnabled).toBe(false);
        expect(scope.action).toEqual({});
    });

    it('GIVEN that modal for edit action is open, proper functions should be called', function() {
        personalizationsmarteditContextModal.openEditAction("mockComponentType", "mockComponentId");
        expect(modalService.open).toHaveBeenCalled();
    });

    it('GIVEN that modalEditActionController properties in scope are instantiated properly', function() {
        controller('modalAddEditActionController', {
            $scope: scope
        });
        controller('modalEditActionController', {
            $scope: scope
        });
        personalizationsmarteditContextModal.openEditAction("mockComponentType", "mockComponentId");
        expect(scope.selectedVariation).toBeDefined();
        expect(scope.selectedCustomization).toBeDefined();
        expect(scope.actions).toBeDefined();
        expect(scope.newComponentTypeSelectedEvent).toBeDefined();
        expect(scope.component).toBeDefined({});
        expect(scope.newComponent).toBeDefined({});
        expect(scope.newComponentTypes).toBeDefined({});
        expect(scope.components).toBeDefined([]);
        expect(scope.modalManager.setButtonHandler).toHaveBeenCalled();
        expect(scope.editEnabled).toBe(true);
        expect(scope.action).not.toEqual({});
    });

});
