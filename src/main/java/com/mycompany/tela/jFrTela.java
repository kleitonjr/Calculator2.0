//Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
//Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template

package com.mycompany.tela;

import java.awt.event.KeyEvent;

public class jFrTela extends javax.swing.JFrame {

    public jFrTela() {
        initComponents();
    }
    double num1, num2;
    String op;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tfResult = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        btn8 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btnIgual = new javax.swing.JButton();
        btnAC = new javax.swing.JButton();
        btnMais = new javax.swing.JButton();
        btnDiv = new javax.swing.JButton();
        btnVirgula = new javax.swing.JButton();
        btnNeg = new javax.swing.JButton();
        btnMuilt = new javax.swing.JButton();
        btnMenos = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tfResult.setEditable(false);
        tfResult.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        tfResult.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        tfResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfResultActionPerformed(evt);
            }
        });

        btn8.setText("8");
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });
        btn8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btn8KeyPressed(evt);
            }
        });

        btn7.setText("7");
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });
        btn7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btn7KeyPressed(evt);
            }
        });

        btn9.setText("9");
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });
        btn9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btn9KeyPressed(evt);
            }
        });

        btn4.setText("4");
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        btn4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btn4KeyPressed(evt);
            }
        });

        btn5.setText("5");
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });
        btn5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btn5KeyPressed(evt);
            }
        });

        btn6.setText("6");
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });
        btn6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btn6KeyPressed(evt);
            }
        });

        btn1.setText("1");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        btn1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btn1KeyPressed(evt);
            }
        });

        btn2.setText("2");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        btn2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btn2KeyPressed(evt);
            }
        });

        btn3.setText("3");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        btn3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btn3KeyPressed(evt);
            }
        });

        btn0.setText("0");
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });
        btn0.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btn0KeyPressed(evt);
            }
        });

        btnIgual.setText("=");
        btnIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIgualActionPerformed(evt);
            }
        });
        btnIgual.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnIgualKeyPressed(evt);
            }
        });

        btnAC.setText("AC");
        btnAC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnACActionPerformed(evt);
            }
        });
        btnAC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnACKeyPressed(evt);
            }
        });

        btnMais.setText("+");
        btnMais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMaisActionPerformed(evt);
            }
        });
        btnMais.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnMaisKeyPressed(evt);
            }
        });

        btnDiv.setText("/");
        btnDiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDivActionPerformed(evt);
            }
        });
        btnDiv.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnDivKeyPressed(evt);
            }
        });

        btnVirgula.setText(",");
        btnVirgula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVirgulaActionPerformed(evt);
            }
        });
        btnVirgula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnVirgulaKeyPressed(evt);
            }
        });

        btnNeg.setText("+/-");
        btnNeg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNegActionPerformed(evt);
            }
        });
        btnNeg.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnNegKeyPressed(evt);
            }
        });

        btnMuilt.setText("*");
        btnMuilt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMuiltActionPerformed(evt);
            }
        });
        btnMuilt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnMuiltKeyPressed(evt);
            }
        });

        btnMenos.setText("-");
        btnMenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenosActionPerformed(evt);
            }
        });
        btnMenos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnMenosKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAC, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNeg, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDiv, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnMuilt, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btn0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnVirgula, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnMais, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnMenos, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAC, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNeg, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDiv, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMuilt, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnMenos, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnVirgula, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnMais, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnIgual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("CALCULADORA");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(tfResult)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfResult, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn8KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn8KeyPressed
        int cod = evt.getKeyCode();
        int tecla = KeyEvent.VK_8;
        if(cod == tecla ){
            tfResult.setText(tfResult.getText() + "8");
        }
    }//GEN-LAST:event_btn8KeyPressed

    private void btn7KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn7KeyPressed
        int cod = evt.getKeyCode();
        int tecla = KeyEvent.VK_7;
        if(cod == tecla ){
            tfResult.setText(tfResult.getText() + "7");
        }
    }//GEN-LAST:event_btn7KeyPressed

    private void btn9KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn9KeyPressed
        int cod = evt.getKeyCode();
        int tecla = KeyEvent.VK_9;
        if(cod == tecla ){
            tfResult.setText(tfResult.getText() + "9");
        }
    }//GEN-LAST:event_btn9KeyPressed

    private void btn4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn4KeyPressed
        int cod = evt.getKeyCode();
        int tecla = KeyEvent.VK_4;
        if(cod == tecla ){
            tfResult.setText(tfResult.getText() + "4");
        }
    }//GEN-LAST:event_btn4KeyPressed

    private void btn5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn5KeyPressed
        int cod = evt.getKeyCode();
        int tecla = KeyEvent.VK_5;
        if(cod == tecla ){
            tfResult.setText(tfResult.getText() + "5");
        }
    }//GEN-LAST:event_btn5KeyPressed

    private void btn6KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn6KeyPressed
        int cod = evt.getKeyCode();
        int tecla = KeyEvent.VK_6;
        if(cod == tecla ){
            tfResult.setText(tfResult.getText() + "6");
        }
    }//GEN-LAST:event_btn6KeyPressed

    private void btn1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn1KeyPressed
        int cod = evt.getKeyCode();
        int tecla = KeyEvent.VK_1;
        if(cod == tecla ){
            tfResult.setText(tfResult.getText() + "1");
        }
    }//GEN-LAST:event_btn1KeyPressed

    private void btn2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn2KeyPressed
        int cod = evt.getKeyCode();
        int tecla = KeyEvent.VK_2;
        if(cod == tecla ){
            tfResult.setText(tfResult.getText() + "2");
        }
    }//GEN-LAST:event_btn2KeyPressed

    private void btn3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn3KeyPressed
        int cod = evt.getKeyCode();
        int tecla = KeyEvent.VK_3;
        if(cod == tecla ){
            tfResult.setText(tfResult.getText() + "3");
        }
    }//GEN-LAST:event_btn3KeyPressed

    private void btnIgualKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnIgualKeyPressed
        num2 = Double.parseDouble(tfResult.getText());
        
        if(op == "sum"){
            tfResult.setText(String.format("%.2f",num1 + num2));
        }else if(op == "minus"){
            tfResult.setText(String.format("%.2f",num1 - num2));
        }else if(op == "multi"){
            tfResult.setText(String.format("%.2f",num1 * num2));
        }else if(op == "div"){
            tfResult.setText(String.format("%.2f",num1 / num2));
        }
    
    }//GEN-LAST:event_btnIgualKeyPressed

    private void btnACKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnACKeyPressed
        limpa();
    }//GEN-LAST:event_btnACKeyPressed

    private void digitaNum(String num){
        tfResult.setText(tfResult.getText() + num);
    } 
    private void limpa(){
        tfResult.setText("");
    }
    
    private void btnMaisKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnMaisKeyPressed
       num1 = Double.parseDouble(tfResult.getText());
       int opConv = Integer.parseInt(op);
        opConv = evt.getKeyCode();
        int tecla = KeyEvent.VK_PLUS;
        if(opConv == tecla ){
            op = "sum";
        }
    }//GEN-LAST:event_btnMaisKeyPressed

    private void btnDivKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnDivKeyPressed
        num1 = Double.parseDouble(tfResult.getText());
        int opConv = Integer.parseInt(op);
        opConv = evt.getKeyCode();
        int tecla = KeyEvent.VK_DIVIDE;
        if(opConv == tecla ){
            op = "div";
        }
    }//GEN-LAST:event_btnDivKeyPressed

    private void btnVirgulaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnVirgulaKeyPressed
        int opConv = Integer.parseInt(op);
        opConv = evt.getKeyCode();
        int tecla = KeyEvent.VK_COMMA;
        if(opConv == tecla ){
            digitaNum(",");
        }       
    }//GEN-LAST:event_btnVirgulaKeyPressed

    private void btnNegKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnNegKeyPressed
       num1 = Double.parseDouble(tfResult.getText());
       num1 = num1 *(-1);
       tfResult.setText(String.valueOf(num1));
    }//GEN-LAST:event_btnNegKeyPressed

    private void btnMuiltKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnMuiltKeyPressed
        num1 = Double.parseDouble(tfResult.getText());
        int opConv = Integer.parseInt(op);
        opConv = evt.getKeyCode();
        int tecla = KeyEvent.VK_MULTIPLY;
        if(opConv == tecla ){
            op = "multi";
        }
    }//GEN-LAST:event_btnMuiltKeyPressed

    private void btnMenosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnMenosKeyPressed
        num1 = Double.parseDouble(tfResult.getText());
        int opConv = Integer.parseInt(op);
        opConv = evt.getKeyCode();
        int tecla = KeyEvent.VK_MINUS;
        if(opConv == tecla ){
            op = "minus";
        }
    }//GEN-LAST:event_btnMenosKeyPressed

    private void tfResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfResultActionPerformed
        requestFocus();
    }//GEN-LAST:event_tfResultActionPerformed

    private void btn0KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn0KeyPressed
        int cod = evt.getKeyCode();
        int tecla = KeyEvent.VK_0;
        if(cod == tecla ){
            tfResult.setText(tfResult.getText() + "0");
        }
    }//GEN-LAST:event_btn0KeyPressed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        digitaNum("9");
    }//GEN-LAST:event_btn9ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        digitaNum("8");
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        digitaNum("7");
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        digitaNum("6");
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        digitaNum("5");
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        digitaNum("4");
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        digitaNum("3");
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        digitaNum("2");
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        digitaNum("1");
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
       digitaNum("0");
    }//GEN-LAST:event_btn0ActionPerformed

    private void btnMaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMaisActionPerformed
       num1 = Double.parseDouble(tfResult.getText());
       limpa();
       op = "sum";
    }//GEN-LAST:event_btnMaisActionPerformed

    private void btnMenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenosActionPerformed
       num1 = Double.parseDouble(tfResult.getText());
       limpa();
       op = "minus";
    }//GEN-LAST:event_btnMenosActionPerformed

    private void btnMuiltActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMuiltActionPerformed
       num1 = Double.parseDouble(tfResult.getText());
       limpa();
       op = "multi";
    }//GEN-LAST:event_btnMuiltActionPerformed

    private void btnDivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDivActionPerformed
       num1 = Double.parseDouble(tfResult.getText());
       limpa();
       op = "div";
    }//GEN-LAST:event_btnDivActionPerformed

    private void btnNegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNegActionPerformed
      num1 = Double.parseDouble(tfResult.getText());
      num1 = num1 *(-1);
      tfResult.setText(String.valueOf(num1));
    }//GEN-LAST:event_btnNegActionPerformed

    private void btnACActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnACActionPerformed
        limpa();
    }//GEN-LAST:event_btnACActionPerformed

    private void btnIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIgualActionPerformed
        num2 = Double.parseDouble(tfResult.getText());
        
        if(op == "sum"){
            tfResult.setText(String.format("%.2f",num1 + num2));
        }else if(op == "minus"){
            tfResult.setText(String.format("%.2f",num1 - num2));
        }else if(op == "multi"){
            tfResult.setText(String.format("%.2f",num1 * num2));
        }else if(op == "div"){
            tfResult.setText(String.format("%.2f",num1 / num2));
        }
    
    }//GEN-LAST:event_btnIgualActionPerformed

    private void btnVirgulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVirgulaActionPerformed
       digitaNum(",");
    }//GEN-LAST:event_btnVirgulaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnAC;
    private javax.swing.JButton btnDiv;
    private javax.swing.JButton btnIgual;
    private javax.swing.JButton btnMais;
    private javax.swing.JButton btnMenos;
    private javax.swing.JButton btnMuilt;
    private javax.swing.JButton btnNeg;
    private javax.swing.JButton btnVirgula;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField tfResult;
    // End of variables declaration//GEN-END:variables

    private void digitaNum(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
