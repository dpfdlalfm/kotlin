package com.example.practice1

//Singleton Pattern : 실행할 때 한번만 객체 생성 후 다시 객체 생성 안함.
// 메모리 낭비가 없음.
object CarFactory {
    val cars = mutableListOf<Car>()
    fun makeCar(horsePower: Int) : Car {
        val car = Car(horsePower)
        cars.add(car)
        return car
    }
}

data class Car(val horsePower : Int)

fun main() {
    val car = CarFactory.makeCar(10)
    val car2 = CarFactory.makeCar(200)

    println(car)
    println(car2)
    println(CarFactory.cars.size.toString())
}
