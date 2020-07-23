package functions

/**
 * Class of higher-order functions for math operations
 */

class CalculatorHighOrder
{
    fun plus (a : Int, b : Int): Int {
        return doOperation(a, b) { _: Int, _: Int ->
            a + b
        }
    }

    fun times (a : Int, b : Int) : Int {
        return doOperation(a, b) { _ : Int, _ : Int ->
            a * b
        }
    }

    fun minus (a : Int, b : Int): Int {
        return doOperation(a, b) { _: Int, _: Int ->
            a - b
        }
    }

    fun divider (a : Int, b : Int): Int {
        return doOperation(a, b) { _: Int, _: Int ->
            (a / b)
        }
    }

    /**
     * This is a higher-order function that receives two int numbers and a lambda function
     * and returns the result of the lambda.
     */
    private fun doOperation(num1 : Int, num2 : Int, function : (a:Int, b: Int) -> Int) : Int
    {
        return function(num1, num2)
    }
}