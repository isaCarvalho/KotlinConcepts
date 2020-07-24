package generics

class Teacher(
        override val name: String,
        override val id : Int,
        val payment : Float
) : SchoolMember(name, id)