fun main(arr:Array<String>){
    var n:Int?
    print("Enter number of numbers:")
    n = readLine()!!.toInt()
    var temp : Int?
    var array  = Array<Int>(n){ readLine()!!.toInt()}
    for(i in 1..array.size-1){
        for(j in 1..array.size-1-i){
            if(array[j]>array[j+1]){
                temp = array[j]
                array[j] = array[j+1]
                array[j+1] = temp
            }
        }

    }
    println("The sorted array is ")
    for(i in array){
        print("$i ")
    }





}