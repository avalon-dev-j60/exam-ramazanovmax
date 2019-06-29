<%-- 
    Document   : navigation
    Created on : 15.06.2019, 13:10:29
    Author     : makram
--%>
<%@tag description="put the tag description here" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="context" value="${pageContext.servletContext.contextPath}"/>
<nav class="" title="SoftwireDev">
    <ul>
        <li>
            <a href="${context}/">Blog</a>
        </li>
        <li>
            <a href="${context}/author.jsp">Автор</a>
        </li>
        <li>
            <a href="${context}/contacts.jsp">Контакты</a>
        </li>
        <li class="pull-right">
            <c:choose>
                <c:when test="${empty sessionScope.user}">
                    <a href="${context}/login">Войти</a> 
                </c:when>
                <c:otherwise>
                    <a href="${context}/logout">Выйти</a> 
                </c:otherwise>
            </c:choose>
        </li>
    </ul>
</nav>