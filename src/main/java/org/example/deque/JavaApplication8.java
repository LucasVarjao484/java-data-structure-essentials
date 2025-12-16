/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package org.example.deque;

/**
 *
 * @author Pichau
 */
public class JavaApplication8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Deque<String> x = new Deque<>();
        System.out.print("Verificando se o deque está vazio: ");
        System.out.println(x.isEmpty());
        System.out.print("Tamanho: ");
        System.out.println(x.tamanho());
        System.out.println("Inserindo (Pedro) no início...");
        x.inserirNoInicio("Pedro");
        System.out.println("Inserindo (Carlos) no início...");
        x.inserirNoInicio("Carlos");
        System.out.println("Inserindo (João) no fim...");
        x.inserirNoFim("João");
        System.out.println("Inserindo (Roberto) no fim...");
        x.inserirNoFim("Roberto");
        System.out.println("Inserindo (Fernando) no início...");
        x.inserirNoInicio("Fernando");
        
        /*System.out.println(x.recupera(1));
        System.out.println(x.recupera(2));
        System.out.println(x.recupera(3));
        System.out.println(x.recupera(4));
        System.out.println(x.recupera(5));*/
        
        System.out.print("Verificando se o deque está vazio: ");
        System.out.println(x.isEmpty());
        System.out.print("Tamanho: ");
        System.out.println(x.tamanho());
        System.out.print("Verificando se (Pedro) existe no deque: ");
        System.out.println(x.existeDado("Pedro"));
        System.out.print("Verificando se (Fulano) existe no deque: ");
        System.out.println(x.existeDado("Fulano"));
        System.out.print("Verificando se (Cicrano) existe no deque: ");
        System.out.println(x.existeDado("Cicrano"));
        System.out.print("Verificando se (João) existe no deque: ");
        System.out.println(x.existeDado("João"));
        System.out.print("Início do deque: ");
        System.out.println(x.recuperarInicio());
        System.out.print("Final do deque: ");
        System.out.println(x.recuperarFim());
        System.out.println("++++++++++++++++++++++");
        System.out.println("Alterando o início para (Lucas)...");
        x.alterarInicio("Lucas");
        System.out.println("Alterando o final para (Jonathan)...");
        x.alterarFim("Jonathan");
        
        /*System.out.println(x.recupera(1));
        System.out.println(x.recupera(2));
        System.out.println(x.recupera(3));
        System.out.println(x.recupera(4));
        System.out.println(x.recupera(5));*/
        
        System.out.print("Início do deque: ");
        System.out.println(x.recuperarInicio());
        System.out.print("Final do deque: ");
        System.out.println(x.recuperarFim());
        System.out.println("Removendo o início do deque...");
        x.removeInicio();
        System.out.println("Removendo o final do deque...");
        x.removeFim();
        
        /*System.out.println(x.recupera(1));
        System.out.println(x.recupera(2));
        System.out.println(x.recupera(3));*/
        
        
        System.out.print("Início do deque: ");
        System.out.println(x.recuperarInicio());
        System.out.print("Final do deque: ");
        System.out.println(x.recuperarFim());
        System.out.print("Verificando se (Lucas) existe no deque: ");
        System.out.println(x.existeDado("Lucas"));
        System.out.print("Verificando se (Jonathan) existe no deque: ");
        System.out.println(x.existeDado("Jonathan"));
        System.out.print("Tamanho: ");
        System.out.println(x.tamanho());
        System.out.println("++++++++++++++++++++++");
        System.out.println("Limpando o deque...");
        x.limpa();
        System.out.print("Verificando se o deque está vazio: ");
        System.out.println(x.isEmpty());
        System.out.print("Tamanho: ");
        System.out.println(x.tamanho());
        System.out.print("Início do deque: ");
        System.out.println(x.recuperarInicio());
        System.out.print("Final do deque: ");
        System.out.println(x.recuperarFim());
    }
    
}
