/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.example.arvorebinariadebusca;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Pichau
 */
public class Arvore {
    No raiz;

    boolean insere(int valor) {
        if (raiz == null) {
            raiz = new No(valor);
            return true;
        }

        return insereRecursivo(raiz, valor);
    }

    private boolean insereRecursivo(No node, int valor) {
        if (valor == node.valor) {
            return false;
        }

        if (valor < node.valor) {
            if (node.filhoEsq == null) {
                node.filhoEsq = new No(valor);
                node.filhoEsq.pai = node;
                return true;
            } else {
                return insereRecursivo(node.filhoEsq, valor);
            }
        } else {
            if (node.filhoDir == null) {
                node.filhoDir = new No(valor);
                node.filhoDir.pai = node;
                return true;
            } else {
                return insereRecursivo(node.filhoDir, valor);
            }
        }
    }

    boolean pesquisa(int valor) {
        return pesquisaRecursivo(raiz, valor);
    }

    private boolean pesquisaRecursivo(No node, int valor) {
        if (node == null) {
            return false;
        }

        if (node.valor == valor) {
            return true;
        } else if (valor < node.valor) {
            return pesquisaRecursivo(node.filhoEsq, valor);
        } else {
            return pesquisaRecursivo(node.filhoDir, valor);
        }
    }

    public void printTree() {
        printNode(raiz, 0);
    }

    private void printNode(No node, int depth) {
        if (node != null) {
            for (int i = 0; i < depth; i++) {
                System.out.print(" ");
            }
            System.out.println(node.valor);
            printNode(node.filhoEsq, depth + 1);
            printNode(node.filhoDir, depth + 1);
        }
    }
    
    
    
    

    public void informaGrauNos() {
    informaGrauNosRecursivo(raiz);
}

private void informaGrauNosRecursivo(No node) {
    if (node != null) {
        int grau = 0;
        if (node.filhoEsq != null) {
            grau++;
        }
        if (node.filhoDir != null) {
            grau++;
        }
        System.out.println("O nó " + node.valor + " tem grau " + grau);
        informaGrauNosRecursivo(node.filhoEsq);
        informaGrauNosRecursivo(node.filhoDir);
    }
}




    public int grau() {
    return grauRecursivo(raiz);
}

private int grauRecursivo(No node) {
    if (node == null) {
        return 0;
    }

    int grau = Math.max(grauRecursivo(node.filhoEsq), grauRecursivo(node.filhoDir));
    if (node.filhoEsq != null && node.filhoDir != null) {
        grau = Math.max(grau, 2);
    } else if (node.filhoEsq != null || node.filhoDir != null) {
        grau = Math.max(grau, 1);
    }

    return grau;
}



 public int profundidadeNo(int valor) {
        return profundidadeNoRecursivo(raiz, valor, 0);
    }

    private int profundidadeNoRecursivo(No node, int valor, int depth) {
        if (node == null) {
            return -1;
        }

        if (node.valor == valor) {
            return depth;
        } else if (valor < node.valor) {
            return profundidadeNoRecursivo(node.filhoEsq, valor, depth + 1);
        } else {
            return profundidadeNoRecursivo(node.filhoDir, valor, depth + 1);
        }
    }

    

    public int profundidadeArvore() {
        return profundidadeArvoreRecursivo(raiz);
    }

    private int profundidadeArvoreRecursivo(No node) {
        if (node == null) {
            return 0;
        } else {
            int profundidadeEsq = profundidadeArvoreRecursivo(node.filhoEsq);
            int profundidadeDir = profundidadeArvoreRecursivo(node.filhoDir);

            if (profundidadeEsq > profundidadeDir) {
                return profundidadeEsq + 1;
            } else {
                return profundidadeDir + 1;
            }
        }
    }
    
    
    

    public void printAlturas() {
    informaAlturaNos();
    printAlturasRecursivo(raiz);
}

private void printAlturasRecursivo(No node) {
    if (node != null) {
        System.out.println("Valor: " + node.valor + " Altura: " + node.altura);
        printAlturasRecursivo(node.filhoEsq);
        printAlturasRecursivo(node.filhoDir);
    }
}


    public void informaAlturaNos() {
    informaAlturaNo(raiz);
}

private int informaAlturaNo(No node) {
    if (node == null) {
        return -1;
    }

    int alturaEsq = informaAlturaNo(node.filhoEsq);
    int alturaDir = informaAlturaNo(node.filhoDir);

    int alturaAtual = 1 + Math.max(alturaEsq, alturaDir);
    node.altura = alturaAtual;

    return alturaAtual;
}


public int altura() {
    return alturaRecursivo(raiz);
}

 int alturaRecursivo(No node) {
    if (node == null) {
        return 0;
    } else {
        int alturaEsq = alturaRecursivo(node.filhoEsq);
        int alturaDir = alturaRecursivo(node.filhoDir);
        return 1 + Math.max(alturaEsq, alturaDir);
    }
}
 
 
 

 public void informaFolhas() {
    informaFolhasRecursivo(raiz);
}

private void informaFolhasRecursivo(No node) {
    if (node != null) {
        if (node.filhoEsq == null && node.filhoDir == null) {
            System.out.println("Folha: " + node.valor);
        } else {
            informaFolhasRecursivo(node.filhoEsq);
            informaFolhasRecursivo(node.filhoDir);
        }
    }
}
 


public void percursoLargura() {
        if (raiz == null) {
            return;
        }

        Queue<No> fila = new LinkedList<>();
        fila.add(raiz);

        while (!fila.isEmpty()) {
            No node = fila.poll();
            System.out.print(node.valor + " ");

            if (node.filhoEsq != null) {
                fila.add(node.filhoEsq);
            }
            if (node.filhoDir != null) {
                fila.add(node.filhoDir);
            }
        }

        System.out.println();
    }



public int nivelNo(int valor) {
        return profundidadeNoRecursivo(raiz, valor, 0);
    }


public void preOrdem() {
    preOrdemRecursivo(raiz);
}

private void preOrdemRecursivo(No node) {
    if (node != null) {
        System.out.print(node.valor + " ");
        preOrdemRecursivo(node.filhoEsq);
        preOrdemRecursivo(node.filhoDir);
    }
}


public void posOrdem() {
    posOrdemRecursivo(raiz);
}

private void posOrdemRecursivo(No node) {
    if (node != null) {
        posOrdemRecursivo(node.filhoEsq);
        posOrdemRecursivo(node.filhoDir);
        System.out.println(node.valor);
    }
}


public void inOrder() {
    inOrderRecursivo(raiz);
}

private void inOrderRecursivo(No node) {
    if (node != null) {
        inOrderRecursivo(node.filhoEsq);
        System.out.print(node.valor + " ");
        inOrderRecursivo(node.filhoDir);
    }
}



    /*void excluirNo(No node) {
        if (node.filhoEsq == null && node.filhoDir == null) { // Nó sem filhos
            if (node.pai == null) { // É a raiz
                raiz = null;
            } else if (node == node.pai.filhoEsq) {
                node.pai.filhoEsq = null;
            } else {
                node.pai.filhoDir = null;
            }
        } else if (node.filhoEsq != null && node.filhoDir == null) { // Nó com apenas um filho à esquerda
            if (node.pai == null) { // É a raiz
                raiz = node.filhoEsq;
            } else if (node == node.pai.filhoEsq) {
                node.pai.filhoEsq = node.filhoEsq;
            } else {
                node.pai.filhoDir = node.filhoEsq;
            }
            node.filhoEsq.pai = node.pai;
        } else if (node.filhoEsq == null && node*/
}
