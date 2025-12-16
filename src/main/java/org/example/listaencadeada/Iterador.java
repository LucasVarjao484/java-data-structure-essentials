/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.example.listaencadeada;

import java.util.Iterator;

/**
 *
 * @author Pichau
 */
public class Iterador<T> implements Iterator {
    private Celula atual;
    
    public Iterador(Celula atual) {
        this.atual = atual;
    }
    
    @Override
    public boolean hasNext() {
        if(atual!=null) {
            return true;
        }
        else {
            return false;
        }
    }
    
    @Override
    public Object next() {
        T elemento = (T) atual.getElemento();
        atual = atual.getProxima();
        return elemento;
    }
    
    public Celula getAtual() {
        return atual;
    }
}
