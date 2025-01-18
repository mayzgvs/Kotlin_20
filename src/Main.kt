//Задача 1: Четное или нечетное число
//  fun main() {
//    println("Введите целое число:")
//    val input = readLine()
//    if (input != null && input.isNotEmpty()) {
//        try {
//            val number = input.toInt()
//
//            if (number % 2 == 0) {
//                println("Число $number - четное")
//            } else {
//                println("Число $number - нечетное")
//            }
//        } catch (e: NumberFormatException) {
//            println("Ошибка: Введите корректное целое число")
//        }
//    } else {
//        println("Ошибка: Ввод не может быть пустым")
//    }
//}


//Задача 2: Минимальное из трех чисел
//fun main() {
//    print("Введите первое число: ")
//    val a = readLine()!!.toInt()
//    print("Введите второе число: ")
//    val b = readLine()!!.toInt()
//    print("Введите третье число: ")
//    val c = readLine()!!.toInt()
//    var min = a
//    if (b < min) min = b
//    if (c < min) min = c
//    println("Минимальное число: $min")
//}


//Задача 3: Таблица умножения
//fun main() {
//    for (i in 1..10) {
//        println("$i * 5 = ${i * 5}")
//    }
//}


//Задача 4: Сумма чисел от 1 до N
//fun main() {
//    print("Введите число N: ")
//    val n = readLine()!!.toInt()
//
//    var sum = 0
//    for (i in 1..n) {
//        sum += i
//    }
//
//    println("Сумма чисел от 1 до $n равна $sum")
//}


//Задача 5: Число Фибоначчи
//fun main() {
//    print("Введите число N: ")
//    val n = readLine()!!.toInt()
//
//    // Первые два числа Фибоначчи
//    var fib1 = 0
//    var fib2 = 1
//
//    println(fib1)
//    if (n > 1) {
//        println(fib2)
//    }
//
//    for (i in 3..n) {
//        val nextFib = fib1 + fib2
//        println(nextFib)
//        fib1 = fib2
//        fib2 = nextFib
//    }
//}


//Задача 6: Проверка простого числа
//fun isPrime(n: Int): Boolean {
//    if (n <= 1) return false
//    if (n == 2 || n == 3) return true
//    if (n % 2 == 0 || n % 3 == 0) return false
//
//    var i = 5
//    while (i * i <= n) {
//        if (n % i == 0 || n % (i + 2) == 0) {
//            return false
//        }
//        i += 6
//    }
//    return true
//}
//
//fun main() {
//    print("Введите число: ")
//    val number = readLine()!!.toInt()
//
//    if (isPrime(number)) {
//        println("$number - простое")
//    } else {
//        println("$number - составное")
//    }
//}


//Задача 7: Обратный порядок чисел
//fun main() {
//    print("Введите число N: ")
//    val n = readLine()!!.toInt()
//
//    for (i in n downTo 1) {
//        println(i)
//    }
//}


//Задача 8: Сумма четных чисел
//fun main() {
//    print("Введите число A: ")
//    val a = readLine()!!.toInt()
//
//    print("Введите число B: ")
//    val b = readLine()!!.toInt()
//
//    var sum = 0
//    for (i in a..b) {
//        if (i % 2 == 0) {
//            sum += i
//        }
//    }
//
//    println("Сумма четных чисел в диапазоне от $a до $b равна $sum")
//}


//Задача 9: Реверс строки
//fun main() {
//    print("Введите строку: ")
//    val inputString = readLine()!!
//
//    val reversedString = inputString.reversed()
//    println(reversedString)
//}


//Задача 10: Количество цифр в числе
//fun main() {
//    print("Введите число: ")
//    val inputNumber = readLine()!!
//
//    val digitCount = inputNumber.length
//    println("Количество цифр в числе: $digitCount")
//}


//Задача 11: Факториал числа
//fun factorial(n: Int): Long {
//    var result = 1L
//    for (i in 2..n) {
//        result *= i
//    }
//    return result
//}
//
//fun main() {
//    print("Введите число N: ")
//    val n = readLine()!!.toInt()
//
//    val fact = factorial(n)
//    println("Факториал $n равен $fact")
//}


//Задача 12: Сумма цифр числа
//fun sumOfDigits(num: Int): Int {
//    var temp = num
//    var sum = 0
//    while (temp != 0) {
//        sum += temp % 10
//        temp /= 10
//    }
//    return sum
//}
//
//fun main() {
//    print("Введите число: ")
//    val number = readLine()!!.toInt()
//
//    val digitsSum = sumOfDigits(number)
//    println("Сумма цифр числа $number равна $digitsSum")
//}


