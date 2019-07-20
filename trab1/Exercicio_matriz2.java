/*

Faça um algoritmo que leia uma matriz de ordem 3x3 de números inteiros. Após a leitura faça:

a)Calcule e mostre a soma dos elementos da primeira coluna;
b)Calcule e mostre a soma dos elementos de cada coluna;
c)Calcule e mostre o produto dos elementos da primeira linha;
d)Calcule e mostre a soma de todos os elementos da matriz;
e)Calcule e mostre a média dos elementos da matriz;
f)Calcule e mostre os elementos que são maiores que a média;
g)Calcule e mostre o maior elemento da matriz e sua posição;
h)Calcule e mostre o menor elemento da matriz e sua posição;
i)Mostre os elementos da diagonal principal;
j)Mostre os elementos do triângulo superior principal;
k)Mostre os elementos do triângulo inferior principal;
l)Calcule e mostre a soma do diagonal principal;
m)Mostre os elementos da diagonal secundária;
n)Mostre os elementos do triângulo superior secundário;
o)Mostre os elementos do triângulo inferior secundário;
p)Calcule e mostre a Soma da diagonal secundária;

*/


import javax.swing.*;
public class Exercicio_matriz2
{
     public static void main(String args[])
     {
          int A[][] = new int[3][3];
          int i, j;
          

          

      // leitura da matriz 3 x 3
      for(i=0; i<3; i++)
      {
         for (j=0; j<3; j++){
            A[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da linha "+i+" e coluna "+j+": "));
         }
      }
      
      
      // a)Calcule e mostre a soma dos elementos da primeira coluna;
         int resp_a = 0;
         for (i=0; i<3; i++){
            resp_a = resp_a + A[i][0];
         }
         JOptionPane.showMessageDialog(null, "a) Soma dos elementos da primeira coluna: " +resp_a);
      
      

      // b)Calcule e mostre a soma dos elementos de cada coluna;
      int vetor_b[] = new int[3];
      for(i=0; i<3; i++){
         for (j=0; j<3; j++){
            vetor_b[i] = vetor_b[i] + A[j][i];
         }
      }
      JOptionPane.showMessageDialog(null, "b) \n Coluna 0: " +vetor_b[0]+" \n Coluna 1: "+vetor_b[1]+ " \n Coluna 2: " + vetor_b[2]);



      // c)Calcule e mostre o produto dos elementos da primeira linha;
         int produto_c = 1;
         for (i=0; i<3; i++){
            produto_c = produto_c * A[0][i];
         }
         JOptionPane.showMessageDialog(null, "c)Calcule e mostre o produto dos elementos da primeira linha: " +produto_c);


      // d)Calcule e mostre a soma de todos os elementos da matriz;
      int soma_matriz_d = 0;
      for(i=0; i<3; i++){
         for (j=0; j<3; j++){
            soma_matriz_d = soma_matriz_d + A[i][j];
         }
      }
      JOptionPane.showMessageDialog(null, "d)Calcule e mostre a soma de todos os elementos da matriz: " +soma_matriz_d);

      
      //e)Calcule e mostre a média dos elementos da matriz;
      int media_matriz_e = 0;
      media_matriz_e = soma_matriz_d / 9;
      JOptionPane.showMessageDialog(null, "e)Calcule e mostre a média dos elementos da matriz: " +media_matriz_e);
      
      
      //f)Calcule e mostre os elementos que são maiores que a média;
      String maiores_media_f = "";
      for(i=0; i<3; i++){
         for (j=0; j<3; j++){
            if (A[i][j] > media_matriz_e){
              maiores_media_f = maiores_media_f + ":" + A[i][j];
            }
         }
      }
      JOptionPane.showMessageDialog(null, "f)Calcule e mostre os elementos que são maiores que a média: \n" +maiores_media_f);


      // g)Calcule e mostre o maior elemento da matriz e sua posição;
      int maior_g = 0;
      int lin_maior = 0;
      int col_maior = 0;
      for(i=0; i<3; i++){
         for (j=0; j<3; j++){
            if (A[i][j] > maior_g){
              maior_g = A[i][j];
              lin_maior = i;
              col_maior = j;
            }
         }
      }
      JOptionPane.showMessageDialog(null, "g)Calcule e mostre o maior elemento da matriz e sua posição: \n Maior: "
      + maior_g +
      "\n Linha: " +
      lin_maior +
      "\n Coluna: " +
      col_maior
      );
      

      // h)Calcule e mostre o menor elemento da matriz e sua posição;
      int menor_h = 999999;
      int lin_menor = 0;
      int col_menor = 0;
      for(i=0; i<3; i++){
         for (j=0; j<3; j++){
            if (A[i][j] < menor_h){
              menor_h = A[i][j];
              lin_menor = i;
              col_menor = j;
            }
         }
      }
      JOptionPane.showMessageDialog(null, "h)Calcule e mostre o menor elemento da matriz e sua posição: \n Menor: "
      + menor_h +
      "\n Linha: " +
      lin_menor +
      "\n Coluna: " +
      col_menor
      );
      
      
      // i)Mostre os elementos da diagonal principal;
         String diag_principal = "";
         for (i=0; i<3; i++){
             diag_principal = diag_principal + " : " + A[i][i];
         }
         JOptionPane.showMessageDialog(null, "i)Mostre os elementos da diagonal principal: \n " + diag_principal);
      

      
      // j)Mostre os elementos do triângulo superior principal; //Observe que o número da linha é sempre menor que o da coluna.
      int vetor_tsp[] = new int[3];
      int contador = 0;
      for(i=0; i<3; i++){
         for (j=0; j<3; j++){
            if (i < j){
              vetor_tsp[contador] = A[i][j];
              contador++;
            }
         }
      }
      JOptionPane.showMessageDialog(null, "j)Mostre os elementos do triângulo superior principal: \n " + vetor_tsp[0] + "\n" + vetor_tsp[1] + "\n" + vetor_tsp[2] + "\n");
      
      

      
      
      // k)Mostre os elementos do triângulo inferior principal;  Observe que o número da linha é sempre maior que o da coluna.

      contador = 0;
      for(i=0; i<3; i++){
         for (j=0; j<3; j++){
            if (i > j){
              vetor_tsp[contador] = A[i][j];
              contador++;
            }
         }
      }
      JOptionPane.showMessageDialog(null, "k)Mostre os elementos do triângulo inferior principal: \n " + vetor_tsp[0] + "\n" + vetor_tsp[1] + "\n" + vetor_tsp[2] + "\n");

      
      
      // l)Calcule e mostre a soma do diagonal principal;
         int soma_diag_principal = 0;
         for (i=0; i<3; i++){
             soma_diag_principal = soma_diag_principal + A[i][i];
         }
         JOptionPane.showMessageDialog(null, "l)Calcule e mostre a soma do diagonal principal: \n " + soma_diag_principal);


      // m)Mostre os elementos da diagonal secundária; // Observe que o número da linha somado ao número da coluna é sempre igual a 4, isto é, ordem + 1.
      contador = 0;
      int soma_ij = 0;
      for(i=0; i<3; i++){
         for (j=0; j<3; j++){
            soma_ij = (i+1) + (j+1);
            if (soma_ij == 4){  // ordem (3) + 1
              vetor_tsp[contador] = A[i][j];
              contador++;
            }
         }
      }
      JOptionPane.showMessageDialog(null, "m)Mostre os elementos da diagonal secundária: \n " + vetor_tsp[0] + "\n" + vetor_tsp[1] + "\n" + vetor_tsp[2] + "\n");

      
      
      // n)Mostre os elementos do triângulo superior secundário;
      //Observe que o número da linha somado ao número da coluna é sempre menor ou igual à ordem..
      contador = 0;
      soma_ij = 0;
      for(i=0; i<3; i++){
         for (j=0; j<3; j++){
            soma_ij = (i+1) + (j+1);
            if (soma_ij <= 3){  // ordem 3
              vetor_tsp[contador] = A[i][j];
              contador++;
            }
         }
      }
      JOptionPane.showMessageDialog(null, "n)Mostre os elementos do triângulo superior secundário: \n " + vetor_tsp[0] + "\n" + vetor_tsp[1] + "\n" + vetor_tsp[2] + "\n");

      
      
      // o)Mostre os elementos do triângulo inferior secundário;
      //Observe que o número da linha somado ao número da coluna é sempre maior ou igual a ordem + 2.
      contador = 0;
      soma_ij = 0;
      for(i=0; i<3; i++){
         for (j=0; j<3; j++){
            soma_ij = (i+1) + (j+1);
            if (soma_ij >= 5){  // ordem 3 +2
              vetor_tsp[contador] = A[i][j];
              contador++;
            }
         }
      }
      JOptionPane.showMessageDialog(null, "o)Mostre os elementos do triângulo inferior secundário: \n " + vetor_tsp[0] + "\n" + vetor_tsp[1] + "\n" + vetor_tsp[2] + "\n");


     // p)Calcule e mostre a Soma da diagonal secundária;
     //Observe que o número da linha somado ao número da coluna é sempre igual a 4, isto é, ordem + 1.
     
      int soma_diag_sec = 0;
      soma_ij = 0;
      for(i=0; i<3; i++){
         for (j=0; j<3; j++){
            soma_ij = (i+1) + (j+1);
            if (soma_ij == 4){  // ordem 3 +1
              soma_diag_sec = soma_diag_sec + A[i][j];
            }
         }
      }
      JOptionPane.showMessageDialog(null, "p)Calcule e mostre a Soma da diagonal secundária: \n " + soma_diag_sec);


          

      
  }
}




