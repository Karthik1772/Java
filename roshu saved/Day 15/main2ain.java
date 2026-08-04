class Queue{
    static int queue[]=new int[5];
    static int n=5,front=-1,rear=-1;
   
    static void enqueue(int data){
        if(rear==n-1){
            System.out.println("Queue is full, can't add data");
            return;
        }
        if(isempty())
            front=0;
        rear++;
        queue[rear]=data;
        System.out.println(queue[rear]+" is added");
    }
    static void dequeue(){
        if(isempty()){
            System.out.println("Queue is empty");
            return;
        }
        System.out.println(queue[front]+" is removed");
        if(front==rear){
            front=-1;
            rear=-1;
            System.out.println("Reset");
        }
        else
            front++;
    }
    static boolean isfull(){
        return rear==n-1;
    }
    static boolean isempty(){
        return front==-1;
    }
   
    static void front(){
        if(isempty()){
            System.out.println("front doesn't exist");
            return;
        }
        System.out.println(queue[front]+" is at front");
    }
   
    static void disp(){
        if(isempty()){
            System.out.println("Queue is empty to disp");
            return;
        }
        for(int i=front;i<rear+1;i++){
            System.out.println(queue[i]+" is at position "+i);
        }
    }
}
public class main2ain{
    public static void main(String[] args) {
        Queue q=new Queue();
        q.enqueue(50);
        q.enqueue(20);
        q.front();
        q.dequeue();
        q.enqueue(10);
        q.enqueue(30);
        q.enqueue(50);
        q.disp();
    }
}