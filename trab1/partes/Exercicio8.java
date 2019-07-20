/**
 * Exercicio8
 */
import javax.swing.JOptionPane;
public class Exercicio8 {

    public static void main(String[] args) {
        int i, j;
        int A[][] = new int[3][4];
        String B[][] = new String[3][4];
        //int C[] = new int[12];
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
        B[0][0] = "1001";
        B[0][1] = "1002";
        B[0][2] = "1003";
        B[0][3] = "1004";
        B[1][0] = "2001";
        B[1][1] = "2002";
        B[1][2] = "2003";
        B[1][3] = "2004";
        B[2][0] = "3001";
        B[2][1] = "3002";
        B[2][2] = "3003";
        B[2][3] = "3004";

        // d)Calcule e mostre a soma de todos os elementos da matriz;
        int soma_matriz_d = 0;
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                soma_matriz_d = soma_matriz_d + A[i][j];
            }
        }
        JOptionPane.showMessageDialog(null,
                "d)Calcule e mostre a soma de todos os elementos da matriz: " + soma_matriz_d);

        // e)Calcule e mostre a m�dia dos elementos da matriz;
        int media_matriz_e = 0;
        media_matriz_e = soma_matriz_d / 9;
        JOptionPane.showMessageDialog(null, "e)Calcule e mostre a m�dia dos elementos da matriz: " + media_matriz_e);

        // f)Calcule e mostre os elementos que s�o maiores que a m�dia;
        double total = 0.0;
        double count = 0.0;
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 4; j++) {
                if (A[i][j] > media_matriz_e) {
                    //JOptionPane.showMessageDialog(null, "Acima da Média");

                    count++;
                    total = (count / 12)*100;
                }
            }
        }

        JOptionPane.showMessageDialog(null,
                "f)Calcule e mostre os elementos que s�o maiores que a média: \n" + total + "% \n");
    }
}