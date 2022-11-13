 class stackEmptyException extends Exception{

}
class stackFullException extends Exception{

}
class stack{
   private int data[];
   private int top;

    public stack(){             // Bydefault taking size
        data = new int[10];
        top = -1;
    }
    public stack(int capicity){       //User taking size
        data = new int[capicity];
        top = -1;
    }

    public int top() throws stackEmptyException{       // find the element on top in static
        if(top == -1){
            stackEmptyException e = new stackEmptyException();
            throw e;
        }
        return data[top];
    }

    public int stacklength(){
        return data.length;
    }
  
    public boolean isEmpty(){     //find that stack is empty or not
        if(top == -1){
            return true;
        }else{
            return false;
        }
    }

    public int size(){            //find size of stack
        return top+1;
    }

    public void push(int elem) throws stackFullException{         //insert the elements in stack
        if(size() == data.length){
            stackFullException e = new stackFullException();
            throw e;
            // int temp[] = data;                       // to increase array dyamicly according to user
            // data = new int[temp.length*2];
            // for(int i = 0 ;i < temp.length;i++){
            //     data[i] = temp[i];
            // }
        }
        top++;
        data[top] = elem;
    }

    public int pop() throws stackEmptyException{                 //delete the elements in stack
        if(size() == 0){
            stackEmptyException e = new stackEmptyException();
            throw e;
        }
        int element = data[top];
        top--;
        return element;
    }
}

public class stackImplementUsingArray{
    public static void main(String args[]) throws stackFullException, stackEmptyException{
        stack s = new stack();
    for(int i = 1;i <= 100;i++){
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