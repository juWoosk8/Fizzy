package simpleSearchEngine

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ManyLinesTest {

    @Test

    fun `should say first second third fourth`() {
        val result = matchWord("first second third fourth", "third")
        assertThat(result).isEqualTo("first second third fourth")
    }
    @Test
    fun `should say Not found if not found`() {
        val result = matchWord("cat dog and mouse", "elephant")
        assertThat(result).isEqualTo("Not found")
    }
}