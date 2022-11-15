package chapter_4

//первичным конструктором (title, artist)
@Suppress("MemberVisibilityCanBePrivate")
class Song(val title: String, val artist: String) {
    fun play() {
        println("Playing the song $title by $artist")
    }

    fun stop() {
        println("Stopped playing $title")
    }

}

// also valid and equivalent code
/*class Song(title: String, artist: String) {
    val title = title
    val artist = artist
}*/

fun main() {
    val songOne = Song("The Mesopotamians", "They Might Be Giants")
    val songTwo = Song("Going Underground", "The Jam")
    val songThree = Song("Make Me Smile", "Steve Harley")
    songTwo.play()
    songTwo.stop()
    songThree.play()
    songThree.stop()
    songOne.play()
}
