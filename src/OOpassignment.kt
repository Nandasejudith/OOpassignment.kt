fun main() {
var addWeight = Human("Nandase Judith", 21, 56.2.toFloat())
    addWeight.eat(8)
    addWeight .speak("Thank you so much for coming")
    addWeight.birthday()
    var fulldetails =details("Kutesa", "Sarah", "kutesarah@gmail.com", "0775674952", 222421)
    println (fulldetails.email)
    println(fulldetails.firstName)
}

class Human( var name:String, var age:Int,  var weight:Float){
fun eat(foodWeight:Int) {
    weight =foodWeight +weight
    println("I am eating $foodWeight Kgs of food")
    println(weight)
}
    fun speak(speech: String){
         println(speech)
    }
    fun birthday (){
        println(age+1)
    }
}

class details(var firstName: String, var lastName:String, var email:String, var phoneNumber:String, var password:Int){

}
