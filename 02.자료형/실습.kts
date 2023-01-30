//변수를 자료형과 함께 선언하는 방법
// -> val/var 변수명 : 타입 = 값

val byteInt:Byte = 10
val shortInt:Short = 10
val integerInt:Int = 10
val longInt:Long = 10

//val wrongByte:Byte = 10000//error Byte : -128 ~ 127

val floatNumber:Float = 10.0f //'f'를 무조건 붙여줘야 한다
val doubleNumber:Double = 10.0

//타입추론
val number1 = 10 //Int
val number2 = 10.0 // Double

//논리형
val yes:Boolean = true
val no:Boolean = false

// 문자/ 문자열형
val text1:Char ='A'
//val text1:Char ='AA'//error
//val text1:Char ="A"//error type missMatch

val strText1:String ="안녕하세요"

//★팁
//1.타입을 선택 할 때는 가장 작은 타입을 선택하는 것이 좋다
//2.실제로는 대부분 Int를 사용한다