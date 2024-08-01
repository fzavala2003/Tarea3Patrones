public class CircleDoubleLinkedListAdapter implements List {
    private CircleDoubleLinkedList circleDoubleLinkedList;

    public CircleDoubleLinkedListAdapter() {
        this.circleDoubleLinkedList = new CircleDoubleLinkedList();
    }

    @Override
    public void add(Object obj) {
        circleDoubleLinkedList.insertAtEnd(obj);
    }

    @Override
    public void remove(Object obj) {
        circleDoubleLinkedList.delete(obj);
    }

    @Override
    public Object get(int index) {
        return circleDoubleLinkedList.get(index);
    }

    @Override
    public int size() {
        return circleDoubleLinkedList.getSize();
    }
}
