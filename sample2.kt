package com.example.practice1

//fun main() {
//    // String Template
//
//    val name = "Inwoo"
//    val lastname = "Lee"
//    val age = 25
//    println("my name is ${name + lastname}, I'm ${age}")
//    // $ 안에 대괄호를 쓰면 변수만 들어가짐.
//    println("is this true? ${1 == 0}")
//    println("this is 2\$")
//    // $ 기호 쓰고 싶으면 앞에 백스페이스를 추가
//
//
//
//    /*
//    주석
//    주석
//    주석주석
//     */
//}

fun main() {
    forAndWhile()
}

fun max1(a : Int, b : Int) : Int {
    if (a > b) {
        return a
    }
    else {
        return b
    }

}
fun max2(a: Int, b: Int) : Int = if (a>b) a else b

fun checkNum(score : Int) {
    when(score) {
        0 -> println("0")
        1 -> println("1")
        2,3 -> println("2 or 3")
        else -> println("?")
    }

    //expression
    var b = when(score) {
        1 -> 1
        2 -> 2
        else -> 3
    }

    println("${b}")

    //statement
    when(score) {
        in 90..100 -> println("A")
        in 10..80 -> println("B")
        else -> println("F")
    }
}

// Expression vs Statement
/* 모든 함수는 Expression
    Unit도 리턴값이 있는걸로 침.

 */

// Array

// List 는 2개가 있다.
// 1. List (값 변경 불가능) 2. MutuableList

fun array() {
    val array = arrayOf(1,2,3)
    val list = listOf(1.2,3)
    // array와 List 초기화 선언

    val array2 = arrayOf(1,"d",3.4f)
    val list2 = listOf(1,"d",11L)
    // 다양한 자료형으로 선언 가능

    // array는 값을 변경할 수 있음.
    // List
    array[0] = 3
    //list[0] = 3 오류 발생. 값 변경 불가능!

    var result = list.get(0)
    //get 함수로 가져올 수만 있다.

    var arrayList = arrayListOf<Int>()
    arrayList.add(10)
    arrayList.add(20)

}

// 반복문 For / While

fun forAndWhile() {
    val students = arrayListOf("a","b","c","d")
    for (name in students) {
        println("${name}")
    }

    for ((index, name) in students.withIndex()) {
        println("${index+1}번째 학생 : ${name}")
    }

    var sum : Int = 0
    for ( i in 1..10) {
        sum += i
    }
    println(sum)

    for (i in 1..10 step 2) {
        sum += i
    }
    println(sum)

    for (i in 1 downTo 1) {
        sum += i
    }
    println(sum)

    var index = 0
    while (index < 10) {
        println("iundex : ${index}")
        index += 1
    }
}