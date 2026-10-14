import java.util.ArrayList;
import java.util.List;
class part_one{
    public static void main(String[] args) {

        ArrayList<String> one = new ArrayList<>();
        one.add("a");
        one.add("a");
        one.add("a");
        one.add("a");
        one.add("b");
        one.add("b");
        one.add("c");
        one.add("c");
        one.add("a");

        ArrayList<String> a = new ArrayList<>(List.of("a"));
        ArrayList<String> b = new ArrayList<>(List.of("b"));
        ArrayList<String> c = new ArrayList<>(List.of("c"));


        ArrayList<String> original = new ArrayList<>();
        for(int i = 0; i < one.size(); i++){
            if(original.contains(one.get(i))){
                if(a.contains(one.get(i))){
                    a.add(one.get(i));
                }
                else if(b.contains(one.get(i))){
                    b.add(one.get(i));
                }
                else if(c.contains(one.get(i))){
                    c.add(one.get(i));
                }
            }
            else{
                original.add(one.get(i));
            }
        }
        //System.out.println(original);
        //System.out.println(one );
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println("a: " + a.size() + ",b: " + b.size() + ",c: " + c.size());
    }

    public class Node{
        int data;
        Node next;

        Node(int value){
            data = value;
            next = null;
        }
    }

    public class DNode{
        int data;
        Node next;
        Node prev;

        DNode(int value){
            data = value;
        }
    }
}