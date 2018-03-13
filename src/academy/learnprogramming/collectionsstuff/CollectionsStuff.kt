package academy.learnprogramming.collectionsstuff


fun main(args: Array<String>) {
    val setInts = setOf(10, 15, 19, 5, 3, -22)

    val immutableMap = mapOf<Int, Car>(1 to Car("green", "Toyota", 2015),
            2 to Car("red", "Ford", 2016),
            3 to Car("silver", "Honda", 2013))

    
}

data class Car(val color: String, val model: String, val year: Int) {

}