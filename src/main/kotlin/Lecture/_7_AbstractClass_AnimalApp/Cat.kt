package Lecture._7_AbstractClass_AnimalApp

// CONCRETE subclass of Animal

/* Cat.kt inherits from Animal.
    Because Animal has an abstract method, Cat.kt MUST override makeNoise(). */

class Cat(age: Int, weight: Double) : Lecture._7_AbstractClass_AnimalApp.Animal(age, weight) {

    override fun makeNoise(): String {
        return "Meow!"
    }
}