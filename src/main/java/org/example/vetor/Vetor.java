/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.example.vetor;

import java.util.ArrayList;
import java.util.Arrays;
import java.lang.reflect.Array;

/**
 *
 * @author Pichau
 */
public class Vetor<T> {
    private T[] vetor;
    private int qntElementos = 0;

    public Vetor(T[] vetor, int qntElementos) {
        this.vetor = vetor;
        this.qntElementos = qntElementos;
    }
    
    public Vetor(int tam) {
        vetor = (T[]) new Object[tam];
        tam = this.qntElementos ;
    }
    
    public void adicionaFim(T elemento) {
        this.espaco();
        for(int i = 0; i < vetor.length; i++) {
            if(vetor[i] == null) {
                vetor[i] = elemento;
                qntElementos++;
                break;
            }
        }
    }    
    
    public void adiciona(int posicao, T elemento) {
        this.espaco();
        try {
        for(int i = qntElementos - 1; i >= posicao; i -= 1) {
            vetor[i+1] = vetor[i];
        }
        vetor[posicao] = elemento;
        qntElementos++;
        }
        catch(ArrayIndexOutOfBoundsException exception) {
            System.out.println("Posição inválida do vetor, fora do comprimento");
        }
    }
    
    public void adicionaInicio(T elemento) {
        this.espaco();
        try {
        for(int i = qntElementos - 1; i >= 0; i -= 1) {
            vetor[i+1] = vetor[i];
        }
        vetor[0] = elemento;
        qntElementos++;
        }
        catch(ArrayIndexOutOfBoundsException exception) {
            System.out.println("Posição inválida do vetor, fora do comprimento");
        }
    }
    
     public boolean existeDado(int posicao) {
        try {
        if (vetor[posicao] == null) {
            System.out.print("Posição nula ! ");
            return false;
        }
        System.out.print("Existe o dado na posição ! ");
        return true;
        }
        catch(ArrayIndexOutOfBoundsException exception) {
            System.out.print("Posição inválida do vetor, fora do comprimento ! ");
        }
        return false;
    }
     
    public boolean vazio() {
         for(int i = 0; i < vetor.length; i++) {
            if(vetor[i] != null) {
                return false;
            }
        }
        return true;
    }
    
    public int tamanho() {
        return qntElementos;
    }
    
    public void limpa() {   
        for(int i = 0; i < vetor.length; i++) {
            vetor[i] = null;
        }
    }
    
    public void espaco() {
        //vetor = (T[]) new Object[tam];
        if(qntElementos == vetor.length) {
            T[] novaArray;
            novaArray = (T []) new Object[vetor.length * 2];
            for(int i = 0; i < vetor.length; i++) {
                novaArray[i] = vetor[i];
            }
            vetor = novaArray;
        }
    }
    
    public T recupera(int posicao) {
        try {
        if (vetor[posicao] == null) {
            System.out.print("Posição nula ! ");
            return null;
        }
        return vetor[posicao];
        }
        catch(ArrayIndexOutOfBoundsException exception) {
            System.out.print("Posição inválida do vetor, fora do comprimento ! ");
        }
        return null;
    }
    
    public void remove(int posicao) {
        try {
            if(vetor[posicao] == null) {
                System.out.println("A posição solicitada está vazia !");
            }
            else {
                /*for(int i = posicao; i < qntElementos - 1; i++) {
                    vetor[i] = vetor[i + 1];
                }*/
                vetor[posicao] = null;
                qntElementos--;
            }
        }
        catch(ArrayIndexOutOfBoundsException exception) {
            System.out.println("Posição inválida do vetor, fora do comprimento");
        }
    }
    
    public void removeInicio() {
        try {
            if(vetor[0] == null) {
                System.out.println("A primeira posição está vazia !");
            }
            else {
                vetor[0] = null;
                qntElementos--;
            }
        }
        catch(ArrayIndexOutOfBoundsException exception) {
            System.out.println("Posição inválida do vetor, fora do comprimento");
        }
    }
    
    public void removeFim() {
        try {
            if(vetor[vetor.length - 1] == null) {
                System.out.println("A última posição está vazia !");
            }
            else {
                vetor[vetor.length - 1] = null;
                qntElementos--;
            }
        }
        catch(ArrayIndexOutOfBoundsException exception) {
            System.out.println("Posição inválida do vetor, fora do comprimento");
        }
    }
    
    public String toString() {
        if(qntElementos == 0) {
           return"[]";
        }
        
        StringBuilder builder = new StringBuilder();
        builder.append(Arrays.toString(vetor));
        
        /*for(int i = 0; i < qntElementos - 1; i++) {
            builder.append(this.vetor[i]);
            builder.append(", ");
        }
        
        builder.append(this.vetor[qntElementos - 1]);
        builder.append("]");*/
        
        return builder.toString();
    }
}
