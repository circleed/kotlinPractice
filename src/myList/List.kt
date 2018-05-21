package myList

/**
 * Created by Daniil on 19.05.2018.
 */
interface List<T> {

    var size: Int

    var head: Node<T>?

    var tail: Node<T>?

    fun get(index: Int): T?

    fun set(index: Int, value: T?)

    fun add(value: T?)

    fun insert(index: Int, value: T?)

    fun print()
}