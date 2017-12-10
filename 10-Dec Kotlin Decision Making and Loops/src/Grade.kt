
fun main(args: Array<String>) {

    var value = 121

    when{
        value in 90..100 -> println("Grade A")
        value in 70..89 ->println("Grade B")
        value in 50..69 -> println("Grade C")
        value<50 -> print("Grade D")
        else-> println("Value Must be within 1-100")
    }
}