/**
 * Untuk menyelesaikan tugas latihan, Anda tidak diperbolehkan mengubah kode yang sudah ada.
 * Cukup tambahkan kode berdasarkan perintah yang sudah ditentukan.
 *
 */
class Cat(private val name: String) {
    // TODO 1
    var sleep: Boolean = false
    var nama = name
    fun toSleep() {
        var nama = this.nama
        if(sleep == true){
            println("$nama, sleep!")
        }else{
            println("$nama, let's play!")
        }
    }
    fun getter(){
        println("Fungsi getter dipanggil")
    }
    fun setter(){
        println("Fungsi setter dipanggil")
    }
}

fun main() {

    // TODO 2
    val gippy = Cat("Gippy")

    gippy.getter()
    gippy.toSleep()
    gippy.setter()
    gippy.getter()
    gippy.sleep = true
    gippy.toSleep()
}