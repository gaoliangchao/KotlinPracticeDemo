package com.gao.kotlindemo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}

fun sum(a: Int, b: Int): Int {
    return a + b
}

fun result1() {
    println("result1: sum: 3 + 2 = ${sum(2, 3)}")
}

fun result2() {
    var number1 = 123_4234
    var number2 = 0000.1_123_4234
    println("result2: number1 $number1")
    println("result2: number2 $number2")
}

fun result3() {
    var number1 = 3 / 0.0
    println("result3: number1 $number1")
    var number2 = -3 / 0.0
    println("result3: number2 $number2")
    var number3 = 0.0 / 0.0
    println("result3: number3 $number3")
    var afl = 5.2345556f
    //下面将看到afl 的值己经发生了改变
    println("afl 的值为：$afl")
}

fun result4() {
    var char1: Char = 'a'
    var char2: Char = '\n'
    var char3: Char = '\r'
    val char4: Char = '\u9999'
    println("result4: char1 $char1-")
    println("result4: char2 $char2-")
    println("result4: char3 $char3-")
    println("result4: char4 $char4-")
}

fun result5(): Unit {
    var byteNumber: Byte = 79
    var shortNumber: Short = 120
//    报错不支持隐式转换
//    var a: Short = byteNumber
    var a: Short = byteNumber.toShort()
    println("result5: byteNumber $byteNumber")
    println("result5: shortNumber $shortNumber")
    println("result5: a $a")
    var shortNumber2: Short = 240
    var b: Byte = shortNumber2.toByte()
    //出现数据溢出 target number 240, b is -16
    println("result5: target number 240, b is $b")

}

fun result6(): Unit {
    var byteNumber: Byte = 79
    var shortNumber: Short = 120
    //算术表达式运算时会进行数据类型的自动转换
    var resultNumber = byteNumber + shortNumber
    println("result6 : resultNumber $resultNumber")
    println("result6 : resultNumber type ${resultNumber.javaClass}")
}

fun main() {
    result1()
    result2()
    result3()
    result4()
    result5()
    result6()
}