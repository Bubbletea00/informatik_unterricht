public class MyList<T> {


    //generische Item klasse für die einzelnen Elemente
    private static class Item<T>{
        T data;
        Item<T> nextItem;

        Item(T data){
            this.data = data;
            this.nextItem = null;
        }

        public Item<T> getNexItem(){
            return nextItem;
        }

        public void setNextItem(Item<T> nextItem) {
            this.nextItem = nextItem;
        }

        @SuppressWarnings("unused")
        public T getData(){
            return data;
        }

    }

    //Erstes Element, head
    private Item<T> head;
    int size = 0;

    public void add(T value) {
        if (head == null) {
            head = new Item<>(value);
        }else {

            Item<T> temp = new Item<>(value);
            Item<T> current = head;

            while (current.getNexItem() != null) {
                current = current.getNexItem();
            }
            current.setNextItem(temp);
        }
        size++;

    }

    public T get(int index) {
        if(index >= size) throw new IndexOutOfBoundsException("Invalid Index");

        Item<T> current = head;

        for (int i = 0; i < index; i++) {
            current = current.getNexItem();
        }
        return current.data;
    }

    public T getFirst(){
        return head.data;
    }

    public T getLast(){
        Item<T> current = head;

        for (int i = 0; i < size-1; i++) {
            current = current.nextItem;
        }

        return current.data;
    }

    public void remove(int index){
        if(index >= size) throw new IndexOutOfBoundsException("Invalid Index");

        //todo throw more exceptions
        Item<T> current = head;

        if(index==0){
            head = current.getNexItem();
        } else {

            for (int i = 0; i < index-1; i++) {
                current = current.getNexItem();
            }
            current.setNextItem(current.getNexItem().getNexItem());

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
            sb.append(current.data);
            if (current.nextItem !=null) sb.append(", ");
            current = current.nextItem;
        }
        sb.append("]");

        return sb.toString();
    }
}
