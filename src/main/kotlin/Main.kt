package ru.netology

import ru.netology.attachments.Attachment

data class Post(
    var id: Int = 0,
    val ownerId: Int = 0,
    val formId: Int = 0,
    val createdBy: Int = 0,
    val date: Int = 0,
    val text: String,
    val replyOwnerId: Int = 0,
    val friendsOnly: Boolean = false,
    val postType: String = "",
    val comments: PostComments? = null,
    val likes: PostLikes? = null,
    var attachments: Array<Attachment>? = null
) {
    data class PostComments(
        val count: Int = 0,
        val canPost: Boolean = false,
        val groupsCanPost: Boolean = false,
        val canClose: Boolean = false,
        val canOpen: Boolean = false
    )

    data class PostLikes(
        val count: Int = 0,
        val userLikes: Boolean = false,
        val canLike: Boolean = false,
        val canPublish: Boolean = false
    )
}

object WallService {
    private var posts = emptyArray<Post>()

    fun add(post: Post): Post {
        // HINT: Пока нет функции удаления, будем использовать индекс массива в качестве основы уникального ID поста.
        // Впоследствии можно брать за основу текущую метку времени с мс или завести отдельный счетчик.
        // Ну и заменить Array на Map.
        posts += post.copy(id = posts.size + 1)
        return posts.last()
    }

    fun update(post: Post): Boolean {
        // HINT: Поскольку использован индекс массива в качестве ID поста, выбираем элемент по этому индексу.
        if ((post.id - 1) > -1 && (post.id - 1) < posts.count()) {
            // Пост найден. Заменяем его
            posts[post.id - 1] = post
            return true
        }
        return false
    }

    fun clear() {
        posts = emptyArray();
    }
}

fun main(args: Array<String>) {
}