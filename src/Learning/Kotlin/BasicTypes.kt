package Learning.Kotlin

class BasicTypes{
    companion object {
        fun create(): BasicTypes = BasicTypes()
    }

    //Numerical
        //Kotlin has all of the basic data types; Double, Float, Long, Int, Short, Byte
        //There are also a few literal constants
        val long = 500L //Tagged as long, F or f tags floats

        //Underscores can be used to make any number constants more readable
        val creditCardNumber = 1234_5678_9012_3456L
        val sortCode = 11_06_42

        //Unless nullable types are needed, numbers are stored as JVM primitives
        val a: Int = 10_000
        //a === a will be true
        //If nullables are needed, the primitives are boxed
        val boxed1: Int? = a
        val boxed2: Int? = a
        //Boxing does not preserve identity, but does preserve equality
        //boxed1 === boxed2 is false
        //boxed1 == boxed2 is true

        //Implicit conversion does not exist (Java int 1 + double 2.0 converts the int to the larger type first)
        val b: Byte = 5
        //val c: Int = b cannot be done, without explicit conversion
        val c: Int = b.toInt()
        //All number types support all type conversions, and if not extension methods can easily be added
        //Implicit conversion is largely useless due to type being inferred from the context of the expressions
        val thisIsADouble = 20L + 20.01
        //All basic operators are also present

    //Characters
        //Characters are Char type, and cannot be used as numbers
        //Literals go in single quotes eg. '1'
        //Escape characters are : \t, \b, \n, \r, \', \", \\ and \$
        val charAsNum = '1'.toInt()
        //Although cannot be used as numbers, explicit conversion can be done

    //Booleans are the same as every language, besides the nullability
        //||, && and ! are supported operators

    //Arrays
        //Arrays can be initialised with arrayOf()
        val array = arrayOf(1,2,3)
        //Arrays in kotlin have some useful inbuilt methods, array.get() ,array.set(), array.size() and iterator()
        //[] operator makes a call to the get and set methods of array, and is best practice for use
        val index0 = array[0]
        //Array contructor is size, function, and can therefore be used to create an array based on indexing
        val arrayOfStrings = Array(10, {i -> i.toString()})
        val arrayOfSquares = Array(10, {i -> i*i})

        //ByteArray, ShortArray, IntArray etc. exist as independent classes for primitives without boxing overhead
        //Separate from Array, but have the same methods

    //Strings
        val str = "Strings in Kotlin"
        //Strings are immutable, and are made up of characters which can be referenced with []
        val firstChar: Char = str[0]
        //Are also iterable
        fun stringIterate(str: String) {
            for (char in str) println(char)
        }
        //Strings can be concatenated with +, but string templates or strings should be preferred
        val doubleString = str + str

        //Strings by default are escaped
        val escapedString = "Discard your fear\nOf the unknown"
        //""" is for raw strings, which can contain anything, including newlines etc.
        val rawString = """ |This string cannot be escaped: \n
                            |And can contain new lines
                            |Any leading whitespace can be trimmed with .trimMargin().
                            |Pipes are used as default margin"""
        //Templates are also available, but have been covered in Basics
}