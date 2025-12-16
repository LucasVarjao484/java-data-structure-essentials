/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.example.fila;

/**
 *
 * @author Pichau
 */
public class Fila<T> {
    private Celula primeira;
    private Celula ultima;
    private int totalDeElementos;

    public Fila() {
        this.primeira = null;
        this.ultima = null;
        this.totalDeElementos = 0;
    }
   
    
    public int tamanho() {
        return this.totalDeElementos;
    }
    
    public void inserir(T elemento) {
        Celula nova = new Celula(elemento);
        if(this.totalDeElementos == 0) {
            primeira = ultima = nova;
            this.totalDeElementos++;
        }
        else {
            this.ultima.setProxima(nova);
            this.ultima = nova;
            this.totalDeElementos++;
        }
    }
    
    public Celula recuperar() {
        return this.primeira;
    }
    
    public boolean existeDadoInicio(T elemento) {
        Celula nova = new Celula(elemento);
        switch (this.totalDeElementos) {
            case 0:
                return false;
            case 1:
                if(this.primeira.getElemento().equals(nova.getElemento())) {
                    return true;
                }
                else {
                    return false;
                }
            default:
                if(this.primeira.getElemento().equals(nova.getElemento())) {
                    return true;
                }
                else {
                    return false;
                }
        }
    }
    
    public void remover() {
        if(this.totalDeElementos == 0) {
            System.out.println("A lista está vazia");
        }
        else if(this.primeira == this.ultima) {
            this.primeira = this.ultima = null;
            this.totalDeElementos -= 1;
        }
        else {
            this.primeira = this.primeira.getProxima();
            this.totalDeElementos -= 1;
        }
    }
    
    public void limpa() {
        if(this.totalDeElementos == 0) {
            System.out.println("A lista já esta limpa !");
        }
        else {
            Celula nova5 = this.primeira;
            Celula armaz = this.primeira;
            int i = 0;
            while(i < this.totalDeElementos){
                nova5 = armaz;
                armaz = nova5.getProxima();
                nova5 = null;
                i++;
            }
            this.primeira = null;
            this.ultima = null;
            this.totalDeElementos = 0;
        }
    }
    
    public boolean isEmpty() {
        if(this.totalDeElementos == 0) {
            return true;
        }
        else {
            return false;
        }
    }
    
    public void alterar(T elemento) {
        Celula x = this.primeira.getProxima();
        Celula y = new Celula(elemento);
        this.primeira = y;
        this.primeira.setProxima(x);
    }
    
    
    public Celula recupera(int posicao) {
        try {
            if(posicao > this.totalDeElementos || posicao == 0) {
            System.out.println("Essa posição não existe ! fora do comprimento");
            return null;
            }
            if(this.totalDeElementos == 0) {
                System.out.println("A lista encadeada atualmente é nula !");
                return null;
            }
            if(posicao == 1) {
                return this.primeira;
            }
            if(posicao == this.totalDeElementos) {
                return this.ultima;
            }
            else {            
                Celula nova2 = this.primeira.getProxima();
                int i = 2;
                while(i < posicao){
                   nova2 = nova2.getProxima();
                   i++;
                }
                return nova2;
            }
        }
        catch(java.lang.NullPointerException exception) {
            return null;
        }
    }
    
}
