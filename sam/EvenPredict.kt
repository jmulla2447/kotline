package sam

fun interface EvenPredict { // fun is used when class has only Single Abstract Method
    fun check(i : Int) : Boolean
}
/*
 that SAM can be used into Lamda function. Lamda funcation is more consious and clear.
* #*/

class TestEven {
    val isEven = object  : EvenPredict {
        override fun check(i : Int): Boolean {
            return i % 2 == 0
        }
    }

    val lamdaIsEven = EvenPredict { it%2==0 } // lambda code is more consious and clear

}

fun main(){
    println(TestEven().isEven.check(4))
    println(TestEven().lamdaIsEven.check(9))
}
