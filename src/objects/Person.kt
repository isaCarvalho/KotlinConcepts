package objects

open class Person()
{
    var name : String = ""
    var age : Int = 0

    constructor(name : String, age : Int) : this()
    {
        this.name = name
        this.age = age
    }

    private val persons = ArrayList<Person>()

    open fun printPerson()
    {
        println("Hi! My name is $name and I'm $age years old.")
    }

    fun addPerson(person: Person)
    {
        this.persons.add(person)
    }

    fun printPersons() {
        persons.forEach {
            it.printPerson()
        }
    }
}