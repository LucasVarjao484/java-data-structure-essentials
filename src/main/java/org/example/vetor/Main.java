/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package org.example.vetor;

/**
 *
 * @author Pichau
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //APENAS UM EXEMPLO, PASSANDO STRING COMO PARÂMETRO, PARA DEMONSTRAÇÃO DOS MÉTODOS
        
        String nome = "Pedro";
        String nome2 = "Carlos";
        String nome3 = "João";
        String nome4 = "Lucas";
        String nome5 = "Paulo";
        String nome6 = ("Jorge");

        Vetor<String> v = new Vetor(4);
        
        System.out.print("Verificação se o vetor está vazio: ");
        System.out.println(v.vazio());
        System.out.println("-------------------------------------");
        System.out.print("Tamanho do vetor atual: ");
        System.out.println(v.tamanho());
        System.out.println("-------------------------------------");
        System.out.println("Adicionando no fim do vetor...");       
        v.adicionaFim(nome);
        v.adicionaFim(nome2); 
        System.out.println("Vetor Atual:");
        System.out.println(v);
        System.out.println("-------------------------------------");
        System.out.print("Verificação se existe algo no indice 2 do vetor: ");
        System.out.println(v.existeDado(2));
        System.out.println("-------------------------------------");
        v.adiciona(1, nome3);
        System.out.println("Vetor após adicionar por posição:");
        System.out.println(v);
        System.out.println("-------------------------------------");
        v.adicionaInicio(nome4);
        System.out.println("Vetor após adicionar no início:");
        System.out.println(v);
        System.out.println("-------------------------------------");
        System.out.print("Verificação se existe algo no índice 3: ");
        System.out.println(v.existeDado(3));
        System.out.println("-------------------------------------");
        System.out.print("Verificação se existe algo no índice 5: ");
        System.out.println(v.existeDado(5));
        System.out.println("-------------------------------------");
        System.out.print("Verificação se o vetor está vazio: ");
        System.out.println(v.vazio());
        System.out.println("-------------------------------------");
        System.out.println("Vetor Atual:");
        System.out.println(v);
        System.out.println("-------------------------------------");
        v.adicionaFim(nome5);
        System.out.println("Vetor após adicionar no final e garantir espaço:");
        System.out.println(v);
        System.out.println("-------------------------------------");
        v.adicionaInicio(nome6);
        System.out.println("Vetor após adicionar no ínicio");
        System.out.println(v);
        System.out.println("-------------------------------------");
        System.out.print("Recuperação de um dado no vetor pelo índice 7: ");
        System.out.println(v.recupera(7));
        System.out.println("-------------------------------------");
        System.out.print("Recuperação de um dado no vetor pelo índice 8: ");
        System.out.println(v.recupera(8));
        System.out.println("-------------------------------------");
        System.out.print("Recuperação de um dado no vetor pelo índice 3: ");
        System.out.println(v.recupera(3));
        System.out.println("-------------------------------------");
        System.out.println("Remoção do índice 5 do vetor:");
        v.remove(5);
        System.out.println(v);
        System.out.println("-------------------------------------");
        System.out.print("Remoção do último item do vetor:");
        v.removeFim();
        System.out.println("-------------------------------------");
        System.out.println("Remoção do primeiro item do vetor:");
        v.removeInicio();
        System.out.println(v);
        System.out.println("-------------------------------------");
        System.out.print("Tamanho atual do vetor: ");
        System.out.println(v.tamanho());
        System.out.println("-------------------------------------");
        System.out.println("Limpando o vetor:");
        v.limpa();
        System.out.println(v);
    }   
}
