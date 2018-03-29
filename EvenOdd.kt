fun main(args:Array<String>){
    var n:Int?;
    print("Enter the value of n: ")
    n = readLine()!!.toInt()
    if(n%2 == 0){
        println("$n is an even number.")
    }else{
        println("$n is an odd number.")
    }
}