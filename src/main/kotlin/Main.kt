// This is the corrected exercise. As corrected in class.
fun main(){
                    //Calling Quiz 1
    println(evenIndex(listOf("naima", "janet","Malia", "Drake", "Hi","jeff","Fred", "hrender", "ten")))

                    //Calling Quiz 2
    println( height(listOf(1.5, 3.5,  4.5, 1.5, 15.5)))

                    //Quiz2 using Alternative method
    println(getpeoplesHeightt((listOf(1.5, 3.5,  4.5, 1.5, 15.5))))

                    // Calling Quiz3
    createdPerson(person = listOf(Person("Georgia", 10, 1.5, 50.0),
       Person("Nalia", 21,1.34, 23.40),
       Person("Ginny", 18, 1.2, 40.0),Person("Sunny", 68, 1.0, 10.0)))

    println()
                    //Calling Quiz4
    val newList = personn()
    //println(newList)

            //Calling Quiz 5
println( averageMileage(
    listOf(CarObjects("KDC831A",240.60),
    CarObjects("KDD332C",600.30),
    CarObjects("KQD441D",800.19),
    CarObjects("KAC",309.00)
    )))
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
//A shorter Alternative Method to do question2
fun getpeoplesHeightt(heightss:List<Double>):peoplesHeight{

    return peoplesHeight(
        average = heightss.average(),
        sum = heightss.sum()
    )
}

//Question3
//Given a list of Person objects, each with the attributes, name, age,
//height and weight. Sort the list in order of descending age (2 points)
data class Person(var name: String, var age: Int, var height:Double, var weight:Double)

fun createdPerson(person:List<Person>) {
    println(person.sortedByDescending {person ->person.age  })

}

//Question 4
//Given a list similar to the one above, write a function in which you will
//create 2 more people objects and add them to the list at one go.
fun personn():List<Person>{

    val person1 = Person("yup",67,89.9,97.0)
    val person2 = Person("yui",89,90.9,78.0)

    return mutableListOf(person1,person2)

}


//Write a function that takes in a list of Car objects each with a
//registration and mileage attribute and returns the average mileage of
//all the vehicles in the list. (3 points)
data class CarObjects(var registration:String, var mileage:Double)
fun averageMileage(cars:List<CarObjects>):Double{

    var sumOfMileage=cars.sumOf { mile-> mile.mileage }
    var average=sumOfMileage/cars.size
    return average
}
