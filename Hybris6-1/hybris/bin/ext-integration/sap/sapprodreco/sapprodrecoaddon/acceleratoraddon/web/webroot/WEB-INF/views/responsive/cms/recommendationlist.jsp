<!--
 [y] hybris Platform

 Copyright (c) 2000-2016 SAP SE or an SAP affiliate company.
 All rights reserved.

 This software is the confidential and proprietary information of SAP
 ("Confidential Information"). You shall not disclose such Confidential
 Information and shall use it only in accordance with the terms of the
 license agreement you entered into with SAP.
-->

<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="theme" tagdir="/WEB-INF/tags/shared/theme" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="format" tagdir="/WEB-INF/tags/shared/format" %>
<%@ taglib prefix="product" tagdir="/WEB-INF/tags/desktop/product" %>
<%@ taglib prefix="component" tagdir="/WEB-INF/tags/shared/component" %>

<c:set var="ulid" value="recommendationUL${recoId}"/>

<jsp:useBean id="random" class="java.util.Random" scope="application"/>
<c:set var="divId" value="div${random.nextInt(1000)}"/>

<c:if test="${not empty productReferences}">
    <div id="${divId}" class="headline">${title}</div>
    <div id="${ulid}" class="carousel">
        <c:forEach items="${productReferences}" var="productReference">
            <div class="item">
                <c:url value="${productReference.target.url}" var="productQuickViewUrl"/>
                <a href="${productQuickViewUrl}"
                   onclick="registerClickthrough('${divId}', '${productReference.target.code}', '${leadingitemdstype}', '${recoType}', '${productQuickViewUrl}', event.target.src)">
                    <div class="thumb">
                        <product:productPrimaryImage product="${productReference.target}" format="product"/>
                    </div>
                    <div class="item-name">${productReference.target.name}</div>
                    <div class="item-price"><format:fromPrice priceData="${productReference.target.price}"/></div>
                </a>
            </div>
        </c:forEach>
    </div>
</c:if>

