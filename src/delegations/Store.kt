package delegations

/**
 * This interface is the model of any store
 */
interface Store
{
    var name : String
    var address : String

    fun printStore()
}

/**
 * This class is implementing the store interface because it is
 * a franchise of the store
 */
class Franchise(override var name : String, override var address : String) : Store {

    /**
     * This is the lazy delegate. It means that the websiteDomain variable
     * will only be initiated when it's called for the first time
     */
    private val websiteDomain : String by lazy {
        readLine()!!.toString()
    }

    override fun printStore() {
        println("The new franchise is called $name\n"
        + "and it is located in $address\n"
        + "and its website domain is $websiteDomain")
    }
}

/**
 * This class represents the marketNetwork that contains a store
 * The store properties is passed to the market network by delegation
 */
class MarketNetwork(store : Store) : Store by store