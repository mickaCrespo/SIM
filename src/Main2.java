/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Arrays;
import java.util.Random;
/**
 *
 * @author Michel
 */
public class Main2 {
    
    public static void main(String[] args) {
        SeriesAleatorias s = new SeriesAleatorias();
        String[] v = new String[4];
        float[] vec = new float[4];
        vec = s.serieAleatoria(4);

        for (int i = 0; i<4;i++){
            System.out.println(vec[i]);
        }
        
        float a = 25.0f;
        String b = "235";
        float c = Float.parseFloat(b);
        System.out.println(c);
        
        
        
            
    	}
        
        
    }
    

