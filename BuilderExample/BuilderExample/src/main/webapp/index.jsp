<jsp:useBean id="product" scope="request" type="com.example.model.Product"/>
<%--<html>--%>
<%--<body>--%>
<%--<h2>Hello World!</h2>--%>
<%--</body>--%>
<%--</html>--%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Product Details</title>
</head>
<body>
    <h1>Product Details</h1>
    <p>Name: ${product.name}</p>
    <p>Price: ${product.price}</p>
</body>
</html>