/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Random;
/**
 *
 * @author Michel
 */
public class ChiCuadrado {
    
    float[] serie;
    int intervalos;
    int[] frecuenciasObservadas;

    
//    Constructor
    
    public ChiCuadrado(float[] serie, int intervalos) {
        this.serie = serie;
        this.intervalos = intervalos;
    }
    
    
//    Metodos de clase
    
    public int frecuenciaEsperada(){
        int n = serie.length;
        while (n/intervalos < 5){
            intervalos = (int) (intervalos)/2;
//            intervalos -= 1;
        }
        return (int) (n/intervalos);
    }
    
//    private void verFrecuenciasO(){
//        int n = serie.length;
//        int t = 1/ this.intervalos;
//        float x;
//
//        for (int i = 0; i < n; i++) {
//            x = serie[i];
//
//            for (int j = 0; j < this.intervalos; j++) {
//                if ((j * t) <= x && (x < ((j + 1) * t))) {
//                    frecuenciasObservadas[j]++;
//                }
//
//            }
//
//        }   
//    }
    
    public void verFrecuenciasO(){
        for (int i=0; i < serie.length; i++){
            int x = (int) ((serie[i] / this.frecuenciaEsperada()) * serie.length );
            frecuenciasObservadas[x] += 1;
        }
    }
    
    public float chiCuadradoCalculo(){
        float chiCuadrado = 0;
        float fofe;
        float fe = frecuenciaEsperada();
        frecuenciasObservadas = new int[intervalos];
        this.verFrecuenciasO();
        
        for (int i = 0; i < intervalos; i++) {
            fofe = (frecuenciasObservadas[i] - fe);
            fofe = (float) Math.pow(fofe,2);
            chiCuadrado += (fofe)/fe;
        }  
        return chiCuadrado;                
    }
    public float chiCuadradoTabulado(int gL){
        float chiCuadrado = 0;
        
        if (gL==1){
            chiCuadrado = (float)0.004;
            
        }
        if (gL==2){
            chiCuadrado = (float)0.103;
        }
        if (gL==3){
            chiCuadrado = (float)0.352;
        }
        if (gL==4){
            chiCuadrado = (float)0.711;
        }
        if (gL==5){
            chiCuadrado = (float)1.145;
        }
        if (gL==6){
            chiCuadrado = (float)1.237;
        }
        if (gL==7){
            chiCuadrado = (float)1.690;
        }
        if (gL==8){
            chiCuadrado = (float)2.180;
        }
        if (gL==9){
            chiCuadrado = (float)2.700;
        }
        if (gL==10){
            chiCuadrado = (float)3.940;
        }
        
        return chiCuadrado;
    }
        
    public boolean calcularChiCuadrado(){
        float chiCalculo = this.chiCuadradoCalculo();
        int gradosLibertad = this.intervalos - 1;
        float chiTabulado = this.chiCuadradoTabulado(gradosLibertad);
        
        return chiCalculo <= chiTabulado;
        
    }
    
    
    
    
    
}