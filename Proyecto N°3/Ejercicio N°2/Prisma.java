/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercico2;

/**
 *
 * @author User
 */
public class Prisma extends FiguraGeometrica {

    private double largo;
    private double ancho;
    private double altura;

    public Prisma(double largo, double ancho, double altura) {
        this.largo = largo;
        this.ancho = ancho;
        this.altura = altura;

        volumen = largo * ancho * altura;

        superficie = 2 * (largo * ancho
                + largo * altura
                + ancho * altura);
    }
}