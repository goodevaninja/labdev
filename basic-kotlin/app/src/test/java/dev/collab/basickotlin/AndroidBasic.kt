package dev.collab.basickotlin

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class AndroidBasic {

    @Test
    fun helloWord() {
        println("Hello world!")
    }

    @Test
    fun penjumlahanType1() {
        val a = 4
        val b = 5
        val result = a + b
        println("Hasil penjumlahan " + a + " + " + b + " = " + result)
    }
}