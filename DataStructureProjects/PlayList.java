package DataStructureProjects;
class SongNode {
    String title;
    SongNode next;
    SongNode prev;

    public SongNode(String title) {
        this.title = title;
        this.next = null;
        this.prev = null;
    }
}

public class PlayList {
    private SongNode head;
    private SongNode tail;
    private SongNode current;

    public void addSong(String title) {
        SongNode newNode = new SongNode(title);
        if (head == null) {
            head = tail = current = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        System.out.println("Added to playlist: " + title);
    }

    public void playNext() {
        if (current != null && current.next != null) {
            current = current.next;
            System.out.println("Playing now: " + current.title);
        } else {
            System.out.println("Reached the end of the playlist.");
        }
    }

    public void playPrev() {
        if (current != null && current.prev != null) {
            current = current.prev;
            System.out.println("Playing now: " + current.title);
        } else {
            System.out.println("At the start of the playlist.");
        }
    }

    public static void main(String[] args) {
        PlayList pm = new PlayList();
        pm.addSong("Song A");
        pm.addSong("Song B");
        pm.addSong("Song C");
        
        pm.playNext(); // Playing now: Song B
        pm.playNext(); // Playing now: Song C
        pm.playPrev(); // Playing now: Song B
    }
}