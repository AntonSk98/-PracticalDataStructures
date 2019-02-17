package ds.stack;

public class Stack<T> {
    private T t;
    private int maxSize;
    private int top;
    private T[] stackArray;
    public Stack(int maxSize){
        this.maxSize=maxSize;
        stackArray=(T[]) new Object[maxSize];
        top=-1;
    }
    public void push(T figure){
        if(isFull()){
            throw new ArrayIndexOutOfBoundsException("Is full!");
        }else{
            top++;
            stackArray[top]=figure;
        }


    }
    public T pop(){
        if(isEmpty())
            throw new ArrayIndexOutOfBoundsException("It is already empty!");
        else{
            int old_top = top;
            top--;
            return stackArray[old_top];}
    }
    public int size(){
        return maxSize;
    }
    public T peak(){
        return stackArray[top];
    }
    public boolean isEmpty(){
        return (top==-1);
    }
    public boolean isFull(){
        return (top==maxSize-1);
    }
    public static String reverseString(String str){
        String result="";
        Stack theStack = new Stack(str.length());
        String arr[] = str.split("");
        for (int i=0; i<theStack.size(); i++){
            theStack.push(arr[i]);
        }
       while(!theStack.isEmpty()){
           result = result+theStack.pop();
       }
       return result;
    }
}
