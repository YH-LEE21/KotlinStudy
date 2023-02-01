//5. nullable 정수형 두개를 받는 함수를 만든다. 이 함수는 받은 인수의 합을 반환한다
//이때 인수중에 null이 있으면 0 으로 취급하여 합을 구한다

fun plusNumbersWithNullable(num1:Int?,num2:Int?):Int {
    var n1  = if(num1 == null) 0 else num1
    var n2 = if(num2 == null) 0 else num2
    return n1 + n2
}

println(plusNumbersWithNullable(50,1))