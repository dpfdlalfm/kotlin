package com.example.practice1

open class Human (val name : String = "David") {
    // 디폴트값 지정 가능. (val name : String = "inwoo")

    // 생성자 오버로딩
//    constructor(name : String, age : Int) : this(name) {
//        println("my name is ${name} and I'm ${age}")
//    }

    init {
        println("New human has been born!")
    }
    // 가장 먼저 실행됨. (생성자보다 빨리)

//  val name = name
//  생성자 안에 변수 선언하면 클래스 내부에 따로 선언문을 안써도 됨.
    fun eatingCake() {
        println("Yummy")
    }

    open fun singASong() {
        println("lalala")
    }
}

class Korean : Human() {
    override fun singASong() {
        super.singASong()
        // super를 이용해 기존의 singAsong 메소드를 상속받음.
        // print 결과 값 : lalala와 라라랄랄이 같이 출력됨.
        
        println("라라랄랄")
        println("my name is : ${name}")
   }

}

fun main(){
//    val human = Human("inwoo")
//    human.eatingCake()
//    println("My name is ${human.name}")
//    val mom = Human("min")


    val korean = Korean()
    korean.singASong()

}
