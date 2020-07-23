package classes

/**
 * This is an enum class. Enum classes are used to declare constants and can implement interfaces.
 */
enum class RoleEnum(val role : String) : IPayment
{
    TRAINEE("Trainee") {
        override fun getPayment(): Float {
            return 10000F
        }
    },
    DEVELOPER("Software developer") {
        override fun getPayment(): Float {
            return 20000F
        }
    },
    ANALYST("Software analyst") {
        override fun getPayment(): Float {
            return 30000F
        }
    },
    ENGINEER("Software engineer") {
        override fun getPayment(): Float {
            return 50000F
        }
    },
    ARCHITECT("Software architect") {
        override fun getPayment(): Float {
            return 50000F
        }
    }
}