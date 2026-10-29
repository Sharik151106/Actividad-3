/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercico2;

/**
 *
 * @author User
 */
public class Cilindro extends FiguraGeometrica {

    private double radio;
    private double altura;

    public Cilindro(double radio, double altura) {
        this.radio = radio;
        this.altura = altura;

        volumen = Math.PI * radio * radio * altura;

        superficie = 2 * Math.PI * radio * radio
                   + 2 * Math.PI * radio * altura;
    }
}
