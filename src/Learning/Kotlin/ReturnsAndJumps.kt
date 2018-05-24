package Learning.Kotlin

import org.w3c.dom.ranges.Range

class ReturnsAndJumps {
    companion object {
        fun create(): ReturnsAndJumps = ReturnsAndJumps()
    }

    //Break and Continue Labels
        //Expressions in Kotlin can be marked with labels with @
        fun labelsAreDecent() {
            loop@ for (i in 1..100) {
                for (j in 1..100) {
                    //The below break jumps to the next iteration of the @loop, not the one it's in
                    if (j==75) break@loop
                    //The below moves on to the next iteration of @loop
                    if (i==50) continue@loop
                }
            }
        }
        //Because a return defaults to the nearest enclosing function, labels are needed to return to other points, like a for loop or lambda.
        fun return1() {
            listOf(1,2,3,4,5).forEach lambdaReturn@{
                if (it == 3) return@lambdaReturn
                print(it)
            }
            print("\nThis returns to the foreach, skipping 3")
        }
        //This can be done also implicitly with a label the same as the funtion a lambda is passed to
        fun return2() {
            listOf(1,2,3,4,5).forEach {
                if (it == 3) return@forEach
                print(it)
            }
            print("\nThis returns to the foreach, skipping 3, but with an implicit Label")
        }
        //In an anonymous function, no tags are needed, as the nearest enclosing function then becomes that, and it will return directly to that
        fun return3() {
            listOf(1,2,3,4,5).forEach(fun(value: Int) {
                if (value == 3) return
                print(value)
            })
            print("\nasdf")
        }
}
