<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
input {
	border-radius: 15px;
}
form {
	text-align: center;
    position: absolute;
    top: 35%;
    width: 100%;

}
button {
    background-color: #4CAF50;
    border: none;
    color: white;
    padding: 15px 32px;
    text-align: center;
    text-decoration: none;
    display: inline-block;
    font-size: 16px;
    margin: 4px 2px;
    cursor: pointer;
}
</style>
    <title>구구단</title>
</head>
<body>
<form action="gugudan.nhn" method="post">
<p>단 : <input name="dan" type="text" /></p>
<p>줄 : <input name="row" type="text"/></p> 
<button>계산</button> 
</form>
</body>
</html>