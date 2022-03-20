package com.example.practice1

class Book private constructor(val id : Int, val name : String) {

    // companion object는 객체 생성 없이 클래스 내 메소드를 읽어올 수 있게 해준다.
    // 주로 private 클래스 내 프로퍼티나 메소드를 가져오는데 사용함.

    companion object BookFactory : IdProvider {

        override fun getId(): Int {
            return 444
        }

        val myBook = "animal farm"

        fun create() = Book(getId(), myBook)
    }

}

interface  IdProvider {
    fun getId() : Int
}


fun main() {
//    val book = Book()
//    Book class가 private 이라 사용 불가함.

    val book = Book.create()
//    create 함수는 Book 클래스 내에 있지만,
//    companion object의 내부 메소드 이므로 가져올 수 있었음.

    val bookId = Book.BookFactory.getId()
    println("${book.id} ${book.name}")
}
