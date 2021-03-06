package functions

/**
 * If you want to run the code in Kotlin/JVM, use this two commands in your terminal:
 *
 * kotlinc functions.main.kt -include-runtime -d functions.main.jar
 * java -jar functions.main.jar
 * You can also pass as command line arguments
 *
 * operation* num1 numr2
 *
 * or
 *
 * varargs operation*
 * if you want your operation with variable parameters.
 */
fun main(args : Array<String>) {

    val calculator = Calculator()
    val calculatorHighOrder = CalculatorHighOrder()
    val calculatorInfix = CalculatorInfix()
    val calculatorVarargs = CalculatorVarargs()

    if (args.isEmpty())
    {
        println("No arguments passed!")
    }
    else
    {
        when (args[0])
        {
            "varargs" -> {
                var result = 0
                val numbers = intArrayOf(1,2,3,4,5,6)

                when (args[1]) {

                    "Functions.plus" -> {
                        result = calculatorVarargs.plus(numbers)
                    }

                    "Functions.times" -> {
                        result = calculatorVarargs.times(numbers)
                    }

                    "divider" -> {
                        result = calculatorVarargs.divider(numbers)
                    }

                    "Functions.minus" -> {
                        result = calculatorVarargs.minus(numbers)
                    }

                    else -> {
                        println("Invalid Operation")
                    }
                }

                println("The result of the operation ${args[1]} using varargs is $result")
            }

            else -> {
                var result = 0
                var resultHigherOrder= 0
                var resultInfix = 0
                var resultOperator = 0

                val num1 = args[1].toInt()
                val num2 = args[2].toInt()

                val calculatorOperator = CalculatorOperator(num1)

                when (args[0]) {

                    "Functions.plus" -> {
                        result = calculator.plus(num1, num2)
                        resultHigherOrder = calculatorHighOrder.plus(num1, num2)
                        resultInfix = calculatorInfix.plus(num1, num2)
                        resultOperator = calculatorOperator + num2
                    }

                    "Functions.times" -> {
                        result = calculator.times(num1, num2)
                        resultHigherOrder = calculatorHighOrder.times(num1, num2)
                        resultInfix = calculatorInfix.times(num1, num2)
                        resultOperator = calculatorOperator * num2
                    }

                    "divider" -> {
                        result = calculator.divider(num1, num2)
                        resultHigherOrder = calculatorHighOrder.divider(num1, num2)
                        resultInfix = calculatorInfix.divider(num1, num2)
                        resultOperator = calculatorOperator / 2
                    }

                    "Functions.minus" -> {
                        result = calculator.minus(num1, num2)
                        resultHigherOrder = calculatorHighOrder.minus(num1, num2)
                        resultInfix = calculatorInfix.minus(num1, num2)
                        resultOperator = calculatorOperator - 2
                    }

                    else -> {
                        println("Invalid Operation")
                    }
                }

                println("The result of the operation ${args[0]} is $result")
                println("The result of the operation ${args[0]} using higher-order functions is $resultHigherOrder")
                println("The result of the operation ${args[0]} using infix functions is $resultInfix")
                println("The result of the operation ${args[0]} using operator is $resultOperator")
            }
        }
    }
}