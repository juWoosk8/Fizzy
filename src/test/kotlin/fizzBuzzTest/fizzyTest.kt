package fizzBuzzTest

import fizzBuzz.fizzbuzz
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test


internal class FizzBuzzTest {

    @Test

    fun `should return 1 given 1 `() {
        val result = fizzbuzz("1")
        assertThat(result).isEqualTo("1")
    }

}