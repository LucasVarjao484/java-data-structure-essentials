/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.example.fila;

/**
 *
 * @author Pichau
 */
public class Celula<T> {
    private Celula<T> proxima;
    private T elemento;

    public Celula(Celula<T> proxima, T elemento) {
        this.proxima = proxima;
        this.elemento = elemento;
    }

    public Celula(T elemento) {
        this.elemento = elemento;
    }

    public Celula<T> getProxima() {
        return proxima;
    }

    public void setProxima(Celula<T> proxima) {
        this.proxima = proxima;
    }

    public T getElemento() {
        return elemento;
    }
    
    public String toString() {
        return this.elemento.toString();
    }
}
