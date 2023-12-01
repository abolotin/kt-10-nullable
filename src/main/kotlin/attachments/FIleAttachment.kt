package ru.netology.attachments

data class File(
    override val id: Int,
    override val ownerId: Int,
    override var date: Int,
    var title: String? = null,
    var size: Int? = null,
    var ext: String? = null,
    var url: String? = null,
    var type : Int? = null,
) : Attachment.Content(id, ownerId, date)

data class FileAttachment(
    override val content: File
) : Attachment("file", content) {
    fun getFile() : File = content
}