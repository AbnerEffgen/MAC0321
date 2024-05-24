package Exercicio1;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FactorialView extends JFrame {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public JTextField numberField;
    public JButton calculateButton;
    private JLabel resultLabel;

    public FactorialView() {
        // Configurações da janela
        setTitle("Calculadora de Fatorial");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        // Campo para entrada do número
        JLabel numberLabel = new JLabel("Número:");
        numberLabel.setBounds(50, 30, 100, 25);
        add(numberLabel);

        numberField = new JTextField();
        numberField.setBounds(150, 30, 100, 25);
        add(numberField);

        // Botão para calcular o fatorial
        calculateButton = new JButton("Calcular");
        calculateButton.setBounds(150, 70, 100, 25);
        add(calculateButton);

        // Label para mostrar o resultado
        resultLabel = new JLabel("Resultado: ");
        resultLabel.setBounds(50, 110, 300, 25);
        add(resultLabel);

        // Adiciona ação ao botão
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculateFactorial();
            }
        });

        // Torna a janela visível
        setVisible(true);
    }

    private void calculateFactorial() {
        try {
            int number = Integer.parseInt(numberField.getText());
            long result = FatorialController.calculateFatorial(number);
            resultLabel.setText("Resultado: " + result);
        } catch (NumberFormatException e) {
            resultLabel.setText("Por favor, insira um número válido.");
        } catch (IllegalArgumentException e) {
            resultLabel.setText(e.getMessage());
        }
    }

    public static void main(String[] args) {
        new FactorialView();
    }

	public JLabel getResultLabel() {
		// TODO Auto-generated method stubS
		return resultLabel;
	}
}

/*
Este programa é uma calculadora simples de fatorial que permite aos usuários inserir um número e calcular seu fatorial.
O usuário pode digitar o número desejado no campo de entrada e clicar no botão "Calcular" para obter o resultado do fatorial.
O resultado será exibido na interface gráfica, facilitando o uso e a compreensão para o usuário.
*/