/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.example.arvorebinariagenerica;

/**
 *
 * @author Pichau
 */
public class Arvore <T> {
    No raiz;
    
    
    boolean insere(No pai, T info, String tipoFilho) {
       No aux;
       boolean ok = false;
       if(pai == null) {
           aux = new No(info);
           raiz = aux;
           ok = true;
       }
       else{
           if((tipoFilho.equalsIgnoreCase("E")) && (pai.temFilhoEsq())) {
               System.out.println("ERRO: Este Nó já possui filho esquerdo !!!");
               ok = false;
           }
           if((tipoFilho.equalsIgnoreCase("D")) && (pai.temFilhoDir())) {
               System.out.println("ERRO: Este Nó já possui filho direito !!!");
               ok = false;
               return false;
           }
           aux = new No(info, pai);
           if(tipoFilho.equalsIgnoreCase("E")){
               pai.inserirFilhoEsq(aux);
           }
           else {
               pai.inserirFilhoDir(aux);
               ok = true;
           }
           
       }return ok;
   }
    
    /*boolean pesquisa(No inicio, String procurado){
        if(inicio != null) {
            if(procurado.equalsIgnoreCase(inicio.nome)) {
                //achou = inicio;
                return true;
            }
            pesquisa(inicio.filhoEsq, procurado);
            pesquisa(inicio.filhoDir, procurado);
        }
        return false;
    }*/
    
    boolean pesquisa(No inicio, T procurado){
        if(inicio != null) {
            if(procurado == inicio.elemento) {
                return true;
            }
            boolean encontradoEsquerda = pesquisa(inicio.filhoEsq, procurado);
            boolean encontradoDireita = pesquisa(inicio.filhoDir, procurado);
            return encontradoEsquerda || encontradoDireita;
        }
        return false;
    }
    
    public void printTree() {
        printNode(raiz, 0);
    }

    private void printNode(No node, int depth) {
        if (node != null) {
            for (int i = 0; i < depth; i++) {
                System.out.print(" ");
            }
            System.out.println(node.elemento);
            printNode(node.filhoEsq, depth + 1);
            printNode(node.filhoDir, depth + 1);
        }
    }
    
    void excluirNo(No node, String tipoFilho, int qtdFilhos) {
        if(qtdFilhos == 0) {
            No x;
            x = node.pai;
            if(tipoFilho == "Esq"){
                x.filhoEsq = null;
            } 
            else{
                x.filhoDir = null;
            }
        }
        else if(qtdFilhos == 1) {
            if(tipoFilho == "Esq"){
                No x;
                x = node.pai;
                if(node.filhoDir == null) {
                    x.filhoEsq = node.filhoEsq;
                }
                else{
                    x.filhoEsq = node.filhoDir;
                }
            } 
            else{
                No x;
                x = node.pai;
                if(node.filhoDir == null) {
                    x.filhoDir = node.filhoEsq;
                }
                else{
                    x.filhoDir = node.filhoDir;
                }
            }
            
        }
        else if(qtdFilhos == 2) {
            System.out.print("Erro! não é possível remover um nó com dois filhos");
            System.out.println("Essa não é uma árvore binária de busca.");
        }
    }
    
    
    void imprimirPreOrdem() {
        imprimirPreOrdemAux(raiz);
        System.out.println(" ");
    }
    
    private void imprimirPreOrdemAux(No noAtual) {
        if (noAtual != null) {
            System.out.print(noAtual.elemento + " ");
            imprimirPreOrdemAux(noAtual.filhoEsq);
            imprimirPreOrdemAux(noAtual.filhoDir);
        }
    }
    
    void imprimirInOrdem() {
        imprimirInOrdemAux(raiz);
        System.out.println(" ");
    }
    
    private void imprimirInOrdemAux(No noAtual) {
        if (noAtual != null) {
            imprimirInOrdemAux(noAtual.filhoEsq);
            System.out.print(noAtual.elemento + " ");
            imprimirInOrdemAux(noAtual.filhoDir);
        }
    }
    
    
    void imprimirPosOrdem() {
        imprimirPosOrdemAux(raiz);
        System.out.println("");
    }
    
    private void imprimirPosOrdemAux(No noAtual) {
        if (noAtual != null) {
            imprimirPosOrdemAux(noAtual.filhoEsq);
            imprimirPosOrdemAux(noAtual.filhoDir);
            System.out.print(noAtual.elemento + " ");
        }
    }

    
}
