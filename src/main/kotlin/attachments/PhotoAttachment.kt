package ru.netology.attachments

data class Photo(
    override val id: Int,
    override val ownerId: Int,
    override var date: Int,
    var albumId: Integer? = null,
    val text: String? = null,
    val width: Int? = null,
    val height: Int? = null,
) : Attachment.Content(id, ownerId, date)

data class PhotoAttachment(
    override val content: Photo
) : Attachment(content) {
    init {
        type = "photo"
    }

    fun getPhoto() : Photo = content
}