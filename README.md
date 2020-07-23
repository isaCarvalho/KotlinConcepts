# Koltin Concepts

this repository is focus on the main concepts of kotlin language.
If you want to see some examples of how higher-order functions, lambda expressions, etc. works,
you can take a look in this module.

The idea is classes that does the main four math operations in different ways.
You can run the code and see how it works.

## Running the code

If you want to run the code in Kotlin/JVM, use this two commands in your terminal:

`kotlinc main.kt -include-runtime -d main.jar`
<br>
`java -jar main.jar`

You can also pass as command line arguments

`operation* num1 num2`

or

`varargs operation*`

if you want your operation with variable parameters.
<br>
<br>
*operation = plus, times, divider, minus