import myList.SingleLinkedList

/**
 * Created by Daniil on 16.05.2018.
 */

fun main(args: Array<String>) {

    val singleLinkedList: SingleLinkedList<Int> = SingleLinkedList()
    singleLinkedList.add(5)
    singleLinkedList.add(8)
    singleLinkedList.insert(1, 10)

    singleLinkedList.print()

}

fun sum(a: Int, b: Int): Int {
    return a + b
}

fun sum(): Int? = 5 + 5

fun array(arr: Array<String>) {
    print("first elem ${arr[0]}")
}

fun max(a: Int, b: Int, c: Int): Int {
    if(a > b)
        return a
    else
        return b
}

fun max(a: Int, b: Int): Int = if (a > b) a else b

fun getStringLength(obj: Any): Int? {
    if(obj is String) {
        return obj.length
    }

    return null
}

fun whenFun() {
    val testObj = "myVal"
    when(testObj) {
        "1" -> print(1)
        "myVal" -> print(testObj)
    }
}



