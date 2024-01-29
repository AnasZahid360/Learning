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

//    var i = 15
//    var j = 18
//
//    var result = i == 16 || j++ == 18
//    println(i)
//    println(j)


    // ! NOT
    // false --> ! --> true
    // true --> ! --> false


        val isRaining = false

        if (isRaining == false){
            println("Enjoy Your Day")
        }
        else{
            println("Take Umbrella")
        }


        val x= 15
        val y = 20

        if (x > y){
           println("$x Is Greater Than $y")
        } else if (x < y) {
            println("$x Is Smaller Than $y")
        }else{
           println("$x Is Equal To $y")
        }


        // If And Else Can Be Used As An Expression
        val a = 20
        val b = 15

        if (a > b){
            println("A Is Greater Than B")
        }else if (a < b){
            println("A Is Smaller Than B")
        }else{
            println("A Is Equal To B")
        }

        val c = 18
        val d = 18

        if (c > d){
            println("C Is Greater Than D")
        }else if (c < d){
            println("C Is Smaller Than D")
        }else{
            println("C Is Equal To D")
        }
    // x > y, x < y, x==y


//        val number = 19
//        if (number % 2 == 0){
//            println("Number Is Even & Can Be Divided By 2")
//        }else{
//            println("Number Is Odd & Cannot Be Divided By 2")
//        }

//    val number = 88
//    val result = number in 1 until 88
//    println(result)


    val animal = "Dog"
    // When Can Also Be Used As An Expression Like If & Else
    when (animal){
        "Horse" -> println("Animal Is Horse")
        "Cat" -> println("Animal Is Cat")
        "Dog" -> println("Animal Is Dog")
        else -> println("Animal Not Found")
    }

    val digit = 19

    when (digit){
        13 -> println("Thirteen")
        14 -> println("Fourteen")
        15 -> println("Fifteen")
        16 -> println("Sixteen")
        in 17..19 -> println("Teen")
        else -> println("Not In Range")
    }

    // What Are Loops?
    // Loops Are Set Of Statements Which You Want To Be Executed Multiple Times

    var count = 1
    while (count <= 50)
    {
        println("This Bomb Will Go Off In  $count" ) // Concatenation
        count++
    }






    }

