package collections

fun main()
{
    /**
     * Immutable types are covariant, while mutable types are invariant
     */

    // immutable list
    val list = listOf(1, 2, 3, 4, 5, 5)
    println("\nImmutable list: $list")

    // mutable list
    val mutableList = mutableListOf<Int>()
    for (i in 0 until 5)
        mutableList.add(i, i+1)

    println("\nMutable list: $mutableList\n")

    println("\nSlice 0..3: ${list.slice(0..3)}")

    println("\nFiltering null in the list: ${list.filterNotNull()}")

    println("\nDropping 1 element: ${mutableList.drop(1)}")

    /**
     * The in operation
     */

    println("\nnumber 1 is in list? " + 1 in list + "\n")

    // immutable set
    val set = setOf(1, 2, 3, 4, 5, 5)
    println("\nImmutable set: $set\n")

    // mutable set
    val mutableSet = mutableSetOf<Int>()
    for (i in 0 until 5)
        mutableSet.add(i)

    // forEach
    mutableSet.forEach {
        println("\nElement: $it\n")
    }

    val newSet = mutableSet + mutableSetOf(6, 7, 8, 9, 10)
    println("\nConcatenating sets: $newSet\n")

    println("\nFiltering the elements > 2: ${newSet.filter { it > 2 }}")

    println("\nSumming the elements: ${set.map { it + 2 }}")

    println("\nFolding the elements: ${set.fold(0, {acc, i -> acc + i})}")

    // immutable map
    val map = mapOf(1 to "a", 2 to "b")
    println("\nImmutable map: $map\n")

    // mutable map
    val mutableMap = mutableMapOf<String, Int>()
    for (i in 0 until 5)
        mutableMap["$i"] = i

    println("\nMutable map: $mutableMap\n")

    val newMap = mutableMap - mutableMapOf(1 to 1)
    println("\nThis is the new map: $newMap\n")

    val otherList = listOf("aaaaa", "bbbbb", "ccccc", "a", "bb")
    println("\nGrouping by length: ${otherList.groupBy { it.length }}")
}