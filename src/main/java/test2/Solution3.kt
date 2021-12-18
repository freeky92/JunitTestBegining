package test2

class Solution3

fun main() {
    println(getYearEra(2077))
}

fun getYearEra(year: Int): String {
    val era: String = when {
        year < 1970 -> "before"
        year == 1970 -> "equals"
        (year > 1970) && (year < 2000) -> "after (XX century)"
        (year > 1999) && (year < 2100) -> "after (XXI century)"
        year >= 2100 -> "distant future"
        else -> {
            return "Wrong year"
        }
    }
    return era
}

