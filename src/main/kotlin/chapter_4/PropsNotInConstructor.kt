@file:Suppress("unused")

package chapter_4

class PropsNotInConstructor {
    val propertyInt: Int = 1
}

abstract class PropsNotInConstructorAbstractVal {
    // абстрактный метод возвращающий int
    abstract val propertyInt: Int
}

class PropsNotInConstructorAbstractValImpl: PropsNotInConstructorAbstractVal() {
    // имплементация абстрактного метода
    override val propertyInt: Int
        get() = TODO("Not yet implemented") // todo can replace on any value like 1
}

@Suppress("CanBePrimaryConstructorProperty")
class PropsInConstructorButInitializeInClassBody(propertyInt: Int) {
    val propertyInt: Int = propertyInt // can move in constructor
}
// equivalent PropsInConstructorButInitializeInClassBody class
class PropsInConstructorAndInitialized(val propertyInt: Int) {

}

fun main() {

}