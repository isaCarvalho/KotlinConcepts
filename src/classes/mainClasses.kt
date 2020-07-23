package classes

fun main(args : Array<String>)
{
    println("\n--------------------------------------------------------------\nCreating the team...")

    val employeesList = ArrayList<Employee>()

    employeesList.add(Employee("Employee1", 20, RoleEnum.TRAINEE))
    employeesList.add(Employee("Employee2", 22, RoleEnum.ANALYST))
    employeesList.add(Employee("Employee3", 24, RoleEnum.ARCHITECT))
    employeesList.add(Employee("Employee4", 26, RoleEnum.DEVELOPER))
    employeesList.add(Employee("Employee5", 28, RoleEnum.ENGINEER))

    employeesList.forEach {
        println("${it.id} ${it.name} is ${it.role.role} and receives ${it.role.getPayment()} per month")
    }

    println("\n--------------------------------------------------------------\nCreating the tasks...")

    val serviceList = ArrayList<Service>()

    serviceList.add(SoftwareService("Development", Price(12000F), "Java"))
    serviceList.add(SoftwareService("Server-side application", Price(13000F), "Koltin"))
    serviceList.add(HardwareService("Cleaning", Price(13000F)))

    serviceList.forEach {
        val message = "The ${it.name} will cost ${it.price}"

        when (it) {
            is SoftwareService -> println(message + " and will use the ${it.technology}")
            is HardwareService -> println(message)
        }
    }

    println("\n--------------------------------------------------------------\nCreating the job...")

    println("This is the job's team: \n${Job().Team(employeesList)}")
    println("This is the job's tasks:\n${Job.Task(serviceList)}")
}