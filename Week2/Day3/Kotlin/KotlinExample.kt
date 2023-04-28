fun main(){
    println("Hey this is main function")
    var x:String="data"
    var y:Int=10
    var z:Double=2.3
    println("x is "+x+" y is "+y+" z is "+z)

    if( y==10){
        println("Y is 10")
    }
    else{
        println("Y is not 10")
    }

    for(i in 1..10){
        println(i)
    }
    for(i in 10 downTo 1){
        println(i)
    }
    show()
    add(19,2)
    println(sum(10,2))
}

fun show(){
    println("This is new functions")
}
fun add(x:Int,y:Int){
    println("Total is "+(x+y))
}
fun sum(x:Int,y:Int):Int{
    return x+y
}