<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<body>
    <h2>Hello World!</h2>
    <ul>
        <li><a href="<c:url value='/' />">HOME</a> </li>
        <li>-------------------------------</li>
        <li><a href="<c:url value='/swagger-ui.html' />">swagger-ui</a> </li>
    </ul>
</body>
</html>
