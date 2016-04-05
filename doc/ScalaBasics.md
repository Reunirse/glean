SCALA : A SCALABLE LANGUAGE
•	Scala  stands for scalable language. 
•	It is a blende of object oriented and functional programming concepts.
•	Scala’s functional programming constructs makes it easy to build interesting things quickly from simpler parts.
•	Object oriented concepts makes it easy to structure larger systems and to adapt to new demands.
•	Other languages might have object and function as two different concepts but in scala a function value is an object. Function types are classes that can be inherited by subclasses.
•	Scala is object oriented language in pure form , every value is an object and every operation is a method call.
Scala Traits - Overview
•	Scala traits are like interfaces in java,but they also have method implementations and even fields. Object are constructed by mixing compositions , which takes members of class and adds members of number of traits to them.
•	Unlike a class , a triat can add more functionality to an unspecified super class.
Ideas of functional programming
•	Functions are first class values.
•	Operation of a program should map input values to output values.
Eg: consider implementation of string in Ruby. A string is an array of characters. Characters of string can be changed individually. You can change the semicolon characters in string to period inside same string object. But in Java and scala Replacing a character in a string such as s.replace(‘;’,’.’) yield a new string object.
•	Strings are immutable in Scala. Scala has immutable lists, tuples, maps and sets
•	In functional programming methods should not have side effects. They should communicate with environment by taking arguments and returning results. .Replace method takes a string and returns another string. Methods like replace are called referentially transparent, which means for any given input the method call should  be replaced by its result without affecting its semantics. Functional programming encourage immutable data structures and referentially transparent methods.

Scala gives us choice, if you want to u can write in imperative style .i.e with mutable and sideeffects, but scala has functional alternatives to avoid that.
Scala reuses java types , but dresses them up. Scala string support methods like toInt or toFloat.we can write str.toInt instead of Integer.parseInt(str)
Java string classes has no toInt method. But scala lets you define implicit conversions, which are applied when types would not match up. In this case when looking for toInt method, scala compiler will find no such member of class string, but it will find an implicit conversions that converts java string to an instance of the scala class StringOps, which does define such a member. This conversion is done implicitily before performing toInt operation.
Scala is Concise
Class Myclass {
  private int index;
  private string name;
  public MyClass(int index, string name) {
   this.index = index;
   this.name =name; } }
In Scala
Class Myclass(index: Int, name :string)



