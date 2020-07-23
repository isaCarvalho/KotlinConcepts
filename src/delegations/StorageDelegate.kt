package delegations

import kotlin.reflect.KProperty

class StorageDelegate
{
    operator fun getValue(thisRef : Any?, property : KProperty<*>) : String {
        return "$thisRef is being delegated to ${property.name} to StorageDelegate"
    }

    operator fun setValue(thisRef: Any?, property: KProperty<*>, value : String)
    {
        println("${property.name} is receiving $value in $thisRef")
    }
}