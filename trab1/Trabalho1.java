
import javax.swing.JOptionPane;

public class Trabalho1 {

    public static void main(String[] args) {
        int i, j;
        int A[][] = new int[3][4];
        String B[][] = new String[3][4];
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

        /**
         * 1) Solicite ao usuário a quantidade de caixas de cerveja em cada
         * compartimento, a mensagem que aparece para o usuário deve seguir EXATAMENTE o
         * seguinte modelo: "Olá, insira a quantidade de caixas de cerveja para o
         * compartimento (número do compartimento): "
         */
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 4; j++) {
                A[i][j] = Integer.parseInt(JOptionPane.showInputDialog(
                        "Olá, insira a quantidade de caixas de cerveja para o compartimento " + B[i][j] + ":"));
            }
        }

        /**
         * 2) Qual é o número total de caixas de cerveja no armazém ?
         */
        int numeroDeCaixas = 0;
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 4; j++) {
                numeroDeCaixas = numeroDeCaixas + A[i][j];
            }
        }
        JOptionPane.showMessageDialog(null, "O número total de caixas de cerveja no armazém é " + numeroDeCaixas);

        /**
         * 3) O armazém está desorganizado, calcule o número ideal de caixas de cerveja
         * que deveriam estar alocados em cada compartimento. (Calcule a média).
         */
        double media = numeroDeCaixas / 12;
        JOptionPane.showMessageDialog(null,
                "O número ideal de caixas de cerveja que deveriam estar alocados em cada compartimento é: " + media);

        /**
         * 4) Qual é o número do compartimento que MAIS tem caixas de cerveja ?
         */
        int maior_g = 0;
        String maior_comp = "";
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 4; j++) {
                if (A[i][j] > maior_g) {
                    maior_g = A[i][j];
                    maior_comp = B[i][j];
                }
            }
        }
        JOptionPane.showMessageDialog(null,
                "O número do compartimento que mais tem caixas de cerveja é o compartimento: " + maior_comp + " com "
                        + maior_g + " cervejas.");

        /**
         * 5) Qual é o número do compartimento que MENOS tem caixas de cerveja?
         */
        int menor_g = 9999999;
        String menor_comp = "";
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 4; j++) {
                if (A[i][j] < menor_g) {
                    menor_g = A[i][j];
                    menor_comp = B[i][j];
                }
            }
        }
        JOptionPane.showMessageDialog(null,
                "O número do compartimento que menos tem caixas de cerveja é o compartimento: " + menor_comp + " com "
                        + menor_g + " cervejas.");

        /**
         * 6) Peça que o usuário informe o número de um dos compartimentos(exemplo
         * 1003), diga quantas caixas de cerveja tem neste compartimento.
         */
        int caixas = 0;
        String compartimento = JOptionPane.showInputDialog(
                "Informe o número do compartimento para consultar quantas caixas existem neste compartimento.");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 4; j++) {
                if (B[i][j].equals(compartimento)) {
                    caixas = A[i][j];
                    JOptionPane.showMessageDialog(null,
                            "No compartimento " + compartimento + " existem " + caixas + " caixas.");
                }
            }
        }

        /**
         * 7) Mostre todas as quantidades de caixas de cerveja ordenadas em apenas 1
         * mensagem. Para isso coloque todas as quantidades em um vetor e ordene com o
         * BubbleSort.
         */
        int troca, fim, aux;
        int arrayOrdenado[] = new int[12];
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

        /**
         * 8) Mostre a porcentagem do número de compartimentos em relação ao total (12
         * compartimentos), que possuem mais caixas de cerveja que a média do armazém.
         */
        double total = 0.0;
        double count = 0.0;
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 4; j++) {
                if (A[i][j] > media) {
                    count++;
                }
            }
        }
        total = (count / 12) * 100;
        JOptionPane.showMessageDialog(null,
                "Porcentagem dos compartimentos que possuem mais caixas de cerveja que a média do armazém: " + total
                        + "%");

        /**
         * 9) Mostre o número do compartimento que MENOS tem caixas de cerveja na
         * Prateleira 2.
         */
        int menor_prat = 9999999;
        String menor_comp_prat = "";
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 4; j++) {
                if (A[1][j] < menor_prat) {
                    menor_prat = A[1][j];
                    menor_comp_prat = B[1][j];
                }
            }
        }
        JOptionPane.showMessageDialog(null,
                "O número do compartimento que menos tem caixas de cerveja na Prateleira 2 é: " + menor_comp_prat);

        /**
         * 10) Mostre o número do compartimento que MAIS tem caixas de cerveja na
         * Prateleira 3.
         */
        int maior_prat = 0;
        String maior_comp_prat = "";
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 4; j++) {
                if (A[2][j] > maior_prat) {
                    maior_prat = A[2][j];
                    maior_comp_prat = B[2][j];
                }
            }
        }
        JOptionPane.showMessageDialog(null,
                "O número do compartimento que mais tem caixas de cerveja na Prateleira 3 é: " + maior_comp_prat);
    }
}