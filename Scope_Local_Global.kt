var globalVariable = "This is a Global Variable"
fun display1():Unit{
    println(globalVariable)
}


fun main(args:Array<String>){
   var localVariable = "This is a Local  Variable"
    println(localVariable)
    display1()
    globalVariable = globalVariable + "\t"+localVariable
    println("Modified global variable is \n"+globalVariable)
}
