## Java Programming Language 
# Java Programming Concepts

This repository provides a concise guide to Java programming, covering fundamental concepts with examples. Each concept is explained with well-commented code for ease of understanding.

---

## Table of Contents
1. [Variable Declaration and Initialization](#1-variable-declaration-and-initialization)
2. [Operators](#2-operators)
3. [String Built-in Functions](#3-string-built-in-functions)
4. [Conditional Statements](#4-conditional-statements)
5. [Iteration Statements](#5-iteration-statements)
6. [Functions in java](#6-Functions-in-Java)
7. [Objects and classes](#7-Creating-class-and-objects)
8. [Constructors](#8-Constructors)
9. [Inheritance](#9-Inheritance)
10. [This keyword](#10-This-keyword)
11. [Super Keyword](#11-Super-keyword)
12. [Polymorphism: Method overloading & Method Overriding](#12-Polymorphism)
13. [Examples](#13-Example-problems)

---

## 1. Variable Declaration and Initialization
Variables in Java must be declared with a specific data type before use. Here's an example:

```java
public class Main {
    public static void main(String args[]) {
        // Declaration of variables
        int number;
        float number2 = 23.4f;
        String name;
        char color;
        boolean is_valid;

        // Initialization of variables
        number = 10;
        name = "AJAY";
        color = 'r';
        is_valid = true;

        System.out.println("Int Number: " + number);
        System.out.println("Float Number: " + number2);
        System.out.println("String Variable: " + name);
        System.out.println("Char Variable: " + color);
        System.out.println("Boolean Value: " + is_valid);
    }
}
```
---
## 2. operators
```
public class Main
{
	public static void main(String[] args) {
		// Operators 
		/*
		1. Arithematic Operators (+,-,*,/,%, ++, --)
		2. Comparison Operator(>,<,>=,<=,==,!=)
		3. Assiagnment Operator(=, += ,-=, *=,/= %=)
		4. Logical Operator(&&, || ,!)
		*/
		
		// 1. Arithematic Operator
// 		int number1 = 100 ,number2 = 10;
// 		int result;
		
// 		result = number1 % number2;
		
// 		System.out.println("Result of 2 numbers: "+result);

    // 2. Comparison Operator & Assignment Operator
        // int number = 3;
        
        // if (number != 2){
        //     // true block
        //     System.out.println("Not Equals");
        // }else {
        //     // false block
        //     System.out.println("Equals");
        // }
	
	// 4. Logical Operator
	    int a = 3, b = -4;
	    
	   // if(a > 0 && b > 0){
	   //     //true block 
	   //     System.out.println("Both greater than 0");
	   // }else {
	   //     //false block 
	   //     System.out.println("Both or either1 less than 0");
	   // }
	    
	    System.out.println(!(a > 10));
	}
}

```
## 3. string-built-in-functions
```
public class Main
{
	public static void main(String[] args) {
		String name = "AJAY";
		String name2 = " VARMA";
		
		// String built in functions
		System.out.println("String length: "+name.length());
		System.out.println("String index at 1: "+ name.charAt(1));
		System.out.println("CONCATINATION: "+ name.concat(name2));
		System.out.println("Checking ends with abc: " + name.endsWith("JAY"));
		System.out.println("check with:"+ name.startsWith("A"));
		System.out.println("result: "+ name2.toUpperCase());
		System.out.println("checking to lower case:"+ name.toLowerCase());
		
	}
}

```
## 4. conditional-statements
```
class Main{
    public static void main(String args[]){
        /* Condition statments 
        1. if 
            1.1 Simple if statement 
            1.2 if-else statement 
            1.3 else-if ladder 
        2. Switch statements 
    */
    int a = 4;
    
    // if(a == 1){
    //     System.out.println("ONE");
    // }else if(a == 2){
    //     System.out.println("TWO");
    // }else if(a == 3){
    //     System.out.println("THREE");
    // }else if(a == 4){
    //     System.out.println("FOUR");
    // }else{
    //     System.out.println("NOT ONE");
    // }
    
    switch(a){
        case 1:
            System.out.println("ONE");
            break;
        case 2:
            System.out.println("TWO");
            break;
        case 3:
            System.out.println("THREE");
            break;   
        default:
            System.out.println("DEFAULT");
    }
    
    }
    
    
}
```
## 5. iteration-statements
```
public class Main
{
	public static void main(String[] args) {
		/* Iterating Statements 
		1. For loop : if you know the number of iteration
		2. While loop : if you dont know no of iterations 
		3. Do-While loop 
		4. For each loop 
		*/
		// 1. FOR loop
		int n = 1;
		/* Syntax of for loop: 
		for(initialisation; condition; increment/decrement){
		    // block of code 
		}
		*/
// 		for(int i = 10;i >= n; i--){
// 		    System.out.print(i + " ");
// 		}
    // 2. While Loop 
    // Syntax for while loop: 
    /* while(condition){
        // block of code
    }*/
    // while(n <= 100){  
    //     System.out.print(n + " ");  
    //     n++; //(n = n + 1) 
    // }
    // 3. Do-While loop 
    // do {
    //     System.out.print(n + " ");
    //     n ++;
    // }while(n <= 10); 
    // 4. FOR EACH LOOP 
    //char[] name = {'A','j','A','Y'};
    
    // for(char c: name){
    //     System.out.println(c);
    // }
    
		  
	}
}

```
## 6. Functions in Java 
```
public class Main
{
	public static void main(String[] args) {
		/* Functions : Block of code which results a meaningful activity 
		1. Functions with parameter and with returning value 
		2. Function with parameter and with out returning value
		3. Function without parameter and with returning value 
		4. Function without parameter and with out returning value 
		*/
		float sum;
		sum(); // function call
		
	}
	
	static void sum(){ // function definition
	float num1 = 45.3f, num2 = 34.5f;
	    float sum;
	    sum = num1 + num2;
	    System.out.println("Sum of numbers: " + sum);
	}
}
```
## 7. Creating class and objects
```
public class Main
{
	public static void main(String[] args) {
		// creating objects
		// syntax object creation: class_name object_name = new class_name()
		Bank sbi = new Bank();
		sbi.name = "SBI";
		sbi.location = "Banglore";
		sbi.print_details();
		
		Bank canera = new Bank();
		canera.name = "CANERA";
		canera.location = "Hydrabad";
		canera.print_details();
		
	}
}

class Bank { // class definition
    String name,location;
    
    void print_details(){
        System.out.println("Name of the bank is "+ name + "\nLoacation: "+ location);
    }
}
```
## 8. Constructors
```
public class Main
{
	public static void main(String[] args) {
		/* Constructors: special function, which executes when a object is created
		types 
		1. Default constructor 
		2. Paremterised constructor 
		*/
		Bank sbi = new Bank("SBI","Banglore");
		sbi.print_details();
		Bank union = new Bank("UNION","Kerala");
		union.print_details();
	}
}

class Bank { 
    String name,location;
    
    // syntax for constructor class_name(paramter){}
    Bank(String bank_name, String bank_location){
        this.name = bank_name;
        this.location = bank_location;
    }
    
    void print_details(){
        System.out.println("Name of the bank is "+ name + " & Loacation: "+ location);
    }
}
```
## 9. Inheritance
```
/* 
inheritance: creating a class from an existing class
types: 
1. Single ingeritance : Single parent & single child 
2. Multiple inheritance : Multiple parant & single child (can't achieved using java)
3. Multilevel inheritance : Single grand parant & Single parant & single child
4. Heirarchial inheritance : Sigle parant & Multiple childs 
5. Hybrid inheritance 
*/
public class Main
{
	public static void main(String[] args) {
		C c = new C();
		System.out.println("c.nameA: "+c.nameA);
		System.out.println("c.nameA: "+c.nameB);
		System.out.println("c.nameA: "+c.nameC);
		c.displayA();
		c.displayB();
		c.displayC();
	}
}


// Multilevel & Single level

class A{
    // attributes 
    String nameA = "A";
    
    // Method
    void displayA(){
        System.out.println("I am A");
    }
}

// syntax : extends class_name 
class B extends A{
    // attributes 
    String nameB = "B";
    
    // Method
    void displayB(){
        System.out.println("I am B");
    }
}

class C extends B {
    // attributes 
    String nameC = "C";
    
    // Method
    void displayC(){
        System.out.println("I am C");
    }
}

// Heirarchial Inheritance

class A { 
    String nameA = "A";
    
    void displayA(){
        System.out.println("I am A");
    }
}


class B extends A{
    String nameB = "B";
    
    void displayB(){
        System.out.println("I am B");
    }
}

class C extends A{
    String nameC = "C";
    
    void displayC(){
        System.out.println("I am C");
    }
}
```
## 10. This-keyword
```
// Topic : This Keyword
public class Main
{
	public static void main(String[] args) {
		// Syntax for creating objects: Class_name obeject_name = new Class_name();
		Bank sbi = new Bank("SBI",45000f);
		
		sbi.print_details();
		
	}
}

// Bank class 
class Bank{
    String name;
    float balance;
    // Parameterized Constructors
    Bank(String name, float balance){ // if parameter names & instance names are same: use this keyword
        this.name = name;
        this.balance = balance;
    }
    
    // print_details 
    void print_details(){
        System.out.println("Bank Name: "+ this.name + " | Bank Banalce: "+ this.balance);
    }
}
```
## 11. Super Keyword
```
// Super key word 
public class Main
{
	public static void main(String[] args) {
		Child c = new Child("VAISHNAV","AJAY");
		c.display_info();
	}
}

class Parent {
    String name;
    // constructor
    Parent(String name){
        this.name = name;
        //System.out.println("Parent constructor is called... " + name);
    }
    // function: display_info_parent
    void display_info(){
        System.out.println("PARANT CLASS FN IS CALLED");
    }
}




class Child extends Parent{
    String name;
    // constructor 
    Child(String c_name,String p_name){
        super(p_name); // calling parent constructor using this keyword 
        this.name  = c_name ;
        //System.out.println("Child constructor is called... " + name);
    }
    // function : display_info_child
    void display_info(){
        super.display_info(); // fn calling using super keyword 
        System.out.println("CHILD CLASS FN IS CALLED");
    }
}
```
## 12. Polymorphism 
```
/* 
Polymorphism: ability to take multiple forms 
- Ways to achieve polymorphism 
1. Method overloading : same function name but differ in parameter 
2. Method overriding : same function name & attributes in base and sub class
*/

// Method Overloading: Example
public class Main
{
	public static void main(String[] args) {
		Mathematics math = new Mathematics();
		math.sum(3,5); // output: 3 + 5 = 8
		math.sum(2,4,5); // output: 5 + 4 + 2 = 11
	}
}

class Mathematics {
    // function1: sum 
    void sum(int num1, int num2){
        int sum = num1 + num2;
        // output
        System.out.println("Sum of 2 numbers: " + sum);
    }
    
    // function2: sum
    void sum(int num1, int num2, int num3){
        int sum = num1 + num2 + num3;
        // output
        System.out.println("Sum of 3 numbers: " + sum);
    }
}


// Method overriding
public class Main
{
	public static void main(String[] args) {
		Child c = new Child("A","B");
		c.display_info();
	}
}


class Parent {
    // attributes 
    String name;
    
    // constructor : parent 
    Parent(String p_name){
        this.name = p_name;
    }
    // Display function 
    void display_info(){
        System.out.println("PARENT CLASS NAME: "+this.name);
    }
}


class Child extends Parent{
    // attibutes 
    String name;
    
    Child(String c_name,String p_name){
        super(p_name); // parent constructor
        this.name  = c_name;
    }
    
    void display_info(){
        super.display_info();// super keyword: calling parent function
        System.out.println("CHILD CLASS NAME: "+this.name);
    }
    
}

```
## 13. Example problems
```
class & objects : Questions 
Create a class Book with attributes book_name, author, price, 
with methods get_details(), get_price(), update_price(price)

Create a class Car with attributes car_name, brand, price
with methods get_price(), update_price(), print_details()

polymorphism & inheritance: Questions
create a class shape, then inherit the shape class rectangle, circle.
use area() method in both class to find the aree of the shape and illustrate the polymorphsm concept.
```
