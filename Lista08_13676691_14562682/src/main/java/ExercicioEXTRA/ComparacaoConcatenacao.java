package ExercicioEXTRA;

public class ComparacaoConcatenacao {

    public static void main(String[] args) {
        // Definindo o número de iterações
        int iterations = 10000;

        // Concatenação usando a classe String
        long startTimeString = System.currentTimeMillis();
        String concatenatedString = "";
        for (int i = 0; i < iterations; i++) {
            concatenatedString += "String" + i;
        }
        long endTimeString = System.currentTimeMillis();
        long durationString = endTimeString - startTimeString;

        // Concatenação usando a classe StringBuffer
        long startTimeStringBuffer = System.currentTimeMillis();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < iterations; i++) {
            stringBuffer.append("String").append(i);
        }
        long endTimeStringBuffer = System.currentTimeMillis();
        long durationStringBuffer = endTimeStringBuffer - startTimeStringBuffer;

        // Exibindo os resultados
        System.out.println("Tempo de concatenação usando String: " + durationString + " ms");
        System.out.println("Tempo de concatenação usando StringBuffer: " + durationStringBuffer + " ms");
    }
}


//A concatenação usando String é mais lenta devido à sua imutabilidade. Cada operação
// de concatenação cria uma nova instância de String, o que é menos eficiente em termos
// de desempenho. StringBuffer, por ser mutável, oferece uma concatenação mais eficiente,
// modificando diretamente o conteúdo da string sem criar novas instâncias.
