package generics

/**
 * Out modifier is marking covariance.
 * Covariance is because Student is a subtype of SchoolMember and
 * GenericGeneratorOut<Student> is subtype of GenericGeneratorOut<SchoolMember>
 */
interface GenericGeneratorOut<out T> {
    fun generate() : T
}

class StudentGenerator : GenericGeneratorOut<Student> {

    var name = ""
    var id = 0

    override fun generate(): Student {
        return Student(name, id)
    }
}