package submarine

import java.io.File

class SonarData

fun readSonarData(fileName: String) = File(fileName).readLines().map { it.toInt() }

fun main() {
    val list = readSonarData("src/main/java/submarine/data.txt")
    var count = 0
    val sum3List = emptyList<Int>().toMutableList()
    for (k in 1 until list.lastIndex) {
        sum3List.add(list[k - 1] + list[k] + list[k + 1])
        if (k != 1 && sum3List [k - 1] > sum3List[k - 2]) {
            count += 1
        }
    }
    println(count)
}