
var newarr=[1,2,3,6,9,8,7,4];

function modify()
{
    newarr.unshift(newarr.pop());
    document.getElementById('btn1').innerHTML =newarr[0];
    document.getElementById('btn2').innerHTML =newarr[1] ;
    document.getElementById('btn3').innerHTML =newarr[2];
    document.getElementById('btn6').innerHTML =newarr[3];
    document.getElementById('btn9').innerHTML =newarr[4];
    document.getElementById('btn8').innerHTML =newarr[5];
    document.getElementById('btn7').innerHTML =newarr[6];
    document.getElementById('btn4').innerHTML =newarr[7];
    
}
