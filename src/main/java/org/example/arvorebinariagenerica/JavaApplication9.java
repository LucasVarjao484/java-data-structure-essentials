/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package org.example.arvorebinariagenerica;

/**
 *
 * @author Pichau
 */
public class JavaApplication9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Arvore<String> x = new Arvore();
        x.inserir(0);
        x.inserir(1);
        x.inserir(2);
        
        x.percorrerEmOrdem();
        System.out.println(x.encontrar(1));*/
        Arvore x = new Arvore();
        x.insere(null, "Adão", null);
        x.insere(x.raiz, "Cain", "E");
        x.insere(x.raiz, "Abel", "D");
        //x.printTree();
        //System.out.println("-----");
        x.insere(x.raiz.filhoEsq, "Unknow 1", "E");
        x.insere(x.raiz.filhoEsq, "Unknow 2", "D");
        x.insere(x.raiz.filhoEsq.filhoEsq, "Unknow 3", "E");
        x.printTree();
        System.out.println(x.pesquisa(x.raiz, "Unknow 1"));
        System.out.println("+++++++++++++++++++++++");
        x.imprimirPreOrdem();
        x.imprimirInOrdem();
        x.imprimirPosOrdem();
    }
    
}
