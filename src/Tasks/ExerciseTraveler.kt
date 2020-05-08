package Tasks
// Задача "Путешественник".
// Путешественник идет по горам и каждый день записывает по показаниям приборов на какой высоте он сейчас находится.
// Необходимо определить, сколько пик гор путешественник точно пересек.
// Точка называется пиком горы, если две соседние с ней точки НЕ выше или равны по высоте с текущей точкой.
// Крайние точки пиками гор не считаются(стартовая и конечная).

fun main(args: Array<String>) {
    var allMountains=arrayOf<Int>(16, 87, 97, 88, 73, 17, 46, 88, 30, 74, 5, 33, 36, 89, 36, 46, 39, 8, 14, 77, 25, 87, 18, 98, 38, 24, 37, 70, 13, 83, 76, 2, 20, 25, 31, 72, 36, 67, 50, 83, 37, 49, 87, 66, 40, 83, 34, 93, 14, 51, 70, 54, 67, 64, 65, 46, 36, 3, 14, 36, 22, 50, 40, 53, 40, 63, 80, 42, 13, 48, 68, 47, 38, 25, 82, 28, 1, 80, 21, 39, 93, 54, 14, 94, 94, 72, 65, 35, 77, 22, 17, 47, 89, 15, 18, 95, 78, 18, 77, 71, 29, 69, 34, 94, 33, 7, 87, 30, 70, 97, 45, 98, 70, 35, 86, 50, 28, 96, 54, 10, 29, 44, 35, 95, 79, 45, 2, 51, 48, 69, 68, 83, 99, 47, 48, 77, 83, 10, 62, 88, 53, 82, 5, 4, 18, 40, 11, 99, 23, 43, 17, 66, 29, 69, 74, 24, 43, 96, 36, 98, 9, 51, 48, 87, 4, 28, 95, 82, 94, 22, 25, 66, 35, 76, 55, 23, 3, 6, 15, 56, 6, 26, 87, 10, 4, 64, 14, 43, 25, 77, 21, 7, 66, 24, 6, 9, 77, 68, 20, 3, 53, 10, 63, 94, 69, 34, 6, 21, 42, 16, 30, 24, 96, 13, 43, 85, 89, 54, 19, 10, 42, 66, 11, 4, 75, 63, 61, 50, 33, 99, 3, 17, 15, 29, 28, 32, 59, 75, 86, 56, 1, 53, 99, 20, 27, 63, 51, 53, 78, 40, 71, 9, 56, 10, 19, 50, 48, 72, 99, 48, 14, 30, 31, 71, 56, 50, 28, 83, 21, 72, 12, 50, 11, 86, 62, 10, 29, 46, 63, 22, 36, 57, 74, 11, 93, 66, 7, 23, 54, 27, 12, 42, 79, 70, 25, 11, 2, 27, 26, 50, 20, 48, 63, 83, 58, 86, 71, 3, 85, 13, 54, 99, 66, 83, 33, 35, 91, 7, 72, 74, 17, 89, 47, 78, 79, 10, 56, 22, 62, 75, 46, 37, 79, 75, 1, 93, 97, 25, 33, 23, 88, 32, 45, 53, 8, 26, 89, 67, 97, 96, 48, 52, 74, 90, 37, 37, 41, 23, 93, 34, 59, 54, 54, 7, 25, 37, 18, 35, 70, 84, 44, 20, 97, 18, 84, 40, 97, 85, 66, 70, 31, 98, 71, 69, 32, 29, 6, 61, 42, 20, 11, 75, 37, 69, 50, 82, 97, 66, 98, 66, 18, 10, 81, 56, 54, 97, 94, 7, 83, 17, 18, 62, 47, 15, 10, 95, 10, 57, 53, 20, 24, 57, 92, 28, 84, 48, 73, 10, 16, 66, 20, 50, 37, 75, 72, 46, 62, 45, 59, 52, 31, 2, 95, 24, 64, 90, 96, 96, 50, 19, 57, 57, 57, 57, 57, 57, 57, 57, 57, 57, 57, 57, 57, 57, 57, 57, 57, 57, 57, 57, 57, 57, 57, 57, 57, 57, 57, 57, 57, 57, 57, 57, 57, 57, 57, 57, 57, 57, 57, 57, 57, 57, 57, 57, 57, 57, 57, 57, 57, 57, 57, 57, 57, 57, 57, 57, 57, 57, 57, 57, 57, 57, 57, 57, 57, 57, 57, 57, 57, 57, 57, 57, 57, 57, 57, 57, 57, 57, 57, 57, 57, 57, 57, 57, 57, 57, 57, 57, 57, 57, 57, 57, 57, 57, 57, 57, 57, 57, 57, 57, 64, 86, 22, 49, 71, 74, 41, 47, 33, 39, 50, 89, 74, 63, 76, 31, 31, 70, 85, 21, 26, 76, 85, 16, 59, 82, 82, 67, 46, 60, 37, 11, 53, 73, 25, 73, 60, 67, 23, 22, 27, 79, 64, 96, 23, 18, 52, 18, 47, 91, 16, 13, 46, 36, 87, 50, 59, 27, 72, 6, 46, 92, 53, 34, 57, 2, 94, 31, 74, 78, 99, 4, 66, 64, 47, 78, 52, 3, 44, 68, 9, 30, 18, 52, 83, 16, 63, 79, 89, 15, 20, 16, 44, 4, 56, 85, 81, 58, 38, 88, 39, 80, 44, 91, 58, 94, 2, 78, 19, 87, 55, 63, 68, 86, 9, 84, 25, 79, 90, 22, 75, 21, 84, 85, 64, 79, 42, 30, 75, 69, 6, 9, 5, 45, 5, 37, 47, 57, 9, 9, 5, 51, 16, 3, 76, 41, 21, 61, 52, 82, 20, 6, 53, 59, 95, 38, 64, 47, 74, 13, 70, 88, 14, 42, 52, 13, 97, 12, 76, 75, 54, 65, 78, 87, 97, 2, 86, 57, 12, 41, 16, 49, 81, 35, 58, 8, 27, 14, 27, 24, 42, 22, 84, 28, 87, 44, 36, 49, 57, 62, 13, 89, 68, 23, 36, 59, 55, 59, 79, 85, 33, 98, 42, 20, 86, 39, 48, 55, 83, 79, 2, 44, 58, 72, 60, 60, 58, 40, 88, 31, 31, 71, 89, 24, 48, 10, 45, 25, 50, 4, 70, 3, 96, 52, 64, 3, 54, 52, 88, 78, 83, 6, 96, 64, 57, 65, 97, 13, 95, 15, 88, 42, 40, 99, 48, 7, 64, 14, 73, 33, 36, 9, 97, 65, 4, 56, 83, 30, 92, 23, 69, 70, 21, 49, 59, 96, 32, 6, 66, 54, 42, 97, 89, 33, 54, 31, 80, 76, 99, 3, 98, 97, 41, 28, 5, 17, 67, 73, 1, 20, 88, 21, 16, 11, 75, 6, 44, 33, 77, 63, 48, 30, 54, 25, 32, 94, 5, 53, 66, 91, 13, 7, 62, 91, 33, 4, 70, 98, 64, 1, 54, 3, 35, 95, 5, 45, 35, 41, 18, 5, 45, 16, 84, 45, 50, 17, 8, 11, 40, 87, 60, 31, 38, 12, 96, 25, 66, 98, 49, 67, 80, 92, 53, 80, 4, 55, 16, 46, 83, 8, 77, 71, 74, 42, 40, 81, 44, 5, 85, 50, 20, 75, 99, 64, 83, 11, 57, 5, 55, 78, 59, 63, 93, 78, 13, 37, 47, 98, 3, 3, 39, 67, 70, 65, 57, 51, 39, 33, 71, 89, 48, 10, 26, 14, 46, 16, 66, 32, 60, 12, 54, 24, 67, 54, 9, 55, 10, 28, 36, 28, 36, 75, 65, 90, 7, 4, 56, 72, 75, 48)
    val lengthAllMountains = allMountains.size
    println("Длина горной цепи составляет: " + lengthAllMountains + " гор.")

    var countMountainPeaks = 0
    for (i in 1..lengthAllMountains-2){
        if (allMountains[i] >= allMountains[i-1] && allMountains[i] >= allMountains[i+1]){
            countMountainPeaks++
        }
    }
    println("Путешественник пересек следующее количество пиков горы: " + countMountainPeaks)
}