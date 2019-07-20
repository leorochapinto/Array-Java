import javax.swing.*;

public class Prototipo8 // BubbleSort
{
    public static void main(String args[]) {
        int troca, fim, i, aux;
        int tamanho = 12;
        int vetorOrdenar[] = new int[tamanho];
        // aqui vc pode atribuir valores
        vetorOrdenar[0]=12;
        vetorOrdenar[1]=2;
        vetorOrdenar[2]=5;
        vetorOrdenar[3] = 7;
        vetorOrdenar[4] = 9;
        vetorOrdenar[5] = 8;
        vetorOrdenar[6] = 11;
        vetorOrdenar[7] = 4;
        vetorOrdenar[8] = 10;
        vetorOrdenar[9] = 6;
        vetorOrdenar[10] = 3;
        vetorOrdenar[11] = 1;
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
        int g;
        String mensagem = "";
        for(g = 0;g<12;g++){
            mensagem+=vetorOrdenar[g]+" : ";
        }
        // aqui vc pode mostrar o vetor
        JOptionPane.showMessageDialog(null, mensagem);
    }
}