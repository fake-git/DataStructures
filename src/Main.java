import LinkedList.LinkedList;
import LinkedList.IndexOutOfLinkedListException;
import LinkedList.Node;


public class Main {



    private static void print(LinkedList linkedList){

        Node current = linkedList.head;

        while (current != null){
            System.out.println(current.getData());
            current = current.next;
        }
    }



    public static void main(String[] args) throws IndexOutOfLinkedListException {

//        List myList = new List();
//
//        myList.Add("ola1");
//        myList.Add("ola2");
//        myList.Add("ola3");
//        myList.Add("ola4");
//        myList.Add("ola5");
//        myList.Add("ola6");
//        myList.Add("ola7");
//        myList.Add("ola8");
//        myList.Add("ola9");
//        myList.Add("ola10");
//        myList.Add("ola11");
//        myList.Add("ola12");
//
//        System.out.println(myList);
//
//        for (Object i :myList.data) {
//            System.out.println(i);
//        }

        /// ----------------------------------------------------------------- ///


        LinkedList numbers = new LinkedList();
        for(int i=0; i<10; i++)
            numbers.add(i*10);

        print(numbers);
        System.out.println();
        numbers.getNodeByIndex(20);
        numbers.remove(90);
        numbers.remove(0);
        numbers.remove(50);
        System.out.println();
        print(numbers);

    }


}
