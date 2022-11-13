class Node<t>{
    t data;
    Node<t> next;

    public Node(t data){
        this.data = data;
        next = null;
    }
}

class stackEmptyException extends Exception{

}
class stack<t>{
    private Node<t> head;
    private int size;

    public int size(){
        return size;
    }

    public  boolean isEmpty(){
        return (size() == 0); //head = null
    }

    public t top() throws stackEmptyException{
        if(size() == 0){
            stackEmptyException e = new stackEmptyException();
            throw e;
        }
        return head.data;
    }


    public void push(t elem){
        Node<t> newNode = new Node<t>(elem);
        newNode.next = head;
        head = newNode;
        size++;            
        }

    public t pop() throws stackEmptyException{
        if(size() == 0){
            stackEmptyException e = new stackEmptyException();
            throw e;
        }
        t data = head.data;
        head = head.next;
        return data;
    }    
    }  


public class stackImplementUsingLinkedList {
    public static void main(String args[]) throws stackEmptyException{
        stack<Integer> s = new stack<Integer>();
        for(int i = 1;i <= 10;i++){
            s.push(i);
            System.out.println(s.top());
        }
    
        while(!s.isEmpty()){
            try{
                System.out.println(s.pop());
            }catch(stackEmptyException e){
    
            }
    }
}
}
