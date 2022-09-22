fun main() {

    val cow: Grass = Grass(name="Cow")
    val giraffe: Grass = Grass (name = "Giraffe")
    val tiger: Meat = Meat (name = "Tiger")
    val lion: Meat = Meat (name = "Lion")

    var animals = mutableListOf(cow.name, giraffe.name, tiger.name, lion.name)
    println(animals)
}

class Grass(var name: String, var food: String = "Grass") {}
class Meat(var name: String, val food: String = "Meat") {}