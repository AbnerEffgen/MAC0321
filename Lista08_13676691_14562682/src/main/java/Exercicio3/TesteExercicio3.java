package Exercicio3;

import static org.junit.Assert.*;
import org.junit.Test;

public class TesteExercicio3 {

    @Test
    public void testArrayListMulticonjunto() {
        Multiconjunto<Integer> arrayListMulti1 = new ArrayListMulticonjunto<>();
        arrayListMulti1.add(1);
        arrayListMulti1.add(2);
        arrayListMulti1.add(2);
        
        Multiconjunto<Integer> arrayListMulti2 = new ArrayListMulticonjunto<>();
        arrayListMulti2.add(2);
        arrayListMulti2.add(3);
        arrayListMulti2.add(4);

        assertFalse(arrayListMulti1.equals(arrayListMulti2));

        arrayListMulti1.addAll(arrayListMulti2);
        assertTrue(arrayListMulti1.equals(new ArrayListMulticonjunto<Integer>() {{
            add(1);
            add(2);
            add(2);
            add(2);
            add(3);
            add(4);
        }}));
    }

    @Test
    public void testSetMulticonjunto() {
        Multiconjunto<String> setMulti1 = new SetMulticonjunto<>();
        setMulti1.add("a");
        setMulti1.add("b");
        setMulti1.add("b");
        
        Multiconjunto<String> setMulti2 = new SetMulticonjunto<>();
        setMulti2.add("b");
        setMulti2.add("c");
        setMulti2.add("d");

        assertFalse(setMulti1.equals(setMulti2));

        setMulti1.addAll(setMulti2);
        assertTrue(setMulti1.equals(new SetMulticonjunto<String>() {{
            add("a");
            add("b");
            add("b");
            add("c");
            add("d");
        }}));
    }

    @Test
    public void testLinkedListMulticonjunto() {
        Multiconjunto<Double> linkedListMulti1 = new LinkedListMulticonjunto<>();
        linkedListMulti1.add(1.5);
        linkedListMulti1.add(2.0);
        linkedListMulti1.add(2.0);
        
        Multiconjunto<Double> linkedListMulti2 = new LinkedListMulticonjunto<>();
        linkedListMulti2.add(2.0);
        linkedListMulti2.add(3.5);
        linkedListMulti2.add(4.0);

        assertFalse(linkedListMulti1.equals(linkedListMulti2));

        linkedListMulti1.addAll(linkedListMulti2);
        assertTrue(linkedListMulti1.equals(new LinkedListMulticonjunto<Double>() {{
            add(1.5);
            add(2.0);
            add(2.0);
            add(2.0);
            add(3.5);
            add(4.0);
        }}));
    }

    @Test
    public void testStackMulticonjunto() {
        Multiconjunto<Character> stackMulti1 = new StackMulticonjunto<>();
        stackMulti1.add('a');
        stackMulti1.add('b');
        stackMulti1.add('b');
        
        Multiconjunto<Character> stackMulti2 = new StackMulticonjunto<>();
        stackMulti2.add('b');
        stackMulti2.add('c');
        stackMulti2.add('d');

        assertFalse(stackMulti1.equals(stackMulti2));

        stackMulti1.addAll(stackMulti2);
        assertTrue(stackMulti1.equals(new StackMulticonjunto<Character>() {{
            add('a');
            add('b');
            add('b');
            add('b');
            add('c');
            add('d');
        }}));
    }
}
