//Coding With John - 15min Crash Course on Java

//Variables store store data
//Inside the Method or Function you have your main, which basically controls what that Method does when you call it
// int is the type of variable
// myInt is the name of the variable
// 7 is the value of the variable
//add ; after every statement to end it
//There are different variables such as int = 7, double = 9.5,and characters or char='D'
//Can multiply (*) variables to get an outcome
// Strings are considerd non-primitive types and variable types that start with a lowercase letter are primitive types
//methods are called in the print statement, but cannot be called from primitive types
// Cannot type methods outside of print line. For example: "System.out.println(name and .method goes here())"
//.length() method prints out the number of characters in the string.
// .toUppercase() prints the string of characters in uppercase.
// .toLowercase() prints the string of characters in lowercase.
// To make a String variable, you need to use double quotes and the type = String, name = myName, and value = "Devin" with a ;

// To create a new method in the same Java File, do "private static void air()" this is called the method declaration.
// Can print the new method by calling it in the main method by doing air();
// Method can take parameters. Ex: "private static void printName(String name)" between the 2 parentheses is where you put the parameters.
// To include the parameter in your print line, type "System.out.println("My name is " + name)";
// + is how you can link two strings together in java
// Concatenating strings is when you use the plus sign + to link 2 strings together in Java
// can add multiple parameters by using , int number for example.

//Void means not returning any value
// To change void in the method declaration, change "void" into the data type value that you want to print.
// To return the value in the method, exchange "System.out.println()" for "return".
// To run ".length()" from another method, run it from the print line of the Method Declaration and then call that method to the main method.
//Conditional Statements - if(), else if(), and else statements. Inside the () is where you would put the Condition. For ex: if(name.equals("Devin")){}.
// == means equal because = is being used to assign values to variables. For ex: if(number == 5){}.
// != means any value thats not equal to that number. For ex: if(number != 5){}.

//To print a piece of code without copying and pasting the same code over and over again, we can use a loop.
// Type of loop can be a For loop. For ex: for(int i = 0; i < 10; i++) {}. Code will print inside the curly brackets 10 times.
// for(int i = 0; i < 10; i++) {}. Says keep looping while i is less than 10 and everytime it goes through the loop, increment i by 1
//Java is an Object Oriented Programming Language - meaning, can take a lot of code and put it into another file(class) and then use that code to put in your main file.
//To call another public file into your main file, in the main method type "NameofFile.NameofMethod();"
//File has to be public inorder to call it into your main file
// Can also store the parameters value from another file.

//Private methods can only be called within the file.
//Can create another class to create more methods so your code won't be cluttered.
//Can create another class to act as a blueprint to create objects.
// A class is not an object, but you can use the Name of a class to make the objects.
//To create an object do," Cat myCat = new Cat();". Name of class , Name of variable = the object() /or new Cat().
//Object is stored in a Variable name.
//To create an age and Name for something just do "String name;" and "int age;"
//Basically creating the type and name of variable.

//use the . to access the fields of the objects.
//To create another method you can also write, "public void meow() {}"
//While accessing a field on the class we don't have (), only when calling a method we add () at the end of calling it.
//To print method from another file just call it, don't use print line. For ex: Cat.dingDong();
//If class or method is Static then it can easily be called to print.
// To call a method that doesn't have static, you must type the name of the object and then call the method that's non-static


//1.(Creating variables and then storing the value of two variables inside of another vairable.)
public class JavaProgram {
  public static void main(String[] args) {
    int number = 7;
    double shoeSize = 9.5;
   
    double result = number * shoeSize;

    System.out.println(result);
  }
}

// 2.(Creating a main method and a method declaration, which is another method. We then call that method into the main method to print the concatenating strings with the parameters.)
public class JavaProgram {
  public static void main(String[] args) {
    air("Devin");
  }
  private static void air(String name) {
    System.out.println("Hello " + name);
  }
}


//3. Creating our Conditional Statements which are "if(), else if(), and else statements." Putting them inside of the Method Declaration and then calling it in the main method.
public class JavaProgram {
  public static void main(String[] args) {
    air("Mark");
  }
  private static void air(String name) {
    if(name.equals("Mark")) {
      System.out.println("Hello Mark");
    }
    else if(name.equals("Devin")) {
      System.out.println("Hello Devin");
    }
    else {
      System.out.println("Hello Stranger");
      
    }
  }
}

//4.Creating our Conditional Statement with numbers instead of Strings in our Method Declaration. We then call that method to the main method. With either == , != , > , or < operators.
public class JavaProgram {
  public static void main(String[] args) {
    air(8);
  }
  public static void air(int num) {
    if(num == 7) {
      System.out.println("Hello 7");
    }
    else if(num < 8) {
      System.out.println("Hello 8");
    }
    else {
      System.out.println("Hello Stranger");
    }
  }
}


//5.Creating a for loop. Type of loop is For(). 
public class JavaProgram {
  public static void main(String[] args) {
    for (int i = 0; i < 4; ++i){
      System.out.println("Hello ");
    } 
  }
}


//6.Call another file with its Method into this file while also setting the parameters value.
public class JavaProram {
  public static void main(String[] args) {
    Cat.air("Devin");
  }
}


//7. Calling a print statement from another file and then creating objects in our main file to give the fields values to print. 
//Created the variables with no value from a sepearte class or program.
public class JavaProgram {
  public static void main(String[] args) {
    Cat cat1 = new Cat();
    cat1.name = "Devin";
    cat1.age = 7;
    Cat.meow();
    System.out.println(cat1.name + " " + cat1.age);
  }
}
