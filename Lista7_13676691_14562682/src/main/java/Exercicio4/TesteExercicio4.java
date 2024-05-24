package Exercicio4;

import Exercicio3.Multiconjunto;
import Exercicio3.ArrayListMulticonjunto;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TesteExercicio4 {

    @Test
    public void testMulticonjuntoAdapter() {
        // Criando um Multiconjunto usando ArrayList
        Multiconjunto<Integer> arrayListMulticonjunto = new ArrayListMulticonjunto<>();
        arrayListMulticonjunto.add(1);
        arrayListMulticonjunto.add(2);
        arrayListMulticonjunto.add(2);

        // Criando um adaptador para o Multiconjunto
        MulticonjuntoAdapter<Integer> adapter = new MulticonjuntoAdapter<>(arrayListMulticonjunto);

        // Testando o tamanho do adaptador
        assertEquals(3, adapter.size());

        // Testando se contém os elementos
        assertTrue(adapter.contains(1));
        assertTrue(adapter.contains(2));
        assertFalse(adapter.contains(3));

        // Testando a remoção de elementos
        assertTrue(adapter.remove(1));
        assertFalse(adapter.contains(1));

        // Testando a adição de elementos
        assertTrue(adapter.add(3));
        assertTrue(adapter.contains(3));

        // Testando a limpeza do adaptador
        adapter.clear();
        assertEquals(0, adapter.size());
        assertTrue(adapter.isEmpty());
    }
}
