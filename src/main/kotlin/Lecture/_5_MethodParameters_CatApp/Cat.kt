package Lecture._5_MethodParameters_CatApp

// This version demonstrates PASSING PARAMETERS to methods
class Cat(private val name: String, private var age: Int, weightIn: Int) {

    var weight = 0
        set(newWeight) {if (newWeight >= 5) {field = newWeight}}

    init {weight = weightIn}     // INIT BLOCK: Runs when the object is created.

    /* METHOD WITH PARAMETER: distance is a PARAMETER.
        Kotlin requires the data type (Int) to be declared. */

    /* The method reduces weight depending on the distance walked.
        -= is shorthand for: weight = weight - distance

        Returns Boolean to indicate success or failure. */
    fun walk(distance: Int): Boolean {

        if (weight - distance >= 5) {
            weight -= distance
            return true
        }
        return false
    }

    override fun toString(): String {
        return "Name: $name, age: $age, weight: $weight"
    }
}