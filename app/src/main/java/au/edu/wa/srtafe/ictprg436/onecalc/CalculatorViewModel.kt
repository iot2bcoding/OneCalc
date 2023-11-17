package au.edu.wa.srtafe.ictprg436.onecalc

/**
 * Here is where the business logic lives
 * also where the state is held
 */
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import kotlin.math.cos
import kotlin.math.sin
import kotlin.math.sqrt
import kotlin.math.tan

class CalculatorViewModel : ViewModel() {
    var state by mutableStateOf(CalculatorState())
        private set
    fun onAction(action: CalculatorAction){
        when(action){
            is CalculatorAction.Number -> enterNumber(action.number)
            is CalculatorAction.Decimal -> enterDecimal()
            is CalculatorAction.Clear -> state = CalculatorState()
            is CalculatorAction.Operation -> enterOperation(action.operation)
            is CalculatorAction.Calculate -> performCalculation()
            is CalculatorAction.Delete -> performDelete()

        }
    }

    private fun performDelete() {
        when{
            state.numArgTwo.isNotBlank() -> state = state.copy(
                numArgTwo = state.numArgTwo.dropLast(1)
            )
            state.operation != null -> state = state.copy(
                operation = null
            )
            state.numArgOne.isNotBlank() -> state = state.copy(numArgOne = state.numArgOne.dropLast(1))
        }
    }

    private fun performCalculation() {
        val number1 = state.numArgOne.toDoubleOrNull()
        val number2 = state.numArgTwo.toDoubleOrNull()
        var result = 0.0

        // Check if it's a single operand operation
        val singleOpList = arrayListOf(
            CalculatorOperation.Sin,
            CalculatorOperation.Cos,
            CalculatorOperation.Tan,
            CalculatorOperation.Sq
            // Add other single operand operations as needed
        )
        if (singleOpList.contains(state.operation)) {
            // Check for one operand, or Bail
            if (number1 != null) {
                // Handle single operand calculations here
                result = when (state.operation) {
                    is CalculatorOperation.Sin -> sin(number1)
                    is CalculatorOperation.Cos -> cos(number1)
                    is CalculatorOperation.Tan -> tan(number1)
                    is CalculatorOperation.Sq -> sqrt(number1)
                    else -> return
                }
            }
        } else {
            // Check for two operands, or Bail
            if (number1 != null && number2 != null) {
                // Handle two operand calculations here
                result = when (state.operation) {
                    is CalculatorOperation.Add -> number1 + number2
                    is CalculatorOperation.Subtract -> number1 - number2
                    is CalculatorOperation.Multiply -> number1 * number2
                    is CalculatorOperation.Divide -> {
                        if (number2 != 0.0) {
                            number1 / number2
                        } else {
                            // Handle division by zero here
                            // You may want to display an error message or handle it as appropriate
                            return
                        }
                    }
                    is CalculatorOperation.Power -> Math.pow(number1, number2)
                    else -> return
                }
            }
        }
        state = state.copy(
            numArgOne = result.toString().take(15),
            numArgTwo = "",
            operation = null
        )
    }

    private fun enterOperation(operation: CalculatorOperation) {
        //  We need the first argument number before we can enter an operation
        if (state.numArgOne.isNotBlank()){
            //  Use of copy method creates new State object, thus preserving immutability
            state = state.copy(operation = operation)
        }
    }

    //  We need to determine if we are working with first number operand, or second, and that
    //  if its the first one we haven't exceeded our Max len
    //  I found the original code very clunky with too many return statements

    private fun enterNumber(number: Int) {
        val currentNumber = if (state.operation == null) state.numArgOne else state.numArgTwo

        if (currentNumber.length < MAX_NUM_LENGTH) {
            state = if (state.operation == null) {
                //  The state.copy method creates a new state object with the specified
                //  properties changed, the old state object will be dereffed and cleaned up
                state.copy(numArgOne = currentNumber + number)
            } else {
                state.copy(numArgTwo = currentNumber + number)
            }
        }
    }
    companion object {
        private const val MAX_NUM_LENGTH = 8
    }

    //  We need to determine if we are working with first number operand, or second, and that
    //  if its the first one we haven't exceeded our Max len
    //  I found the original code very clunky with too many return statements
    //  NOTE There is a bug you can't add a decimal number with no whole number component
    //

    private fun enterDecimal() {
        val currentNumArg = if (state.operation == null) state.numArgOne else state.numArgTwo

        //  The old code checked if there is a number already, and the string does not already have a decimal
        //  - if (currentNumArg.isNotBlank() && !currentNumArg.contains(".")) { -
        //  new code removes requirement for a number to be present, just checks there isn't one
        //  present already

        if (!currentNumArg.contains(".")) {
            state = if (state.operation == null) {
                //  Using template for string concat, compiler suggestion
                state.copy(numArgOne = "$currentNumArg.")
            } else {
                state.copy(numArgTwo = "$currentNumArg.")
            }
        }
    }
}