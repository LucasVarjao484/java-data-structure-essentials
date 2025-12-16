/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package org.example.listacircular;

/**
 *
 * @author Pichau
 */
public class JavaApplication5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ListaCirculaar<String> x = new ListaCirculaar<>();
        x.adicionaComeco("Música 3");
        x.adicionaComeco("Música 2");
        x.adicionaComeco("Música 1");
        System.out.println(x.recupera(1));
        System.out.println(x.recupera(2));
        System.out.println(x.recupera(3));
        System.out.println("--------");
        System.out.println("anterior e próximo do primeiro:");
        System.out.println(" ");
        x.TestandoAntProx(1);
        System.out.println(" ");
        System.out.println("--------");
        System.out.println("anterior e próximo da última:");
        System.out.println(" ");
        x.TestandoAntProx(3);
        System.out.println(" ");
        System.out.println("--------");
        System.out.println("Removendo do fim");
        x.removeFim();
        System.out.println(" ");
        System.out.println(x.recupera(1));
        System.out.println(x.recupera(2));
        System.out.println(x.recupera(3));
        System.out.println("--------");
        System.out.println("anterior e próximo do primeiro:");
        System.out.println(" ");
        x.TestandoAntProx(1);
        System.out.println(" ");
        System.out.println("anterior e próximo do último:");
        System.out.println(" ");
        x.TestandoAntProx(2);
        System.out.println(" ");
        System.out.println("--------");
        System.out.println("Removendo do fim novamente");
        x.removeFim();
        System.out.println(" ");
        System.out.println(x.recupera(1));
        System.out.println(x.recupera(2));
        System.out.println(x.recupera(3));
        System.out.println("--------");
        System.out.println("anterior e próximo do primeiro:");
        System.out.println(" ");
        x.TestandoAntProx(1);
    }
    
}
