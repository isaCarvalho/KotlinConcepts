package classes

/**
 * This is a data class. Kotlin's data classes are created with the data keyword
 * before the class declaration and receives a non-empty constructor.
 */
data class Employee(var name : String, var age : Int, var role: RoleEnum)
{
    private var id : Int = 0

    init {
        id = Math.random().toInt()
    }

    fun getId() = id
}