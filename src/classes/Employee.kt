package classes

/**
 * This is a data class. Kotlin's data classes are created with the data keyword
 * before the class declaration and receives a non-empty constructor.
 */
data class Employee(var name : String, var age : Int, var role: RoleEnum)
{
    /**
     * Setters and getters are called recursively, so, if we want to prevent
     * the compiler from generating errors, we can use the backing field.
     */
    var id : Int = 0
        get() = field.plus(1)

    /**
     * You can also do that creating your own backing property
     */
    private var _cpf : String? = null
    var cpf : String
        get() =_cpf?.toLowerCase() ?: ""

        set(value) {
            if (value.length > 11 || value.isEmpty())
                println("Invalid cpf")
            else
                _cpf = value
        }

    init {
        id = Math.random().toInt()
    }
}