package com.example.practice1

data class Ticket(val companyName : String, val name : String, var date : String, var seatNumber : Int)
// toString(), hashcode(), equals(), copy() 가 data class를 이용하면 자동 생성됨.
// data class는 하나의 파일에 여러개를 만들어서 저장할 수 있음.

class TicketNormal(val companyName : String, val name : String, var date : String, var seatNumber : Int)

fun main() {
    val ticketA = Ticket("koreanAir", "inwoo", "2020.01.03", 14)
    val ticketB = TicketNormal("koreanAir", "inwoo", "2020.01.03", 14)

    println(ticketA)    // data class는 println 하면 내용을 출력 해주는데
    println(ticketB)    // 일반 class는 println 하면 주소값을 출력시킴.
}