public class MusicPlaylist {
    //define veriable
    private SongNode head;
    private SongNode tail;
    private SongNode current;
    //creating constructor
    public MusicPlaylist(){
        this.head = null;
        this.tail = null;
        this.current = null;
    }
    //adding song to the end of playlist
    public void addSong(String title) {
        //create new song node
        SongNode newNode = new SongNode(title);
        //if playlist empty
        if (head == null){
            head = newNode;
            tail = newNode;
            current = newNode;
            return;
        }
        //connecting new node after the tail
        newNode.prev = tail;
        tail.next = newNode;
        //update tail
        tail = newNode;
    }
    //removing song from the playlist
    public void removeSong(String title){
        SongNode temp = head;
        //searching for the song
        while(temp != null && !temp.title.equals(title)){
            temp = temp.next;
        }
        //if song not exist
        if(temp == null){
            System.out.println("the song isnt in the playlist");
            return;
        }
        // updating current if its removed
        if(current == temp){
            if (temp.next != null ){
                current = temp.next;
            } else {
                current = temp.prev;
            }
        }
        //if song is a head
        if(temp == head){
            head = head.next;
        } else {
            temp.prev.next = temp.next;
        }
        // if song is a tail
        if( temp == tail){
            tail = tail.prev;
        } else {
            temp.next.prev = temp.prev;
        }
        //if playlist is empty
        if(head == null){
            tail = null;
            current = null;
        }
        //displaying removed song
        System.out.println("Removed: " + title);
    }
    //remove middle song from the playlist
    public void removeMiddleSong(){
        //cheking if playlist is empty
        if(head == null){
            System.out.println("Playlist is empty.");
            return;
        }
        //couting number of songs
        int count = 0;
        SongNode temp = head;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        //find middle song
        int middle = count / 2;
        temp = head;
        for (int i = 0; i < middle; i++){
            temp = temp.next;
        }
        //removing middle song
        String removedSong = temp.title;
        removeSong(removedSong);
        System.out.println("Middle song removed: " + removedSong);
    }
    //move to the next song
    public void nextSong(){
        //cheking if there are next song
        if(current != null && current.next != null){
            current = current.next;
            System.out.println("Playing: " + current.title);
        } else {
            System.out.println("Already at the last song of the playlist.");
        }
    }
    //move to the previous song
    public void previousSong(){
        // cheking if there are previous song
        if(current != null && current.prev != null){
            current = current.prev;
            System.out.println("Playing: " + current.title);
        } else {
            System.out.println("Already at the first song of the playlist.");
        }
    }
    //display current song
    public void displayCurrentSong(){
        //cheking if there any song
        if(current == null){
            System.out.println("No song is currently playing.");
            return;
        }
        //displaying current song
        System.out.println("Current song: " + current.title);
    }
    //display all song in playlist
    public void displayPlaylist(){
        //start from the head
        SongNode temp = head;
        //visiting each song
        while(temp != null){
            System.out.print(temp.title + " <-> ");
            temp = temp.next;
        }
        //displaying end of the playlist
        System.out.print("END");
    }
}
