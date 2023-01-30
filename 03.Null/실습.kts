val number:Int? = null // null이 들어갈 수 있는 변수 -> nullable 한다
println(number)
//val number1:Int = null // null이 들어갈 수 없는 변수 -> non-null

val num1:Int = 2 + 5
val num2:Int = 10
val num3:Int = num1 + num2
println(num3)

var number2:Int? = 2 + 5
var number3:Int? = 10
//val number4:Int? = number2 + number3 //error! why? 100% Int라는 확신이 없기 때문에
val number4:Int? = number2!! + number3!!
println(number4)

// !!로 null이 아님을 개발자가 보장 할 수 있다.
// - 하지만 실제로 null인 경우에는 NPE (NullPointException이 발생 할 수 있다)
// - 결론 : 정말 100% 확신이 있는 경우가 아니면 사용하지 말자!

if(null == 5){ // == 비교연산 사용가능
    println("same")
}else{
    println("not same")
}

if(null == null){ // == 비교연산은 가능하다 (상태비교)
    println("same")
}else{
    println("not same")
}