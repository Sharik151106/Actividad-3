/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercico2;

/**
 *
 * @author User
 */
public class Piramide extends FiguraGeometrica {
    private double base;
    private double altura;
    private double apotema;

    public Piramide(double base, double altura,
                    double apotema) {
        this.base = base;
        this.altura = altura;
        this.apotema = apotema;

        volumen = (base * base * altura) / 3;

        superficie = base * base + 2 * base * apotema;
    }
}

