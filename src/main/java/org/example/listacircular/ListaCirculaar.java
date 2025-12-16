/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.example.listacircular;

/**
 *
 * @author Pichau
 */
public class ListaCirculaar<T> {
    private Celula primeira;
    private Celula ultima;
    private int totalDeElementos;

    public ListaCirculaar() {
        this.primeira = null;
        this.ultima = null;
        this.totalDeElementos = 0;
    }
    
    public void adicionaComeco(T elemento) {
        Celula nova = new Celula(this.ultima, elemento, this.primeira);
        if(this.totalDeElementos == 0) {
            primeira = ultima = nova;
            nova.setAnterior(ultima);
            nova.setProxima(primeira);
            this.totalDeElementos++;
        }
        else {
            nova.setAnterior(ultima);
            nova.setProxima(primeira);
            this.primeira.setAnterior(nova);
            this.primeira = nova;
            this.ultima.setProxima(primeira);
            this.totalDeElementos++;
        }  
    }
    
    public void removeFim() {
        if(this.totalDeElementos == 0) {
            System.out.println("A lista está vazia");
        }
        else if(this.primeira == this.ultima) {
            this.primeira = this.ultima = null;
            this.totalDeElementos -= 1;
        }
        else {
            Celula x = (Celula)recupera(this.totalDeElementos - 1);
            this.ultima = x;
            x.setProxima(this.primeira);
            this.primeira.setAnterior(x);
            this.totalDeElementos -= 1;
        }
    }
    
    public Celula recupera(int posicao) {
        try {
            if (posicao == 0) {
                System.out.println("Posição 0 não existe");
                return null;
            }
            if(posicao > this.totalDeElementos) {
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
    
    public void TestandoAntProx(int posicao) {
        try {
            if(this.totalDeElementos == 0) {
            System.out.println("A lista está vazia!");
        }
        else if(posicao > this.totalDeElementos) {
            System.out.println("Posição inválida, maior que o tamanho da lista!");
        }
        else {
        Celula x = (Celula)recupera(posicao);
        System.out.print("Anterior: ");
        System.out.println(x.getAnterior());
        System.out.print("Próxima: ");
        System.out.println(x.getProxima());
        }
        } catch(java.lang.NullPointerException exception) {
            System.out.println("Posição inválida");
        }
        
    }
}
