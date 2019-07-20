import javax.swing.*;

public class Prototipo8c // BubbleSort
{
    public static void main(String args[]) {
        int troca, fim, i, aux;
        int j;
        int A[][] = new int[3][4];
        int arrayOrdenado[] = new int[12];
        A[0][0] = 1;
        A[0][1] = 23;
        A[0][2] = 3;
        A[0][3] = 4;
        A[1][0] = 11;
        A[1][1] = 132;
        A[1][2] = 13;
        A[1][3] = 134;
        A[2][0] = 101;
        A[2][1] = 12;
        A[2][2] = 19;
        A[2][3] = 24;
        
        int contador = 0;
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 4; j++) {
                arrayOrdenado[contador] = A[i][j];
                contador++;
            }
        }
        troca = 1;
        fim = 12 - 1;
        while (troca == 1) {
            troca = 0;
            for (i = 0; i < fim; i++) {
                if (arrayOrdenado[i] > arrayOrdenado[i + 1]) {
                    aux = arrayOrdenado[i];
                    arrayOrdenado[i] = arrayOrdenado[i + 1];
                    arrayOrdenado[i + 1] = aux;
                    troca = 1;
                }
            }

            fim = fim - 1;
        }
        int g;
        String mensagem = "";
        for (g = 0; g < 12; g++) {
            mensagem += arrayOrdenado[g] + " : ";
        }
        JOptionPane.showMessageDialog(null, mensagem);
    }
}