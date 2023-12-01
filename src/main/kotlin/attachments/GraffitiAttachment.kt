package ru.netology.attachments

data class Graffiti(
    override val id : Int,
    override val ownerId: Int,
    override var date: Int,
    var url: String? = null,
    var width: Int = 0,
    var height: Int = 0

) : Attachment.Content(id, ownerId, date)

data class GraffitiAttachment(
    override val content: Graffiti
) : Attachment("graffiti", content) {
    fun getGraffiti() : Graffiti = content
}