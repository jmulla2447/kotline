package varient

fun  interface AnimalHospital<in T> {
    fun registerAnimal(animal :T)
}

fun interface Operate<out T>{
    fun operationAnimal() : T
}

class Register : AnimalHospital<Animal>{
    override fun registerAnimal(animal: Animal) {
        println("Register animal is ${animal.name}")
    }
}

class Treatment : Operate<Animal>{
    override fun operationAnimal(): Animal {
        return Dog("")
    }
}
