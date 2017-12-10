
fun main(args: Array<String>) {

    var first = 150
    var second = 20


    var max = if (first > second) {
        println("first is assigned")
        first
    } else {
        println("second is assigned")
        second
    }
    println(max)

}