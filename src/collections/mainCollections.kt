package collections

fun main()
{
    val list = listOf(1, 2, 3, 4, 5, 5)
    println(list)

    val mutableList = mutableListOf<Int>()
    for (i in 0 until 5)
        mutableList.add(i, i+1)

    println(mutableList)

    val set = setOf(1, 2, 3, 4, 5, 5)
    println(set)

    val mutableSet = mutableSetOf<Int>()
    for (i in 0 until 5)
        mutableSet.add(i)

    println(mutableSet)

    val map = mapOf(1 to "a", 2 to "b")
    println(map)

    val mutableMap = mutableMapOf<String, Int>()
    for (i in 0 until 5)
        mutableMap["$i"] = i

    println(mutableMap)
}