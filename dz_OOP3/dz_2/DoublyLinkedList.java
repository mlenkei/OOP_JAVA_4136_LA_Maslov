package dz_OOP3.dz_2;

import java.util.Iterator;

public class DoublyLinkedList implements Iterable{

    private Member head;
    private Member tail;
    private int count = 0;

    @Override
    public Iterator iterator() {
        return new Iterator<Object>() {
            Member element0 = new Member("0");
            {
                element0.setNext(head);
            }
            Member currentElement = element0;

            @Override
            public boolean hasNext() {
                return currentElement.getNext() != null;
            }

            @Override
            public Object next() {
                currentElement = currentElement.getNext();
                return currentElement.getCat();
            }
        };
    }

    public int size() {
        return count;
    }

    private Member getElement(int index){
        if (index >= count){
            throw new IndexOutOfBoundsException();
        }

        Member result = head;
        for (int i = 1; i <= index; i++){
            result = result.getNext();
        }
        return result;
    }

    public Object get(int index){

        Member element = getElement(index);

        return element.getCat();
    }

    public void remove(int index){

        Member currentElement = getElement(index);
        Member nextElement = currentElement.getNext();
        Member previousElement = currentElement.getPrevious();

        if (index == 0){
            head = nextElement;
            if (tail == currentElement){
                tail = null;
            }
        }

        if (index == count - 1){
            tail = previousElement;
            if (head == currentElement){
                head = null;
            }
        }

        count--;

        if (nextElement != null){
            nextElement.setPrevious(previousElement);
        }

        if (previousElement != null){
            previousElement.setNext(nextElement);
        }

    }

    public void add(int index, Object Cat){
        if (count == index){
            add(Cat);
            return;
        }
        count++;

        Member currentElement = new Member(Cat);

        if (index == 0){
            head = currentElement;
        }

        Member nextElement = getElement(index);
        Member previousElement = nextElement.getPrevious();

        currentElement.setNext(nextElement);
        currentElement.setPrevious(previousElement);

        if (previousElement != null) {
            previousElement.setNext(currentElement);
        }

    }

    public void add(Object Cat){
        count++;
        Member member = new Member(Cat);
        if (head == null){
            head = member;
            tail = member;
            return;
        } else if (tail == null) {
            tail = member;
            return;
        }

        tail.setNext(member);
        member.setPrevious(tail);
        tail = member;
    }

}
