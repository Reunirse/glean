
Scala Basics

-> scala code can be written in both imperative and functional way.

-> val and var are the keywords used to define variables in scala. 'val' is immutable but 'var' is mutable

-> Not mandatory to mention the type when defining a variable . Scala type inference takes care of that.

-> In functional style ,'val' is prefered more over 'var'

-> 'def' is the keyowrd used for defining functions

-> Not mandatory to have explicit return statement for function . The result of the last line evaluation will be returned 

-> function definition :- def func1(arg1: type, arg2:type): <returntype> = {}

-> function definition without = returns unit . Ex:- main method

-> Method that dont return a value is called procedure

-> if a function takes only one parameter , then it can be called without dot or paranetheses

   Ex:- for (i <- 1 to 10) , where to is a function which takes only 1 parameter

-> When a variable is invoked by passing the arguments , scala internally invokes its apply method .

   Ex:- for (i <- 1 to 2) greetstring(i) => for(i <- 1 to 2) greetstring.apply(i)

-> when an assignment is made to a variable to which parentheses and a single argument have been applied, the compiler will transform that into an invocation 
     of an update method that takes two parameters
  
      Ex :- greetStrings(0) = "Hello"
                
             will be transformed into
  
            greetStrings.update(0, "Hello")

-> classes in scala can be instantiated with New keyword

-> classes accepts parameters and this parameters forms part of the constructor

-> 2 types of constructor 

   1) primary constructor
   2) auxiliary constructor

-> Singleton objects are same as static in java.

-> Objects doesnot accept arguments

-> Function inside class is known as methods whereas function inside object is known as function itself

-> companion object - object having same name of a class

-> objects are used in 2 types 

  1) companion object
  2) standalone object

-> Any singleton object with main method is used as entry point for an application.

-> Every value in scala is an object and every operation on an object is a method call

-> scala does not have operators . All operators are method calls

-> 1+2 in scala is calling the method '+' in the integer object 1 which takes one argument ie 2 . so in effect it is 1.+(2)

-> If number begins with 0x or 0X, its hexadecimal. If number begins with non-zero digit, its decimal. If number ends in L or l, its long

-> stripMargin method is used to remove leading spaces in string when a string value is written in multiple lines

-> 3 operator notations - postfix, prefix and infix.

-> prefix operators are +, -, !, and ~

-> modulus operator follows IEEE754 standard and thus remainder uses rounding division , not truncating division

-> a && b - b is evaluated only if a is true

-> == != are final methods in Any and equals method invokes == . equals method can be overriden inside class using override keyword

-> Any method which start with * has highest precedence

-> Scala order of precedence is :- */% +- : =! <> & ˆ | (all letters)

-> Any method that ends in a ‘:’ character is invoked on its right operand, passing in the left operand

     Ex:- a:b:c is invoked as c.:(b).:(a)

-> 'override' keyword is used to reimplement an already defined method

-> 3 types of acces modifiers  - public, private, protected. Default modifier is public
