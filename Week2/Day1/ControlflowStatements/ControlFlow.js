// Variables
let num1 = 10;
let num2 = 5;
let str1 = "Hello";
let bool1 = true;

// If statement
if (num1 > num2) {
  console.log("num1 is greater than num2");
}

// If-else statement
if (num1 < num2) {
  console.log("num1 is less than num2");
} else {
  console.log("num1 is greater than or equal to num2");
}

// Ladder if-else statement
if (num1 === num2) {
  console.log("num1 and num2 are equal");
} else if (num1 > num2) {
  console.log("num1 is greater than num2");
} else {
  console.log("num1 is less than num2");
}

// Nested if-else statement
if (bool1) {
  if (str1 === "Hello") {
    console.log("bool1 is true and str1 is Hello");
  } else {
    console.log("bool1 is true but str1 is not Hello");
  }
} else {
  console.log("bool1 is false");
}

// Switch statement
let day = "Monday";
switch (day) {
  case "Monday":
    console.log("Today is Monday");
    break;
  case "Tuesday":
    console.log("Today is Tuesday");
    break;
  case "Wednesday":
    console.log("Today is Wednesday");
    break;
  default:
    console.log("Invalid day");
}

// Loops

// do..while loop
let i = 0;
do {
  console.log(i);
  i++;
} while (i < 5);

// while loop
i = 0;
while (i < 5) {
  console.log(i);
  i++;
}

// for loop
for (let j = 0; j < 5; j++) {
  console.log(j);
}

// for..in loop
let obj = { a: 1, b: 2, c: 3 };
for (let prop in obj) {
  console.log(prop + ": " + obj[prop]);
}

// for..of loop
let arr = [1, 2, 3, 4, 5];
for (let element of arr) {
  console.log(element);
}

// forEach loop
arr.forEach(function (element) {
  console.log(element);
});
