import java.util.ArrayList;
public class partOne_Three {
    public static void main(String[] args) {
        int[] list = new int[3000];
        int[] one = { 5, 1, 2, 3, 4, 6, 3, 7, 8, 9, 10, 11, 12, 13, 17 };
        for(int i = 0; i < list.length; i++){
            list[i] = (int)(Math.random() * 20 + 1);
        }
    
        for(int i = 0; i < list.length; i++){
            //System.out.println(list[i]);
        }

        ArrayList<Integer> test = new ArrayList<>();
        test.add(30); test.add(90);
        //ArrayList<Integer> test1 = new ArrayList<>();
        //test1.add(89); test1.add(23);
        //test = test1;
        //test.remove(1);
        test.clear();


        //System.out.println(test);
        System.out.println(longestClimb(one));
    }

    public static ArrayList<Integer> longestClimb(int[] o){
        ArrayList<Integer> result = new ArrayList<>();
        ArrayList<Integer> second = new ArrayList<>();
        int count = o.length;

        //--------------------------------------------------------- version 1 == O(n)

        /* 
        for(int i = 0; i < count; i++){
            int temp = o[i] + 1;
            if(i == o.length - 1){
                int tempo = o[i-1] +1;
                if(o[i] == tempo){
                  result.add(o[i]);  
                }
                break;
            }
            else if(o[i+1] == temp){
                result.add(o[i]);
                }
            else if( i >= 1){
                int tempo = o[i-1] + 1;
                if(o[i] == tempo){
                    result.add(o[i]);
                }
            }
        }
        */
        

//----------------------------------------------------------------- version 2 == O(n^2) I have nested loop
///* 
        for(int i = 0; i < count; i++ ){
            int temp = o[i] + 1;

            if(second.size() != 0 && result.size() != 0){
                if(second.size() > result.size()){ // get hit by loop
                    //result.clear();
                    result = second;
                    second.clear();
                }
                else if (result.size() > second.size()){
                    //second.clear();
                }
            }

            else if(i == o.length - 1){
                int tempo = o[i-1] +1;
                if(o[i] == tempo){
                  result.add(o[i]);  
                }
                
                break;
            }

            else if(result.size() != 0 && o[i+1] == temp){ // if there like two or more consecutive numbers in the list, we can make like two array then compare it which one is the longest
                for(int k = i; k < o.length - 1; k++){
                    int temporary = o[k] + 1;
                    if(o[k+1] == temporary){
                        second.add(o[k]);
                    }
                    else{
                        second.add(o[k]);
                        i = k;
                        break;
                    }
                }
                
            }

            

            else if(o[i+1] == temp){
                for(int k = i; k < o.length - i; k++){
                    int temporary = o[k] + 1;
                    if(o[k+1] == temporary){
                        result.add(o[k]);
                    }
                    else{
                        result.add(o[k]);
                        i = k;
                        break;
                    }
                }
            }
            

        }
        //*/

        //-------------------------------------------------------
        
        return result;
    }
    
}

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