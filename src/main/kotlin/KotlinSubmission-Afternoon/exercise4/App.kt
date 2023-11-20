package id.infinitelearning.KotlinSubmission.exercise4

fun main() {


    /**
     * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
     *
     */
    // Buat di bawah sini
try {
    print("Masukkan suatu angka: ")
    val userInput = readLine()
    val number = userInput?.toInt()

    if (number != null) {
        println("Anda memasukkan angka: $number")
    } else {
        throw NumberFormatException("Input bukan angka.")
    }

} catch (e: NumberFormatException) {
    println("Error: Input bukan angka.")
}
}