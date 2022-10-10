/*Aim:-Create a class named Stack. Design a class named Queue for storing integers. Like a 
stack, a queue holds elements. In a stack, the elements are retrieved in a last-in firstout fashion. In a queue, the elements are retrieved in a first-in first-out fashion. The 
class contains: 
• An int[] data field named elements that stores the int values in the queue. 
• A data field named size that stores the number of elements in the queue. 
• A constructor that creates a Queue object with default capacity 8.
• The method enqueue(int v) that adds v into the queue.
• The method dequeue() that removes and returns the element from the queue.
• The method empty() that returns true if the queue is empty. 
• The method getSize() that returns the size of the queue. */
import java.util.*;

class stack
{
    static int j = 0;
    int size;
    int s;
    int a[] = null;

    stack()
    {
        size=8;
        s = size;
        a = new int[size];
    }
    stack(int size)
    {
        this.size = size;
        s = size;
        a = new int[size];
    }

    public void enqueue(int v)
    {
        a[--size] = v;
        // System.out.println(a[j-1]);
    }
    public void print()
    {
        System.out.println(Arrays.toString(a));
        // if(a!=null)
        // {
            // a = null;
            
        // }
    }
    public void dequeue()
    {
        a = null;
        // a = new int[8];
    }
    public boolean empty()
    {
        if(a==null)
        return true;
        else
        return false;
    }
    public int getSize()
    {
        return s;
    }
    //last in first out
}

class queue
{
    static int j = 0;
    //first in first out
    int size;
    int a[] = null;
    queue()
    {
        size=8;
        a = new int[size];
    }
    queue(int size)
    {
        this.size = size;
        a = new int[size];
    }

    public void enqueue(int v)
    {
        a[j++] = v;
        // System.out.println(a[j-1]);
    }

    public void dequeue()
    {
        a = null;
        // a = new int[8];
    }
    public boolean empty()
    {
        if(a==null)
        return true;
        else
        return false;
    }
    public int getSize()
    {
        return size;
    }
    public void print()
    {
        System.out.println(Arrays.toString(a));
        
    }
}
public class stack_que {
    public static void main(String[] args) {
        
        queue q = new queue();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.print();
        System.out.println("Size of the queue is :  "+q.getSize());
        q.dequeue();
       System.out.println(q.empty());
       q = new queue();
       System.out.println(q.empty());

        stack s = new stack();
        s.enqueue(1);
        s.enqueue(2);
        s.enqueue(3);
        s.print();
        System.out.println("Size of the stack is :  "+s.getSize());
        s.dequeue();
       System.out.println(s.empty());
       s = new stack();
       System.out.println(s.empty());
    }
}
