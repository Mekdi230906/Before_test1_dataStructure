public class part_two {
    public static void main(String[] args) {
        Node one = new Node(1);
        one.next = new Node(4);
        one.next.next = new Node(7);

        Node second = new Node(2);
        second.next = new Node(3);
        second.next.next = new Node (8);
        second.next.next.next = new Node(9);

        ListTools result = new ListTools();
        
        
        while(second != null && one != null){ //using < to compare the heads and input it into new list //we also need to consider both terms to be in the condition
        // otherwise if you terms done but not in the condition, then it is possible for compiler to throw an error
            if(one.data < second.data){
                result.add(one.data);
                one = one.next;
            }
            else{
                result.add(second.data);
                second = second.next;
            }
        }

        while(second != null){ // I put this because i know that second list is bigger than one list
            result.add(second.data);
            second = second.next;
        }
        
        result.printing();
        }
    }

    //----------------------------------------------------


     class Node{
        int data;
        Node next;

        Node(int value){
            data = value;
            next = null;
        }
    }

    class ListTools{
        Node head = null;
        Node tail = null;

        public void add(int value){
            Node adding = new Node(value);

            if(head == null ){
                head = adding;
                tail = adding;
            }
            else{
                tail.next = adding;
                tail = adding;
            }
        }

        public void printing(){
            Node temp = head;
            while(temp != null){
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }


