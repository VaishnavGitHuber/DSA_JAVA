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
