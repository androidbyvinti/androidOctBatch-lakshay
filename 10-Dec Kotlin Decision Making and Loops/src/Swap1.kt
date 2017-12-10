

fun main(args: Array<String>) {

    var first  = 10
    var second = 20
    var temp = 0


    temp = first // temp = 10, first = 10
    first = second // second = 20, first = 20
    second = temp

    //string interpolation
    println("Value of first variable = $first")
    println("Value of second variable = $second")

}
