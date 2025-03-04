package com.example.git_ex
import org.junit.Assert.*
import org.junit.Test
class JTest {
    @Test
    fun testSimple() {
        val result = 2 + 3
        assertEquals(5, result)
    }
}