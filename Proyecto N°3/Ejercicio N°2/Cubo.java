/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercico2;

/**
 *
 * @author User
 */
public class Cubo extends FiguraGeometrica {

    private double lado;

    public Cubo(double lado) {
        this.lado = lado;

        volumen = lado * lado * lado;
        superficie = 6 * lado * lado;
    }
}