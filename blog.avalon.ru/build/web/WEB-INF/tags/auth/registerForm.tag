<%-- 
    Document   : register
    Created on : 29.06.2019, 12:48:45
    Author     : makram
--%>

<%@tag description="put the tag description here" pageEncoding="UTF-8"%>
<%@taglib prefix="common" tagdir="/WEB-INF/tags/common/"%>

<common:error/>

<form action="${pageContext.servletContext.contextPath}/register" method="post">
    <p class="row gap-bottom">
        <input type="email"
               name="email"
               placeholder="Email"
               value="${param.email}"
               required>
    </p>
    <p class="row gap-bottom">
        <input type="password"
               name="password"
               placeholder="Пароль"
               required>
    </p>
    <p class="row gap-bottom">
        <input type="password"
               name="confirm"
               placeholder="Подтверждение пароля"
               required>
    </p>
    <p class="row gap-bottom">
        <button class="pull-right">Регистрация</button>
    </p>
</form>