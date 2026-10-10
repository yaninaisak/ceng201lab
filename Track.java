public class Track {
    // storing track information
    private String title;
    private String artist;
    private int durationSeconds;
    private boolean isExplicit;
    // constructor for track object
    public Track(String title, String artist, int durationSeconds){
        this.title = title;
        this.artist = artist;
        if (durationSeconds < 0 ) {
            System.out.println("Invalid duration, setting to 0");
            this.durationSeconds = 0;
        } else {
            this.durationSeconds = durationSeconds;
        }
        this.isExplicit = isExplicit;
    }
    public Track(String title, String artist) {
        this(title, artist, 0, false);

    }
   // title-only constructor.
    public Track(String title) {
        this(title, "Unknown Artist", 0, false);
    }
    // default constructor.
    public Track() {
        this("Unkown Title", "Unkown Artist", 0, false);
    }
    // getter for title
    public String getTitle() {
        return title;
    }
    // getter for artist
    public String getArtist() {
        return artist;
    }
    // getter for duration
    public int getDurationSeconds() {
        return durationSeconds;
    }
    public boolean isExplicit() {
        return isExplicit;
    }
    // converting seconds into minute:second format
    public String getDurationFormatted() {
        // Your code here
        int minutes = durationSeconds / 60;
        int seconds = durationSeconds % 60;
        return String.format("%d:%02d", minutes, seconds);
    }
    @Override
    public String toString() {
        // Your code here
        String result = "\"" + title + "\" by " + artist +" [" + getDurationFormatted() + "]";
        if (isExplicit) {
            result += "[Explicit]";
        }
        return result;
    }
    // displaying track information
    public void displayInfo() {
        System.out.println("\"" + title + "\" by " + artist + "  [" + getFormattedDuration() + "]");
    }
}
