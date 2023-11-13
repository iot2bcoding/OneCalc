package au.edu.wa.srtafe.ictprg436.onecalc
import java.util.Stack
//  todo Add this to the calculator, even though the number processing seems to be tangled
//   up in the View model making it so you can't have multiple operator in one calc, eg just one operation

class CalculatorParser {


    fun calculateExpression(expression: String): Double {
        val operators = Stack<Char>()
        val values = Stack<Double>()

        val precedence = mapOf('+' to 1, '-' to 1, '*' to 2, '/' to 2)

        var i = 0
        while (i < expression.length) {
            if (expression[i].isDigit() || (expression[i] == '.' && i + 1 < expression.length && expression[i + 1].isDigit())) {
                val stringBuilder = StringBuilder()
                while (i < expression.length && (expression[i].isDigit() || expression[i] == '.')) {
                    stringBuilder.append(expression[i])
                    i++
                }
                values.push(stringBuilder.toString().toDouble())
            } else if (expression[i] in "+-*/") {
                while (!operators.empty() && (precedence[operators.peek()]
                        ?: 0) >= (precedence[expression[i]] ?: 0)
                ) {
                    val operator = operators.pop()
                    val operand2 = values.pop()
                    val operand1 = values.pop()
                    values.push(applyOperator(operand1, operand2, operator))
                }
                operators.push(expression[i])
                i++
            } else if (expression[i] == '(') {
                operators.push(expression[i])
                i++
            } else if (expression[i] == ')') {
                while (!operators.empty() && operators.peek() != '(') {
                    val operator = operators.pop()
                    val operand2 = values.pop()
                    val operand1 = values.pop()
                    values.push(applyOperator(operand1, operand2, operator))
                }
                operators.pop() // Pop '('
                i++
            } else {
                // Ignore spaces and other characters
                i++
            }
        }

        while (!operators.empty()) {
            val operator = operators.pop()
            val operand2 = values.pop()
            val operand1 = values.pop()
            values.push(applyOperator(operand1, operand2, operator))
        }

        return values.pop()
    }

    private fun applyOperator(operand1: Double, operand2: Double, operator: Char): Double {
        return when (operator) {
            '+' -> operand1 + operand2
            '-' -> operand1 - operand2
            '*' -> operand1 * operand2
            '/' -> operand1 / operand2
            else -> throw IllegalArgumentException("Unsupported operator: $operator")
        }
    }
}