/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaaplicationstrp;

/**
 *
 * @author picperru
 */
public class Persona {
    
    String n;
    String a;
    String c;   
    
    public Persona(){
            
    }

    public Persona(String n, String a, String c) {
        this.n = n;
        this.a = a;
        this.c = c;
    }

    public String getN() {
        return n;
    }

    public void setN(String n) {
        this.n = n;
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
    }

  
}