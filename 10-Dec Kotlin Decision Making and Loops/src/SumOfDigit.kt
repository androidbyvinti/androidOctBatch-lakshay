
fun main(args: Array<String>) {

    var value = 1200
    var temp = 0
    var sum = 0

    while (value>0){
        temp = value % 10   // 25 / 10 --> 2 --> 5
        sum += temp // 0 + 3 = 3 + 5 = 8
        value /= 10  // 25 / 10 - > 2
    }
    println(sum)

}