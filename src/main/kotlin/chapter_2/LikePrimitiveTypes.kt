package chapter_2

import java.util.Arrays

fun main() {

    charPlusAndCastToIntForStdOut() // 50

    waysToDeclareVariables() // 5

    val l: Long = castIntToLongAndAssignInt(50)
    println(l) // 50

    @Suppress("UNUSED_VARIABLE") val arrUnit = createArray()
    // out:
    // firstElem
    // [firstElem, 2]
    // [firstElem, secondElem]
}

/**
 * Initialize val char and assign value '1'.
 *
 * Invoke 'plus' fun in char and plus '1' after assign to charPlus.
 *
 * Use only .code function instead 'as' operator. char as String in Kotlin like (String) char in Java
 */
fun charPlusAndCastToIntForStdOut() = run {
    val char = '1'
    val charPlus = char + 1
    println(charPlus.code)
}

/**
 * You can declare variables without initialization like var x: Int but not var x. Compiler must know a type of concrete variable in compile time.
 *
 * In this case it can't implicitly assign type for var that why you need give explicitly type for it
 */
@Suppress(
    "UNUSED_VARIABLE", "RedundantExplicitType", "JoinDeclarationAndAssignment", "CanBeVal",
)
fun waysToDeclareVariables() = run {
//    var x;
// Doesn't work, cuz compiler can't implicitly give type for this variable without value
// (Everytime compiler first check on value type, than create object of this type and assign implicitly type for variables like this object's type)
    @Suppress("ASSIGNED_BUT_NEVER_ACCESSED_VARIABLE") val f: Float
    @Suppress("UNUSED_VALUE")
    f = 1F // can't be f = 1 cuz need float value
    val x: Int // it works
    var x2: Int = 2 // it works, but prefer var x2 = 2 (without explicitly type declaration)
//    println(x) // must initialize x
    x = 3
    println(x + x2)
}

/**
 * [intVal] input value which has Int type must transform to Long for assign to Long variable
 * (val l: Long) can't refer on Int object, for what you need use function toLong
 */
fun castIntToLongAndAssignInt(intVal: Int): Long {
    return intVal.toLong()
}

/**
 * Compiler while reading file replace:
 *
 * val arrayAllTypes: Array<*> = arrayOf("firstElem", 2) as Object[] arrayAllTypes = new Object[]{"firstElem", 2};
 *
 * anyVal: Any? = arrayAllTypes[0] as Object[] anyVal = arrayAllTypes[0];
 *
 * println(anyVal) as System.out.prinln(anyVal);
 *
 * val arrayStrings: Array<String> = arrayOf("firstElem", "second") as String[] arrayString = new String[]{"firstElem", "secondElem"}
 */
fun createArray() = run {
    val arrayAllTypes: Array<*> = arrayOf("firstElem", 2)
    val anyVal: Any? = arrayAllTypes[0]
    println(anyVal)
    val arrayStrings: Array<String> = arrayOf("firstElem", "secondElem")
    println(arrayAllTypes.contentToString())
    @Suppress("ReplaceJavaStaticMethodWithKotlinAnalog")
    println(Arrays.toString(arrayStrings))
}
