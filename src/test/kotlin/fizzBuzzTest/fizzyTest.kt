package fizzBuzzTest

import fizzBuzz.fizzbuzz
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test


internal class FizzBuzzTest {

    @Test

    fun `should return 1 given 1 `() {
        val result = fizzbuzz(1)
        assertThat(result).isEqualTo("1")
    }

    @Test

    fun `should return 2 given 2 `() {
        val result = fizzbuzz(2)
        assertThat(result).isEqualTo("2")
    }

    @Test

    fun `should return Fizz given 3 `() {
        val result = fizzbuzz(3)
        assertThat(result).isEqualTo("Fizz")
    }

    @Test

    fun `should return Buzz given 5 `() {
        val result = fizzbuzz(5)
        assertThat(result).isEqualTo("Buzz")
    }

    @Test

    fun `should return Fizz given 6 `() {
        val result = fizzbuzz(6)
        assertThat(result).isEqualTo("Fizz")
    }

    @Test

    fun `should return Buzz given 10 `() {
        val result = fizzbuzz(10)
        assertThat(result).isEqualTo("Buzz")
    }

    @Test

    fun `should return FizzBuzz given 15 `() {
        val result = fizzbuzz(15)
        assertThat(result).isEqualTo("FizzBuzz")
    }
}