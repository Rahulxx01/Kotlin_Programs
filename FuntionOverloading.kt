fun main(args:Array<String>){

    var sumTotal = sum1(10,20)
    println("sumTotal: $sumTotal")

    var sumTotal1 = sum1(10,20,30)
    println("sumTotal: $sumTotal1")

    var sumTotal2 = sum1(10,20,30,40)
    println("sumTotal: $sumTotal2")

    var sumTotal3 = sum1(10,20,30,sum1(10,10,sum1(10,10,10,sum(10,10))))
    println("sumTotal: $sumTotal3")


}

fun sum1(n1:Int,n2:Int):Int{
    return n1+n2
}

fun sum1(n1:Int,n2:Int,n3:Int):Int{
    return n1+n2+n3

}

fun sum1(n1:Int,n2:Int,n3:Int,n4:Int):Int{
    return n1+n2+n3+n4

}
