
<%@tag description="put the tag description here" pageEncoding="UTF-8"%>.
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<fmt:setBundle basename="resources.errors"/>

<%@attribute name="error"%>

<c:if test="${not empty error}">
    <div class="box error gap-bottom">
        <fmt:message key="${error}"/>
    </div>
</c:if>
