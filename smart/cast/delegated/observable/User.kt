package smart.cast.delegated.observable

import kotlin.properties.Delegates

class User {
    var name: String by Delegates.vetoable("Nulll") {
            prop, old, new ->
        println("$old -> $new")
    }
}

fun main() {
    val user = User()
    user.name = "first"
    user.name = "second"
}
