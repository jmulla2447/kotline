package smart.cast.delegated.observable

import kotlin.properties.Delegates

class User {
    var name: String by Delegates.observable("-") {
            _, old, new -> // if prop is not used so we can use - instade of prop
        println("$old -> $new")
    }

    var age : Int by Delegates.vetoable(11){
        _, _, newValue -> newValue >=18
    }
}

fun main() {
    val user = User()
    user.name = "first"
    user.name = "second"
    user.age = 15
    println(user.age)
}

/*
*   Feature	                observable	            vetoable
    When it's called	    After the value is set	Before the value is set
    Can stop update?	    ❌ No	                ✅ Yes (by returning false)
    Return value needed?	No (returns Unit)	    Yes (Boolean - allow or block)
    Typical use	Logging,    reacting to changes	    Validation, conditional update
* */
