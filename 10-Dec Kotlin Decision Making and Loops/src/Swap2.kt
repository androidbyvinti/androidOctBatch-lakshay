fun main(args: Array<String>) {

    var first = 456
    var second = 124

    first += second // 456 + 124 // first = 580
    second = first - second //580 - 124 = second =  456
    first -= second // 580 - 456 = first = 124

    println("First variable is = $first")
    println("Second variable is = $second")

}