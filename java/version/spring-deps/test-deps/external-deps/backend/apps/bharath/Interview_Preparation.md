# Core Java Made Easy
Static and Non-Static Members : Blocks, Fields, Methods
Data Types, Literals, Type Conversion
Wrapper Classes
Operators and Assignments
Flow Control and Looping
Access Modifiers
Packages
OOPS : Abstraction, Encapsulation, Inheritance, Polymorphism
Exception Handling
Multi Threading
Garbage Collection
Inner Classes
String Handling
Input/Output Streams
Collections with Generics
Enums
Java 8
JVM Architecture
Interview Questions

Fundamental Courses :
Core Java Made Easy
JDBC, Servlets and JSP
Spring :
Spring Framework in easy Steps
Spring Boot Fundamentals
Spring Data JPA using Hibernate
Specialization :
Java Web Services Part 1 and Part 2
Java Messaging Services 
Spring Data REST
Spring Cloud Fundamentals
Spring Security
Testing :
JUnit and Mockito
Maven
Java Design Patterns
Cloud :
Git
Maven
Gradle
AWS (EC2, Elastic Bean Stalk)
Docker (Docker Compose)
Kubernetes

Log4j Vulnerability
Dependency Injection
Spring MVC
Object Class Methods
Immutable Class
Deep Clone vs Shallow Clone

Java 8 Features:
default method in interface
static method in interface
functional interface
lambda expression
method reference
stream : intermediate + terminal operation
###############################################################
JDK = JRE + JVM
Compiler .java -> .class or bytecode -> (JIT compiler) machine code

Java is platform independent (bytecode)

OOP (Object Oriented Programming)
- ATM (Customer and Bank interact)
- names, properties/attributes and functionality/behaviour

Online Shopping
- Address, Customer, Order, Payment, Product
Hospital Management
- Patient, Doctor, Billing, Appointment

OOPS :
- Abstraction (Eg : Interfaces and Abstract Class, Car, TV, Laptop, Mobile, Exposing public interfaces)
- Encapsulation (Protecting Properties and Functionality of an Object from other Object. Eg : Class)
- Inheritance (Code re-usability, IS-A Relationship, Defining new object with help of an existing object, Accessing and Updating an existing Object Functionality)
- Polymorphism (Multiple Behaviour at different times : Method Overloading and Method Overriding)

Building blocks of Java Program
Variables, Blocks, Methods, Class
Variables point to memory location where data is stored.
**Non-Static / Object Variables : Account Number, Balance, accountBalance(), withdrawal()
Static / Common across Objects Variables : Bank Name, interest()**

###############################################################
Static Context : Class Level Context
- No Object needs to be created
- Static Methods should be invoked using ClassName.
- Static Variables are common across Class.

Local Variables (defined in method) are stored in Stack.
Global Variables stored in Heap.
###############################################################
Non-Static Context (Stored in Heap or Method Area)
Variables, Methods, Blocks, Constructor.
Initialize Non-Static Variables using Constructor.
###############################################################
Static will be executed only when Class is loaded.
Non-Static blocks and Constructor is executed whenever Object is created.
###############################################################
this refers to objects reference or current object's members address in memory
this cannot be used in static context.
###############################################################
Data Type
Primitive Data Type
byte 1
short 2
int 4
long 8
float 4
double 8
char 2
boolean true/false
Reference Data Type
class
Array
String
Implicit Type Casting (lower to higher)
Explicit Type Casting (higher to lower)
Reference Type Casting
Identifier : name of class, method and variables
###############################################################
Wrapper Classes : Primitive to Object Type
Primitive : byte, short, int, long, float, double, char, boolean
Wrapper : Byte, Short, Integer, Long, Float, Double, Character, Boolean

Primitive to Object : Boxing    Integer integer = Integer.valueOf(10)
Object to Primitive : Unboxing  int i = integer.intValue()
Primitive to String             String str = Integer.toString(10)
String to Primitive             int i = Integer.parseInt(str)
Object to String                String str = Integer.valueOf(10).toString()
String to Object                Integer integer = Integer.valueOf(str)
###############################################################
Operators :
Arithmetic(+ - * / %)
Assignment (=)
Bitwise (& | ^)
Comparison/Relational <= >= < >
Short Circuit (&& better than & will improve performance it will not evaluate second operator)
Ternary Operator exp1 ? exp2 : exp3
**Operator Overloading : only + operator is overloaded in java**
###############################################################
Flow Control Statements
Selection : if-else, switch
Iterative : while, do-while, for, for-each
Transfer : break, continue (skip iteration), return, try-catch-finally, assert
**use break in switch statements**
**switch fall through : two case have common logic**
###############################################################
Access Modifiers
**Default is package level access modifier**
access modifiers : public, private, protected, package
###############################################################
Packages
java.lang (implicitly )
java.util
java.io
com.company.controller
com.company.service
com.company.entities
com.company.dto
###############################################################
Inheritance
Single Inheritance (Parent extends Object)
Multi Level Inheritance (Audi extends Car) (Car extends Vehicle)
(Parent is instantiated first by JVM then Child is instantiated)
Hierarchical Inheritance

super keyword
Employee : Developer, Tester, Manager
###############################################################
Abstract : Theoretical not Practical / not implemented
Abstract Class (Partial Abstraction)
Interface (Complete Abstraction)
**Marker Interface (no method definition) : Cloneable, Serializable, RandomAccess (used by ArrayList) **
**interface methods by default : public abstract**
**interface variables by default : public static final so variables must be initialized**
interface vs abstract class
**final vs abstract**
one abstract method then class becomes abstract
we cannot use both final and abstract to a class, method
final class cannot have abstract method
abstract class can have final method
###############################################################
Polymorphism
Compile Time / Static Binding / Method Overloading
Runtime Time / Dynamic Binding / Method Overriding (same signature parent-child macbookPro,macbookAir start() shutdown() )
(we can switch implementation at runtime)
interface : specification
class : implementation
- interface support multiple inheritance
- interface support complete abstraction(List -> ArrayList LinkedList)

Upcasting -> Child to Parent -> Parent parent = new Child()
Downcasting -> Parent to Child -> byte b = (byte) i

Auto Promotion int -> float, int -> long
**Most specific Child class version is invoked in inheritance**
###############################################################




