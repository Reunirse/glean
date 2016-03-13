
Place to note down the points learned/understood while going through programming in scala initial 6 chapters:

Scala - Scalable language
-object oriented and functional programming language
-Scala is an object-oriented language in pure form: every value is an object and every operation is a method call

Why Scala?
compatibility, brevity/concise, high-level abstractions, and advanced static typing.

String abstraction:
 val nameHasUpperCase = name.exists(_.isUpperCase)

Type inference - Scala’s ability to figure out types from context

 val - final
 var - mutable

Parameterless functions- when you define a function that takes no parameters and returns a conceptual property, you should leave the empty parentheses off, like this:
  scala> def greeting = "Hello, world!"
  greeting: java.lang.String
Such functions are called parameterless functions.( it can be made to val iwthout any impact)

Interface <-> trait

apply: When you apply parentheses to a variable (a val or a var) and pass in a single argument, Scala will transform that into an invocation of a method named apply.
So greetStrings(i) gets transformed into greetStrings.apply(i). 
So it’s not a special case; it’s a general rule.

Scala Lists are always immutable
Scala Arrays are always mutable

List has a method named ::: that prepends a passed List to the List on which ::: was invoked

Nil -an empty List

HashMap/Map = HashSet/Set??????????/

Companion object-A singleton object can share the same name with a class, and when it does, the singleton is called the class’s companion object.
 a singleton object is either a companion or a stand-alone object.
 One difference between Scala and Java is that whereas Java requires you to put a public class in a file 'named' after the class.

Scala includes a construct called a trait, which is similar in spirit to Java’s interface. One main difference between Java interfaces and Scala traits is that whereas all methods in Java interfaces are by definition abstract, you can give methods real bodies with real code in Scala traits

  Scala methods will return the value of the last expression -> extend Scala traits

  Methods with a result type of Unit are executed for their side effects

Procedure style-whenever you leave off the equals sign before the body of a method, its result type will definitely be Unit(curly braces required).   
  def add(b: Byte) { sum += b }
   Scala cannot have static members. Instead, Scala has singleton objects.

Singleton Object/Companion objects && Standalone objects (main method)

Primary constructor of the class- It takes the class parameters and executes all statements of the class body. 
Every auxiliary constructor- must call another constructor of the same class as its first action. 
The called constructor is either the primary constructor, or else another auxiliary constructor that comes textually before the calling constructor. 
The net effect of this is that every constructor invocation in Scala will end up eventually calling the primary constructor of the class. The primary constructor is thus the single point of entry of a class.

alphanumeric identifier :  x1     _out_     MAX_DECIMAL_NUMBER    CamelCase
 operator identifier : +    ++    :::    <?>    :->
  mixed identifier : vector_+     success_?    myvar_=
  literal identifier : 'x‘    ‘<clinit>‘    ‘yield‘

The implicit modifier in front of the method tells the compiler to apply it automatically in a number of situations.
>implicit def intToRational(x: Int) = new Rational(x)
2 * new Rational(3,4) // 2 is implictly made  to Rational
