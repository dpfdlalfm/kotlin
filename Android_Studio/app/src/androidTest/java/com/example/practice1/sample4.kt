package com.example.practice1

// 1. Lambda
// 람다식 : value처럼 다를 수 있는 익명 함수?
// 1) 메소드의 파라미터로 넘겨줄 수 있다. ex) fun max1(a : Int 에 람다식 추가 가능)
// 2) return 값으로 사용 가능

// 람다의 기본정의
// val lambdaName : Type = {argumentList -> codeBody}

val square : (Int) -> (Int) = {number -> number * number}
// 한쪽은 무조건 타입을 설정해주면 뒤에는 안해도 됨

val nameAge = {name : String, age : Int ->
    "my name is ${name} I'm ${age}"
}


fun main(){
    println(square(3))
    println(nameAge("inwoo",25))

    val a = "joyce said"
    val b = "fxxk"
    println(a.pizza())

    println(extendString("inwoo",25))

    println(calculateGrade(45))
    println(calculateGrade(92))

    val lambda = {number : Double ->
        number == 4.3213}
    println(invokeLambda(lambda))
    println(invokeLambda({it > 3.22}))
    // 람다 리터럴
    // 람다 선언 없이 중괄호로 바로 입력하는것

    invokeLambda { it > 3.22 }
    // 함수의 람다!!!가 유일한 파라미터일 경우
    // 중괄호 양쪽에 괄호를 없애도 됨.
}

// 확장함수

val pizza : String.() -> String = {
    this + "Pizza is the best!"
}

fun extendString(name : String, age : Int) : String{
    val introduceMyself : String.(Int) -> String = {
        "I'm ${this} and ${it} years old" }
    // this는 확장 되기전 String 을 받은 것
    // 파라미터가 1개일 경우에는 it으로 가능.
    return name.introduceMyself(28)
}

// 람다의 Return

val calculateGrade : (Int) -> String = {
    //파라미터는 항상 () 써야하지만 리턴값은 한개이기 때문에 안써도 됨.
    when (it) {
        in 0..40 -> "F"
        in 41..70 -> "B"
        in 71..100 -> "perfect"
        else -> "Error"
    }
}

fun invokeLambda(lambda : (Double) -> Boolean) : Boolean {
    // 파라미터가 lambda 식.
    // 이 lambda 식은 double 형을 boolean 형으로 바꾼다.
    return lambda(5.2343)
    // double형 파라미터가 지금 5.2343임.
}

