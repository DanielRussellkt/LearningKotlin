package Learning.Kotlin

class Basics {
    //Companion object allows classes to be instantiated, in the below example there is no name
    //Not really basic, but simple way of giving me access to this in runner.kt
    companion object {
        fun create(): Basics = Basics()
    }

    //Functions are declared with fun, and Parameters are in Pascal Notation
    //Funtions without return types simply omit the type, rather than specify they are void
    //"Unit", however, corresponds to java's void, and can be specified if required (It is not EXACTLY the same)
        fun print(toPrint: String): Unit{
            //Kotlin uses the same print syntax as Scala, nice start
            println(toPrint)
        }


    //Functions can have a return type, which can either be specified by : [Type}, or inferred
        fun sum(x: Int, y: Int): Int{
            return x + y
        }

    //A return type for the below will be inferred from the expression
        fun inferredIntReturn(x: Int, y: Int) = x + y

        fun inferresStringReturn(x: Int, y: Int) = (x+y).toString()

    //Immutable variables;
        val one = 1
        //one will have its type inferred as Int
        val two: Int = 2
        //two is immediately assigned a type
        //val three: Int
        //three will need to be assigned later, and cannot be declared without its expected type
        //three = 3
        //three can then be assigned later, this cannot be done in this location, but would work when placed directly in runner.kt
        //Note that three is still val, and therefore immutable

    //Mutable Variables;
        var mutableNumber = 1
        //Same keywords as scala, nothing new here, can then be reassigned or modified later

    //String Templates - Same as string interpolation in scala
        //The $ within a string can preface functionality to be called within that string
        val wrong = "Kotlin is not better than Java"
        val statement = "How could you possibly say \"$wrong\"!?"

        //This can even use expressions and provide quite complex functionality;
        val right = "I think they meant \"${wrong.replace("is not", "is so much")}\""

    //Kotlin conditionals
        //Pretty standard to be honest
        fun compare(x: Int, y: Int): String{
            if(x==y){
                return "equal"
            }else if(x>y){
                return "$x is greater than $y"
            }else if(y>x){
                return "$y is greater than $x"
            }else return "Impossible!?"
        }

        //If can also be used as an expression
        fun highest(x: Int, y: Int) = if (x > y) x else y

        //Because if/else can be used as an expression, ternaries do not exist
        //Realistically though, with extension methods one could easily create a ternary operator

    //Nullability
        //Kotlin distinguishes references than can/cannot hold null with ?
        //Kotlin throws compilation errors if a non-nullable variable is assigned to null
        //This prevents NPEs unless specifically thrown, using !!, or by interoperating with java methods
        fun multiply(x: Int?, y: Int?){
            //Because x and y can be null, return x*y is not possible
            if (x != null && y != null){
                //Null checks in kotlin cast the variables to non-nullable
                //So now, x*y will work
                //Love this, basically enforces null checking before even compiling
                println(x*y)
            }
            else{
            println("$x or $y is null, method failed")
            }
        }

    //Type checking and automatic casts
        fun checkStringLength(toCheck: Any): Int? {
            //Kotlin offers easy type checking with "is" evaluating to boolean
            if (toCheck is String){
                //Casts to string from Any
                return toCheck.length
            }
            //If it is still Any
            return null
        }
        //The above could also be done with (toCheck !is String) return null, then returning toCheck.length

    //Loops
        //For
            val seasons = listOf("Winter", "Spring", "Summer", "Autumn")

            fun iterate() {
            //foreach implementation (Although .foreach exists for collections)
            for (season in seasons) {
                println(season)
            }
            //the below is the same, but prints. .indices is useful
            //for (index in seasons.indices){
            //    println("Season $index is ${seasons[index]}")
            //}

            //For the standard for i=0, i>10, i++ scenario, ranges should be used (for (i in 1..10))
            }

        //While
            fun whileIterate(collection: List<Any>) {
                var index = 0
                while (index < collection.size) {
                    println(collection[index])
                    index++
                }
            }


    //When - Kotlin's alternative to java's switch/scala's case/match
        //This is POWERFUL, works analogously to scala as far as i can see
        fun whatIsThis(obj: Any): String =
            //Really nice, "When x is y" is syntactically nice to read
            when (obj) {
                1           -> "one"
                "II"        -> "two"
                is Int      -> "other integer"
                !is String  -> "Not already a string"
                else        -> "Some other value"
            }
        //Also note the lack of curly braces, returns the string directly from the when. Else acts as "default"

    //Ranges
        //Same as scala - start, end and step
        val oneToTen = (1..10)
        //With step progressions
        val odds = (1..20 step 2)

    //Collections
        //Kotlin has List, Set and Map, if needed, mutableList interface can allow for modification
        val numbers: MutableList<Int> = mutableListOf(1,2,3)
        val numbers2: List<Int> = listOf(1,2,3)

        //Ints can be added to the mutable list by the below
        //numbers.add(4)
        //Note that it is still val and immutable, and cannot be reassigned
        //numbers = listOf<Int>(1,2,3)
        //Numbers2 cannot have anything added to it with the add method, as it is completely immutable

        //Sets function effectively the same as in Scala
        val setExample: Set<String> = setOf("a", "b", "c", "c")
        //println(setExample.size) returns 3, as the "c" only exists once



}


