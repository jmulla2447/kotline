package smart.cast

open class Base {
    open val value : Any = "I am String"
}

class Parent : Base() {
    override val value : Int = 11
}

fun checkValue(base: Base){
    if (base.value is String) {
        //  println(base.value.length) Here Smart casting not done by compiler
        // compiler belive on developer and that is developer risk because open proerty can be override here
        /*
        *   The property value is open — a subclass could override it and return something completely different each time.
            Kotlin says: “I can’t trust that value is still a String after the check.”
        * */

        /*
        * same way custome getter compiler can not rely on because it is dependt updon developer
        * if developer write code like below than based on flag or any condition value is changed sometimes is string and
        * sometimes it is Int so custome getter and setter mthod also not part of smart cast
        * */
    }
}

class WithCustomGetter(val flag: Boolean){
    val thing: Any get() = if (flag) "String" else  10
}
