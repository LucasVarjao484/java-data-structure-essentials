/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package org.example.arvorerubronegra;

import java.util.Scanner;

/**
 *
 * @author Pichau
 */
public class JavaApplication15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArvoreRubroNegra arvore = new ArvoreRubroNegra();
        
        int x = -1;
        Scanner z = new Scanner(System.in);
        while(x != 0) {
            System.out.println("1 - Inserir número");
            System.out.println("2 - Retornar dados de um nó específico");
            System.out.println("3 - Retornar a árvore");
            System.out.println("4 - Excluir nó");
            System.out.println("0 - Encerrar");
            System.out.print("Informe o que deseja fazer: ");
            x = z.nextInt();
            
            if(x == 1) {
                int no;
                System.out.print("Informe o número que deseja inserir: ");
                no = z.nextInt();
                arvore.inserir(no);
            }
            if(x == 2) {
                int no;
                System.out.print("Informe o nó buscado: ");
                no = z.nextInt();
                arvore.imprimirInfoNo(no);
            }
            if(x == 3) {
                System.out.println(" ");
                arvore.imprimirArvore();
            }
            if(x == 4) {
                int no;
                System.out.print("Informe o número que deseja excluir: ");
                no = z.nextInt();
                arvore.remover(no);
            }
            System.out.println(" ");
        }

  
    }
    
}
