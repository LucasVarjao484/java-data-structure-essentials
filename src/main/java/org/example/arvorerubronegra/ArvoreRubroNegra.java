/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.example.arvorerubronegra;

/**
 *
 * @author Pichau
 */
public class ArvoreRubroNegra {
    private No raiz;
    private No nil;

    public ArvoreRubroNegra() {
        nil = new No(0);
        nil.vermelho = false;
        nil.esquerdo = nil;
        nil.direito = nil;
        nil.pai = nil;
        raiz = nil;
    }

    private void rotacaoEsquerda(No x) {
        No y = x.direito;
        x.direito = y.esquerdo;

        if (y.esquerdo != nil)
            y.esquerdo.pai = x;

        y.pai = x.pai;

        if (x.pai == nil)
            raiz = y;
        else if (x == x.pai.esquerdo)
            x.pai.esquerdo = y;
        else
            x.pai.direito = y;

        y.esquerdo = x;
        x.pai = y;
    }

    private void rotacaoDireita(No x) {
        No y = x.esquerdo;
        x.esquerdo = y.direito;

        if (y.direito != nil)
            y.direito.pai = x;

        y.pai = x.pai;

        if (x.pai == nil)
            raiz = y;
        else if (x == x.pai.direito)
            x.pai.direito = y;
        else
            x.pai.esquerdo = y;

        y.direito = x;
        x.pai = y;
    }

    private void corrigirInsercao(No z) {
        while (z.pai.vermelho) {
            if (z.pai == z.pai.pai.esquerdo) {
                No y = z.pai.pai.direito;

                if (y.vermelho) {
                    z.pai.vermelho = false;
                    y.vermelho = false;
                    z.pai.pai.vermelho = true;
                    z = z.pai.pai;
                } else {
                    if (z == z.pai.direito) {
                        z = z.pai;
                        rotacaoEsquerda(z);
                    }

                    z.pai.vermelho = false;
                    z.pai.pai.vermelho = true;
                    rotacaoDireita(z.pai.pai);
                }
            } else {
                No y = z.pai.pai.esquerdo;

                if (y.vermelho) {
                    z.pai.vermelho = false;
                    y.vermelho = false;
                    z.pai.pai.vermelho = true;
                    z = z.pai.pai;
                } else {
                    if (z == z.pai.esquerdo) {
                        z = z.pai;
                        rotacaoDireita(z);
                    }

                    z.pai.vermelho = false;
                    z.pai.pai.vermelho = true;
                    rotacaoEsquerda(z.pai.pai);
                }
            }
        }

        raiz.vermelho = false;
    }

    public void inserir(int chave) {
        No z = new No(chave);
        No y = nil;
        No x = raiz;

        while (x != nil) {
            y = x;
            if (z.valor < x.valor)
                x = x.esquerdo;
            else
                x = x.direito;
        }

        z.pai = y;

        if (y == nil)
            raiz = z;
        else if (z.valor < y.valor)
            y.esquerdo = z;
        else
            y.direito = z;

        z.esquerdo = nil;
        z.direito = nil;
        z.vermelho = true;

        corrigirInsercao(z);
    }

    private void transplantar(No u, No v) {
        if (u.pai == nil)
            raiz = v;
        else if (u == u.pai.esquerdo)
            u.pai.esquerdo = v;
        else
            u.pai.direito = v;

        v.pai = u.pai;
    }

    private void corrigirRemocao(No x) {
        while (x != raiz && !x.vermelho) {
            if (x == x.pai.esquerdo) {
                No w = x.pai.direito;

                if (w.vermelho) {
                    w.vermelho = false;
                    x.pai.vermelho = true;
                    rotacaoEsquerda(x.pai);
                    w = x.pai.direito;
                }

                if (!w.esquerdo.vermelho && !w.direito.vermelho) {
                    w.vermelho = true;
                    x = x.pai;
                } else {
                    if (!w.direito.vermelho) {
                        w.esquerdo.vermelho = false;
                        w.vermelho = true;
                        rotacaoDireita(w);
                        w = x.pai.direito;
                    }

                    w.vermelho = x.pai.vermelho;
                    x.pai.vermelho = false;
                    w.direito.vermelho = false;
                    rotacaoEsquerda(x.pai);
                    x = raiz;
                }
            } else {
                No w = x.pai.esquerdo;

                if (w.vermelho) {
                    w.vermelho = false;
                    x.pai.vermelho = true;
                    rotacaoDireita(x.pai);
                    w = x.pai.esquerdo;
                }

                if (!w.direito.vermelho && !w.esquerdo.vermelho) {
                    w.vermelho = true;
                    x = x.pai;
                } else {
                    if (!w.esquerdo.vermelho) {
                        w.direito.vermelho = false;
                        w.vermelho = true;
                        rotacaoEsquerda(w);
                        w = x.pai.esquerdo;
                    }

                    w.vermelho = x.pai.vermelho;
                    x.pai.vermelho = false;
                    w.esquerdo.vermelho = false;
                    rotacaoDireita(x.pai);
                    x = raiz;
                }
            }
        }

        x.vermelho = false;
    }

    public void remover(int chave) {
        No z = buscar(raiz, chave);

        if (z == nil)
            return;

        No y = z;
        No x;
        boolean corOriginal = y.vermelho;

        if (z.esquerdo == nil) {
            x = z.direito;
            transplantar(z, z.direito);
        } else if (z.direito == nil) {
            x = z.esquerdo;
            transplantar(z, z.esquerdo);
        } else {
            y = minimo(z.direito);
            corOriginal = y.vermelho;
            x = y.direito;

            if (y.pai == z)
                x.pai = y;
            else {
                transplantar(y, y.direito);
                y.direito = z.direito;
                y.direito.pai = y;
            }

            transplantar(z, y);
            y.esquerdo = z.esquerdo;
            y.esquerdo.pai = y;
            y.vermelho = z.vermelho;
        }

        if (!corOriginal)
            corrigirRemocao(x);
    }

    private No minimo(No no) {
        while (no.esquerdo != nil)
            no = no.esquerdo;
        return no;
    }

    private No buscar(No no, int chave) {
        if (no == nil || chave == no.valor)
            return no;

        if (chave < no.valor)
            return buscar(no.esquerdo, chave);

        return buscar(no.direito, chave);
    }

    public No buscar(int chave) {
        return buscar(raiz, chave);
    }

    private void imprimirArvore(No no, String identacao, boolean ultimo) {
        if (no != nil) {
            System.out.print(identacao);
            System.out.print(ultimo ? "└─" : "├─");
            System.out.print(no.valor + (no.vermelho ? "(R)" : "(B)"));
            System.out.println();
            imprimirArvore(no.esquerdo, identacao + (ultimo ? "   " : "│  "), false);
            imprimirArvore(no.direito, identacao + (ultimo ? "   " : "│  "), true);
        }
    }

    public void imprimirArvore() {
        imprimirArvore(raiz, "", true);
    }

    public void imprimirInfoNo(int valor) {
        No no = buscar(raiz, valor);

        if (no == nil) {
            System.out.println("O nó " + valor + " não está na árvore.");
            return;
        }

        String cor = no.vermelho ? "R" : "B";
        String pai = no.pai != nil ? String.valueOf(no.pai.valor) : "null";

        System.out.println(
            "O nó " + valor + " possui a cor (" + cor + ") e o seu pai é (" + pai + ")."
        );
    }
    
}
