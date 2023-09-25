# Unit2

# A simple Java program

Note :  Java adopts the convention that class names start with a capital letter, and method names with a lowercase
letter.

<br/>

# Method calls -[link](https://medium.com/computer-programming-and-so-can-you/the-call-stack-or-how-to-find-your-way-to-where-you-are-going-and-back-again-a40571e40566)

- the call stack is the part of memory contains local variables, parameters and return addresses.
  <img width="528" alt="스크린샷 2023-09-24 오후 11 09 51" src="https://github.com/nhnacademyGroup5/IntroductiontoProgramming/assets/119652360/2d1ea9d3-c2ad-45fe-bbd3-4449d6e27d73">
  <br/>

<img width="611" alt="스크린샷 2023-09-24 오후 11 15 51" src="https://github.com/nhnacademyGroup5/IntroductiontoProgramming/assets/119652360/0e1ba4d7-2921-42b1-ba48-444556bbd5f9">

#Objects and classes in Java
-Objects : can be manipulated by programs(invoking their methods), belongs to a class(an instance of class).
-Classes : is constituted by a set of objects have same properties, determines methods are available for the objects.

<br/>

## Static Method -[link](https://tecoble.techcourse.co.kr/post/2020-07-16-static-method/)

# Assignment

Syntax :
-variableName = expression;

- variableName is the name of a variable
- expression is an expression that, when evaluated, must return a value of the type of thr variable.

<br/>

# The class String

-String methods
-String concat : concatenates the specified string to the end of this string.
-int length    : returns the length of this string.
-String substring : returns substring of this string.
-String toLowerCase,toUpperCase : to lower or upper case.
-String trim : returns a copy of string omit white space.

<br/>

# Mutable objects :  the class StringBuffer

-StringBuffer methods    
-StringBuffer - constructs a String buffer.
-StringBuffer append - appends the string.
-StringBuffer replace - replace the characters in a substring.
-String toString - converts to a string representing the data.

-side-effect public static void main (String[] args) {
StringBuffer s = new StringBuffer("test");
StringBuffer t;
t = s;
s.append("!");
System.out.println(s.toString()); - test!
System.out.println(t.toString()); - test!

