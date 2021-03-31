fun main() {
    var gari = Car("Subaru", "toyota", "red", 60)
    gari.carry(100)
    println(gari.calculateParkingFees(5))
    var basi = Bus("isuzu", "toyota", "white", 60)
    println(basi.maxTripFare(5678.12.toDouble()))
    println(basi.maxTripFare(5678.12.toDouble() * basi.capacity))
    println(basi.calculateParkingFees(5))

}
    open class Magari(var make: String, var model: String, var color: String, var capacity: Int) {
        fun carry(people: Int) {
            var people = people - capacity
            if (people <= capacity) {
                println("carry $people passengers")
            } else {
                println(" over capacity by $people")
            }
        }

      open fun calculateParkingFees(hours: Int): Int {
            return hours * 20
        }

    }

    class Car(make: String, model: String, color: String, capacity: Int) : Magari(make, model, color, capacity) {


    }

    class Bus(make: String, model: String, color: String, capacity: Int) : Magari(make, model, color, capacity) {
        fun maxTripFare(fare: Double): Double {
            var y = 0
            return y + fare

        }

        override fun calculateParkingFees(hours: Int): Int {
            return hours*capacity
        }
    }

