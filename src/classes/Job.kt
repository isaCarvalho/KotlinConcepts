package classes

import java.util.*
import kotlin.collections.ArrayList

/**
 * This is a nested class. Nested classes are classes that contains other classes.
 */
class Job
{
    private var date: Date = Date()

    /**
     * This class is the task class. It means that every job is going to contain
     * a Task, and a task is a list of services.
     */
    class Task(private val list : ArrayList<Service>)
    {
        fun getTask(index : Int) : Service?
        {
            if (index > list.size-1 || index < 0)
                return null

            return list[index]
        }

        fun addTask(service: Service)
        {
            list.add(service)
        }
    }

    /**
     * This is a inner class called Team. It is inner because we can only access
     * it after creating the Job class. We can access the job's task without
     * creating it, but not the team.
     */
    inner class Team(private val employees : ArrayList<Employee>)
    {
        fun getEmployeeByName(name : String) : Employee?
        {
            employees.forEach {
                if (it.name == name)
                    return it
            }

            return null
        }

        fun addEmployee(employee : Employee)
        {
            this.employees.add(employee)
        }

        fun getTeamCount() = employees.size
    }
}