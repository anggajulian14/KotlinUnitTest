package com.example.kotlinunittest

import org.junit.Assert
import org.junit.Test

// Ini adalah kelas uji untuk menguji kelas SimpleCalculator.
internal class SimpleCalculatorTest {
    // Ini adalah fungsi uji yang menggunakan anotasi @Test dari framework pengujian.
    @Test
    fun test() {
        // Membuat objek kalkulator dari kelas SimpleCalculator.
        val calculator = SimpleCalculator()

        // Memanggil metode add() dari kelas SimpleCalculator dan menyimpan hasilnya dalam variabel result.
        val result = calculator.add(2, 2)

        // Membandingkan hasil penjumlahan (result) dengan nilai yang diharapkan (4) menggunakan Assert.assertEquals().
        // Jika hasil penjumlahan sesuai dengan nilai yang diharapkan (4), pengujian akan lulus.
        // Jika tidak, pengujian akan gagal dan pesan "hasil harus 4" akan ditampilkan.
        Assert.assertEquals("hasil harus 4", 4, result)
    }
}
