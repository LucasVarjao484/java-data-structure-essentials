/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.example.arvorerubronegra;

/**
 *
 * @author Pichau
 */
public class No {
    int valor;
    No pai;
    No esquerdo;
    No direito;
    boolean vermelho;

    public No(int valor) {
        this.valor = valor;
        this.vermelho = true;
    }
}
