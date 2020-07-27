<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>

<h1>${test}</h1>
<h1>${joinVO.id}</h1>
<h1>${joinVO.name}</h1>
<h1>${joinVO.pw}</h1>

</body>
</html>
