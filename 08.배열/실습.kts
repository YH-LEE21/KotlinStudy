//배열을 선언하는 방법 (1)
var array1 = arrayOf(true,"Hi",10,null)
var array2 = arrayOf<Int?>(1,2,3,null)
var array3 = intArrayOf(1,2,3,4,5)

//배열을 선언하는 방법 (2)
var array4 = Array(10,{0})
println(array4[4])
println(array4.get(1))
array4.set(0,30)
println(array4.get(0))
var array5 = IntArray(10,{0})
//var array6 = StringArray(10,{"HI"}) //-> 불가능

//배열을 선언하는 방법 (3)
var array7 = Array<Int>(10,{0})
var array8 = Array<String>(10,{""})
