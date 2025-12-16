/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package org.example.arvoreavl;

/**
 *
 * @author Pichau
 */
public class JavaApplication13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArvoreAVL arvore = new ArvoreAVL();

        arvore.inserir(12);
        arvore.inserir(9);
        arvore.inserir(15);
        arvore.inserir(6);
        arvore.inserir(18);
        arvore.inserir(2);
        arvore.inserir(10);
        arvore.inserir(16);
        arvore.inserir(5);
        arvore.inserir(7);

        arvore.imprimir();        
    }
    
}
