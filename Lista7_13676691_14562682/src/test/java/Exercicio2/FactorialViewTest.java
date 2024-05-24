package Exercicio2;
/*
Este programa é uma calculadora simples de fatorial que permite aos usuários inserir um número e calcular seu fatorial.
O usuário pode digitar o número desejado no campo de entrada e clicar no botão "Calcular" para obter o resultado do fatorial.
O resultado será exibido na interface gráfica, facilitando o uso e a compreensão para o usuário.
*/
import org.junit.jupiter.api.Test;

import Exercicio1.FactorialView;

import javax.swing.*;
import java.awt.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FactorialViewTest {

	@Test
    public void testValorValido() throws AWTException, InterruptedException {
        // Abre a calculadora
        FactorialView calculator = new FactorialView();
        JTextField numberField = calculator.numberField;
        JButton calculateButton = calculator.calculateButton;
        JLabel resultLabel = calculator.getResultLabel();

        // Define o número a ser inserido
        String entrada = "5";
        // Insere o número no campo de texto
        numberField.setText(entrada);

        // Clica no botão calcular
        calculateButton.doClick();

        // Espera um pouco para o resultado aparecer
        Thread.sleep(1000);

        // Verifica se o resultado exibido é o esperado
        assertEquals("Resultado: 120", resultLabel.getText());
    }
    
	@Test
    public void testValorNegativo() throws AWTException, InterruptedException {
        // Abre a calculadora
        FactorialView calculator = new FactorialView();
        JTextField numberField = calculator.numberField;
        JButton calculateButton = calculator.calculateButton;
        JLabel resultLabel = calculator.getResultLabel();

        // Define o número a ser inserido
        String entrada = "-5";
        // Insere o número no campo de texto
        numberField.setText(entrada);

        // Clica no botão calcular
        calculateButton.doClick();

        // Espera um pouco para o resultado aparecer
        Thread.sleep(1000);

        // Verifica se o resultado exibido é o esperado
        assertEquals("O número precisa ser não negativo.", resultLabel.getText());
    }
	
	@Test
    public void testNaoNumero() throws AWTException, InterruptedException {
        // Abre a calculadora
        FactorialView calculator = new FactorialView();
        JTextField numberField = calculator.numberField;
        JButton calculateButton = calculator.calculateButton;
        JLabel resultLabel = calculator.getResultLabel();

        // Define o número a ser inserido
        String entrada = "a";
        // Insere o número no campo de texto
        numberField.setText(entrada);

        // Clica no botão calcular
        calculateButton.doClick();

        // Espera um pouco para o resultado aparecer
        Thread.sleep(1000);

        // Verifica se o resultado exibido é o esperado
        assertEquals("Por favor, insira um número válido.", resultLabel.getText());
    }

}