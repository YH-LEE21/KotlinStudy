//3. 학생의 시험 점수를 넣어주면 학점을 반환하는 함수를 만드시오
//(90점 이상 A학점, 80~89점은 B학점, 70~79점은 C학점, 그렇지 않으면 F학점)

fun checkGrade(score:Int):String{
    var result:String
    when(score){
        in 90..100 -> result = "A학점"
        in 80..89 -> result = "B학점"
        in 70..79 -> result = "C학점"
        else -> result = "F학점"
    }
    return result
}

println(GPA(69))