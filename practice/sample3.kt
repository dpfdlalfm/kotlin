package com.example.practice1


fun main() {
    nullcheck()
    ignoreNulls("abcd")
}

// Nullable / NonNull

fun nullcheck() {
    var name = "inwoo"
    var nullName : String? = null
    // ?를 붙이면 null값이 됨. null 값 선언시 타입을 생략하면 안됨!!

    var nameInUppercase = name.uppercase()

    var nullNameInUpperCase = nullName?.uppercase()
    // null 값이면 null을 반환
    // null값이 아니면 대문자로 변경된 문자를 반환
    // 실행전에 미리 nullcheck가 가능함.

    // ?: 앨비스 프레슬리 문자자
    // null 값이 아니면 그대로를 출력, null 값이면 다음 문장을 출력
    val lastNAme : String? = null
    val fullName = name+" "+(lastNAme?: "NO lastName")
    //lastNAme이 null 값이면 뒤 문자열을 출력.
    // nullcheck와 동시에 if문 역할도 같이하는 듯
    println(fullName)

    //!!
}

fun ignoreNulls(str : String?) {
    val mNotNull : String = str!!
    // 확실하게 null 값이 아니라고 하는 기능.
    val upper = mNotNull.uppercase()
    println(upper)


    val email : String?= "dpfdlalfm@naver.com"
    email?.let{
        println("my email is ${email}")
    }
}

