// we are using let instead of var
/*
let _firstName='John';
let age=78;
const _MAX=100;
_firstName=true;
console.log(_firstName);
console.log(age);

console.log(_MAX);
let num = 10;

console.log(num);

// Increment operator
num++; // num = num + 1

console.log(num);

var num2 = 10;

console.log(num2);

// Decrement operator
num2--; // num2 = num2 - 1

console.log(num2);

let num3 = 40;

console.log(num3);

console.log(--num3);

console.log(num3);

*/
//////////////////////////////////////////////////////////////
/*
let var1 = 9;
let var2 = 9;
 
// Equal ===
console.log(var1 === var2);
 
// Not Equal !=
console.log(var1 != var2);
 
// Greater than >
console.log(var1 > var2);
 
// Less than <
console.log(var1 < var2);
 
// Greater than or equal to >=
console.log(var1 >= var2);
 
// Less than or equal to <=
console.log(var1 <= var2);
*/
///////////////////////////////////////////////
/*
//Ternary operator
let num1 = 100;
let num2 = 1000;
 
let result = (num1 < num2) ? "yay" : "nay";
 
console.log(result);

*/

///// recommended single quotes in console log//////////
/*

let num1 = 314;
let num2 = 314;
 
if (num1 < num2)
{
    console.log('Num1 is less than Num2');
}
else if (num1 > num2)
{
    console.log("Num1 is greater than Num2");
}
else
{
    console.log("Default fallback code");
}

*/

////////loops/////

/*
for (var i = 90; i <= 100; i += 2)
{
    console.log("This is position for I: " + i);
}
 
var j = 90;
 
while (j <= 100)
{
    console.log("This is position for J: " + j);
    j += 2;
}
 
var k = 90;
 
do
{
    console.log("This is position for K: " + k);
    k += 2;
} while (k <= 100);

*/
/////////////////////////////switch case //////////////////////

let awesomeVar = 0;
 
switch (awesomeVar)
{
    case 0:
    console.log("This is 0");
   
    break;
 
    case 1:
    console.log("This is 1");
  
    break;
 
    case 2:
    console.log("This is 2");
   
    break;
 
    case 3:
    console.log("This is 3");
    break;
 
    case 4:
    console.log("This is 4");
    break;
 
    case 5:
    console.log("This is 5");
    break;
 
    default:
    console.log("This is the default value");
    break;
}

/////////////////// Function ///////////////////////


function _myFunction()
{
    let a=100;
    let b=200;
    return('addition of a and b is: ',(a+b));
}
 
let result=_myFunction();
console.log(result);
 
function AwesomeFunc()
{
    console.log("Hello");
    console.log("and");
    console.log("Goodbye");
}
 
function Sum(num1, num2)
{
    let result = num1 + num2;
 
    console.log(result);
}
 
function SumReturn(num1, num2)
{
    let result = num1 + num2;
 
    return result;
}
 
AwesomeFunc();
Sum(4, 7);
console.log(SumReturn(5, 9));
 
let epicVar = SumReturn(2, 100);
 
console.log(epicVar);