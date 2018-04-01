fun main(args:Array<String>){

    show(10)
    show("Hello world")
    show(21.2)


}

fun show(n1:Int):Unit{
    println("n1: $n1")
}

fun show(n1:String):Unit{

    println("n1:$n1")

}
fun show(n1:Double):Unit{
    show(22)
    show("Polymorphysim")
    println("n1:$n1")
}