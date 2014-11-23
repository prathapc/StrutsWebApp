<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<title>Hello World</title>
</head>
<body>
   Hello World, <s:property value="name"/>
   <h2>Value stack detials</h2>
   <s:property value="key1"/>
   <s:property value="key2"/>
</body>
</html>