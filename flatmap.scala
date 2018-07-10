val users = List(("Juntao", 32), ("Abruzzi", 30), ("李白", 10))

def x = for {
	result <- users
	(name, age) = result 
	if (age > 10 && age < 32)
} yield name

x

val users = List(("Juntao", 32), ("Abruzzi", 30), ("李白", 10))
for ((name, age) <- users if age > 10) {
	println(name)
}