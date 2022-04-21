<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>CafeSearch</title>

<style type="text/css">
.button{
	position:absolute;
	width:80px;
	height:25px;
	font-size:15px;
	left:50%;
	top:15%;
}
.border-style {
	
}
#padding{
	padding: 0px 0px 0px 15px;
}



</style>

<script type="text/javascript">
function click10() {
	
}
function click20() {
	
}
function click40() {
	
}
function click60() {
	
}
function click80() {
	
}
function click100() {
	
}
function click120() {
	
}
</script>
</head>
<body style='background-color:#EFEEEE'>
<form action='${requestUri}' method='get'>

 
<div>
<input type='text' class="border-style" id="padding"  
style='font-size:120%;position:absolute;left:50%;top:10%;
margin-top:-30px;margin-left:-300px;width:500px;height:45px' name='keyword' placeholder='請輸入關鍵字'
onfocus="placeholder= '' " onblur="placeholder='請輸入關鍵字'" />
</div>

<div>
<button type='button' class='button' name='buttonCafe' onclick='click10()' style='border-style:none ;cursor:pointer;margin-left:-240px'>不限時</button>
</div>
<div>
<button type='button' class='button' name='buttonDessert' onclick='click20()' style='border-style:none;cursor:pointer;margin-left:-160px'>甜點</button>
</div>
<div>
<button type='button' class='button' name='buttonCharge' onclick='click40()' style='border-style:none;cursor:pointer;margin-left:-80px'>插座</button>
</div>
<div>
<button type='button' class='button' name='buttonNight' onclick='click60()' style='border-style:none;cursor:pointer;margin-left:0px'>深夜</button>
</div>
<div>
<button type='button' class='button' name='buttonSilent' onclick='click80()' style='border-style:none;cursor:pointer;margin-left:80px'>安靜</button>
</div>
<div>
<button type='button' class='button' name='buttonBrunch' onclick='click100()' style='border-style:none;cursor:pointer;margin-left:160px'>早午餐</button>
</div>
<div>
<button type='button' class='button' name='buttonBeauty' onclick='click120()' style='border-style:none;cursor:pointer;margin-left:240px'>網美</button>
</div>

<div>
<input type='image' src="images/coffeeSearch.png" 
style='position:absolute;width:142px;height:45px;left:50%;top:10%;margin-top:-30px;
margin-left:230px '/>
</div>

<div>
<a href ='http://localhost:8080/Final_Project/TestProject'><img src="images/coffee2.png" style='position:absolute;width:310px;height:398px;left:30%;top:60%;margin-top:-175px;
margin-left:-125px '></a>
</div>
<div>
<a href ='http://localhost:8080/Final_Project/TestProject'><img src="images/coffee5.png" style='position:absolute;width:70px;height:70px;left:50%;top:10%;margin-top:-47px;
margin-left:-400px '></a>
</div>
<div>
<a href ='http://localhost:8080/Final_Project/TestProject'><img src="images/coffee6.png" style='position:absolute;width:382px;height:62px;left:70%;top:50%;margin-top:-80px;
margin-left:-275px '></a>
</div>
<div>
<a href ='http://localhost:8080/Final_Project/TestProject'><img src="images/coffee1.png" style='position:absolute;width:379px;height:248px;left:70%;top:80%;margin-top:-165px;
margin-left:-275px '></a>
</div>
</form>
</body>
</html>