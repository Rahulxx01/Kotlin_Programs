fun main(args:Array<String>){
    var n:Int?
    print("Enter a number:")
    n = readLine()!!.toInt()
    var temp = n
    var r=0
    while(n!=0){
        r = (r*10)+n%10
        n /=10
    }
    if(r == temp){
        println("$temp is a Palindrome")
    }else{
        println("$temp is not a Palindrome")

    }


}