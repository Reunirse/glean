#### 1-6



Scala Traits are like interfaces in Java, but they can also have method implementations and even fields.

In a functional language, a function is a value of the same status like an integer or a string. We can pass functions 
as arguments to other functions, return them as results from functions, or store them in variables. 
We can define a function inside another function, just as defining an integer value inside a function, also we can define functions without giving a name.

Immutable data structures are one of the cornerstones of functional programming.
Scala has immutable lists, tuples, maps, and sets.


Scala has two kinds of variables, vals and vars. 
A val is similar to a final variable in Java. Once initialized, a val can never be reassigned. 
A var, by contrast, is similar to a non-final variable in Java. A var can be reassigned throughout its lifetime.

Any application of an object to some arguments in parentheses will be transformed to an apply method call.

To add a new element to a set, we call + on the set, passing in the new element. Both mutable and immutable sets offer a + method, but their behavior differs. 
A mutable set will add the element to itself, 
An immutable set will create and return a new set with the element added.

One way to move towards a functional style, is to try to program without vars.

If a function isn’t returning any interesting value, which is what a result type of Unit. 
The only waythat function can make a difference in the world is through some kind of side effect.


Inside a class definition, we can place fields and methods, which are collectively called members. 
Fields, which defines with either val or var, are variables that refer to objects. 
Methods, which you define with def, contain executable code. 
The fields hold the state, or data, of an object, whereas the methods use that data to do the computational work of the object.

One important characteristic of method parameters in Scala is that they are vals, not vars

A singleton object is more than a holder of static methods, however. It is a first-class object.


One difference between classes and singleton objects is that singleton objects cannot take parameters, whereas classes can. 
Because you can’t instantiate a singleton object with the new keyword, you have no way to pass parameters to it.

Scala convention is to use camel case for constants, such as XOffset