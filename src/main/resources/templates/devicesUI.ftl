<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<h3>Laptop Grade Table</h3>
<table>
    <tr>
        <th>Laptop Brand</th>
        <th>Laptop Price</th>
        <th>Laptop RAM Size</th>
        <th>Laptop Processor Type</th>
    </tr>
    <#list devices as laptop>
    <tr>
        <td>${laptop.brandName}</td>
        <td>${laptop.price}</td>
        <td>${laptop.ramSize}</td>
        <td>${laptop.processorType}</td>
    <tr>
    </#list>
</table>
</body>
</html>