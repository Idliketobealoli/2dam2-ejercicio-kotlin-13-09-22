/**
 * @author Daniel Rodríguez Muñoz
 */
fun main() {
    ejercicio1()
    ejercicio2()
}

fun ejercicio2() {
    // Pedir email, numero de tarjeta de crédito, dni y comprobar que sean correctos.
    println("Por favor, introduzca los siguientes campos: ")
    print("E-mail: ")
    val email: String = readln()
    print("\nNúmero de tarjeta de crédito: ")
    val numCC: String = readln()
    print("\nDNI: ")
    val dni: String = readln()
    comprobarDatos(email, numCC, dni)
}

fun comprobarDatos(email: String, numCC: String, dni: String) {
    val emailCorrecto: Boolean = email.matches("[a-z0-9]+@[a-z]+\\.[a-z]{2,3}".toRegex())
    val creditCardCorrecto: Boolean = numCC.matches("[0-9]{4}-[0-9]{4}-[0-9]{4}-[0-9]{4}".toRegex())
    val dniCorrecto: Boolean = dni.matches("[0-9]{8}-[A-Z]".toRegex())

    if (emailCorrecto && creditCardCorrecto && dniCorrecto) {
        println("Datos correctos")
    }
    else when {
        !emailCorrecto -> println("E-mail incorrecto.")
        !creditCardCorrecto -> println("Tarjeta de crédito incorrecta.")
        !dniCorrecto -> println("DNI incorrecto.")
    }
}

fun ejercicio1() {
    // Pedir por consola un intervalo de números y devolver la tabla de multiplicar de los numeros del intervalo:
    println("Por favor, introduzca el primer número del intervalo: ")
    val num1 = readLine()?.toInt() ?: 0
    println("Por favor, introduzca el segundo número del intervalo: ")
    val num2 = readLine()?.toInt() ?: (num1 + 1)
    println("El intervalo ha sido configurado a $num1 .. $num2")
    val intervalo = num1..num2
    println("*** *** *** ***\n")

    for (i in intervalo) {
        println("-> TABLA DEL $i: ")
        for (j in 1..10) {
            println("$i * $j = ${i*j}")
        }
        println("")
    }
}