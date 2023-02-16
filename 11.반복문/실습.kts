// range
for(value in 1..10) {
    println(value.toString() +"반복")
}

// progrssion + step
for(value in 1..10 step (5)) {
    println(value.toString() +"반복")
}

// progression + downTo
for(value in 10 downTo 1) {
    println(value.toString() +"반복")
}


val numbers = listOf<Int>(0,1,2,3)
for(number in numbers) {
    println(number)
}

for(number in 0..numbers.size) {
    println("반복3")
}

for(number in 0 until numbers.size) {
    println("반복4")
}

for((index,number) in numbers.withIndex()) {
    println(number)
}

numbers.forEach{
    println(it)
}

numbers.forEach{ number ->
    println(number)
}