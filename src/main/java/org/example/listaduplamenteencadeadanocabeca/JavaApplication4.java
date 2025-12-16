/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package org.example.listaduplamenteencadeadanocabeca;

/**
 *
 * @author Pichau
 */
public class JavaApplication4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ListaDuplaEncadNoCabeca<String> x = new ListaDuplaEncadNoCabeca<>("Constante");
        x.adicionaComeco("A");
        x.adicionaFim("C");        
        x.adiciona(2, "B");
        x.adicionaFim("D");
        System.out.println(x.recupera(1));
        System.out.println(x.recupera(2));
        System.out.println(x.recupera(3));
        System.out.println(x.recupera(4)); 
        
        /*x.TestandoCabeca();
        System.out.println("+++++++++++++++++++++");
        x.removeInicio();
        System.out.println(x.recupera(1));
        System.out.println(x.recupera(2));
        System.out.println(x.recupera(3));
        x.TestandoCabeca();
        System.out.println("+++++++++++++++++++++");
        x.removeFim();
        System.out.println(x.recupera(1));
        System.out.println(x.recupera(2));
        x.TestandoCabeca();
        System.out.println("+++++++++++++++++++++");
        x.removeFim();
        System.out.println(x.recupera(1));
        System.out.println(x.recupera(2));
        x.TestandoCabeca();*/
        
        System.out.println("Testando celula anterior e proxima por posição: ");
        System.out.println(" ");
        x.TestandoAntProx(0);
        System.out.println(" ");
        x.TestandoAntProx(1);
        System.out.println(" ");
        x.TestandoAntProx(2);
        System.out.println(" ");
        x.TestandoAntProx(3);
        System.out.println(" ");
        x.TestandoAntProx(4);
        System.out.println("++++++++++++++");
        System.out.println(" ");
        x.TestandoCabeca();
        
        System.out.println("+++++++++++++++++++++");
        System.out.println("Removendo início");
        x.removeInicio();
        System.out.println(x.recupera(1));
        System.out.println(x.recupera(2));
        System.out.println(x.recupera(3));       
        System.out.println("Testando celula anterior e proxima por posição: ");
        System.out.println(" ");
        x.TestandoAntProx(1);
        System.out.println(" ");
        x.TestandoAntProx(2);
        System.out.println(" ");
        x.TestandoAntProx(3);
        System.out.println(" ");
        
        x.TestandoCabeca();
        System.out.println("+++++++++++++++++++++");
        System.out.println("Removendo fim");
        x.removeFim();
        System.out.println(x.recupera(1));
        System.out.println(x.recupera(2));
        System.out.println("Testando celula anterior e proxima por posição: ");
        System.out.println(" ");
        x.TestandoAntProx(1);
        System.out.println(" ");
        x.TestandoAntProx(2);
        System.out.println(" ");
        x.TestandoCabeca();
        System.out.println("+++++++++++++++++++++");
        System.out.println("Removendo fim");
        x.removeFim();
        System.out.println(x.recupera(1));
        System.out.println("Testando celula anterior e proxima por posição: ");
        System.out.println(" ");
        x.TestandoAntProx(1);
        System.out.println(" ");
        x.TestandoCabeca();
    }
    
}
