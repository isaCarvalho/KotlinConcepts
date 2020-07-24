package generics

fun main()
{
    /**
     * We are setting the variable generatorSchoolMember a Student,
     * but we cannot access the students method
     */
    println("\n--------------------------------------------------------------\nPrinting the student...")
    val generatorOutSchoolMember : GenericGeneratorOut<SchoolMember> = StudentGenerator()

    val student = generatorOutSchoolMember.generate()
    println(student)

    /**
     * SchoolMemberGenerator is the other way around
     */
    println("\n--------------------------------------------------------------\nTesting the teacher...")
    val teacher = Teacher("SchoolMember1", 1, 10000F)

    val generatorInTeacher : GenericGeneratorIn<Teacher> = SchoolMemberGenerator()
    println(generatorInTeacher.isNameEmpty(teacher))

    /**
     * Testing the generic function
     */
    println("\n--------------------------------------------------------------\nPrinting the types...")
    val schoolMembers = ArrayList<SchoolMember>()

    schoolMembers.add(Teacher("Teacher1", 1, 10000F))
    schoolMembers.add(Student("Student1", 1))
    schoolMembers.add(Teacher("Teacher3", 3, 30000F))
    schoolMembers.add(Student("Student2", 2))
    schoolMembers.add(Teacher("Teacher5", 5, 50000F))

    schoolMembers.forEach {
        println(getType(it))
    }
}

fun <T:SchoolMember> getType(value : T) : String {
    return when (value)
    {
        is Teacher -> "${value.name} is a teacher"
        is Student -> "${value.name} is a student"
        else -> "${value.name} is a school member or type unknown"
    }
}