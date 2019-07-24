function addNumbers() {
    var num1 = parseInt(document.getElementById("number1").value);
    var num2 = parseInt(document.getElementById("number2").value);
    var result=document.getElementById("result");
    result.value=num1 + num2;
    console.log("a");
}

function subNumbers() {
    var num1 = parseInt(document.getElementById("number1").value);
    var num2 = parseInt(document.getElementById("number2").value);
    var result=document.getElementById("result");
    result.value=num1 - num2;
}

function multiplyNumbers() {
    var num1 = parseInt(document.getElementById("number1").value);
    var num2 = parseInt(document.getElementById("number2").value);
    var result=document.getElementById("result");
    result.value=num1 *num2;
}
function divideNumbers() {
    var num1 = parseInt(document.getElementById("number1").value);
    var num2 = parseInt(document.getElementById("number2").value);
    var result=document.getElementById("result");
    result.value=num1 / num2;
}
function falsedisabled(){
   
    document.getElementById("add").disabled=false;
    document.getElementById("sub").disabled=false;
    document.getElementById("mul").disabled=false;
    document.getElementById("div").disabled=false;
    }
