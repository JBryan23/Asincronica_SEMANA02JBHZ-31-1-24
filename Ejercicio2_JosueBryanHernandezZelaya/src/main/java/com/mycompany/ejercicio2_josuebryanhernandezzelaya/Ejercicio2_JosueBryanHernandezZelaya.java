/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio2_josuebryanhernandezzelaya;

import javax.swing.*;
/** 2.Escribir un programa que permita ingresar 3 valores distintos y con ellos hacer, la suma,
resta, multiplicación.

/**
 *
 * @author Usuario
 */
public class Ejercicio2_JosueBryanHernandezZelaya  {
    public static void main(String[] args) {
        String primerNumero, segundoNumero, tercerNumero;
        int num1, num2, num3, suma, resta, multiplicacion;

        primerNumero = JOptionPane.showInputDialog("Usuario escriba el primer numero entero: ");
        segundoNumero = JOptionPane.showInputDialog("Usuario el segundo numero entero: ");
        tercerNumero = JOptionPane.showInputDialog("Usuario el tercer numero entero: ");

        num1 = Integer.parseInt(primerNumero);
        num2 = Integer.parseInt(segundoNumero);
        num3 = Integer.parseInt(tercerNumero);

        // Operaciones de la suma , resta y multiplicacion
        suma = num1 + num2 + num3;
        resta = num1 - num2 - num3;
        multiplicacion = num1 * num2 * num3;

        // Mostrar resultados de cada operacion
        String resultadoMensaje = "Resultados:\n";
        resultadoMensaje += "Suma: " + suma + "\n";
        resultadoMensaje += "Resta: " + resta + "\n";
        resultadoMensaje += "Multiplicación: " + multiplicacion;

        JOptionPane.showMessageDialog(null, resultadoMensaje, "Resultados", JOptionPane.PLAIN_MESSAGE);
        System.exit(0);
    }
}