<%-- 
    Document   : register
    Created on : 29.06.2019, 13:02:20
    Author     : makram
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="common"  tagdir="/WEB-INF/tags/common/"%>
<%@taglib prefix="auth" tagdir="/WEB-INF/tags/auth/"%>

<common:layout title="Регистрация">
    <div>
        <h2>Регистрация</h2>
        <auth:registerForm/>
    </div>
</common:layout>
