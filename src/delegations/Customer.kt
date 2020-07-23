package delegations

class Customer(private val map : Map<String, Any?>)
{
    val id : Int by map
    val name : String by map
}