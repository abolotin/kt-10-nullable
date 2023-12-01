package ru.netology.attachments

data class Video(
    override val id: Int,
    override val ownerId: Int,
    override var date: Int,

    var artist: String? = null,
    var title: String? = null,
    var description: String? = null,
    var duration: Int? = null,
    var views: Int
) : Attachment.Content(id, ownerId, date)


data class VideoAttachment(
    override val content: Video
) : Attachment("video", content) {
    fun getVideo() : Video = content
}