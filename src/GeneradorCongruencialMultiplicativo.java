
import java.math.BigDecimal;
import java.math.RoundingMode;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mickaelacrespo
 */
public class GeneradorCongruencialMultiplicativo {
    
    private int a;
    private int m;
    private int seed;
    private int xi;
    private boolean first;

    
//    Constructor
    
    public GeneradorCongruencialMultiplicativo(int k, int g, int seed) {
        this.a = 3 + 8 * k;
        this.m = (int) Math.pow(2,g);
        this.seed = seed;
        this.first = true;
    }
    
//    Metodos de la clase
    
          
    public int generarNumeroX(){
        if (first == true){
            this.first = false;
            return this.seed;
        }
        else{
            int x2 = (a*xi) % m; 
            return x2;    
        }

    }
    
    public float generarNumeroRandom(){       
       this.xi = generarNumeroX();  
       float r = (float) xi / m;      
       r = truncar(r);
       return r;
    }
    
    private float truncar(double valor){
        return new BigDecimal(valor).setScale(4, RoundingMode.DOWN).floatValue();
    }
    
    public void newSeed(int seed){
        this.seed = seed;
        this.first = true;
    }
    
    public void newRun(){
        this.first = true;
    }
    
    
    
           
    
    
    
}