
fun main(args: Array<String>) {

    var gender = "male"
    var age = 43
    var city  = "metro"

    when{
        age in 25..35 && gender=="male" && city=="metro"-> println("6% premium")
        age in 25..40 && gender=="male" && city=="non-metro"-> println("4% premium")
        age in 25..42 && gender=="female" && city=="metro"-> println("3% premium")
        age in 25..45 && gender=="female" && city=="non-metro"-> println("2% premium")
        else-> println("Not insured")
    }

}