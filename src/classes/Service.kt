package classes

/**
 * This is a sealed class. It is abstract and all the classes
 * that extends this class has to be in this very file.
 */
sealed class Service(open val name : String, open val price : Price)

data class SoftwareService(override val name : String, override val price : Price, val technology : String) : Service(name, price)

data class HardwareService(override val name : String, override val price : Price) : Service(name, price)

/**
 * This is a class that is created mostly when we need no wrap a primitive type.
 * It is still experimental
 */
inline class Price(val value : Float)