package com.example.practice1

fun main() {
    helloWorld()
    println(add(4,6))
    println(hi())
}

fun helloWorld() : Unit {
    // Unit 은 void와 똑같은 기능
    // return 값이 없는 함수를 정의 (생략 가능)
    println("hello world!")
}

fun add(a : Int, b : Int) : Int {
    return a+b
}

fun hi() {
    val a : Int = 10
    // val 변수는 변하지 않는 값.
    var b : Int = 9
    // var 생략 가능
    b = 100

    var name = "inwoo"
    var home : String
    home = "Yeongdo"

    println(a)
    println(b)
    println(home)
    println(name)
}