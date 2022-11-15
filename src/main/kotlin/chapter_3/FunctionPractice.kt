@file:Suppress("unused")

package chapter_3

fun main() {

    //------------------------------------------------------------------------------------------------------------------------------------------------------------------
    // if function has only 1 statement then code block unnecessary, and you can use '=' operator

    /**
     * can declare function with return type and without code block (must drop block code {} if using '=' operator).
     *
     * In this case return keyword implicitly
     */
    fun withReturnType(x: Int): Int = x

    /**
     * A function body can be an expression. Its return type is inferred.
     */
    fun withoutReturnType(x: Int) = x

    //------------------------------------------------------------------------------------------------------------------------------------------------------------------

    /**
     * can declare function with return type and code block (must drop '=' in this case for using {})
     *
     * In this case return keyword must be explicitly declare
     */
    fun withReturnTypeBlocked(x: Int): Int {
        return x
    }

    /**
     * Unit return type can be omitted.
     */
    fun printSum(a: Int, b: Int) {
        println("sum of $a and $b is ${a + b}")
    }

    /**
     * can declare function with return type and code block with run function inside (run function just another one fun like wrapper)
     *
     * run function can implicitly inquire return type for fun declaration
     */

    fun withReturnTypeBlockedWithRunFun(x: Int): Int =
        run { // fun withReturnTypeBlockedWithRunFun(x: Int) = run { return x } //also valid
            return x
        }

    //------------------------------------------------------------------------------------------------------------------------------------------------------------------
    //------------------------------------------------------------------------------------------------------------------------------------------------------------------

    /**
     * More info from
     *
     * @see <a href="https://kotlinlang.org/docs/returns.html#return-to-labels">Return labels</a>
     */

    fun fooReturn() {
        listOf(1, 2, 3, 4, 5).forEach {
            if (it == 3) return // non-local return directly to the caller of foo()
            print(it)
        }
        println("this point is unreachable")
    }

    fun litLabelReturn() {
        listOf(1, 2, 3, 4, 5).forEach lit@{
            if (it == 3) return@lit // local return to the caller of the lambda - the forEach loop
            print(it)
        }
        print(" done with explicit label")
    }

    fun foreachReturn() {
        listOf(1, 2, 3, 4, 5).forEach {
            if (it == 3) return@forEach // local return to the caller of the lambda - the forEach loop
            print(it)
        }
        print(" done with implicit label")
    }

    fun foreachAnonymousFunctionReturn() {
        listOf(1, 2, 3, 4, 5).forEach(fun(value: Int) {
            if (value == 3) return  // local return to the caller of the anonymous function - the forEach loop
            print(value)
        })
        print(" done with anonymous function")
    }

    fun runLabelOutForeachReturn() {
        run loop@{
            listOf(1, 2, 3, 4, 5).forEach {
                if (it == 3) return@loop // non-local return from the lambda passed to run
                print(it)
            }
        }
        print(" done with nested loop")
    }

}