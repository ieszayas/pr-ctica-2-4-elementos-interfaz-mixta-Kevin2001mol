package controlventana;

import java.awt.Color;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class Ventana_1 extends javax.swing.JFrame {

    public Ventana_1() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        opcion1 = new javax.swing.JRadioButton();
        opcion2 = new javax.swing.JRadioButton();
        opcion3 = new javax.swing.JRadioButton();
        opcion4 = new javax.swing.JCheckBox();
        opcion5 = new javax.swing.JCheckBox();
        opcion6 = new javax.swing.JCheckBox();
        texto_correo = new javax.swing.JLabel();
        texto_random = new javax.swing.JTextField();
        escribir_correo = new javax.swing.JTextField();
        boton_iphone = new javax.swing.JToggleButton();
        combobox1 = new javax.swing.JComboBox<>();
        spinner1 = new javax.swing.JSpinner();
        volumen = new javax.swing.JSlider();
        separador = new javax.swing.JSeparator();
        opcion1_clone = new javax.swing.JRadioButton();
        opcion2_clone = new javax.swing.JRadioButton();
        opcion3_clone = new javax.swing.JRadioButton();
        opcion4_clone = new javax.swing.JCheckBox();
        opcion5_clone = new javax.swing.JCheckBox();
        opcion6_clone = new javax.swing.JCheckBox();
        texto_random_clone = new javax.swing.JTextField();
        combobox1_clone = new javax.swing.JComboBox<>();
        spinner1_clone = new javax.swing.JSpinner();
        volumen_clone = new javax.swing.JSlider();
        boton_iphone_clone = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        escribir_correo_clone = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        opcion1.setText("Opcion 1");
        opcion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcion1ActionPerformed(evt);
            }
        });

        opcion2.setText("Opcion 2");
        opcion2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcion2ActionPerformed(evt);
            }
        });

        opcion3.setText("Opcion 3");
        opcion3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcion3ActionPerformed(evt);
            }
        });

        opcion4.setText("Opcion 4");
        opcion4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcion4ActionPerformed(evt);
            }
        });

        opcion5.setText("Opcion 5");
        opcion5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcion5ActionPerformed(evt);
            }
        });

        opcion6.setText("Opcion 6");
        opcion6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcion6ActionPerformed(evt);
            }
        });

        texto_correo.setText("Correo");

        texto_random.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texto_randomActionPerformed(evt);
            }
        });
        texto_random.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                texto_randomKeyReleased(evt);
            }
        });

        escribir_correo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                escribir_correoActionPerformed(evt);
            }
        });
        escribir_correo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                escribir_correoKeyReleased(evt);
            }
        });

        boton_iphone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/b_off.png"))); // NOI18N
        boton_iphone.setRolloverEnabled(false);
        boton_iphone.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/b_on.png"))); // NOI18N
        boton_iphone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_iphoneActionPerformed(evt);
            }
        });

        combobox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        combobox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combobox1ActionPerformed(evt);
            }
        });

        spinner1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spinner1StateChanged(evt);
            }
        });
        spinner1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                spinner1KeyReleased(evt);
            }
        });

        volumen.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                volumenStateChanged(evt);
            }
        });

        opcion1_clone.setText("Opcion 1");
        opcion1_clone.setEnabled(false);
        opcion1_clone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcion1_cloneActionPerformed(evt);
            }
        });

        opcion2_clone.setText("Opcion 2");
        opcion2_clone.setEnabled(false);
        opcion2_clone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcion2_cloneActionPerformed(evt);
            }
        });

        opcion3_clone.setText("Opcion 3");
        opcion3_clone.setEnabled(false);
        opcion3_clone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcion3_cloneActionPerformed(evt);
            }
        });

        opcion4_clone.setText("Opcion 4");
        opcion4_clone.setEnabled(false);
        opcion4_clone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcion4_cloneActionPerformed(evt);
            }
        });

        opcion5_clone.setText("Opcion 5");
        opcion5_clone.setEnabled(false);
        opcion5_clone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcion5_cloneActionPerformed(evt);
            }
        });

        opcion6_clone.setText("Opcion 6");
        opcion6_clone.setEnabled(false);
        opcion6_clone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcion6_cloneActionPerformed(evt);
            }
        });

        texto_random_clone.setEnabled(false);
        texto_random_clone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texto_random_cloneActionPerformed(evt);
            }
        });

        combobox1_clone.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        combobox1_clone.setEnabled(false);
        combobox1_clone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combobox1_cloneActionPerformed(evt);
            }
        });

        spinner1_clone.setEnabled(false);

        volumen_clone.setEnabled(false);

        boton_iphone_clone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/b_off.png"))); // NOI18N
        boton_iphone_clone.setEnabled(false);
        boton_iphone_clone.setRolloverEnabled(false);
        boton_iphone_clone.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/b_on.png"))); // NOI18N
        boton_iphone_clone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_iphone_cloneActionPerformed(evt);
            }
        });

        jLabel1.setText("Correo");
        jLabel1.setEnabled(false);

        escribir_correo_clone.setEnabled(false);
        escribir_correo_clone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                escribir_correo_cloneActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(opcion1_clone)
                        .addGap(18, 18, 18)
                        .addComponent(opcion4_clone))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(opcion2_clone)
                        .addGap(18, 18, 18)
                        .addComponent(opcion5_clone))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(opcion3_clone)
                        .addGap(18, 18, 18)
                        .addComponent(opcion6_clone)))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(combobox1_clone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(texto_random_clone, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(volumen_clone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(spinner1_clone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(boton_iphone_clone)
                        .addGap(92, 92, 92))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(opcion3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(opcion6))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(opcion1)
                                .addGap(28, 28, 28)
                                .addComponent(opcion4)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(opcion2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(opcion5)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(combobox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(spinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(boton_iphone)
                                        .addGap(70, 70, 70))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(texto_random, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(volumen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(texto_correo, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(escribir_correo, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(separador)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(33, 33, 33)
                        .addComponent(escribir_correo_clone, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(opcion1)
                                    .addComponent(opcion4))
                                .addGap(8, 8, 8))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(texto_random, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(volumen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combobox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(opcion5)
                    .addComponent(opcion2))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(spinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(boton_iphone))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(opcion3)
                            .addComponent(opcion6))))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(texto_correo)
                    .addComponent(escribir_correo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(separador, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(opcion1_clone)
                            .addComponent(opcion4_clone)
                            .addComponent(texto_random_clone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(opcion2_clone)
                            .addComponent(opcion5_clone)
                            .addComponent(combobox1_clone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(volumen_clone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(opcion3_clone)
                    .addComponent(opcion6_clone)
                    .addComponent(spinner1_clone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton_iphone_clone))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(escribir_correo_clone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boton_iphoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_iphoneActionPerformed

        boton_iphone_clone.setSelected(boton_iphone.isSelected());

    }//GEN-LAST:event_boton_iphoneActionPerformed

    private void opcion6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcion6ActionPerformed
        opcion6_clone.setSelected(opcion6.isSelected());
    }//GEN-LAST:event_opcion6ActionPerformed

    private void opcion5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcion5ActionPerformed
        opcion5_clone.setSelected(opcion5.isSelected());
    }//GEN-LAST:event_opcion5ActionPerformed

    private void opcion4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcion4ActionPerformed
        opcion4_clone.setSelected(opcion4.isSelected());
    }//GEN-LAST:event_opcion4ActionPerformed

    private void opcion2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcion2ActionPerformed
        opcion2_clone.setSelected(opcion2.isSelected());
    }//GEN-LAST:event_opcion2ActionPerformed

    private void opcion3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcion3ActionPerformed
        opcion3_clone.setSelected(opcion3.isSelected());
    }//GEN-LAST:event_opcion3ActionPerformed

    private void opcion1_cloneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcion1_cloneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_opcion1_cloneActionPerformed

    private void opcion2_cloneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcion2_cloneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_opcion2_cloneActionPerformed

    private void opcion3_cloneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcion3_cloneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_opcion3_cloneActionPerformed

    private void opcion4_cloneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcion4_cloneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_opcion4_cloneActionPerformed

    private void opcion5_cloneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcion5_cloneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_opcion5_cloneActionPerformed

    private void opcion6_cloneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcion6_cloneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_opcion6_cloneActionPerformed

    private void texto_randomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_texto_randomActionPerformed
        for (int i = texto_random.getText().length() - 1; i >= 0; i--) {

            texto_random_clone.setText(texto_random_clone.getText() + texto_random.getText().charAt(i));

        }


    }//GEN-LAST:event_texto_randomActionPerformed


    private void texto_random_cloneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_texto_random_cloneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_texto_random_cloneActionPerformed

    private void combobox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combobox1ActionPerformed
        combobox1_clone.setSelectedItem(combobox1.getSelectedItem());
    }//GEN-LAST:event_combobox1ActionPerformed

    private void combobox1_cloneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combobox1_cloneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combobox1_cloneActionPerformed

    private void boton_iphone_cloneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_iphone_cloneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton_iphone_cloneActionPerformed

    private void escribir_correoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_escribir_correoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_escribir_correoActionPerformed

    private void escribir_correo_cloneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_escribir_correo_cloneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_escribir_correo_cloneActionPerformed

    private void opcion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcion1ActionPerformed
        opcion1_clone.setSelected(opcion1.isSelected());
    }//GEN-LAST:event_opcion1ActionPerformed

    private void texto_randomKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_texto_randomKeyReleased
        // texto_random_clone.setText(texto_random.getText());
    }//GEN-LAST:event_texto_randomKeyReleased

    private void escribir_correoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_escribir_correoKeyReleased
        escribir_correo_clone.setText(escribir_correo.getText());
        JTextField text = new JTextField();
        String regex = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
        if (!(escribir_correo.getText().matches(regex))) {
            Border bordeRojo = BorderFactory.createLineBorder(Color.RED, 2);
            escribir_correo.setBorder(bordeRojo);
        }
        if ((escribir_correo.getText().matches(regex))) {
            Border bordeNegro = BorderFactory.createLineBorder(Color.BLACK);
            escribir_correo.setBorder(bordeNegro);
        }

    }//GEN-LAST:event_escribir_correoKeyReleased

    private void spinner1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_spinner1KeyReleased

    }//GEN-LAST:event_spinner1KeyReleased

    private void spinner1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinner1StateChanged
        spinner1_clone.setValue(spinner1.getValue());
    }//GEN-LAST:event_spinner1StateChanged

    private void volumenStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_volumenStateChanged
        volumen_clone.setValue(volumen.getValue());
    }//GEN-LAST:event_volumenStateChanged

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana_1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton boton_iphone;
    private javax.swing.JToggleButton boton_iphone_clone;
    private javax.swing.JComboBox<String> combobox1;
    private javax.swing.JComboBox<String> combobox1_clone;
    private javax.swing.JTextField escribir_correo;
    private javax.swing.JTextField escribir_correo_clone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton opcion1;
    private javax.swing.JRadioButton opcion1_clone;
    private javax.swing.JRadioButton opcion2;
    private javax.swing.JRadioButton opcion2_clone;
    private javax.swing.JRadioButton opcion3;
    private javax.swing.JRadioButton opcion3_clone;
    private javax.swing.JCheckBox opcion4;
    private javax.swing.JCheckBox opcion4_clone;
    private javax.swing.JCheckBox opcion5;
    private javax.swing.JCheckBox opcion5_clone;
    private javax.swing.JCheckBox opcion6;
    private javax.swing.JCheckBox opcion6_clone;
    private javax.swing.JSeparator separador;
    private javax.swing.JSpinner spinner1;
    private javax.swing.JSpinner spinner1_clone;
    private javax.swing.JLabel texto_correo;
    private javax.swing.JTextField texto_random;
    private javax.swing.JTextField texto_random_clone;
    private javax.swing.JSlider volumen;
    private javax.swing.JSlider volumen_clone;
    // End of variables declaration//GEN-END:variables
}
