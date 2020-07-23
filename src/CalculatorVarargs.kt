/**
 * Class that contains functions to calculate math operations with variable parameters
 */

class CalculatorVarargs
{
    fun plus(nums : IntArray) : Int
    {
        return doOperation(false, *nums) { a : Int, b : Int ->
            a + b
        }
    }

    fun times(nums : IntArray) : Int
    {
        return doOperation(true, *nums) { a : Int, b : Int ->
            a * b
        }
    }

    fun divider(nums : IntArray) : Int
    {
        return doOperation(true, *nums) { a : Int, b : Int ->
            a / b
        }
    }

    fun minus(nums : IntArray) : Int
    {
        return doOperation(false, *nums) { a : Int, b : Int ->
            a - b
        }
    }

    /**
     * This function receives a variable number of int parameters and a lambda function.
     * It will apply the result of the lambda for each of the parameters received
     * and return the result
     */
    private fun doOperation(resultValue : Boolean, vararg nums : Int, function : (a: Int, b : Int) -> Int) : Int
    {
        var result = if (resultValue) 1 else 0
        for (i in nums)
            result = function(result, i)

        return result
    }
}