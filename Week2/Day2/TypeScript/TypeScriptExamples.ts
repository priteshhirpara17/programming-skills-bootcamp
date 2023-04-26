/*
install npm
npm install -g typescript
npm install -g ts-node
*/

let x="hello";

console.log(x);

let y :String="jhon doe";
console.log(y);

let z:any=10;
console.log(typeof z);
z="Hello";
console.log(typeof z);

const students:string[]=[];//array declearatioin 
students.push("A");
students.push("B");
console.log(students);

let states: readonly string[]=["gujarat"];
//states.push("panjab");//can not add items in readonly array
console.log(states);


function add(): number{
    return 5+2;
}

console.log(add());

function hello():void{
    console.log("hello world!");
}

function sum(x :number,y :number):number{
    return x+y;
}
console.log(sum(10,2));

function mul(a:number,b:number,c?:number):number{
    return a*b*(c||1);
}
console.log(mul(5,2,3));