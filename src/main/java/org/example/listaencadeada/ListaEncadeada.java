/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.example.listaencadeada;

/**
 *
 * @author Pichau
 *
 */
public class ListaEncadeada<T>{
    private Celula primeira;
    private Celula ultima;
    private int totalDeElementos;

    public ListaEncadeada() {
        this.primeira = null;
        this.ultima = null;
        this.totalDeElementos = 0;
    }
  
    public void adicionaComeco(T elemento) {
        Celula nova = new Celula(this.primeira, elemento);
        if(this.totalDeElementos == 0) {
            primeira = ultima = nova;
            this.totalDeElementos++;
        }
        else {
            nova.setProxima(primeira);
            
            this.primeira = nova;
            this.totalDeElementos++;
        }  
    }
    
    public int tamanho() {
        return this.totalDeElementos;
    }
    
    public void adicionaFim(T elemento) {
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
    
    public void adiciona(int posicao, T elemento) {
        try {
            this.totalDeElementos++;
            if(posicao == 1) {
                System.out.println("Para adicionar na primeira posição, utilize o método adicionaInicio!");
                this.totalDeElementos--;
            }
            else if(posicao == this.totalDeElementos) {
                System.out.println("Para adicionar na última posição, utilize o método adicionaFim!");
                this.totalDeElementos--;
            }
            else {
                //this.totalDeElementos++;
                Celula x = (Celula)recupera(posicao -1 );
                Celula y = (Celula)recupera(posicao  );
                Celula nova = new Celula(y, elemento);
                x.setProxima(nova);
                //this.totalDeElementos++;
            }           
        }
        catch(java.lang.NullPointerException exception) {
            System.out.println("Não existe posição zero !");
        }
    }
    
    public Celula recupera(int posicao) {
        try {
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
    
    public boolean existeDado(T elemento) {
        //Não completo
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
                Celula nova3 = this.primeira;
                int i = 0;
                while(i < this.totalDeElementos){
                    if(nova.getElemento().equals(nova3.getElemento())) {
                        return true;
                    }
                    nova3 = nova3.getProxima();
                    i++;
                }
                return false;
        }
    }
    
    public void remove(int posicao) {
        if(this.totalDeElementos == 0) {
            System.out.println("A lista está vazia");
        }
        else if(posicao == 1) {
            System.out.println("Para remover na primeira posição, utilize o método removeInicio!");
            //this.totalDeElementos--;
        }
        else if(posicao == this.totalDeElementos) {
            System.out.println("Para remover na última posição, utilize o método removeFim!");
            //this.totalDeElementos--;
        }
        else {
            Celula x = (Celula)recupera(posicao - 1);
            Celula y = (Celula)recupera(posicao);
            x.setProxima(y.getProxima());
            this.totalDeElementos--;
        }
    }

    public void removeInicio() {
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
            x.setProxima(null);
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
    
    private T Recupera2(int posicao) {
        //Em Testes
         if (this.totalDeElementos == 0) {
            
            System.out.println("A lista está vazia!!");
            return null;
            
        } else if (posicao < 0 || posicao >= this.totalDeElementos) {
            
            System.out.println("A Posição " + posicao + " é Inválida!");
            return null;
            
        } else {
            
            Iterador it = new Iterador(this.primeira);
            int i = 0;
            while (it.hasNext()) {
                if (i != posicao) {
                    it.next();
                    i++;
                } else {
                    break;
                }
            }
            
            return (T) it.getAtual();
        }
    }
}
