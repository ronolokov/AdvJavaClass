# Generics

## Why Use Generics?
Generics enable types (classes and interfaces) to be parameters when defining classes, interfaces and methods. Much like the more familiar formal parameters used in method declarations, type parameters provide a way for you to re-use the same code with different inputs. 

## Type Parameter Naming Conventions

By convention, type parameter names are single, uppercase letters. This stands in sharp contrast to the variable naming conventions that you already know about, and with good reason: Without this convention, it would be difficult to tell the difference between a type variable and an ordinary class or interface name.

The most commonly used type parameter names are:

E - Element (used extensively by the Java Collections Framework)
K - Key
N - Number
T - Type
V - Value
S,U,V etc. - 2nd, 3rd, 4th types

## Advantages of Generics:

Programs that uses Generics has got many benefits over non-generic code.
1.  Code Reuse: We can write a method/class/interface once and use for any type we want.

2.  Type Safety : Generics make errors to appear compile time than at run time

3.  Individual Type Casting is not needed. Typecasting at every retrieval operation is a big headache. 



# Lambda

```java

new DummyInterface2() {
    @Override
    public String applySlogan(String slogan) {
        return "Steve Jobs says: " + slogan;
    }
}
                | Lambda
                V
(String slogan) -> {
    return "Steve Jobs says: " + slogan;
}
                | if we have only one line, then we dont need curly braces, and we dont return 
                V

(String slogan) -> "Steve Jobs says: " + slogan
                
                | if it has only one parameter, then can remove paranthesis and I can remove type of parameter
                V

slogan -> "Steve Jobs says: " + slogan


```






