Scala is High Level
Reduces code complexity.
//JAVA
Boolean nameHasUpperCase =false
for(int i =0;i<name.length(); i++) {
  if(Character.isUpperCase(name.charAt(i))) {
nameHasUpperCase = true;
break;
}
Whereas in Scala
val nameHasUpperCase = name.exists(_.isUpper)

The predicate _.isUpper is an example of function literal in scala . It describes a function that takes a character argument(represented by _ character) and tests whether its an uppercase letter.
Function literals in scala are light weight
Scala is statically typed
Scala classifies variables and expressions according to the kind of values they hold and compute.
The arguments against static types i.e verbosity and make impossible certain type of dynamic modification in overcome in scala using type inference and pattern matching.
Static type systems avoid run time errors
A static type systems provide a safety net that makes you let changes to code base with high degree of confidence
First Steps In Scala
ALL of java’s primitive type have corresponding classes in Scala package.
When you compile your scala code to java byte codes, the scala compiler will use java primitive typeswhere possible to give you performance benefits of primitive types.
VALS and VARS
•	A val is similar to final variables.
•	Once initialized var can never be reassigned.  A var can be reassigned throughout its lifetime.
•	If you initialise a variable with a string literal. Scala inferred type of message to be string , which is called type inference.
val msg =” Hello World”
Defining Functions
def max (x :Int , y :Int):Int = {
  if(x>y)x else y
} 
Type annotation must follow every function parameters proceeded by a colon. Scala compiler does not infer function parameter types.
The equal sign that precedes the body of the function hint that function defines an expression that result in a value.
Writing Scala scripts
Command line arguments are available to Scala Script via scala array named args. In scala arrays are zero based, you can access an element by specifying index in parenthesis.
println(“Hello , “+args(0))
$scala helloarg.scala planet
Result : Hello, planet
Scala enables you to program imperatively as well as in functional style
Example for imperative 
var i=0;
while(i<args.length){
print(args(i))
i+=1;
}
This can be written as args.foreach(arg => println(arg))
Here we call a foreach method on args and pass in a function.In this you are passing a function literal that takes one parameter named arg. The body of function is println(arg).
Scala infers the type of arg to be string. Since string is the element type of array on which you are calling foreach.
If we need , we can also specify type name
args.foreach((arg: String) => println(arg))
If the function literal consists of only one statement that takes a single argument, you  need not explicitly specify name and specify the argument. The following code also works
args.foreach(println)
For LOOP
for(arg <- args)
println(args)
To the right hand of symbol is familiar args array . To the left of <- is arg , the name of a val not a var. 
Although arg seem to be a var variable , because it will get new value on each iteration, its actually a val. Args can’t be reassigned within the body of the for expression. Instead for each element of args array , a new arg value is created and initialized to element value and the body of for will be executed.
Parameterize arrays with types
In scala , you can instantiate objects, or class instances using new. When you instantiate object in scala , you can parameterize using values 
You parameterize an instance with values by passing objects to constructor in parenthesis.
val big = new java.math.BigInteger(“12345”)
val greetString = new Array[String](3)
greetString(0)= “Hello”
greetString(1) = “,”
greetString(2) = “world”
These 3 lines indicate an important concepts to understand about scala concerning meaning of val
When you define a variable with val, the variable can’t be reassigned, but the object to which it refers could still be changed. Here greetStrings will always point to same Array[String] instance with which it was initialized. So array itself is mutable.
Scala doesn’t have operaror overloading. Because it traditionally doesn’t have operators. Characters such as +,-,*,/ can be used with method names. When you write 1+ 2 . you are invoking method + on two arguments 1 and 2.
Arrays are simply instances of classes like any other classes in scala. When you apply parenthesis surrounding  one or more values., scala will transform the code to an invocation of method named apply. So greetStrings(i) gets transformed into greetStrings.apply(i).
This is not restricted to arrays. , any application of n object to some arguments in parenthesis will be transformed to apply method call.
Similarly , when an assignment is made to a variable to which parenthesis and one or more arguments have been applied, the compiler will transform that into an invocation of update method
greetString(0) = “hello” will be transformed to greetString.update(0, “Hello”)
Scala provides a more concise way to create and initialize arrays
val numNames = Array(“zero”,”one”,”two”)
LISTS IN SCALA
Scala Array is a mutable sequence of objects that all share the same type .An Array[Strings] contains only strings. Although you can’t change the length of array after it was instantiated, you can change its element values. Thus arrays are mutable objects.
For immutable sequence of objects that share the same type, you can use Scala List class.
val oneTwoThree = List(1, 2, 3)
Here we create a new val named ontwoThree initialised to a List[Int]. When we call a method on a list it seem by its name to impl that list will mutate, instead creates and returns a new list.
val one =List(1,2)
val three =List(3,4)
val onethree = onetwo ::: threefour
Here List(1,2) and List(3,4) were not mutated. List(1,2,3,4) is a new list.
:: (cons) operator prepend a new element to beginning of list.
val twoThree = List(2,3)
val onetwoThree = 1 :: twoThree
Class List does offer an append operation , it’s written :+ , but this operation is rarely used, because the time it takes to append to a list grows linearly with size of list. , whereas prepending with :: takes constant time To build a list efficiently by appending elements is yo prepend them, but when you are done call reverse; or use a ListBuffer , a mutable list taht does an append operation and when you are done call toList.
Some List methods and its uses
•	val thrill = “Will” :: “fill” :: “until” :: Nil
Creates a new List[String] with three values “Will”, “fill” and “until”
•	thrill(2)  :- Returns the element at index 2(zero base  hence return until)
•	thrill.count(s => s.length == 4) :- count the number of string elements in thrill that have length four (returns 2)
•	thrill.drop(2)  :- Returns thrill list without its first two elements.
•	thrill.dropRight(2) :- Returns the thrill list without its rightmost two elements
•	thrill.exists(s => s == “until”) Determines whether a string element exist in thrill that has value “until”
•	thrill.filter(s => s.length ==4) Returns list of all elements that have length 4.
•	thrill.forall(s => s.endsWith(“l”)) :- Indicates whether all elements in thrill list ends with letter l. Returns true’
•	thrill.foreach(s => print(s)) Executes the print statement on  each of the stringsin the thrill list.
•	thrill.foreach(print) // same as above.
•	thrill.head : - Returns the first element of thrill list. 
•	thrill.init :-  Returns the list of all but last element in the thrill list (returns List(“Will”, “fill”)
•	thrill.isEmpty :- Indicates whether thrill lit is empty.
•	thrill.last :- Returns last element of thrill list
•	thrill.length :- Return number of element in thrill list
•	thrill.map( s => s +”y”) Adds y to each string of list
•	thrill.mkString(“,” ) :- Makes a string with elements of list separated by ,
•	thrill.remove(s => s.length ==4) :-Returns a list except those that have length 4. 
•	thrill.reverse :- Reverse the list
•	thrill.sort((s,t) = > s.charAt(0).toLower < t.charAt(0).toLower) :- Returns a list containing all elements of the thrill list in alphabetical order of the first character lowercased(returns List(“fill”, “until”, “Will”))
•	thrill.tail :- Returns the thrill list minus its first element
Tuples
Tuples are immutable , ut unlike list tuples a=can contain different types of elements. Used to return multiple objects from a method.
val pair = (99, “Luftballons”)
println(pair._1)
println(pair._2)
Scala infers the type of this tuple to be Tuple2[Int, String].
We cant access elements of tuple as pair(0) .The reason is that a lists apply method always return same type , but each element of tuple  may be  a different type. _1 has one result type, _2 has another result type.
Use sets and maps
Scala provides mutable and immutable alternatives for sets and maps. But use the same name for both versions. Scala API contains a base trait. Scala then provides two subtraits, one for mutable sets and another for immutable sets.
Scala provides mutable and immutable version of Map. There is a base Map trait in package scala.collections and two subtrait Maps : A mutable Map in scala.collection.mutable and immutable map scala.collections.immutable.
Given there are no imports , when you see Map . you will get by default : a scala.collections.immutable.Map
import scala.collection.mutable.Map
Val treasureMap = Map[Int , String]()
treasureMap += (1 -> “Go to Island”)
treasureMap +=(2 -> “Find big X on ground.”)
treasureMap + = (3 -> “Dig.”)
println(treasureMap(2))
The explicit type parameterization “[Int, String]”, is required because without any value passed to factory method, the compiler is unable to infer map’s type parameters.
If you prefer immutable map  import is necessary
val romanNumeral = Map(1 -> “I” , 2 - > “II”, 3 -> “III”, 4 -> “IV”)
Recognize Functional style
If a code contain any vars, It is probably in imperative style .If code contains only vals – It is probably in functional style
Imperative Style
def printArgs(args : Array[String]): Unit = {
var i =0
while(i < args.length) {
println(args(i))
i+=1
}}
def printArgs(args: Array[String]): Unit = { 
for(arg <- args)
println(arg)
}
Or arg.foreach(println)
The above function has side effects. If a function returns Unit only way it can make change to the world is by means of side effects. So to make a function purely functional, it can be rewritten as
def formatArgs(args : Array[String]) = args.mkString(“\n”)
println(formatArgs(args)) will print the output 
Scala’s assert method checks the passed boolean and if its false throws assertion error. Else it just returns quietly.
Scala is a hybrid imperative and functional language
READ LINES FROM A FILE
import scala.io.Source
If(args.length > 0) {
for (line <- Source.fromFile(args(0)).getLines())
  println(line.length + “ “ + line)
}
else
console.err.println(“Please enter Filename”)
The getLines method provides an Iterator[String]. Which provides one line on each iteration, excluding the end of line character.









CLASSES AND OBJECTS
A class is a blue print of objects. Once you create a class, you can create objects from the class with the keyword new.
Class ChecksumAccumulator {
}
 Object can be created with :- 
new ChecksumAccumulator
Inside a class definition , you place fields and methods, which are called members. When you instantiate a class, the runtime sets aside some memory to hold the image of the objects statei.e content of variables. Fields are also known as instance variables, because every instance gets its own set of variables.
Class CheckSumAccumulator {
var sum =0
}
val acc = new ChecksumAccumulator
val csa = new ChecksumAccumulator
it is possible to mutate the object acc referred to, even though acc is val.  What you can’t do with acc , given that they are vals, not vars is reassign a different object to them. acc will always refer to the same Checksumaccumulator object,with which you initialize it, but the fields contained inside object might change over time.
Private fields can only be accessed by methods defined in same class.
Class ChecksumAccumulator {
private var sum =0
}
val acc = new ChecksumAccumulator
acc.sum =5 // won’t compile
Now that sum  is private, the only code that can access sum is code defined inside the body of class itself. Thus ChecksumAccumulator won’t be of much use unless we define some methods in it.
Class ChecksumAccumulator {
private var sum =0
def add(b :Byte): Unit = {
sum + =b
}
def checksum(): Int = {
return ~(sum & 0xFF) +1
}
}
One important characteristics of method parameters in scala is that they are vals , not vars.
If you attempt to reassign the parameter inside a method in scala, it won’t compile.
def add(b :Byte) :Unit = {
b=1
sum+=b
}
Whenever you leave off the equal sign before the body of function, its result  type will definitely be Unit. This is true no matter what the body contains. Scala compiler converts any type to Unit. For example, if the last result of method is a String, but the methods result type is declared to be Unit.
The string will be converted to Unit and value won’t be returned.
Eg :- def f():Unit = “the string gets lost”
f: () Unit
Eg :- def g() { “the string gets lost too” }
g: () Unit
Eg:- def h() = { “the string gets returned ” }
res0: java.lang.String = the string gets returned
Singleton Objects
Classes in Scala cannot have static members. Instead Scala has singleton objects. A singleton object definition look like class definition, except instead of keyword class you use the keyword object.
When the singleton object shares the same name as that of the class, it is called class companion object. You must define both class and companion object in same source file. The class is called a companion class of the singleton object. A class and its companion object can access each other’s private members.
One difference between singleton objects and classes is that singleton objects cannot take parameters, whereas classes can. You can’t instantiate a singleton object with a new keyword. 
You have no way to pass parameters to it. Each singleton object is implemented as an instance of of a synthetic class referenced from a static variable.. Singleton object is initialized the first time some code accesses it.
A singleton object that does not share the same name with companion class is standalone object.
THE APPLICATION TRAIT
Scala provides a trait, scala.Application, that can save you some finger typing
import Checksumcalculator extends Application
{
for(season <- List(“fall”, “winter”, “spring”))
  println(season +” : “+calculate(season))
}
To use trait, you first write “extends Application” after name of your singleton object. Then instead of writing a main method, you place the code you could have put in main method directly between curly braces of the singleton object. Now we can compile and run this application just like any other.
How It Works ?
Trait Application declares a main method of the appropriate signature, which our singleton object inherits, making it usable as a scala application. The code between the curly braces of singleton object is collected into a primary constructor of the object, and is executed when the class is initialized.
Shortcomings while inheriting from an Application 
1.You can’t use the trait if you need access to command line arguments.
2. Because of some restrictions of JVM threading model, you need an explicit main method, if the program is multithreaded.
Inherit from application only when our program is simple and multithreaded.


Control Structures in Scala
The control structures available are :- If ,for, while, try match and function calls . All of Scala control structures result in some value.
If Expression
Imperative style
var filename = “default.txt”
If(args.IsEmpty)
filename =args(0)
Functional Style
Scala If expression can return a value. 
val filename = 
If(!args.IsEmpty) args(0) else “default.txt”

One advantage of val instead of var is that , it supports equational reasoning. The introduced variable is equal to the expression that computes it, assuming it has no side effects.
If without an else provides the type of result as Unit. It turns out that value exist whose type is Unit.
scala> val a =  if (false) “hi”
 Any type can be implicitily converted to Unit.
scala>val c: Unit =”hi”

While & do-While loop
Both while and do-while loop result in Unit value.
For Expressions
Iteration through collections.
Code that prints all files in the current directory 
val filesHere = (new java.io.File(“.”)).listFiles
for (file <- filesHere)
println(file)
Filtering
Sometimes we can use for to filter the entire set down to a subset.
for(file <- filesHere; if file.getName.endsWith(“.scala”)) println(file)
---------------------------------------------------------------------------------------------
for(
file <- filesHere;
if file.isFile;
if file.getName.endsWith(“.scala”)
) println(file)
---------------------------------------------------------------------------------------------
for {
file <- filesHere
if file.isFile
if file.getName.endsWith(“.scala”)
} println(file)
Inside Curly braces it is not necessary to put semicolons at the end of line.
Producing a new Collection
We can generate a value to remember for each iteration .You simply prefix the body of for expression with keyword yield.
def scalaFiles = 
for {
 file <- filesHere
If file.getName.endsWith(“.scala”)
} yield file
When the for expression completes, all of these values are returned in a single expression. The type of the resulting collection is based on the kind of collection processed in iteration clauses. In this case result is an arra, because filesHere is an array.
Syntax : for clauses yield body
For () yield file { }

Try Expressions
We can create an exception object and can throw it with throw keyword
throw new NullPointerException

Catching Expressions
try {
doSomething()
}
catch {
case ex :IOException => println(“Oops !”)
case ex: NullPointerException => println(“Oops!!”)
}
Pattern matching is also shown in the above example .
If exception is of type IOException then the first clause is executed. If of type Null Pointer Exception , the second clause will execute. If the exception is of neither type try catch will terminate and exception will propagate further.
The finally clause :-
We can wrap the code with a finally clause if you want some code to execute even if a method is terminated early.
Eg :-Open file gets closed even if method exit by throwing an exception.
val file =openFile()
try {
}
finally {  file .close()} 

Yielding a value 
try-catch-finally can results in value. 

Example  :-
val url = 
try { 
new URL(path)
}
catch {
case e :MalformedURLException => new URL(“http://www.scala-lang.org”) 
If you’re familiar with Java, it’s worth noting that Scala’s behavior differs from Java only because Java’s try-finally does not result in a value. As in Java, if a finally clause includes an explicit return statement, or throws an exception, that return value or exception will “overrule” any previous one that originated in the try block or one of its catch clauses.

def f(): Int = try { return 1 } finally { return 2 }
calling f() results in 2. 

By contrast, given:
def g(): Int = try { 1 } finally { 2 }
calling g() results in 1.

Match Expressions 
It let you select from a number of alternatives. 
Val firstArg = if(args.length > 0) args(0) else “”
firstArg match {
case “salt” = > println(“pepper”)
case “chips” => println(“salsa”)
case _ => println(“No options”)
}
Break is implicit . Match expression results in a value.

FUNCTIONAL OBJECTS
Scala puts a great emphasis on immutable objects.
Rational numbers do not have mutable state. We can add a constant to a rational number , but it results in a new rational number.
In scala classes can take parameters directly. Where as in java, classes have constructors which can take parameters. 
Class parameters can be used directly in the body of class, there is no need to define fields and write assignments which copy constructor parameters to fields.

Multiple Constructors
Scala supports multiple constructors in a class using auxillary constructors. 
Example :-
class Rational(n :Int, d:Int) {
  def this(n :Int) = this(n,1)
println(“created : “+n+”/”+d)
}
Secondary constructor in scala starts with def this(…) . In this code above, an auxillary constructor is used to create an instance of Rational with a default value of 1 for the denominator. It does this by calling the primary constructor with the given parameters n and 1 as arguments.
scala> val y = new Rational(3) // you should see :- created : 3/1
Every auxillary constructor must call another constructor of the same class as its first action. The called constructor is called primary constructor.

Reimplementing the toString method.
When the interpreter prints out the value of a rational number, it invokes the number’s toString method. This method has a default implementation in Scla’s root class Object, where it just prints the class name and hexadecimal number. The default implementation can be overridden by adding a method toString to class Rational
override def toString() = numer+”/”+denom
scala> val x = new Rational(1,3)
x:Rational = 1/3

Identifiers in Scala
Scala has very flexible rules of forming identifiers .
An alphanumeric identifier starts with a letter or an underscore character, which can be followed by further letters, digits and underscore characters.
The $- character also counts as a letter , however it is reserved for identifiers generated by scala compiler. Identifiers in user programs should not contain $ character.
An operator identifier consists of one or more operator characters.
Ex:- + , ++, :::, <?>, :->
A mixed identifier consists of alphanumeric identifier, which is followed by an underscore and an operator identifier
Ex :- vector_+, success_?
A literal identifier is an arbitrary string enclosed in back-ticks
Example :- `x` , `yield`
Reserved words in scala can still be used as identifiers by holding the name in back-tick.


