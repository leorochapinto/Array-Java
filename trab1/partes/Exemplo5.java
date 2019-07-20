import javax.swing.*;

public class Exemplo5 // BubbleSort
{
    public static void main(String args[]) {
        int troca, fim, i, aux;
        int tamanho = Integer.parseInt(JOptionPane.showInputDialog("informe o tamanho do vetor"));
        int vetorOrdenar[] = new int[tamanho];
        // aqui vc pode atribuir valores
        troca = 1;
        fim = tamanho - 1;
        while (troca == 1) {
            troca = 0;
            for (i = 0; i < fim; i++) {
                if (vetorOrdenar[i] > vetorOrdenar[i + 1]) {
                    aux = vetorOrdenar[i];
                    vetorOrdenar[i] = vetorOrdenar[i + 1];
                    vetorOrdenar[i + 1] = aux;
                    troca = 1;
                }
            }
            fim = fim - 1;
        }
        // aqui vc pode mostrar o vetor
    }
}