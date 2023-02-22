package com.mycompany.calculator;

import com.mycompany.tela.jFrTela;

public class Main {
    public static void main(String args[]) {
 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jFrTela().setVisible(true);
            }
        });
    }
}