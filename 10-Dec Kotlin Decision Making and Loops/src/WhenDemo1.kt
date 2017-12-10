
// WAP to check the char is vowel or consonant

fun main(args: Array<String>) {

    var value = 't'

//    if(value == 'a' || value == 'e' || value == 'i' || value == 'o' || value == 'u')
//        println("vowel")
//    else
//        println("consonant")

    when(value){
        'a','e','i','o' ,'u'-> println("vowel")
        else -> println("consonant")
    }


}