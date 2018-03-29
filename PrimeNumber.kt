fun main(args:Array<String>){
    var n:Int?
    var i:Int?
    var flag = false;
    print("Enter the number:")
    n = readLine()!!.toInt()
    for(i in 2..(n/2)){
        if(n%i == 0){
            flag = true;
            break
        }
    }
    if(flag || n<=1){
        println("$n is not a prime number");
    }else{
        println("$n number is a prime number")
    }

}