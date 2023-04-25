function demo(){//declration
    console.log("Hi");//definition
}
demo();//calling
function sum(x,y){
    console.log(x+y);
}
sum(10,20);
function mul(x,y){
    return x*y;
}
console.log("Multiplication function "+mul(2,3));

let add=function (){
    return 5+2;
}
console.log(add);

let div=function(x,y){
    return x/y;
}
ans=div(30,4);
console.log(ans);

let min=(x,y)=>x-y
console.log(min(12,3));