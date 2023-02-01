fun plusNumbers(first_num: Int, second_num: Int):Int{
    val result:Int = first_num + second_num
    return result
}

// 함수를 호출하는 방법
plusNumbers(first_num = 10,second_num = 20)
plusNumbers(10,20)

val result: Int = plusNumbers(first_num = 5,second_num = 7)
println(result)

//기본값이 있는 함수를 선언하는 방법
fun plusNumbersWithDefault(first_num: Int, second_num: Int = 10):Int{
    return first_num+second_num
}

val result2:Int = plusNumbersWithDefault(first_num = 20)
println(result2)
val result3:Int = plusNumbersWithDefault(first_num = 20,second_num = 50)
println(result3)

//반환값이 없는 함수를 선언하는 방법
fun plusNumbersWithNoReturn(first_num:Int,second_num:Int):Unit{
    val result: Int = first_num+second_num
    println(result)
}

fun plusNumbersWithNoReturn2(first_num:Int,second_num:Int):Unit{
    val result: Int = first_num+second_num
    println(result)
}

fun plusNumbersWithNoReturn3(first_num:Int,second_num:Int):Unit{
    val result: Int = first_num+second_num
    println(result)
    return
    //return Unit
}
plusNumbersWithNoReturn3(10,200)

//함수선언을 간단하게 하는 방법
fun shortPlusNumbers(first_num:Int, second_num:Int) = first_num + second_num
val result10 = shortPlusNumbers(first_num = 10, second_num = 100)
println(result10)

//가변인자를 갖는 함수
fun plusMultipleNumbers(vararg numbers:Int):Int{
    for (number in numbers){
        println(number)
    }
}
plusMultipleNumbers(...numbers:1,2,3,4,5)