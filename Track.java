public class Track {
    //storing track data
    private String title;
    private String artist;
    private int durationSeconds;
    private boolean isExplicit;
    //creating constructor for track
    public Track(String title, String artist, int durationSeconds, boolean isExplicit){
        this.title = title;
        this.artist = artist;
        if (durationSeconds < 0) {
            System.out.println("Invalid duration setting to 0");
            this.durationSeconds = 0;
        } else {
            this.durationSeconds = durationSeconds;
        }
        this.isExplicit = isExplicit;
    }
    // creating title + artist constructor
    public Track (String title, String artist){
        this(title, artist, 0, false);
    }
    //creating title only constructor
    public Track(String title){
        this(title, "Unknown artist", 0, false);
    }
    //creating default constructor
    public Track(){
        this("Unknown title", "Unknown artist", 0 ,false);
    }
    // getter for title
    public String getTitle() {return title;}
    // getter fot artist
    public String getArtist() {return artist;}
    // getter for duration
    public int getDurationSeconds() {return durationSeconds;}
    // getter for explisit
    public boolean getIsExplicit() {return isExplicit;}
    // converting duration from second to minute
    public String getDurationFormatted() {
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
}