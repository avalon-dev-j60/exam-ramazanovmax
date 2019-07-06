<%@tag description="put the tag description here" pageEncoding="UTF-8"%>
<%@taglib prefix="common" tagdir="/WEB-INF/tags/common/"%>
<%-- The list of normal or fragment attributes can be specified here: --%>
<%@attribute name="title" required="true"%>

<!DOCTYPE html>
<html>
    <head>
        <title>
            ${title}
        </title>
            <link href="${pageContext.servletContext.contextPath}/css/groundwork-setup.css" type="text/css" rel="stylesheet">
            <link href="${pageContext.servletContext.contextPath}/css/style.css" type="text/css" rel="stylesheet">

    </head>
    <body>
        <article class="two thirds centered padded">
         
          
            <header class="gap-bottom">
                <common:navigation/>
            </header>
            <section class="justify">
            <jsp:doBody/>
            </section>
        </article>
    </body>
</html>