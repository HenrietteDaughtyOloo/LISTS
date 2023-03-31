fun main(){
    println(evenIndex(listOf("naima", "janet","Malia", "Drake", "Hi","jeff","Fred", "hrender", "ten")))

    println( height(listOf(1.56, 3.23,  4.54, 1.32, 15.20)))

    createdPerson()

    println( averageMileage())
}

//Question 1
//Given a list of 10 strings, write a function that returns a list of the strings
//at even indices i.e. index 2,4,6 etc (2 points)
fun evenIndex(list1: List<String>):List<String>{
    var index = listOf<String>()
    for (string in list1)
        if (list1.indexOf(string)%2 == 0) {
            index+=string
        }

    return index

}

//Question 2
//Given a list of people’s heights in metres. Write a function that returns
//the average height and the total height
data class peoplesHeight(var average: Double, var sum: Double)

fun  height(heights: List<Double>):peoplesHeight{
    val average = heights.average()
    var sum = heights.sum()
    val stats = peoplesHeight (average, sum)
    return stats

}

//Question3
//Given a list of Person objects, each with the attributes, name, age,
//height and weight. Sort the list in order of descending age (2 points)
data class Person(var name: String, var age: Int, var height:Double, var weight:Double)

fun createdPerson() {
    val first = Person("Mercy", 9, 0.5, 10.0)
    val second = Person("Georgia", 25, 1.5, 50.0)
    val third = Person("Ginny", 18, 1.2, 40.0)
    val fourth = Person("Sunny", 68, 1.0, 10.0)

    var person = listOf(first, second, third, fourth)
    //returns person
    val sortedPerson = person.sortedByDescending { person -> person.age }
    println(sortedPerson)

}
//Given a list similar to the one above, write a function in which you will
//create 2 more people objects and add them to the list at one go.
fun addingAtAGo(){
    val fifth = Person("Sunny", 68, 1.0, 10.0)
    val sixth = Person("Danny", 56, 1.9, 70.60)

}
//Write a function that takes in a list of Car objects each with a
//registration and mileage attribute and returns the average mileage of
//all the vehicles in the list. (3 points)
data class CarObjects(var registration:String, var mileage:Double)
fun averageMileage():Double{
    val car1=CarObjects("KDC831A",240.60)
    val car2=CarObjects("KDD332C",600.30)
    val car3=CarObjects("KQD441D",800.19)
    val car4=CarObjects("KAC",309.00)
    var cars= listOf(car1,car2,car3,car4)
    var sumOfMileage=cars.sumOf { Mile-> Mile.mileage }
    var average=sumOfMileage/cars.size
    return average
}
