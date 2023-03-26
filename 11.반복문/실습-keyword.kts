//break
for (i in 1..3){
    println("i : "+ i)
    for (j in 1..3){
        if (j == 2) break
        else println(j)
    }
}

println("-----------------")
//continue
for (i in 1..3){
    println("i : "+ i)
    for (j in 1..3){
        if (j == 2) continue
        else println(j)
    }
}
println("-----------------------")
//label
loop@for (i in 1..3){
    println("i : "+ i)
    for (j in 1..3){
        if (j == 2) break@loop
        else println(j)
    }
}