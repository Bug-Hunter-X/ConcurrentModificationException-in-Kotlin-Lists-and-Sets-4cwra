fun main() {
    val list = mutableListOf(1, 2, 3, 4, 5)
    list.removeIf { it > 2 }
    println(list) // Output: [1, 2]

    val set = mutableSetOf(1, 2, 3, 4, 5)
    set.removeIf { it > 2 }
    println(set) // Output: [1, 2]

    //Safe way to remove elements from list
    val list2 = mutableListOf(1,2,3,4,5)
    val toRemove = mutableListOf<Int>()
    for (i in list2){
        if (i > 2) toRemove.add(i)
    }
    list2.removeAll(toRemove)
    println(list2) 
} 