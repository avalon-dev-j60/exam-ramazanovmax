<%@tag description="put the tag description here" pageEncoding="UTF-8"%>
<%@taglib prefix="common" tagdir="/WEB-INF/tags/common/"%>
<common:error/>
        
<form name="loginForm"  action="${pageContext.servletContext.contextPath}/login" method="post"> 
    <p class="row gap-bottom">
        <input type="email" name="email" value="${param.email}" placeholder="Email" required="">
    </p>
    <p class="row gap-bottom">
        <input type="password" name="password" placeholder="Password" required="">
    </p>
    <p class="row gap-bottom">
        <a href="${pageContext.servletContext.contextPath}/register">Регистрация</a>
        <button class="pull-right">Авторизация</button>
    </p>
</form>