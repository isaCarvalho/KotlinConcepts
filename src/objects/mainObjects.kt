package objects

import classes.RoleEnum

fun main()
{
    /**
     * The personAdmin is a object that needs to behavior differently than the other
     * person's objects. That's how we can gave a object a specific behavior
     */
    val person = Person("Person 1", 21)

    val personAdmin = object : Person("PersonAdmin", 50) {
        var role = RoleEnum.DEVELOPER.role

        override fun printPerson() {
            println("I'm the admin. My name is $name, I'm $age and I'm the $role.")
        }
    }

    println("\n--------------------------------------------------------------\nPrinting the persons...")

    person.printPerson()
    personAdmin.printPerson()

    /**
     * The Register object follows the singleton pattern, so instead of implementing
     * a singleton class, we can just use objects.
     */
    Register.addPerson(person)
    Register.addPerson(personAdmin)
    Register.incrementTotal(1000F)

    /**
     * Note how the method printPersons calls the Person's method printPerson
     * and for printing the personAdmin, it overrides its behavior
     */
    println("\n--------------------------------------------------------------\nPrinting the register's persons...")

    Register.printPersons()

    /**
     * Now, we add the persons to teams and check the company Id
     */
    println("\n--------------------------------------------------------------\nPrinting the first team...")

    var team = Team(1)
    team.addPerson(person)

    team.printPersons()

    println("\n--------------------------------------------------------------\nPrinting the second team...")

    team = Team(2)
    team.addPerson(personAdmin)

    team.printPersons()

    println("\n--------------------------------------------------------------\nPrinting the company id...")

    println("Company id: ${Team.companyId}")
}