package Exercicio3;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

class LinkedListMulticonjunto<T> implements Multiconjunto<T> {
    private LinkedList<T> elements;

    public LinkedListMulticonjunto() {
        elements = new LinkedList<>();
    }

    @Override
    public void add(T element) {
        elements.add(element);
    }

    @Override
    public boolean equals(Multiconjunto<T> m) {
        if (m == null || !(m instanceof LinkedListMulticonjunto)) return false;
        LinkedListMulticonjunto<T> other = (LinkedListMulticonjunto<T>) m;
        return this.elements.equals(other.elements);
    }

    @Override
    public void addAll(Multiconjunto<T> m) {
        if (m != null && m instanceof LinkedListMulticonjunto) {
            LinkedListMulticonjunto<T> other = (LinkedListMulticonjunto<T>) m;
            this.elements.addAll(other.elements);
        }
    }

    @Override
    public Iterator<T> iterator() {
        return elements.iterator();
    }

    @Override
    public int size() {
        return elements.size();
    }

    @Override
    public boolean isEmpty() {
        return elements.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return elements.contains(o);
    }

    @Override
    public Object[] toArray() {
        return elements.toArray();
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        return elements.toArray(a);
    }

    @Override
    public boolean remove(Object o) {
        return elements.remove(o);
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return elements.containsAll(c);
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        return elements.addAll(c);
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return elements.retainAll(c);
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return elements.removeAll(c);
    }

    @Override
    public void clear() {
        elements.clear();
    }
}
