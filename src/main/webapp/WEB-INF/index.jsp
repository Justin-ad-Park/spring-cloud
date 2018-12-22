<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<body>
<H2>== Header ==</H2>
    <h2>Hello World!</h2>
    <ul>
        <li><a href="<c:url value='/' />">HOME</a></li>
        <li>-------------------------------</li>
        <li><a href="<c:url value='/swagger-ui.html' />">swagger-ui</a></li>
        <li>-- Spring boot actuator --</li>
        <li><a href="<c:url value='/beans'/>">beans</a></li>
        <li><a href="<c:url value='/env'/>">env</a></li>
        <li><a href="<c:url value='/health'/>">health</a></li>
        <li><a href="<c:url value='/info'/>">info</a></li>
        <li><a href="<c:url value='/loggers'/>">loggers</a></li>
        <li><a href="<c:url value='/metrics'/>">metrics</a></li>
        <li><a href="<c:url value='/trace'/>">trace</a></li>

    </ul>
</body>
</html>
