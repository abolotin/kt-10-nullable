import org.junit.Test

import org.junit.Assert.*
import org.junit.Before
import ru.netology.Post
import ru.netology.WallService

class WallServiceTest {

    @Before
    fun prepareTest() {
        WallService.clear()
    }

    @Test
    fun addTest() {
        val post = WallService.add(Post(id = 0, text = "Post 1"))

        assertNotEquals(0, post.id)
    }

    @Test
    fun updateExistingTest() {
        val postOriginal = WallService.add(Post(id = 0, text = "Original post"))
        val postModified = Post(id = postOriginal.id, text = "Modified post")

        assertTrue(WallService.update(postModified))
    }

    @Test
    fun updateNonExistingTest() {
        val postOriginal = WallService.add(Post(id = 0, text = "Original post"))
        val postModified = Post(id = 0, text = "Modified post")

        assertFalse(WallService.update(postModified))
    }
}