/**
 * Exercicio7
 */
import javax.swing.JOptionPane;
public class Exercicio7 {

    /**
     * 7) Mostre todas as quantidades de caixas de cerveja ordenadas em apenas 1
     * mensagem. Para isso coloque todas as quantidades em um vetor e ordene com o
     * BubbleSort.
     */
    public static void main(String[] args) {
        int i, j, flag, fim, aux;
        int A[][] = new int[3][4];
        int A[] = new int[12];
        A[0][0] = 54;
        A[0][1] = 2;
        A[0][2] = 3;
        A[0][3] = 23;
        A[1][0] = 11;
        A[1][1] = 12;
        A[1][2] = 13;
        A[1][3] = 14;
        A[2][0] = 101;
        A[2][1] = 15;
        A[2][2] = 42;
        A[2][3] = 10;
        // aqui vc pode atribuir valores
//        for (i = 0; i < 3; i++) {
//            for (j = 0; j < 4; j++) {
 //               A[i][j]
  //          }
//}
        flag = 1;
        fim = 12 - 1;
        while (flag == 1) {
            flag = 0;
            for (i = 0; i < fim; i++) {
                if (A[i][j] > A[i][j + 1]) {
                    aux = A[i][j];
                    A[i][j] = A[j + 1];
                    A[j + 1] = aux;
                    flag = 1;
                }
            }
            fim = fim - 1;
        }
        // aqui vc pode mostrar o vetor
        JOptionPane.showMessageDialog(null,"LUDA GUEA"+A[0][0]);
    }
}