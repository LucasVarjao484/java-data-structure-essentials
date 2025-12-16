/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package org.example.pilha;

/**
 *
 * @author Pichau
 */
public class JavaApplication7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pilha<String> x = new Pilha<>();
        System.out.print("Verificando se a pilha está vazia: ");
        System.out.println(x.isEmpty());
        System.out.println("Adicionando (Lucas), (Arthur) e (Douglas), respectivamente");
        x.Push("Lucas");
        x.Push("Arthur");
        x.Push("Douglas");
        System.out.print("Recuperando o topo da pilha: ");
        System.out.println(x.Top());
        System.out.print("Tamanho: ");
        System.out.println(x.tamanho());
        System.out.print("Verificando se (Fulano), está no topo: ");
        System.out.println(x.existeDadoTopo("Fulano"));
        System.out.print("Verificando se (Cicrano), está no topo: ");
        System.out.println(x.existeDadoTopo("Cicrano"));
        System.out.print("Verificando se (Douglas), está no topo: ");
        System.out.println(x.existeDadoTopo("Douglas"));
        System.out.println("+++++++++++++++++++++++++++++");
        System.out.println("Trocando o topo para (Fernando)...");
        x.Pull("Fernando");
        System.out.print("Recuperando o topo da pilha: ");
        System.out.println(x.Top());
        System.out.print("Tamanho: ");
        System.out.println(x.tamanho());
        System.out.print("Verificando se (Fulano), está no topo: ");
        System.out.println(x.existeDadoTopo("Fulano"));
        System.out.print("Verificando se (Cicrano), está no topo: ");
        System.out.println(x.existeDadoTopo("Cicrano"));
        System.out.print("Verificando se (Fernando), está no topo: ");
        System.out.println(x.existeDadoTopo("Fernando"));
        System.out.println("+++++++++++++++++++++++++++++");
        System.out.println("Removendo o topo da pilha...");
        x.Pop();
        System.out.print("Recuperando o topo da pilha: ");
        System.out.println(x.Top());
        System.out.print("Tamanho: ");
        System.out.println(x.tamanho());
        System.out.print("Verificando se (Fulano), está no topo: ");
        System.out.println(x.existeDadoTopo("Fulano"));
        System.out.print("Verificando se (Cicrano), está no topo: ");
        System.out.println(x.existeDadoTopo("Cicrano"));
        System.out.print("Verificando se (Arthur), está no topo: ");
        System.out.println(x.existeDadoTopo("Arthur"));
        System.out.print("Verificando se a pilha está vazia: ");
        System.out.println(x.isEmpty());
        
        System.out.println("Limpando...");
        System.out.println("+++++++++++++++++++++++++++++");
        x.limpa();
        System.out.print("Verificando se a pilha está vazia: ");
        System.out.println(x.isEmpty());
        System.out.print("Recuperando o topo da pilha: ");
        System.out.println(x.Top());
        System.out.print("Tamanho: ");
        System.out.println(x.tamanho());
        System.out.println("+++++++++++++++++++++++++++++");
        System.out.println("Adicionando (Juan), (Matheus) e (Jonathan), respectivamente");
        x.Push("Juan");
        x.Push("Matheus");
        x.Push("Jonathan");
        System.out.print("Recuperando o topo da pilha: ");
        System.out.println(x.Top());
        System.out.print("Tamanho: ");
        System.out.println(x.tamanho());
        System.out.print("Verificando se (Fulano), está no topo: ");
        System.out.println(x.existeDadoTopo("Fulano"));
        System.out.print("Verificando se (Cicrano), está no topo: ");
        System.out.println(x.existeDadoTopo("Cicrano"));
        System.out.print("Verificando se (Jonathan), está no topo: ");
        System.out.println(x.existeDadoTopo("Jonathan"));
        System.out.println("+++++++++++++++++++++++++++++");
        System.out.println("Trocando o topo para (Lucas)...");      
        x.Pull("Lucas");
        System.out.print("Recuperando o topo da pilha: ");
        System.out.println(x.Top());
        System.out.print("Tamanho: ");
        System.out.println(x.tamanho());
        System.out.print("Verificando se (Fulano), está no topo: ");
        System.out.println(x.existeDadoTopo("Fulano"));
        System.out.print("Verificando se (Cicrano), está no topo: ");
        System.out.println(x.existeDadoTopo("Cicrano"));
        System.out.print("Verificando se (Lucas), está no topo: ");
        System.out.println(x.existeDadoTopo("Lucas"));
        System.out.println("Removendo o topo da pilha...");
        System.out.println("+++++++++++++++++++++++++++++");
        x.Pop();
        System.out.print("Recuperando o topo da pilha: ");
        System.out.println(x.Top());
        System.out.print("Tamanho: ");
        System.out.println(x.tamanho());
        System.out.print("Verificando se (Fulano), está no topo: ");
        System.out.println(x.existeDadoTopo("Fulano"));
        System.out.print("Verificando se (Cicrano), está no topo: ");
        System.out.println(x.existeDadoTopo("Cicrano"));
        System.out.print("Verificando se (Matheus), está no topo: ");
        System.out.println(x.existeDadoTopo("Matheus"));
        System.out.print("Verificando se a pilha está vazia: ");
        System.out.println(x.isEmpty());
    }
    
}
