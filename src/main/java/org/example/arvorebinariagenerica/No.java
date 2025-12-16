/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.example.arvorebinariagenerica;

/**
 *
 * @author Pichau
 */
public class No <T> {
    T elemento;
    No pai;
    No filhoEsq;
    No filhoDir;
   
   No(T elemento, No<T> pai) {
        this.elemento = elemento;
        this.pai = pai;
        filhoEsq = filhoDir = null;
    }
   
   No(T elemento) {
        this.elemento = elemento;
        filhoEsq = filhoDir = null;
    }
   
   boolean temFilhoEsq() {
       if(filhoEsq == null) {
           return false;
       }
       else{
           return true;  
       }
   }
   
   boolean temFilhoDir() {
       if(filhoDir == null) {
           return false;
       }
       else{
           return true;
       }
   }
   
   
   void inserirFilhoEsq(No<T> filho) {
       this.filhoEsq = filho;
   }
   
   void inserirFilhoDir(No<T> filho) {
       this.filhoDir = filho;
   }
   
    
    public String toString() {
        return this.elemento.toString();
    }
    
}
