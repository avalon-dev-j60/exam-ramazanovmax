
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="common" tagdir="/WEB-INF/tags/common/"%>
<%@taglib prefix="auth" tagdir="/WEB-INF/tags/auth/" %>
<common:layout title="Sign in">
    <div class="one half centered">
        <h2>Авторизация</h2>
        <auth:loginForm/>
    </div>
</common:layout>
