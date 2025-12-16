/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package org.example.fila;

/**
 *
 * @author Pichau
 */
public class JavaApplication6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Fila<String> x = new Fila<>();
        System.out.print("Verificando se a fila está vazia: ");
        System.out.println(x.isEmpty());
        System.out.print("Tamanho: ");
        System.out.println(x.tamanho());
        System.out.println("-----------------");
        System.out.println("adicionando (Pedro), (Carlos) e (João), respectivamente...");
        x.inserir("Pedro");
        x.inserir("Carlos");
        x.inserir("João");
        
        /*System.out.println(x.recupera(1));
        System.out.println(x.recupera(2));
        System.out.println(x.recupera(3));*/
        
        System.out.print("Verificando se a fila está vazia: ");
        System.out.println(x.isEmpty());
        System.out.print("Tamanho: ");
        System.out.println(x.tamanho());
        System.out.print("Recuperando o primeiro elemento: ");
        System.out.println(x.recuperar());
        System.out.print("Verificando se (João) existe no início: ");
        System.out.println(x.existeDadoInicio("João"));
        System.out.print("Verificando se (Pedro) exite no início: ");
        System.out.println(x.existeDadoInicio("Pedro"));
        System.out.println("-----------------");
        System.out.println("removendo...");
        x.remover();
        
        /*System.out.println(x.recupera(1));
        System.out.println(x.recupera(2));
        System.out.println(x.recupera(3));*/
        
        System.out.print("Recuperando o primeiro elemento: ");
        System.out.println(x.recuperar());
        x.alterar("Matheus");
        System.out.println("-----------------");
        System.out.println("Alterando o topo (Carlos) para (Matheus)...");
        
        /*System.out.println(x.recupera(1));
        System.out.println(x.recupera(2));*/
        
        System.out.print("Verificando se (João) existe no início: ");
        System.out.println(x.existeDadoInicio("João"));
        System.out.print("Verificando se (Pedro) existe no início: ");
        System.out.println(x.existeDadoInicio("Pedro"));
        System.out.print("Verificando se (Matheus) existe no início: ");
        System.out.println(x.existeDadoInicio("Matheus"));
        System.out.print("Recuperando o primeiro elemento: ");
        System.out.println(x.recuperar());
        System.out.println("-----------------");
        
        System.out.println("Limpando...");
        x.limpa();
        
        /*System.out.println(x.recupera(1));
        System.out.println(x.recupera(2));*/
        
        System.out.print("Verificando se (Matheus) existe no início: ");
        System.out.println(x.existeDadoInicio("Matheus"));
        System.out.print("Recuperando o primeiro elemento: ");
        System.out.println(x.recuperar());
        System.out.println("-----------------");
        System.out.println("Readicionando elementos... (Lucas) e (Thiago) respectivamente");
        x.inserir("Lucas");
        x.inserir("Thiago");
        
        /*System.out.println(x.recupera(1));
        System.out.println(x.recupera(2));*/
        
        System.out.print("Verificando se (Thiago) existe no início: ");
        System.out.println(x.existeDadoInicio("Thiago"));
        System.out.print("Verificando se (Lucas) existe no início: ");
        System.out.println(x.existeDadoInicio("Lucas"));
        System.out.print("Recuperando o primeiro elemento: ");
        System.out.println(x.recuperar());
    }
    
}
