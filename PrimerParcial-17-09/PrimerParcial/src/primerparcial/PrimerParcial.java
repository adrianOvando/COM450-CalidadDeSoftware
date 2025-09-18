/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package primerparcial;

import java.util.ArrayList;

/**
 *
 * @author adria
 */
public class PrimerParcial {

    public float Temperatura(float n) {
        return (n * 9.0f / 5.0f) + 32.0f;
    }

    public int Lista(ArrayList<Integer> numeros) {
        int resultado = 0;
        if (numeros == null) return 0; 
        for (int v : numeros) {
            resultado += v;
        }
        return resultado;
    }

}
