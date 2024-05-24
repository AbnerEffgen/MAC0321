package Exercicio3;

import java.util.Collection;

public interface Multiconjunto<T> extends Iterable<T> {
    void add(T element);
    boolean equals(Multiconjunto<T> m);
    void addAll(Multiconjunto<T> m);
    int size();
    boolean isEmpty();
    boolean contains(Object o);
    Object[] toArray();
    @SuppressWarnings("hiding")
	<T> T[] toArray(T[] a);
    boolean remove(Object o);
    boolean containsAll(Collection<?> c);
    boolean addAll(Collection<? extends T> c);
    boolean retainAll(Collection<?> c);
    boolean removeAll(Collection<?> c);
    void clear();
}