package io.codeforall.bootcamp;

public class LinkedList {

    private Node head;
    private int length = 0;

    public LinkedList() {
        this.head = new Node(null);
        // private int length
    }

    public int size() {
        return length;
    }

    /**
     * Adds an element to the end of the list
     *
     * @param data the element to add
     */
    public void add(Object data) {

        Node node = new Node(data);
        //System.out.println("node:" + node.getData());
        //System.out.println("data:" + data);
        Node iterator = head;
        //System.out.println("head:" + head);
        while (iterator.getNext() != null) {
            iterator = iterator.getNext();
        }
        iterator.setNext(node);
        length++;
        //System.out.println("length: "+length);
    }

    /**
     * Obtains an element by index
     *
     * @param index the index of the element
     * @return the element
     */
    public Object get(int index) {
        //throw new UnsupportedOperationException();
        Node myInteractor = head.getNext();
        // int myValue = -1;
        if (length == 0) {
            return null;
        }
        //while (myInteractor.getNext() != null){
        for (int i = 0; i < length; i++) {
            if (i == index) {
                return myInteractor.getData();
            }
            myInteractor = myInteractor.getNext();
        }
        return null;

            /*
            if (myValue == index) {
                return myInteractor.getData();
            }
            myInteractor = myInteractor.getNext();
            myValue++;

        }
        return null;

             */
    }

    /**
     * Returns the index of the element in the list
     *
     * @param data element to search for
     * @return the index of the element, or -1 if the list does not contain element
     */
    public int indexOf(Object data) {
        int mynumber = -1;
        Node iterators = head;

        while (iterators.getNext() != null) {
            //System.out.println("hugo");
            iterators = iterators.getNext();
            mynumber++;
            if (iterators.getData() == data) {
                return mynumber;
            }
        }
        return -1;
    }

    /**
     * Removes an element from the list
     *
     * @param data the element to remove
     * @return true if element was removed
     */
    public boolean remove(Object data) {
        Node current = head;
        Node previous = null;

        if (current == null) {
            return false; // Lista vazia, não há nada para remover
        }

        while (current != null) {
            if (current.getData() == null) {
                // Ignora nós com dados nulos
                previous = current;
                current = current.getNext();
                continue;
            } else if (current.getData().equals(data)) {
                //como o foi encontrado o atual vai perder a referenncia
                //que passa do anterior para o posterior, como foi "retirado"
                //o tamanho precisa de ser diminuido
                previous.setNext(current.getNext());
                length--;
                return true;
            }
            previous = current;
            current = current.getNext();
        }

        return false; // Elemento não encontrado
    }

    // ___________________________________________________
    private class Node {

        private Object data;
        private Node next;

        public Node(Object data) {
            this.data = data;
            next = null;
        }

        //getter
        public Object getData() {
            return data;
        }

        // setter
        public void setData(Object data) {
            this.data = data;
        }

        // getter
        public Node getNext() {
            return next;
        }

        // setter
        public void setNext(Node next) {
            this.next = next;
        }
    }

}
