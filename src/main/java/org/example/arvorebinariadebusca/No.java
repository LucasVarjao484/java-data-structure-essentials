/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.example.arvorebinariadebusca;

/**
 *
 * @author Pichau
 */
public class No <T>{
    int valor;
    No<T> pai;
    No<T> filhoEsq;
    No<T> filhoDir;
    int altura;
    

    No(int valor, No<T> pai) {
        this.valor = valor;
        this.pai = pai;
        filhoEsq = filhoDir = null;
        this.altura = 0;
    }

    No(int valor) {
        this.valor = valor;
        filhoEsq = filhoDir = null;
        this.altura = 0;
    }

    boolean temFilhoEsq() {
        return filhoEsq != null;
    }

    boolean temFilhoDir() {
        return filhoDir != null;
    }

    void inserirFilhoEsq(No<T> filho) {
        this.filhoEsq = filho;
    }

    void inserirFilhoDir(No<T> filho) {
        this.filhoDir = filho;
    }
}
