public class MusicPlaylistDemo {
    public static void main(String[] args){
        //creating a playlist
        MusicPlaylist playlist = new MusicPlaylist();
        //adding song to playlist
        playlist.addSong("Brent Faiyaz - Paper Soldier");
        playlist.addSong("Sonder - What You Heard");
        playlist.addSong("Brent Faiyaz - Trust");
        playlist.addSong("Brent Faiyaz - Dead Man Walking");
        playlist.addSong("Brent Faiyaz - No One Knows");
        //displaying playlist
        System.out.println("===  YANNY'S PLAYLIST ===");
        playlist.displayPlaylist();
        //displaying current song
        System.out.println("\n=== CURRENT SONG PLAYING ===");
        playlist.displayCurrentSong();
        //moving to the next
        System.out.println("\n=== NEXT SONG TO PLAY ===");
        playlist.nextSong();
        //moving to the next again
        System.out.println("\n=== NEXT SONG TO PLAY ===");
        playlist.nextSong();
        //moving to the previous
        System.out.println("\n=== PREVIOUS SONG TO PLAY ===");
        playlist.previousSong();
        //removing Paper Soldier
        System.out.println("\n=== AFTER REMOVING Paper Soldier SONG ===");
        playlist.removeSong("Brent Faiyaz - Paper Soldier");
        playlist.displayPlaylist();
        //removing Trust
        System.out.println("\n=== AFTER REMOVING Trust SONG ===");
        playlist.removeSong("Brent Faiyaz - Trust");
        playlist.displayPlaylist();
        //removing middle song
        System.out.println("\n=== AFTER REMOVING MIDDLE SONG ===");
        playlist.removeMiddleSong();
        playlist.displayPlaylist();
    }
}
