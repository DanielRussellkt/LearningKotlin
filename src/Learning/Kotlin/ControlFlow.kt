package Learning.Kotlin

class ControlFlow {
    companion object {
        fun create(): ControlFlow = ControlFlow()
    }

    //If expression
        //In Kotlin if is an expression, hence there are no ternary operators
        fun whichIsHigher(y: Int, x: Int): Int{
        return if (x>y) x else y
        }
        //If branches can be blocks, with the final expression in the block being the value
        fun whichIsHigher2(y: Int, x: Int): Int{
            if (x>y) {
               println("X is higher")
               return x
            }
            else {
                println("Y is higher than or equal to")
                return y
            }
        }

    //When expression
        //When can match multiple cases to be handled the same way by using a comma
        fun whatIsX(x: Any): String{
            //As when is an expression it can be directly returned
            return when (x) {
                0, 1, is Int, is Long -> "Integer/Long"
                1.0, 10.00, is Double, is Float -> "Floating Point Number"
                is String -> "String"
                else -> {
                    //When cases can also br expressions, where the value is the last line of the block
                    println("No matches")
                    "Not Number or String"
                }
            }
        }
        val invalidNumbers = listOf<Int>(5,10,15,20)
        //in can be used also, to check boundaries or presence in a collection
        fun isXInRange(x: Number): String {
            return when (x) {
                in 1..10 -> "In range"
                !in invalidNumbers -> "Valid number"
                !in 1..20 -> "Out of range"
                else -> "Not Valid at all"
            }
        }

        //If no argument is given, when becomes analogous to an if expression, with the conditions becoming booleans
        val oddNumber = 1
        val isOneOdd: Boolean = when {
            oddNumber % 2 != 0 -> true
            oddNumber % 2 == 0 -> false
            else -> {
                print("what is wrong with x?!")
                false
            }
        }

    //While loops are the same as always, and do while loops also exist
        fun countDownToZero (x: Int) {
            var count = x
            do {
                val justForExample = x
                println(count)
                count--
            } while (count >= 0 && justForExample != 0)
            //In the above while expression, justForExample can be seen in the while condition, despite it being within the while loop scope.
            //This can be useful for waiting for operations to change null expressions
            //The justForExample shouldnt be in the loop, it is just there as an example of the do-while scope.
        }

    //Break and continue exist as expected also




}