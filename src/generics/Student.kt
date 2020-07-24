package generics

class Student(
        override val name: String,
        override val id : Int
) : SchoolMember(name, id)
{
    private val classes = ArrayList<String>()

    fun addClass(studentClass : String) {
        classes.add(studentClass)
    }

    fun printClasses() {
        classes.forEach {
            println(it)
        }
    }
}