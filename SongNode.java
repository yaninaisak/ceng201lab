public class SongNode {
    //define veriable
    String title;
    SongNode prev;
    SongNode next;
    //creating constructor
    public SongNode(String title){
        this.title = title;
        this.prev = null;
        this.next = null;
    }
}
