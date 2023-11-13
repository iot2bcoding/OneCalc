package au.edu.wa.srtafe.ictprg436.onecalc

/*
  CalculatorOperation is a sealed class, which means that it can only be subclassed within the same
  file where it is declared. Sealed classes are often used for representing restricted hierarchies,
  and they can have a finite number of subclasses.

  Inside the sealed class, there are five objects (Add, Subtract, Divide, Multiply, and Power)
  that are subclasses of CalculatorOperation. These objects are singletons, meaning that only one
  instance of each object exists in the program.

    Each object has its own symbol property, which is initialized with a specific string
    representing the corresponding calculator operation.

    For example, the Add object has a symbol of "+".
 */


sealed class CalculatorOperation(val symbol:String) {
    object Add: CalculatorOperation("+")
    object Subtract: CalculatorOperation("-")
    object Divide: CalculatorOperation("/")
    object Multiply: CalculatorOperation("x")
    object Power: CalculatorOperation("Pow")
    object Sin  : CalculatorOperation("Sin")
    object Cos  : CalculatorOperation("Cos")
    object Tan  : CalculatorOperation("Tan")
    object Sq   :  CalculatorOperation("Sq")
}
