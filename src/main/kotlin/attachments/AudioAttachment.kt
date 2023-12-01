package ru.netology.attachments

data class Audio(
    override val id: Int,
    override val ownerId: Int,
    override var date: Int,
    var artist: String? = null,
    val title: String? = null,
    val duration: Int? = null,
    val url: String? = null,
    val lyricsId: Int? = null,
    val albumId: Int? = null,
    val genreId: Int? = null,
    val noSearch: Boolean = true,
    val isHq: Boolean = false
) : Attachment.Content (id, ownerId, date)

data class AudioAttachment(
    override val content: Audio
) : Attachment("audio", content) {
    fun getAudio() : Audio = content
}