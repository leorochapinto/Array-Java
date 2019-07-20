/**
 * Exercicio6
 */
import javax.swing.JOptionPane;
public class Exercicio6 {
    public static void main(String[] args) {
        int i, j;
        int A[][] = new int[3][4];
        String B[][] = new String[3][4];
        A[0][0] = 1;
        A[0][1] = 2;
        A[0][2] = 3;
        A[0][3] = 4;
        A[1][0] = 11;
        A[1][1] = 12;
        A[1][2] = 13;
        A[1][3] = 14;
        A[2][0] = 101;
        A[2][1] = 102;
        A[2][2] = 103;
        A[2][3] = 104;
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
        int caixas = 0;
        /**
         * 6) Peça que o usuário informe o número de um dos compartimentos(exemplo
         * 1003), diga quantas caixas de cerveja tem neste compartimento.
         */
        String compartimento = JOptionPane.showInputDialog(
                "Informe o número do compartimento para consultar quantas caixas existem neste compartimento.");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 4; j++) {
                if (B[i][j].equals(compartimento)) {
                    caixas = A[i][j];
                    JOptionPane.showMessageDialog(null, "No compartimento " + compartimento + " existem " + caixas + " caixas.");
                }
                
            }
        }
        JOptionPane.showMessageDialog(null, compartimento);
    }
}