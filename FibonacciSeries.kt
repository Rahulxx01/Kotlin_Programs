fun main(args:Array<String>){
    var n:Int?
    var a = 1
    var b = 1
    var i:Int?
    var next:Int?
    print("Enter the value of n to be displayed :")
    n = readLine()!!.toInt()
    println("Series")
    for(i in 1..n){
        if(i<=2){
            next = 1
        }else{
            next = a+b
            a = b
            b = next
        }
        print("$next\t")
    }
}