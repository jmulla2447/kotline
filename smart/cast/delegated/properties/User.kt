package smart.cast.delegated.properties

import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class User {
    var name : String by NameDelgate()

    class NameDelgate : ReadWriteProperty<User, String> {
        override fun getValue(thisRef: User, property: KProperty<*>): String {
            return "$thisRef, thank you for delegating '${property.name}' to me!"
        }

        override fun setValue(thisRef: User, property: KProperty<*>, newValue: String) {
            println("$newValue has been assigned to '${property.name}' in $thisRef.")
        }

    }
}

fun main() {
    val user = User()
    println(user.name)
    user.name = "Javed"
}
