// rotate the array to right

import java.util.ArrayList;
public class partOne_Two {
    public static void main(String[] args) {
        ArrayList<Character> one = new ArrayList<>();
        one.add('a');
        one.add('b');
        one.add('c');
        one.add('d');
        one.add('e');

        System.out.println(one);

       /* 
        char temp = one.get(one.size() - 1);
        one.remove(one.get(one.size() - 1));
        one.add(0, temp);*/

        //rotateRight(1, one);

        //System.out.println(one);

        rotateLeft(1, one);

        System.out.println(one);
    }

    public static void rotateRight(int k, ArrayList<Character> o){
        for(int i = 0; i < k; i++){
            //o.add(0, o.get(o.size()-1));
            char temp = o.get(o.size() - 1);
            o.remove(o.get(o.size() - 1));
            o.add(0, temp);
        }
    }

    public static void rotateLeft(int k, ArrayList<Character> o){
        for(int i = 0; i < k; i++){
            char temp = o.get(0);
            o.add(temp);
            o.remove(0);
        }
    }
}

/* 


class ListTools{
    public static Node build(int...value ){
        Node dummy = new Node(0);
        Node tail = dummy;
        for(int v : value){
            tail= tail.next;
        }
        return dummy.next;
        }

        public static void print(Node head){
            StringBuilder sb = new StringBuilder();
            for(Node c = head; c != null ; c = c.next){
                sb.append(c.data).append("->");
            }
            System.out.println(sb.append("NULL"));
        }

        public static Node nodeAt(Node head, int index){
            Node c = head;
            for(int i = 0; i < index; i++) c = c.next;
            return c; 
        }

        public static void printBothWays(DNode head){
            Node c = head, last = null;
            StringBuilder sb = new StringBuilder("forward: ");
            while(c!= null){
                sb.append(c.data).append(" ");
                last = c; 
                c = c.next;
            }
            sb.append("\nbackward: ");
            while(last != null){
                sb.append(last.data).append(" ");
                last = last.prev;
            }
            System.out.println(sb);
        }

    }
        */