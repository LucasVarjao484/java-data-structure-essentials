/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.example.listaduplamenteencadeada;

/**
 *
 * @author Pichau
 */
public class Celula<T> {
    private Celula<T> anterior;
    private Celula<T> proxima;
    private T elemento;

    public Celula(Celula<T> proxima, T elemento) {
        this.proxima = proxima;
        this.elemento = elemento;
    }

    public Celula(T elemento, Celula<T> anterior) {
        this.elemento = elemento;
        this.anterior = anterior;
    }
    
    public Celula(Celula<T> anterior, T elemento, Celula<T> proxima) {
        this.anterior = anterior;
        this.elemento = elemento;
        this.proxima = proxima;
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

    public Celula<T> getAnterior() {
        return anterior;
    }

    public void setAnterior(Celula<T> anterior) {
        this.anterior = anterior;
    }
    
    
    public String toString() {
        return this.elemento.toString();
    }
}
