package objects

object Register : Person() {
    private var total = 0F

    val incrementTotal = { value : Float ->
        if (value > 0F)
            total += value
    }

    val getTotal = {
        if (total < 0F)
            total = 0F

        total
    }
}