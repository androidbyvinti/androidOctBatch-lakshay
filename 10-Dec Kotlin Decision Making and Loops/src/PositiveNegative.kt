
fun main(args: Array<String>) {

    var value = -200

//    if(value>0){
//        println("Positive")
//    } else if(value<0){
//        println("Negative")
//    } else {
//        println("Equal to zero")
//    }

    when {
        value>0 -> println("Positive")
        value<0 -> println("Negative")
        else -> println("Equal to zero")
    }

}