<%-- 
    Document   : navigation
    Created on : 15.06.2019, 13:10:29
    Author     : makram
--%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@tag description="put the tag description here" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="context" value="${pageContext.servletContext.contextPath}"/>
<%@tag import="ru.avalon.blog.services.*"%>

<fmt:setBundle basename="resources.labels"/>

<nav class="" title="SoftwireDev">
    <ul>
        <li>
            <a href="${context}/"><fmt:message key="label.blog"/></a>
        </li>
        <li>
            <a href="${context}/author.jsp"><fmt:message key="label.author"/></a>
        </li>
        <li>
            <a href="${context}/contacts.jsp"><fmt:message key="label.contacts"/></a>
        </li>
        <li class="pull-right">
            <c:choose>
                <c:when test="${empty sessionScope.user}">
                    <a href="${context}/login"><fmt:message key="label.sign-in.title"/></a> 
                </c:when>
                <c:otherwise>
                    <a href="${context}/logout"><fmt:message key="label.sign-out"/>  </a> 
                </c:otherwise>
            </c:choose>
        </li>
    </ul>
</nav>