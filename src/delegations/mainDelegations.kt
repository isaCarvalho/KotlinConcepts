package delegations

fun main()
{
    /**
     * Because of the delegations, we can use the printStore method
     * implemented by the franchise class directly from the market
     * store
     */
    val marketNetwork = MarketNetwork(Franchise(
            "Coffee Franchise",
            "San Francisco, 15"
    ))

    /**
     * Using the delegation that we defined with Franchise.
     * Note that we can use all of store's properties and methods
     */
    println("\n--------------------------------------------------------\nUpdating the values...")
    marketNetwork.resetHours("08h00min", "17h00min")

    println("\n--------------------------------------------------------\nPrinting the values...")
    marketNetwork.printStore()

    println("\n--------------------------------------------------------\nPrinting some more properties...")
    println(marketNetwork.name)
    println(marketNetwork.address)

    /**
     * This is the customer delegation
     */
    println("\n--------------------------------------------------------\nPrinting the customer...")

    val customer = Customer(mapOf("id" to 1, "name" to "Customer1"))
    println("\n${customer.id} - ${customer.name}")

    /**
     * This is the storage delegation
     */
    println("\n--------------------------------------------------------\nPrinting the custom delegation...")

    val storage = Storage().apply {
        name = "Coffee storage"
    }

    println("\n${storage.name}\n")
}