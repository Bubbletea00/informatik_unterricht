public class MyList<T> {


    //generische Item Klasse für die einzelnen Elemente
    private static class Item<T>{
        T data;
        Item<T> nextItem;

        Item(T data){
            this.data = data;
            this.nextItem = null;
        }

        public Item<T> getNextItem(){
            return nextItem;
        }

        public void setNextItem(Item<T> nextItem) {
            this.nextItem = nextItem;
        }

        public T getData(){
            return data;
        }

        public int getRestLength(){
            if (nextItem==null){
                return 1;
            } else{
                return nextItem.getRestLength() + 1;
            }
        }

    }

    //Erstes Element, head
    private Item<T> head;
    int size = 0;

    public int countAllItems(){
//        int i = 0;
//
//        Item<T> head2 = head;
//
//        while(head2 != null) {
//            head2 = head2.getNextItem();
//            i++;
//        }
//
//        return i;

        return head.getRestLength();
    }

    public void add(T value) {
        if (head == null) {
            head = new Item<>(value);
        }else {

            Item<T> temp = new Item<>(value);
            Item<T> current = head;

            while (current.getNextItem() != null) {
                current = current.getNextItem();
            }
            current.setNextItem(temp);
        }
        size++;

    }

    public void add(T value, int index){
//        if(index  > size) throw new IndexOutOfBoundsException("Invalid Index"); //todo index length
        Item<T> temp = new Item<>(value);
        Item<T> current = head;


        if (current.getNextItem() != null){
            for (int i = 0; i <index-1; i++) {
                current = current.getNextItem();

            }
            temp.setNextItem(current.getNextItem());
            current.setNextItem(temp);
        }
    }

    public T get(int index) {
        if(index >= size) throw new IndexOutOfBoundsException("Invalid Index"); //todo index length

        Item<T> current = head;

        for (int i = 0; i < index; i++) {
            current = current.getNextItem();
        }
        return current.getData();
    }

    public T getFirst(){
        return head.getData();
    }

    public T getLast(){
        Item<T> current = head;

        for (int i = 0; i < size-1; i++) {
            current = current.getNextItem();
        }

        return current.getData();
    }

    public void remove(int index){
        if(index >= size) throw new IndexOutOfBoundsException("Invalid Index");

        //todo throw more exceptions
        Item<T> current = head;

        if(index==0){
            head = current.getNextItem();
        } else {

            for (int i = 0; i < index-1; i++) {
                current = current.getNextItem();
            }
            current.setNextItem(current.getNextItem().getNextItem());

        }
        size--;
    }

    public void removeFirst(){
        this.remove(0);
    }

    public void removeLast(){
        this.remove(size-1);
    }

    public int getSize(){
        return size;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        Item<T> current = head;
        while (current!=null){
            sb.append(current.getData().toString());
            if (current.getNextItem() !=null) sb.append(", ");
            current = current.getNextItem();
        }
        sb.append("]");

        return sb.toString();
    }
}
