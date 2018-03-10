fun main(args: Array<String>){
    var a:Double
    var b:Double
    var c:Double
    print("Enter a:")
    a = readLine()!!.toDouble()
    print("Enter b:")
    b = readLine()!!.toDouble()
    c = a+b

    println("$a + $b = $c")
    c = a-b
    println("$a - $b = $c")
    c = a*b
    println("$a * $b = $c")
    if(b>0){
        c = a/b
        println("$a / $b = $c")
        c = a%b
        println("$a % $b = $c")

    }





}