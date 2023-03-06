fun main() {
    print("Masukkan angka pertama: ")
    val num1 = readLine()?.toDouble()

    print("Masukkan angka kedua: ")
    val num2 = readLine()?.toDouble()

    print("Pilih operasi (+, -, *, /): ")
    val operator = readLine()

    val result = when(operator) {
        "+" -> num1?.plus(num2!!)
        "-" -> num1?.minus(num2!!)
        "*" -> num1?.times(num2!!)
        "/" -> num1?.div(num2!!)
        else -> null
    }

    if(result != null) {
        println("Hasil: $result")
    } else {
        println("Operasi tidak valid.")
    }
}