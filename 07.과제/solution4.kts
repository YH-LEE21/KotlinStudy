//4. 학생이 시험에서 맞은 문제의 갯수를 넣어주면 시험 점수점(정수)를 반환하는 함수를 만드시오
//(시험 문제는 총 20문제이고 만점은 100점)

fun testScore(currect_answer:Int) = 5*currect_answer
var answer:Int = testScore(20)
println("Score : "+answer)