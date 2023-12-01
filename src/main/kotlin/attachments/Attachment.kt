package ru.netology.attachments

abstract class Attachment(val type : String, content: Content) {
    abstract class Content(
        id: Int,
        ownerId: Int,
        date: Int
    ) {
        open val id = id
        open val ownerId = ownerId
        open var date = date
    }

    open val content = content
}
