/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package org.example.arvorebinariadebusca;

/**
 *
 * @author Pichau
 */
public class JavaApplication10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Arvore x = new Arvore();
        x.insere(10);
        x.insere(20);
        x.insere(30);
        x.insere(40);
        x.insere(50);
        x.insere(60);
        x.insere(70);
        x.insere(80);
        x.insere(90);
        x.insere(4);
        x.insere(6);
        x.insere(3);
        x.insere(5);
        x.insere(7);
        x.insere(100);
        x.insere(101);
        x.insere(102);
        x.insere(103);
        x.insere(104);
        x.insere(105);
        x.insere(106);
        x.insere(107);
        x.insere(110);
        x.insere(120);
        x.insere(130);
        x.insere(12);
        x.insere(14);
        x.insere(16);
        x.insere(15);
        x.insere(17);
        x.insere(18);
        x.insere(19);
        
        
        x.printTree();
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxx");
        
        System.out.println("Grau dos nós:");
        x.informaGrauNos();
        System.out.println(" ");
        System.out.print("Grau da árvore: ");
        System.out.println(x.grau());
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxx");
        
        System.out.print("Profundidade do nó 120 (exemplo): ");
        System.out.println(x.profundidadeNo(120));
        System.out.print("Profundidade da árvore: ");
        System.out.println(x.profundidadeArvore());
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxx");
        
        System.out.println("Alturas de todos os nós da árvore:");
        x.printAlturas();
        System.out.print("Altura da árvore: ");
        System.out.println(x.altura());
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxx");
        
        System.out.println("Todas as folhas da árvore:");
        x.informaFolhas();
        
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxx");
        System.out.print("Percorrendo por largura:");
        x.percursoLargura();
        System.out.println( );
        
        System.out.print("Nível do nó 106 (exemplo): ");
        System.out.println(x.nivelNo(106));
        
        System.out.println("Imprimindo pelos métodos !");
        System.out.println("Pré ordem:");
        x.preOrdem();
        System.out.println(" ");
        System.out.println("");
        System.out.println("Pós ordem:");
        x.posOrdem();
        System.out.println();
        System.out.println("In ordem:");
        x.inOrder();
    }
    
}


//10-20-30-40-50-60-70-80-90-4-6-3-5-7-100-101-102-103-104-105-106-
//107-110-120-130-12-14-16-15-17-18-19