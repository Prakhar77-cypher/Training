public class CQD{
    int SIZE;
    int front,rear;
    int items[];
     CQD(int size)
    {
        front=-1;
        rear=-1;
        this.SIZE=size;
        this.items=new int[size];
    }
    boolean isFull() //To check is queue is full
    {
        if(front==0 && rear== SIZE-1)
        {
            return true; 
        }
        else if(front==rear+1)
        {
            return true;
        }
        return false;
        
    }
    boolean isEmpty() //To check is queu is Empty
    {
        if(front==-1)
        return true;
        else
        return false;
        
    }    
       //Adding value
    void enQ(int element){
        if(isFull())
        {
            System.out.println("Queue is full");
            
        }
        else{
            if(front==-1)
             front=0;
             rear=(rear+1)%SIZE;
             items[rear]=element;
             System.out.println("Inserted"+element);
        }
    }
    //Removing element

int DQ()
{
    int element;
    if(isEmpty()){
        System.out.println("Queue is Empty");
        return(-1);
        
    }else{
        element=items[front];
        if(front==rear){
            front=-1;
            rear=-1;
        }
        else
        {
            front=(front+1)%SIZE;
        }
        return (element);
    }
}
void display()
{
    int i;
    if(isEmpty()){
    System.out.println("empty quesu");
}else{
    System.out.println("Items ->");
    for( i=front;i!=rear;i=(i+1)%SIZE)
    {
        System.out.print(items[i]+" ");
        
    }
    System.out.println(items[i]);
}
}
public static void main(String[] args)
{
    CQD x=new CQD(8);
    for(int i=0;i<8;i++)
    {
        x.enQ(i);
    }
    x.display();
    int elem=x.DQ();
    if(elem!=-1)
    {
        System.out.println("deleted element is" +elem);
        
    }
    x.display();
    
}

        }
    