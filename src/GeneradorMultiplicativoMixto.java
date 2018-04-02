/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mickaelacrespo
 */
public class GeneradorMultiplicativoMixto {
    
    private int a;
    private int m;
    private int c;
    private int seed;
    private int xi;

//    Constructor
    
    public GeneradorMultiplicativoMixto(int k, int g, int c, int seed) {
        this.a = 1 + 4*k;
        this.m = 2^g;
        this.c = c;
        this.seed = seed;
        this.xi = seed;
    }
    
//  Metodos de la clase
    
    
    private int modM(){
        return (int) ((a*xi + c) % m);
    }
    
    private int generarNumeroX(){
        int x2 = (a*xi + c) * this.modM(); 
        return x2;
    }
    
    public float generarNumeroRandom(){
       this.xi = generarNumeroX();
       
       float r = xi / m;
       
       return r;
    }
     
}
