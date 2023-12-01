package ru.netology.attachments

abstract class Attachment(val type : String, open val content: Content) {
    abstract class Content(
        open val id: Int,
        open val ownerId: Int,
        open var date: Int
    )
}
