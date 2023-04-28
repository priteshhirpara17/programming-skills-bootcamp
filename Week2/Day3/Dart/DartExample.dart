import 'dart:io';

void main() {
  print("Hello");
  var x = "DEMO";
  var y = 20;
  int z = 30;
  //double
  //float
  //bool
  print("X is ${x} and y is ${y}");

  print("Enter your name");

  var data = stdin.readLineSync();

  print("Your name is ${data}");

  print("Enter your age");
  int age = int.parse(stdin.readLineSync()!);
  print("Your age is ${age + 2}");

  if (age < 18) {
    print("Child");
  } else {
    print("Adult");
  }
  while (age >= 0) {
    print(age);
    //age-=1;
    age--;
  }
  sum(10, 20);
  add(5, 2, c: 4);
  var st = new Student();
  st.setName();
  st.getName();
  st.myname();
}

void sum(x, y) {
  print("Total is ${x + y}");
}

void add(a, b, {c: 0}) {
  print("Total is ${a + b + c}");
}

void mul(a, b, [c]) {}

class Student {
  var name = "jhon doe";
  void setName() {
    print("Enter Name");
    name = stdin.readLineSync()!;
  }

  void getName() {
    print("Your name ${name}");
  }

  void myname() => print("My Name is ${name}");
}
