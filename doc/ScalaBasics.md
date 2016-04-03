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


#### 7



Using val is the functional style, and it helps the same way as a final variable in Java
It tells readers of the code that the variable will never change, saving them from scanning all code in the variable’s scope to see if it ever changes.

Look for opportunities to use vals. It makes the code both easier to read and easier to refactor.

An exception throw has type Nothing

Java will not allow to create a variable in an inner scope that has the same name as a variable in an outer scope. 
In a Scala program, an inner variable is said to shadow a like-named outer variable, because the outer variable becomes invisible in the inner scope.


#### 9-11



Higher-order functions take functions as parameters give an extra opportunity to condense and simplify code.
One benefit of higher-order functions is they enable us to create control abstractions that allow us to reduce code duplication.

A curried function is one that applied to multiple argument lists, instead of just one.

A class with abstract members must itself be declared abstract, which is done by writing an abstract modifier in front of the class keyword.
A method is abstract if it does not have an implementation(i.e., no equals sign or body). Unlike Java, no abstract modifier is necessary (or allowed) 
on method declarations. Methods that do have animplementation are called concrete.

Client code should not be affected by a decision to implement an attribute as a field or method. For instance, we could have chosen to implement 
parameterless methods as fields instead of methods, simply by changing the def in each definition to a val

In principle it’s possible to leave out all empty parentheses in Scala function calls. However, it is recommended to still write the empty parentheses
when the invoked method represents more than a property of its receiver object. For instance, empty parentheses are appropriate if the method performs
I/O, or writes reassignable variables (vars), or reads vars other than the receiver’s fields, either directly or indirectly by using mutable objects. That
way, the parameter list acts as a visual clue that some interesting computation is triggered by the call

It is encouraged style in Scala to define methods that take no parameters and have no side effects as parameterless methods, i.e., leaving off the empty parentheses. 
On the other hand, you should never define a method that has side-effects without parentheses, because then invocations of that method would look like a field selection.

Inheritance means that all members of the superclass are also members of the subclass, with two exceptions. First, private members of the super-
class are not inherited in a subclass. Second, a member of a superclass is not inherited if a member with the same name and parameters is already implemented in the subclass.

A factory object contains methods that construct other objects. Clients would then use these factory methods for object construction rather than constructing the objects directly with new.

In Scala, every class inherits from a common superclass named Any. Because every class is a subclass of Any, the methods defined in Any are “universal” methods: they may be invoked on any object.

The root class Any has two subclasses: AnyVal and AnyRef. AnyVal is the parent class of every built-in value class in Scala. 
There are nine such value classes: Byte, Short, Char, Int, Long, Float, Double, Boolean, and Unit.
AnyRef is the base class of all reference classes in Scala.

