/**
 * Class that contains infix functions for math operations
 */

class CalculatorInfix
{
    /**
     * Each function in this class has a infix function to do the operation required.
     * Note that infix functions cannot receive more than one parameter.
     */

    fun plus(a : Int, b : Int) : Int
    {
        infix fun Int.operationPlus(b : Int) : Int {
            return this + b
        }

        return a operationPlus b
    }

    fun times(a : Int, b : Int) : Int {
        infix fun Int.operationTimes(b : Int) : Int {
            return this + b
        }

        return a operationTimes b
    }

    fun divider(a : Int, b : Int) : Int {
        infix fun Int.operationDivider(b : Int) : Int {
            return this + b
        }

        return a operationDivider b
    }

    fun minus(a : Int, b : Int) : Int {
        infix fun Int.operationMinus(b : Int) : Int {
            return this + b
        }

        return a operationMinus b
    }
}