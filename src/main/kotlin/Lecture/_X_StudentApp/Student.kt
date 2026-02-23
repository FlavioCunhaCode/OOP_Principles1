package Lecture._X_StudentApp

// This file contains the Student CLASS (the blueprint)
class Student(val id: String,val name: String,val course: String,
              var mark: Double) {

/* PRIMARY CONSTRUCTOR:
    The constructor parameters are declared in the header.
    Because we use val/var, they automatically become
    properties (attributes) of the class.*/

// toString(): This returns a text representation of the object.
override fun toString(): String {
    return "Name: $name Course: $course Mark: $mark"
}
}