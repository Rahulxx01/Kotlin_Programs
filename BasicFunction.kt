fun main(args:Array<String>){

    println("Enter a:")
    var a:Int = readLine()!!.toInt()
    println("Enter b:")
    var b:Int = readLine()!!.toInt()
    var r = sum(a,b)
    println("Sum of a and b is : $r")
}

fun sum(a:Int,b:Int):Int?{
    var sum:Int? = a+b
    return sum

}