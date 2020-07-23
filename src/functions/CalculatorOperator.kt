package functions

data class CalculatorOperator(val a : Int)

operator fun CalculatorOperator.plus(b : Int) = a + b

operator fun CalculatorOperator.times(b: Int) = a * b

operator fun CalculatorOperator.div(b: Int) = a / b

operator fun CalculatorOperator.minus(b: Int) = a - b