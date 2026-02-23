package Lecture._4_CustomSetter_CatApp

// This file demonstrates a CUSTOM SETTER in Kotlin
class Cat(private val name: String, private var age: Int, weightIn: Int) {

    /* PROPERTY WITH CUSTOM SETTER:
        weight is now PUBLIC (default visibility),
        meaning it can be accessed and modified outside the class.
        However, we CONTROL how it is modified using a custom setter. */

    var weight = 0
        set(newWeight) {

            /* CUSTOM SETTER: This runs whenever someone tries to assign
                a new value to weight (e.g., sniffy.weight = 6). */

            /*  newWeight → the value being assigned
                field → the actual underlying storage variable */

            if (newWeight >= 5) {field = newWeight}

            // If newWeight is less than 5, the assignment is ignored.
            // This prevents invalid or unrealistic values.
        }

    /* INIT BLOCK: Runs when the object is created.
        We initialise weight using the constructor parameter.
        This will also trigger the custom setter. */

    init {weight = weightIn}

    fun walk(): Boolean {
        if (weight > 5) {
            weight--
            return true
        }
        return false
    }

    override fun toString(): String {
        return "Name: $name, age: $age, weight: $weight"
    }
}