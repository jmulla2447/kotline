package varient

fun main(){
    val hund = Dog("Hund")
    val registery = Register()
    registery.registerAnimal(hund)
    val katze = Cat("Katze")
    registery.registerAnimal(katze)
}
