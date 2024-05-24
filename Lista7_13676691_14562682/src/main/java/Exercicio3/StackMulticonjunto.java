package Exercicio3;

import java.util.Collection;
import java.util.Iterator;
import java.util.Stack;

class StackMulticonjunto<T> implements Multiconjunto<T> {
    private Stack<T> elements;

    public StackMulticonjunto() {
        elements = new Stack<>();
    }

    @Override
    public void add(T element) {
        elements.push(element);
    }

    @Override
    public boolean equals(Multiconjunto<T> m) {
        if (m == null || !(m instanceof StackMulticonjunto)) return false;
        StackMulticonjunto<T> other = (StackMulticonjunto<T>) m;
        return this.elements.equals(other.elements);
    }

    @Override
    public void addAll(Multiconjunto<T> m) {
        if (m != null && m instanceof StackMulticonjunto) {
            StackMulticonjunto<T> other = (StackMulticonjunto<T>) m;
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
