package Exercicio3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ArrayListMulticonjunto<T> implements Multiconjunto<T> {
    private ArrayList<T> elements;

    public ArrayListMulticonjunto() {
        elements = new ArrayList<>();
    }

    @Override
    public void add(T element) {
        elements.add(element);
    }

    @Override
    public boolean equals(Multiconjunto<T> m) {
        if (m == null || !(m instanceof ArrayListMulticonjunto)) return false;
        ArrayListMulticonjunto<T> other = (ArrayListMulticonjunto<T>) m;
        return this.elements.equals(other.elements);
    }

    @Override
    public void addAll(Multiconjunto<T> m) {
        if (m != null && m instanceof ArrayListMulticonjunto) {
            ArrayListMulticonjunto<T> other = (ArrayListMulticonjunto<T>) m;
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
