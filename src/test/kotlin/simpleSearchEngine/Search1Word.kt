package simpleSearchEngine

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OneWordTest {

    @Test

    fun `should find word in position 3 `() {
        val result = matchWord1("first second third fourth", "third")
        assertThat(result).isEqualTo("3")
    }
    @Test
    fun `should say Not found if not found`() {
        val result = matchWord1("cat dog and mouse", "elephant")
        assertThat(result).isEqualTo("Not found")
    }
}