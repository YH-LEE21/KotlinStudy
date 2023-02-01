//if
val number1:Int = 30
if (number1 == 10) {
    println("10 입니다")
}else if (number1 == 20){
    println("20 입니다")
}else{
    println("10,20 둘 다 아닙니다.")
}

//간단한경우 이렇게 사용가능
if (number1 == 10) println("10입니다")
else if (number1 == 30) println("30입니다.")
else println("10,30 둘 다 아닙니다")

val number2: Int = 10 + 20
val number3: Int = if(number2>30) 40 else 50
println("number3 : "+number3)

val number4:Int = 5

when (number4){
    5 -> {
        println("5입니다.")
    }
    6 -> {
        println("6입니다.")
    }
    else ->{
        println("모르겠습니다.")
    }
}

when (number4){
    5 -> println("5입니다.")
    6 -> println("6입니다.")
    else -> println("모르겠습니다.")
}

//when (number4){
//    4 -> println("4입니다.")
//    "안녕하세요" -> println("Hello")
//    is Boolean -> println("boolean")
//}

when (number4){
    in 1..10 -> println("number is in 1..10")
    in 11..39 -> println("number is in 11..39")
    in 40..60 -> println("number is in 40..60")
}