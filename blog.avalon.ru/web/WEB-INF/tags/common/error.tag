
<%@tag description="put the tag description here" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@attribute name="error"%>
<c:if test="${not empty error}">
    <div class="box error gap-bottom">
        ${error}
    </div>
</c:if>