//Задача 13: Палиндром
//fun isPalindrome(str: String): Boolean {
//    val cleanStr = str.toLowerCase().filter { it.isLetterOrDigit() }
//    return cleanStr == cleanStr.reversed()
//}
//
//fun main() {
//    print("Введите строку: ")
//    val input = readLine()!!
//
//    if (isPalindrome(input)) {
//        println("Строка '$input' является палиндромом")
//    } else {
//        println("Строка '$input' не является палиндромом")
//    }
//}


//Задача 14: Найти максимальное число в массиве
//fun main() {
//    print("Введите размер массива: ")
//    val size = readLine()!!.toInt()
//
//    val array = Array(size) { 0 }
//    for (i in 0 until size) {
//        print("Введите элемент массива №$i: ")
//        array[i] = readLine()!!.toInt()
//    }
//
//    val maxValue = array.maxOrNull() ?: throw IllegalStateException("Массив пуст")
//    println("Максимальное число: $maxValue")
//}


//Задача 15: Сумма всех элементов массива
//fun main() {
//    print("Введите размер массива: ")
//    val size = readLine()!!.toInt()
//
//    val array = Array(size) { 0 }
//    for (i in 0 until size) {
//        print("Введите элемент массива №$i: ")
//        array[i] = readLine()!!.toInt()
//    }
//
//    val sum = array.sum()
//    println("Сумма элементов массива: $sum")
//}


//Задача 16: Количество положительных и отрицательных чисел
//fun main() {
//    print("Введите размер массива: ")
//    val size = readLine()!!.toInt()
//
//    val array = Array(size) { 0 }
//    for (i in 0 until size) {
//        print("Введите элемент массива №$i: ")
//        array[i] = readLine()!!.toInt()
//    }
//
//    val positiveCount = array.count { it > 0 }
//    val negativeCount = array.count { it < 0 }
//
//    println("Положительных чисел: $positiveCount")
//    println("Отрицательных чисел: $negativeCount")
//}


//Задача 17: Простые числа в диапазоне
//fun isPrime(n: Int): Boolean {
//    if (n <= 1) return false
//    if (n == 2 || n == 3) return true
//    if (n % 2 == 0 || n % 3 == 0) return false
//
//    var i = 5
//    while (i * i <= n) {
//        if (n % i == 0 || n % (i + 2) == 0) {
//            return false
//        }
//        i += 6
//    }
//    return true
//}
//
//fun main() {
//    print("Введите число A: ")
//    val a = readLine()!!.toInt()
//
//    print("Введите число B: ")
//    val b = readLine()!!.toInt()
//
//    for (i in a..b) {
//        if (isPrime(i)) {
//            println(i)
//        }
//    }
//}


//Задача 18: Подсчет гласных и согласных в строке
//val vowels = setOf('а', 'у', 'е', 'ы', 'о', 'э', 'я', 'и', 'ю', 'ё')
//val consonants = setOf(
//    'б', 'в', 'г', 'д', 'ж', 'з', 'й', 'к', 'л', 'м',
//    'н', 'п', 'р', 'с', 'т', 'ф', 'х', 'ц', 'ч', 'ш', 'щ'
//)
//
//fun countVowelsAndConsonants(input: String): Pair<Int, Int> {
//    var vowelCount = 0
//    var consonantCount = 0
//
//    input.forEach { char ->
//        when (char.toLowerCase()) {
//            in vowels -> vowelCount++
//            in consonants -> consonantCount++
//        }
//    }
//
//    return Pair(vowelCount, consonantCount)
//}
//
//fun main() {
//    print("Введите строку: ")
//    val input = readLine()!!
//
//    val (vowelCount, consonantCount) = countVowelsAndConsonants(input)
//    println("Гласных: $vowelCount")
//    println("Согласных: $consonantCount")
//}


//Задача 19: Перестановка слов в строке
//fun reverseWords(input: String): String {
//    val words = input.split(" ")
//    return words.reversed().joinToString(" ")
//}
//
//fun main() {
//    print("Введите строку: ")
//    val input = readLine()!!
//
//    val reversedInput = reverseWords(input)
//    println(reversedInput)
//}


//Задача 20: Число Армстронга
//import java.lang.Math.pow
//
//fun isArmstrongNumber(num: Int): Boolean {
//    val originalNum = num
//    var sum = 0
//    var temp = num
//    val digits = num.toString().length
//
//    while (temp > 0) {
//        val lastDigit = temp % 10
//        sum += pow(lastDigit.toDouble(), digits.toDouble()).toInt()
//        temp /= 10
//    }
//
//    return sum == originalNum
//}
//
//fun main() {
//    print("Введите число: ")
//    val number = readLine()!!.toInt()
//
//    if (isArmstrongNumber(number)) {
//        println("$number - это число Армстронга")
//    } else {
//        println("$number - это не число Армстронга")
//    }
//}
