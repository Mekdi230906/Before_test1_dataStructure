/*
Build a music playlist that loops forever: after the last song, it goes back to
the first. Store the songs in a circular singly linked list, where the last
node's next points back to the first node.
*/

public class partThree {
    public static void main(String[] args) {
        Playlist one = new Playlist();

    }
    
}

class Playlist{

    private static class SongNode{
        String title;
        SongNode next;
        SongNode(String title) { 
            this.title = title;
        }
    }

    private SongNode last;
    private SongNode current;
    private int size = 0;

    public void addSong(String title){
        //
        SongNode newSong = new SongNode(title);
        if(last == null){
            last = newSong;
            current = newSong;
            newSong.next = newSong;
            size++;
        }
        else{
            newSong.next = last.next;
            last.next = newSong;
            last = newSong;
        }
        
    }

    public String playNext(){
        //
        current = current.next;
        return current.title + "Skipped!";
    }

    public String skip(int k){
        //
        for(int i = 0; i < k; i++){
            current = current.next;
        }
        return "Skipped " + k + " times!";
    }

    public void removeCurrent(){
        //
        SongNode temp = current;
        while(temp.next != current){
            temp = temp.next;
        }
        temp.next = current.next;
        current = current.next;
        size--;
        //how about the last
    }

    public String toString(){
        //
        String list = " ";
        Node start = current;


        return "hello";
    }
}


 class DNode{
    int data;
    DNode next;
    DNode prev;

    DNode(int val){
        data = val;
    }
}

