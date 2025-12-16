/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.example.arvoreavl;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Pichau
 */
public class ArvoreAVL {
private No raiz;

    public ArvoreAVL() {
        this.raiz = null;
    }


    private int obterAltura(No no) {
        if (no == null) {
            return 0;
        }
        return no.altura;
    }


    private int obterFatorBalanceamento(No no) {
        if (no == null) {
            return 0;
        }
        return obterAltura(no.esquerdo) - obterAltura(no.direito);
    }


    private void atualizarAltura(No no) {
        int alturaEsquerdo = obterAltura(no.esquerdo);
        int alturaDireito = obterAltura(no.direito);
        no.altura = Math.max(alturaEsquerdo, alturaDireito) + 1;
    }


    private No rotacaoDireita(No no) {
        No novoNo = no.esquerdo;
        no.esquerdo = novoNo.direito;
        novoNo.direito = no;
        atualizarAltura(no);
        atualizarAltura(novoNo);
        return novoNo;
    }


    private No rotacaoEsquerda(No no) {
        No novoNo = no.direito;
        no.direito = novoNo.esquerdo;
        novoNo.esquerdo = no;
        atualizarAltura(no);
        atualizarAltura(novoNo);
        return novoNo;
    }


    private No rotacaoDuplaDireita(No no) {
        no.esquerdo = rotacaoEsquerda(no.esquerdo);
        return rotacaoDireita(no);
    }


    private No rotacaoDuplaEsquerda(No no) {
        no.direito = rotacaoDireita(no.direito);
        return rotacaoEsquerda(no);
    }


    public void inserir(int valor) {
        raiz = inserirAux(raiz, valor);
    }

    private No inserirAux(No no, int valor) {
        if (no == null) {
            return new No(valor);
        }

        if (valor < no.valor) {
            no.esquerdo = inserirAux(no.esquerdo, valor);
        } else if (valor > no.valor) {
            no.direito = inserirAux(no.direito, valor);
        } else {
            return no;
        }

        atualizarAltura(no);

        int fatorBalanceamento = obterFatorBalanceamento(no);

        if (fatorBalanceamento > 1 && valor < no.esquerdo.valor) {
            return rotacaoDireita(no);
        }
        if (fatorBalanceamento < -1 && valor > no.direito.valor) {
            return rotacaoEsquerda(no);
        }
        if (fatorBalanceamento > 1 && valor > no.esquerdo.valor) {
            return rotacaoDuplaDireita(no);
        }
        if (fatorBalanceamento < -1 && valor < no.direito.valor) {
            return rotacaoDuplaEsquerda(no);
        }

        return no;
    }


    public void imprimir() {
        imprimirAux(raiz, 0);
    }

    private void imprimirAux(No no, int nivel) {
        if (no == null) {
            return;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < nivel; i++) {
            sb.append("   ");
        }
        System.out.println(sb.toString() + no.valor);

        imprimirAux(no.esquerdo, nivel + 1);
        imprimirAux(no.direito, nivel + 1);
    }
   
}
