// While문 실습

//아래와 같이 작성하면 무한루프에 빠진다
// 루프(loop) : 반복

//var i = 0
//while(i<5){
//    if(i%2 == 0){
//        println("짝수")
//    }else{
//        println("홀수")
//    }
//    i++
//}

var z = 10
do {
    if(z%2 == 0){
        println("짝수")
    }else{
        println("홀수")
    }
    z++
}while(z>20)