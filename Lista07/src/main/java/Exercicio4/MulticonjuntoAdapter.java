package Exercicio4;

import Exercicio3.Multiconjunto;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

public class MulticonjuntoAdapter<T> implements Set<T> {
    private Multiconjunto<T> multiconjunto;

    public MulticonjuntoAdapter(Multiconjunto<T> multiconjunto) {
        this.multiconjunto = multiconjunto;
    }

    @Override
    public int size() {
        return multiconjunto.size();
    }

    @Override
    public boolean isEmpty() {
        return multiconjunto.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return multiconjunto.contains(o);
    }

    @Override
    public Iterator<T> iterator() {
        return new MulticonjuntoIterator();
    }

    @Override
    public Object[] toArray() {
        return multiconjunto.toArray();
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return multiconjunto.toArray(a);
    }

    @Override
    public boolean remove(Object o) {
        return multiconjunto.remove(o);
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return multiconjunto.containsAll(c);
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        return multiconjunto.addAll(c);
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return multiconjunto.retainAll(c);
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return multiconjunto.removeAll(c);
    }

    @Override
    public void clear() {
        multiconjunto.clear();
    }

    private class MulticonjuntoIterator implements Iterator<T> {
        private Iterator<T> iterator = multiconjunto.iterator();
        private Set<T> elementsSet = new HashSet<>();

        @Override
        public boolean hasNext() {
            while (iterator.hasNext()) {
                T element = iterator.next();
                if (!elementsSet.contains(element)) {
                    elementsSet.add(element);
                    return true;
                }
            }
            return false;
        }

        @Override
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            return elementsSet.iterator().next();
        }
    }

    @Override
    public boolean add(T e) {
        multiconjunto.add(e);
        return true;
    }
}
