public class Main
{
    public static void main(String[] args)
    {
        sample a = new sample(1,2);
        sample b = new sample(3,4);
        sample c = new sample(5,6);
        sample d = new sample(7,8);
        
        singleLinkedList list = new singleLinkedList();
        
        list.addToFront(a);
        list.addToFront(b);
        list.addToFront(c);
        list.addToFront(d);

        list.removeFromFront();
        list.printList();
        System.out.println(list.getSize());
        System.out.println("Is list empty "+list.isEmpty());
    }
}