package com.example.kotlin_study


//Singleton Pattern

object CarFactory{
    val cars = mutableListOf<Car>()

    fun makeCar(horsepower: Int):Car{
        val car=Car(horsepower)
        cars.add(car)
        return car
    }
}
//유일함. 딱 한번만 만들어짐.

data class Car(val horsepower:Int)

fun main(){
    val car = CarFactory.makeCar(10)
    val car2 = CarFactory.makeCar(200)

    println(car)
    println(car2)
    println(CarFactory.cars.size.toString())
}