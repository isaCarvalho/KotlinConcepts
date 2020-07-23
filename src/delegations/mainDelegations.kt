package delegations

fun main()
{
    /**
     * Because of the delegations, we can use the printStore method
     * implemented by the franchise class directly from the market
     * store
     */
    MarketNetwork(Franchise(
            "Coffee Franchise",
            "San Francisco, 15"
    )).printStore()

}