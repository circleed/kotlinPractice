package myList

/**
 * Created by Daniil on 19.05.2018.
 */
class SingleLinkedList<T> : List<T>{

    override var size: Int = 0

    override var head: Node<T>? = null

    override var tail: Node<T>? = null

    override fun get(index: Int): T? {

        if(this.size < index) return null

        if(this.head == null) return null

        if(this.size == 1) return head?.value

        var currNode: Node<T>? = this.head

        while( currNode?.next != null )
            currNode = currNode.next

        return currNode?.value
    }


    override fun set(index: Int, value: T?) {
        if(this.size < index) return

        if(this.head == null) return

        if(this.size == 1) head?.value = value

        var currNode: Node<T>? = this.head

        while( currNode?.next != null )
            currNode = currNode.next

        currNode?.value = value
    }

    override fun add(value: T?) {
        if(this.head == null) {
            this.head = Node(value, null, null)
            this.tail = this.head
            this.head?.next = this.tail
            this.head?.previous = this.tail
            //???????????????
            size++
            return
        }

        var currNode: Node<T>? = this.head
        while(currNode?.next != this.tail)
            currNode = currNode?.next

        val newNode: Node<T>? = Node(value, null, null)

        newNode?.next = this.head
        newNode?.previous = this.tail
        this.tail?.next = newNode
        this.head?.previous = newNode
        this.tail = newNode

        this.size++

    }

    override fun insert(index: Int, value: T?) {
        if(this.size < index) return

        if(this.head == null) {
            this.head = Node(value, null, null)
            this.tail = this.head
            this.head?.next = this.tail
            this.head?.previous = this.tail
            size++
            return
        }

        var currNode: Node<T>? = this.head
        var iter = 0
        while(iter != index) {
            currNode = currNode?.next
            iter++
        }

        val newNode: Node<T>? = Node(value, null, null)

        newNode?.next = currNode?.next
        newNode?.previous = currNode
        currNode?.next?.previous = newNode
        currNode?.next = newNode
        this.size++

//        currNode?.next?.previous = newNode
//        newNode?.next = currNode?.next
//        currNode?.next = newNode
//        newNode?.previous = currNode

    }

    override fun print() {
        var currNode = this.head
        var iter = 0
        while(iter != size) {
            print(" ${currNode?.value}")
            currNode = currNode?.next
            iter++
        }

    }


}