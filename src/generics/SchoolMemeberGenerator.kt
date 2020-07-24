package generics

/**
 * In modifier is marking contravariance.
 * Contravariance is because Teacher is a subtype of SchoolMember and
 * GenericGeneratorIn<Teacher> is supertype of GenericGenerator<SchoolMember>
 */
interface GenericGeneratorIn<in T> {
    fun isNameEmpty(value : T) : Boolean
}

class SchoolMemberGenerator : GenericGeneratorIn<SchoolMember> {
    override fun isNameEmpty(value: SchoolMember): Boolean {
        if (value.name == "")
            return true

        return false
    }
}