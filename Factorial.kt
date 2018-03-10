fun main(args:Array<String>){
    var num:Int
    var factorial:Long = 1
    print("Enter the number you want to calculate factorial:")
    num = readLine()!!.toInt()
    if(num<0){
        println("Invalid number")
    }else{
        for(i in 1..num){
            factorial = factorial * i
        }
    }
    println("Factorial of $num is $factorial")
}