/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package org.example.listaduplamenteencadeada;

/**
 *
 * @author Pichau
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ListaDuplaEncad<String> x = new ListaDuplaEncad<>();
        x.adicionaComeco("a");
        x.adicionaFim("c");
        x.adiciona(2, "b");
        x.adiciona(2, "d");
        x.adiciona(4, "e");
        System.out.println(x.recupera(1));
        System.out.println(x.recupera(2));
        System.out.println(x.recupera(3));
        System.out.println(x.recupera(4));
        System.out.println(x.recupera(5));
        System.out.println("+++++++++++++++++++++");
        x.removeInicio();
        x.removeFim();
        System.out.println(x.recupera(1));
        System.out.println(x.recupera(2));
        System.out.println(x.recupera(3));
        System.out.println("+++++++++++++++++++++");
        x.remove(2);
        //x.adicionaComeco("qualqeur coisa");
        System.out.println(x.recupera(1));
        System.out.println(x.recupera(2));
        System.out.println("+++++++++++++++++++++");
        x.limpa();
        System.out.println(x.recupera(1));
        x.adicionaComeco("A");
        x.adicionaFim("C");
        x.adiciona(2, "B");
        x.adicionaFim("D");
        System.out.println(x.recupera(1));
        System.out.println(x.recupera(2));
        System.out.println(x.recupera(3));
        System.out.println(x.recupera(4));
        System.out.println("+++++++++++++++++++++");
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
        
        System.out.println("+++++++++++++++++++++");
        System.out.println("Com objetos agora:");        
        ListaDuplaEncad<Aluno> y = new ListaDuplaEncad<>();
        Aluno a = new Aluno("Pedro", 23);
        Aluno b = new Aluno("Carlos", 32);
        Aluno c = new Aluno("Lucas", 17);
        Aluno d = new Aluno("José", 24);
        y.adicionaComeco(a);
        y.adicionaFim(c);
        y.adiciona(2, b);
        y.adiciona(3, d);
        System.out.println(y.recupera(1));
        System.out.println(y.recupera(2));
        System.out.println(y.recupera(3));
        System.out.println(y.recupera(4));
         System.out.println("+++++++++++++++++++++");
        System.out.println("Testando celula anterior e proxima por posição: ");
        System.out.println(" ");
        y.TestandoAntProx(0);
        System.out.println(" ");
        y.TestandoAntProx(1);
        System.out.println(" ");
        y.TestandoAntProx(2);
        System.out.println(" ");
        y.TestandoAntProx(3);
        System.out.println(" ");
        y.TestandoAntProx(4);
    }
    
}
