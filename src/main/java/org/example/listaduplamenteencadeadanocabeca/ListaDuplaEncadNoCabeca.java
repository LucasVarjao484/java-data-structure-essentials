/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.example.listaduplamenteencadeadanocabeca;

/**
 *
 * @author Pichau
 */
public class ListaDuplaEncadNoCabeca<T> {
    private Celula primeira;
    private Celula ultima;
    private final Celula cabeca;
    private int totalDeElementos;

    public ListaDuplaEncadNoCabeca(T cabeca) {
        this.primeira = null;
        this.ultima = null;
        Celula cabeca2 = new Celula(this.ultima, cabeca, this.primeira);
        this.cabeca = cabeca2;
        this.totalDeElementos = 0;
    }
  
    public void adicionaComeco(T elemento) {        
        if(this.totalDeElementos == 0) {
            Celula nova = new Celula(this.cabeca, elemento, this.cabeca);
            primeira = ultima = nova;
            this.cabeca.setAnterior(this.ultima);
            this.cabeca.setProxima(this.primeira);
            this.totalDeElementos++;
        }
        else {
            Celula nova = new Celula(this.cabeca, elemento, this.primeira);
            this.primeira.setAnterior(nova);
            this.primeira = nova;
            this.cabeca.setAnterior(this.ultima);
            this.cabeca.setProxima(this.primeira);
            this.totalDeElementos++;
        }  
    }
    
    public int tamanho() {
        return this.totalDeElementos;
    }
    
    public void adicionaFim(T elemento) {
        if(this.totalDeElementos == 0) {
            Celula nova = new Celula(this.cabeca, elemento, this.cabeca);
            primeira = ultima = nova;
            this.cabeca.setAnterior(ultima);
            this.cabeca.setProxima(primeira);
            this.totalDeElementos++;
        }
        else {
            Celula nova = new Celula(this.ultima, elemento, this.cabeca);
            this.ultima.setProxima(nova);
            this.ultima = nova;
            this.cabeca.setAnterior(ultima);
            this.cabeca.setProxima(primeira);
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
                Celula nova = new Celula(x, elemento, y);
                y.setAnterior(nova);
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
    
    /*public boolean existeDado(T elemento) {
        //Não completo
        Celula nova = new Celula(elemento);
        switch (this.totalDeElementos) {
            case 0:
                System.out.println("Deu 1");
                return false;
            case 1:
                if(this.primeira.equals(nova)) {
                    return true;
                }
                else {
                    System.out.println("deu 2");
                    return false;
                }
            default:
                Celula nova3 = this.primeira;
                int i = 0;
                while(i < this.totalDeElementos){
                    if(nova.equals(nova3)) {
                        return true;
                    }
                    nova3 = nova3.getProxima();
                    i++;
                }
                System.out.println("deu 3");
                return false;
        }
    }*/
    
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
            Celula z = y.getProxima();
            z.setAnterior(x);
            this.totalDeElementos--;
        }
    }

    public void removeInicio() {
        if(this.totalDeElementos == 0) {
            System.out.println("A lista está vazia");
        }
        else if(this.primeira == this.ultima) {
            this.primeira = this.ultima = null;
            this.cabeca.setAnterior(ultima);
            this.cabeca.setProxima(primeira);
            this.totalDeElementos -= 1;
        }
        else {
            this.primeira = this.primeira.getProxima();
            this.primeira.setAnterior(this.cabeca);
            this.cabeca.setAnterior(ultima);
            this.cabeca.setProxima(primeira);
            this.totalDeElementos -= 1;
        }
    }

    public void removeFim() {
        if(this.totalDeElementos == 0) {
            System.out.println("A lista está vazia");
        }
        else if(this.primeira == this.ultima) {
            this.primeira = this.ultima = null;
            this.cabeca.setAnterior(ultima);
            this.cabeca.setProxima(primeira);
            this.totalDeElementos -= 1;
        }
        else {
            Celula x = (Celula)recupera(this.totalDeElementos - 1);
            this.ultima = x;
            x.setProxima(this.cabeca);
            this.cabeca.setAnterior(ultima);
            this.cabeca.setProxima(primeira);
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
    
    public void TestandoCabeca() {
        System.out.print("A cabeça é: ");
        System.out.println(this.cabeca);
        System.out.print("Anterior da cabeça: ");
        System.out.println(this.cabeca.getAnterior());
        System.out.print("Próximo da cabeça: ");
        System.out.println(this.cabeca.getProxima());
    }
}
