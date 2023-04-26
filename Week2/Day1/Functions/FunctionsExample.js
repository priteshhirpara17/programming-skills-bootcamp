// Function Declaration
function add(a, b) {
    return a + b;
  }
  
  // Function Expression
  const subtract = function(a, b) {
    return a - b;
  };
  
  // Arrow Function Expression
  const multiply = (a, b) => {
    return a * b;
  };
  
  // Arrow Function Expression with Implicit Return
  const divide = (a, b) => a / b;
  
  // IIFE (Immediately Invoked Function Expression)
  (function() {
    console.log('Hello, World!');
  })();
  
  // Named Function Expression
  const factorial = function factorial(n) {
    return n < 2 ? 1 : n * factorial(n - 1);
  };
  
  // Default Parameter Function
  function greet(name = 'World') {
    console.log(`Hello, ${name}!`);
  }
  
  // Rest Parameter Function
  function sum(...numbers) {
    return numbers.reduce((total, number) => total + number, 0);
  }
  
  // Spread Operator Function
  function concatenate(array1, array2) {
    return [...array1, ...array2];
  }
  
  // Callback Function
  function doSomething(callback) {
    console.log('Doing something...');
    callback();
  }
  
  // Higher Order Function
  function multiplyBy(number) {
    return function(x) {
      return x * number;
    };
  }
  