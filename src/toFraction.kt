
import kotlin.math.roundToInt

fun main() {
    print(toFraction(1.05))
}
fun toFraction(value: Double): String {
    val ratio = 0.000001 // the radius should be adjusted depending on the
                            // required accuracy and the number of 0's after the point.
    var i = 1
    while (true) {
        val tem = value / (1.0 / i)
        if (kotlin.math.abs(tem - tem.roundToInt()) < ratio) {
            val x = tem.roundToInt() to i
            var a = x.toString().drop(1)
            a = a.dropLast(1)
            val frac = a.replace(",", "/")
            return frac.replace("\\s".toRegex(), "")
            //If the radius is not enough the function returns 1/1, so it is recommended
            // to create a condition to avoid this or return the original decimal value.
        }
        i++
    }
}