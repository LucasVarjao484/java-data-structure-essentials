/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package org.example.listaencadeada;

/**
 *
 * @author Pichau
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ListaEncadeada<String> x = new ListaEncadeada<>();
        
        System.out.print("Tamanho da lista: ");
        System.out.println(x.tamanho());
        
        String a = "a";
        x.adicionaFim(a);
        System.out.println("Adicionando a no fim: ");
        System.out.println(x.recupera(1));
        
        String b = "b";
        x.adicionaComeco(b);
        System.out.println("Adicionando b no começo: ");
        System.out.println(x.recupera(1));
        System.out.println(x.recupera(2));
        
        String v = "v";
        x.adicionaFim(v);
        System.out.println("adicionando v no final: ");
        System.out.println(x.recupera(1));
        System.out.println(x.recupera(2));
        System.out.println(x.recupera(3));
        
        String d = "d";
        x.adicionaComeco(d);
        System.out.println("adicionando d no começo: ");
        System.out.println(x.recupera(1));
        System.out.println(x.recupera(2));
        System.out.println(x.recupera(3));
        System.out.println(x.recupera(4));
        
        String c = "c";
        x.adicionaFim(c);
        System.out.println("adicionando c no fim: ");
        System.out.println(x.recupera(1));
        System.out.println(x.recupera(2));
        System.out.println(x.recupera(3));
        System.out.println(x.recupera(4));
        System.out.println(x.recupera(5));
        
        String e = "e";
        x.adiciona(2, e);
        System.out.println("adicionando e na posição 2: ");
        System.out.println(x.recupera(1));
        System.out.println(x.recupera(2));
        System.out.println(x.recupera(3));
        System.out.println(x.recupera(4));
        System.out.println(x.recupera(5));
        System.out.println(x.recupera(6));
        
        String f = "f";
        x.adiciona(3, f);
        System.out.println("adicionando f na posição 3: ");
        System.out.println(x.recupera(1));
        System.out.println(x.recupera(2));
        System.out.println(x.recupera(3));
        System.out.println(x.recupera(4));
        System.out.println(x.recupera(5));
        System.out.println(x.recupera(6));
        System.out.println(x.recupera(7));
        System.out.print("Tamanho da lista agora: ");
        System.out.println(x.tamanho());
        
        
        
        
        x.removeInicio();
        System.out.println("removendo o início: ");
        System.out.println(x.recupera(1));
        System.out.println(x.recupera(2));
        System.out.println(x.recupera(3));
        System.out.println(x.recupera(4));
        System.out.println(x.recupera(5));
        System.out.println(x.recupera(6));
        x.removeFim();
        System.out.println("removendo o fim: ");
        System.out.println(x.recupera(1));
        System.out.println(x.recupera(2));
        System.out.println(x.recupera(3));
        System.out.println(x.recupera(4));
        System.out.println(x.recupera(5));
        x.remove(3);
        System.out.println("removendo a posição 3");
        System.out.println(x.recupera(1));
        System.out.println(x.recupera(2));
        System.out.println(x.recupera(3));
        System.out.println(x.recupera(4));

        
        
        
        /*System.out.println(x.recupera(1));
        System.out.println(x.recupera(2));
        System.out.println(x.recupera(3));
        System.out.println(x.recupera(4));
        System.out.println(x.recupera(5));
        System.out.println(x.recupera(6));
        System.out.println(x.recupera(7));*/
        
        x.limpa();
        System.out.println("limpando a lista");
        
        x.adicionaComeco(b);
        System.out.println("Adicionando b no começo de novo: ");
        System.out.println(x.recupera(1));
        x.adicionaFim(a);
        System.out.println("Adicionando a no fim de novo: ");
        System.out.println(x.recupera(1));
        System.out.println(x.recupera(2));
        
        /*d b a v c
        d
        e
        f
        b
        a
        v
        c*/
        
    }
    
}
