fun main() {

    val onlineTime = 111111
    val min = onlineTime / 60
    val hours = onlineTime / 3600

    println(onlineTime)

    fun onlineTime() {
        when (onlineTime) {
            in 0..60 -> println("был(а) в сети только что")
            in 61..3600 -> println("был(а) в сети назад") // минуты
            in 3601..86400 -> println("был(а) в сети назад")// часы
            in 86401..172800 -> println("был(а) в сети сегодня")
            in 172801..259200 -> println("был(а) в сети вчера")
            in 259201..Int.MAX_VALUE -> println("был(а) в сети давно")
            else -> println("Неверное число")
        }
    }
}