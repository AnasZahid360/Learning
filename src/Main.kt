// 3 Logical Operators In Kotlin
// && (AND)
// || (OR)
// ! (NOT)

fun main() {

    val salary100000 = false
    val areYouAbleToBuyFerrari = true

    // && AND
    // If Both Conditions Are True, Condition 1 && Condition 2, Answer Will Be True
    // If One Condition Is True And Other Is False, Condition 1 && Condition 2, Answer Will Be False

    var ferrariShowroom = salary100000 && areYouAbleToBuyFerrari
    println(ferrariShowroom)

    // || OR
    // If Any Condition Is True, Condition 1 || Condition 2, Answer Will Be True

    ferrariShowroom = salary100000 || areYouAbleToBuyFerrari
    println(ferrariShowroom)

    // Short Circuiting
    // This mechanism applies when an interpreter
    // is executing logical expressions, and skips the "irrelevant" parts of the expressions.

    var i = 15
    var j = 18

    var result = i == 16 || j++ == 18
    println(i)
    println(j)


    // ! NOT
    // false --> ! --> true
    // true --> ! --> false

//    val answer = true
//    result = !answer
//     println(result)


        val isRaining = false

        if (isRaining == false){
            println("Enjoy Your Day")
        }
        else{
            println("Take Umbrella")
        }
    }

