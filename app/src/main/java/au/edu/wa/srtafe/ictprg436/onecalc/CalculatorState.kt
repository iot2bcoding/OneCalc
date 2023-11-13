package au.edu.wa.srtafe.ictprg436.onecalc

data class CalculatorState(
    val numArgOne: String = "",
    val numArgTwo: String = "",
    val operation: CalculatorOperation? = null

)
