<jsp:useBean id="product" scope="request" type="com.example.model.Product"/>
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
