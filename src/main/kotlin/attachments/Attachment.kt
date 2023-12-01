package ru.netology.attachments

abstract class Attachment(content: Content) {
    abstract class Content(
        id: Int,
        ownerId: Int,
        date: Int
    ) {
        open val id = id
        open val ownerId = ownerId
        open var date = date
    }

    var type: String = ""
    open val content = content
}
