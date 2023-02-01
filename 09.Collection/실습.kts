//List
var numbers = listOf<Int>(1,2,3)
println("numbers")
///numbers[0] = 3 ->error immutable 값 변경 불가능
println(numbers[0])
println(numbers.get(1))
println(numbers.indexOf(2))
println(numbers.first())
println(numbers.last())
println("------------")

var numbers2 = mutableListOf<Int>(1,2,3)
println("numbers2")
numbers2.add(50)
println(numbers2)
numbers2.removeAt(0)
println(numbers2)
numbers2.addAll(2, listOf<Int>(100,100))
println(numbers2)
println("------------")

//Set
var numbers3 = setOf<Int>(1,2,3,1,1,3,4)
println("numbers3")
println(numbers3.contains(1))
println(numbers3.containsAll(setOf<Int>(4,2)))
println("------------")
var numbers4 = mutableSetOf<Int>(1,2,3,1,1,3,4)
println("numbers4")
numbers4.remove(1)
println(numbers4)

println("------------")

//Map
var numbers5 = mapOf<Int,String>(1 to "one",2 to "two")
println("numbers5")
println(numbers5.keys)
println(numbers5.values)
println(numbers5.size)
println(numbers5.get(1))
println(numbers5[2])
println(numbers5.getOrDefault(2,"DEFALUT"))
println(numbers5.getOrDefault(3,"DEFALUT"))
println("------------")

var numbers6 = mapOf<Int,String>(Pair(1,"one"), Pair(2,"two"))

var numbers7 = mutableMapOf<Int,String>(1 to "one", 2 to "two")