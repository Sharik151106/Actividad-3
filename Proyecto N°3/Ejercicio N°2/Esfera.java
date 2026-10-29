/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercico2;

/**
 *
 * @author User
 */
public class Esfera extends FiguraGeometrica {
    private double radio;
    
    public Esfera(double radio) {
        this.radio = radio;

        volumen = (4.0 / 3.0) * Math.PI
                * Math.pow(radio, 3);

        superficie = 4 * Math.PI * radio * radio;
    }
}