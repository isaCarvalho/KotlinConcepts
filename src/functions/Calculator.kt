package functions

/**
 * Class that contains the lambda functions for math operations
 */

class Calculator
{
    val plus = { a : Int, b : Int -> a + b }

    val times = { a : Int, b : Int -> a * b}

    val divider = { a : Int, b : Int -> (a / b).toInt()}

    val minus = { a : Int, b : Int -> a - b}
}