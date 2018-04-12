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
    
    public int[] getFrecuenciasObservadas() {
        return frecuenciasObservadas;
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
        double chiCuadrado = 0;
         switch (gL) {
            case 1:  chiCuadrado = 3.84;
                     break;
            case 2:  chiCuadrado = 5.99;
                     break;
            case 3:  chiCuadrado = 7.81;
                     break;
            case 4:  chiCuadrado = 9.49;
                     break;
            case 5:  chiCuadrado = 11.1;
                     break;
            case 6:  chiCuadrado = 12.6;
                     break;
            case 7:  chiCuadrado = 14.1;
                     break;
            case 8:  chiCuadrado = 15.5;
                     break;
            case 9:  chiCuadrado = 16.9;
                     break;
            case 10: chiCuadrado = 18.3;
                     break;
            case 11: chiCuadrado = 19.7;
                     break;
            case 12: chiCuadrado = 21.0;
                     break;
            case 13: chiCuadrado = 22.4;
                     break;
            case 14: chiCuadrado = 23.7;
                     break;
            case 15: chiCuadrado = 25.0;
                     break;         
            case 16: chiCuadrado = 26.3;
                     break;
            case 17: chiCuadrado = 27.6;
                     break;
            case 18: chiCuadrado = 28.9;
                     break;
            case 19: chiCuadrado = 30.1;
                     break;
            case 20: chiCuadrado = 31.4;
                     break;         
        }
        
        return (float) chiCuadrado;
    }
        
    public boolean calcularChiCuadrado(){
        float chiCalculo = this.chiCuadradoCalculo();
        int gradosLibertad = this.intervalos - 1;
        float chiTabulado = this.chiCuadradoTabulado(gradosLibertad);
        
        return chiCalculo <= chiTabulado;
        
    }
    
    
    
    
    
}
