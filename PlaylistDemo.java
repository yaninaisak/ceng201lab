public class PlaylistDemo {
    public static void main (String[] args){
        System.out.println("=== Playlist Track Demo ===\n");
        // --- Default constructor ---
        Track t1 = new Track();
        System.out.println("Default Track: ");
        System.out.println(t1);
        // --- Title-only constructor ---
        Track t2 = new Track("Neon Lights");
        System.out.println("\nTitle-only track:");
        System.out.println(t2);
        // --- Title + artist constructor ---
        Track t3 = new Track("Ocean Drive", "Midnight Pulse");
        System.out.println("\nTitle + Artist Track:");
        System.out.println(t3);
        // --- Full constructor ---
        Track t4 = new Track("Raindrop Waltz", "Clara Voss", 210, false);
        System.out.println("\nFull Track (non-explicit):");
        System.out.println(t4);
        // --- Getter test ---
        System.out.println("\nGetter Test:");
        Track t5 = new Track("Stardust", "Stellar Echo", 242, true);
        System.out.println("Title:     " + t5.getTitle());
        System.out.println("Artist:    " + t5.getArtist());
        System.out.println("Duration:  " + t5.getDurationFormatted());
        System.out.println("Explicit:  " + t5.getIsExplicit());
        // --- Invalid duration test ---
        System.out.println("\nInvalid Duration Test:");
        Track t6 = new Track("Broken Clock", "Static Noise", -20, false);
        System.out.println(t6);
    }
}
