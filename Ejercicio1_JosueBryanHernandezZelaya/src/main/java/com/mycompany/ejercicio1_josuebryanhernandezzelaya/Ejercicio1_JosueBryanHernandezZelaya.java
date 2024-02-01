/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio1_josuebryanhernandezzelaya;

import javax.swing.*;
/** 1. Escribir un programa que ingrese su nombre y apellidos por separados y se imprima el
resultado concatenado.

/**
 *
 * @author Usuario
 */
public class Ejercicio1_JosueBryanHernandezZelaya {
    public static void main(String[] args) {
        String nombre, apellido1, apellido2;

        nombre = JOptionPane.showInputDialog(" Usuario por favor ingrese su nombre: ");
        apellido1 = JOptionPane.showInputDialog("Usuario por favor ingrese su primer apellido: ");
        apellido2 = JOptionPane.showInputDialog("Usuario por favor ingrese su segundo apellido: ");

        // nombre y apellidos indicadps y concatenado
        String nombreCompleto = nombre + " " + apellido1 + " " + apellido2;

        // Mostrar el resultado concatenado
        JOptionPane.showMessageDialog(null, "Nombre completo registrado: " + nombreCompleto, "Datos del usuario ", JOptionPane.PLAIN_MESSAGE);
        System.exit(0);
    }
}
