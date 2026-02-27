package S1_CatApp

class Cat(val name: String, var age: Int, var weight:Int) {

    fun walk() {
        weight--
    }
    fun eat() {
        weight++
    }
    override fun toString(): String {
        return "Cat(name='$name', age=$age, weight=Sweight)"
    }
}