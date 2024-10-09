package controlventana;

import java.awt.Color;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class Ventana_1 extends javax.swing.JFrame {

    public Ventana_1() {
        initComponents();
        verificar_correock.setVisible(false);
        chiquitin_lbl.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grup_botones123 = new javax.swing.ButtonGroup();
        grup_botones123_clone = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        opcion1rb = new javax.swing.JRadioButton();
        opcion2rb = new javax.swing.JRadioButton();
        opcion3rb = new javax.swing.JRadioButton();
        opcion4ck = new javax.swing.JCheckBox();
        opcion5ck = new javax.swing.JCheckBox();
        opcion6ck = new javax.swing.JCheckBox();
        texto_correo = new javax.swing.JLabel();
        texto_random_field = new javax.swing.JTextField();
        escribir_correo_field = new javax.swing.JTextField();
        boton_iphone_tb = new javax.swing.JToggleButton();
        combobox1 = new javax.swing.JComboBox<>();
        spinner1 = new javax.swing.JSpinner();
        volumen_sldr = new javax.swing.JSlider();
        separador = new javax.swing.JSeparator();
        opcion1_clonerb = new javax.swing.JRadioButton();
        opcion2_clonerb = new javax.swing.JRadioButton();
        opcion3_clonerb = new javax.swing.JRadioButton();
        opcion4_cloneck = new javax.swing.JCheckBox();
        opcion5_cloneck = new javax.swing.JCheckBox();
        opcion6_cloneck = new javax.swing.JCheckBox();
        texto_random_clone_field = new javax.swing.JTextField();
        combobox1_clone = new javax.swing.JComboBox<>();
        spinner1_clone = new javax.swing.JSpinner();
        volumen_clone_sldr = new javax.swing.JSlider();
        boton_iphone_clone_tb = new javax.swing.JToggleButton();
        texto_correo_2 = new javax.swing.JLabel();
        escribir_correo_clone_field = new javax.swing.JTextField();
        verificar_correock = new javax.swing.JCheckBox();
        chiquitin_lbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        grup_botones123.add(opcion1rb);
        opcion1rb.setText("Opcion 1");
        opcion1rb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcion1rbActionPerformed(evt);
            }
        });

        grup_botones123.add(opcion2rb);
        opcion2rb.setText("Opcion 2");
        opcion2rb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcion2rbActionPerformed(evt);
            }
        });

        grup_botones123.add(opcion3rb);
        opcion3rb.setText("Opcion 3");
        opcion3rb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcion3rbActionPerformed(evt);
            }
        });

        opcion4ck.setText("Opcion 4");
        opcion4ck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcion4ckActionPerformed(evt);
            }
        });

        opcion5ck.setText("Opcion 5");
        opcion5ck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcion5ckActionPerformed(evt);
            }
        });

        opcion6ck.setText("Opcion 6");
        opcion6ck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcion6ckActionPerformed(evt);
            }
        });

        texto_correo.setText("Correo");

        texto_random_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texto_random_fieldActionPerformed(evt);
            }
        });
        texto_random_field.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                texto_random_fieldKeyReleased(evt);
            }
        });

        escribir_correo_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                escribir_correo_fieldActionPerformed(evt);
            }
        });
        escribir_correo_field.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                escribir_correo_fieldKeyReleased(evt);
            }
        });

        boton_iphone_tb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/b_off.png"))); // NOI18N
        boton_iphone_tb.setRolloverEnabled(false);
        boton_iphone_tb.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/b_on.png"))); // NOI18N
        boton_iphone_tb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_iphone_tbActionPerformed(evt);
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

        volumen_sldr.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                volumen_sldrStateChanged(evt);
            }
        });

        grup_botones123_clone.add(opcion1_clonerb);
        opcion1_clonerb.setText("Opcion 1");
        opcion1_clonerb.setEnabled(false);
        opcion1_clonerb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcion1_clonerbActionPerformed(evt);
            }
        });

        grup_botones123_clone.add(opcion2_clonerb);
        opcion2_clonerb.setText("Opcion 2");
        opcion2_clonerb.setEnabled(false);
        opcion2_clonerb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcion2_clonerbActionPerformed(evt);
            }
        });

        grup_botones123_clone.add(opcion3_clonerb);
        opcion3_clonerb.setText("Opcion 3");
        opcion3_clonerb.setEnabled(false);
        opcion3_clonerb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcion3_clonerbActionPerformed(evt);
            }
        });

        opcion4_cloneck.setText("Opcion 4");
        opcion4_cloneck.setEnabled(false);
        opcion4_cloneck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcion4_cloneckActionPerformed(evt);
            }
        });

        opcion5_cloneck.setText("Opcion 5");
        opcion5_cloneck.setEnabled(false);
        opcion5_cloneck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcion5_cloneckActionPerformed(evt);
            }
        });

        opcion6_cloneck.setText("Opcion 6");
        opcion6_cloneck.setEnabled(false);
        opcion6_cloneck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcion6_cloneckActionPerformed(evt);
            }
        });

        texto_random_clone_field.setEnabled(false);
        texto_random_clone_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texto_random_clone_fieldActionPerformed(evt);
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

        volumen_clone_sldr.setEnabled(false);

        boton_iphone_clone_tb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/b_off.png"))); // NOI18N
        boton_iphone_clone_tb.setEnabled(false);
        boton_iphone_clone_tb.setRolloverEnabled(false);
        boton_iphone_clone_tb.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/b_on.png"))); // NOI18N
        boton_iphone_clone_tb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_iphone_clone_tbActionPerformed(evt);
            }
        });

        texto_correo_2.setText("Correo");
        texto_correo_2.setEnabled(false);

        escribir_correo_clone_field.setEnabled(false);
        escribir_correo_clone_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                escribir_correo_clone_fieldActionPerformed(evt);
            }
        });

        verificar_correock.setForeground(javax.swing.UIManager.getDefaults().getColor("Actions.Green"));
        verificar_correock.setText("Correo verificado correctamente!");
        verificar_correock.setToolTipText("");
        verificar_correock.setEnabled(false);
        verificar_correock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verificar_correockActionPerformed(evt);
            }
        });

        chiquitin_lbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/ok.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(opcion1_clonerb)
                        .addGap(18, 18, 18)
                        .addComponent(opcion4_cloneck))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(opcion2_clonerb)
                        .addGap(18, 18, 18)
                        .addComponent(opcion5_cloneck))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(opcion3_clonerb)
                        .addGap(18, 18, 18)
                        .addComponent(opcion6_cloneck)))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(combobox1_clone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(texto_random_clone_field, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(volumen_clone_sldr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(spinner1_clone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(boton_iphone_clone_tb)
                        .addGap(92, 92, 92))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(opcion3rb)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(opcion6ck))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(opcion1rb)
                                .addGap(28, 28, 28)
                                .addComponent(opcion4ck)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(opcion2rb)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(opcion5ck)))
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
                                        .addComponent(boton_iphone_tb)
                                        .addGap(70, 70, 70))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(texto_random_field, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(volumen_sldr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(texto_correo, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(escribir_correo_field, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(verificar_correock)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chiquitin_lbl)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(separador)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(texto_correo_2)
                        .addGap(33, 33, 33)
                        .addComponent(escribir_correo_clone_field, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                                    .addComponent(opcion1rb)
                                    .addComponent(opcion4ck))
                                .addGap(8, 8, 8))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(texto_random_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(volumen_sldr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combobox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(opcion5ck)
                    .addComponent(opcion2rb))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(spinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(boton_iphone_tb))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(opcion3rb)
                                    .addComponent(opcion6ck))))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(texto_correo)
                            .addComponent(escribir_correo_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(verificar_correock)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chiquitin_lbl)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(separador, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(opcion1_clonerb)
                            .addComponent(opcion4_cloneck)
                            .addComponent(texto_random_clone_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(opcion2_clonerb)
                            .addComponent(opcion5_cloneck)
                            .addComponent(combobox1_clone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(volumen_clone_sldr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(opcion3_clonerb)
                    .addComponent(opcion6_cloneck)
                    .addComponent(spinner1_clone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton_iphone_clone_tb))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(texto_correo_2)
                    .addComponent(escribir_correo_clone_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void boton_iphone_tbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_iphone_tbActionPerformed
        boton_iphone_clone_tb.setSelected(boton_iphone_tb.isSelected());
    }//GEN-LAST:event_boton_iphone_tbActionPerformed

    private void opcion6ckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcion6ckActionPerformed
        opcion6_cloneck.setSelected(opcion6ck.isSelected());
    }//GEN-LAST:event_opcion6ckActionPerformed

    private void opcion5ckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcion5ckActionPerformed
        opcion5_cloneck.setSelected(opcion5ck.isSelected());
    }//GEN-LAST:event_opcion5ckActionPerformed

    private void opcion4ckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcion4ckActionPerformed
        opcion4_cloneck.setSelected(opcion4ck.isSelected());

    }//GEN-LAST:event_opcion4ckActionPerformed

    private void opcion2rbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcion2rbActionPerformed
        opcion2_clonerb.setSelected(opcion2rb.isSelected());
        //apagarOtrosBotones(opcion2);
    }//GEN-LAST:event_opcion2rbActionPerformed

    private void opcion3rbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcion3rbActionPerformed
        opcion3_clonerb.setSelected(opcion3rb.isSelected());
        //apagarOtrosBotones(opcion3);
    }//GEN-LAST:event_opcion3rbActionPerformed

    private void opcion1_clonerbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcion1_clonerbActionPerformed

    }//GEN-LAST:event_opcion1_clonerbActionPerformed

    private void opcion2_clonerbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcion2_clonerbActionPerformed

    }//GEN-LAST:event_opcion2_clonerbActionPerformed

    private void opcion3_clonerbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcion3_clonerbActionPerformed

    }//GEN-LAST:event_opcion3_clonerbActionPerformed

    private void opcion4_cloneckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcion4_cloneckActionPerformed

    }//GEN-LAST:event_opcion4_cloneckActionPerformed

    private void opcion5_cloneckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcion5_cloneckActionPerformed

    }//GEN-LAST:event_opcion5_cloneckActionPerformed

    private void opcion6_cloneckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcion6_cloneckActionPerformed

    }//GEN-LAST:event_opcion6_cloneckActionPerformed

    private void texto_random_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_texto_random_fieldActionPerformed
        for (int i = texto_random_field.getText().length() - 1; i >= 0; i--) {
            texto_random_clone_field.setText(texto_random_clone_field.getText() + texto_random_field.getText().charAt(i));
        }
    }//GEN-LAST:event_texto_random_fieldActionPerformed


    private void texto_random_clone_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_texto_random_clone_fieldActionPerformed

    }//GEN-LAST:event_texto_random_clone_fieldActionPerformed

    private void combobox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combobox1ActionPerformed
        combobox1_clone.setSelectedItem(combobox1.getSelectedItem());
    }//GEN-LAST:event_combobox1ActionPerformed

    private void combobox1_cloneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combobox1_cloneActionPerformed

    }//GEN-LAST:event_combobox1_cloneActionPerformed

    private void boton_iphone_clone_tbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_iphone_clone_tbActionPerformed

    }//GEN-LAST:event_boton_iphone_clone_tbActionPerformed

    private void escribir_correo_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_escribir_correo_fieldActionPerformed

    }//GEN-LAST:event_escribir_correo_fieldActionPerformed

    private void escribir_correo_clone_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_escribir_correo_clone_fieldActionPerformed

    }//GEN-LAST:event_escribir_correo_clone_fieldActionPerformed

    private void opcion1rbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcion1rbActionPerformed
        opcion1_clonerb.setSelected(opcion1rb.isSelected());

    }//GEN-LAST:event_opcion1rbActionPerformed

    private void texto_random_fieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_texto_random_fieldKeyReleased

    }//GEN-LAST:event_texto_random_fieldKeyReleased

    private void escribir_correo_fieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_escribir_correo_fieldKeyReleased
        escribir_correo_clone_field.setText(escribir_correo_field.getText());
        JTextField text = new JTextField();
        String regex = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
        if (!(escribir_correo_field.getText().matches(regex))) {
            Border bordeRojo = BorderFactory.createLineBorder(Color.RED, 2);
            escribir_correo_field.setBorder(bordeRojo);
        }
        if ((escribir_correo_field.getText().matches(regex))) {
            Border bordeNegro = BorderFactory.createLineBorder(Color.GREEN, 2);
            escribir_correo_field.setBorder(bordeNegro);
            verificar_correock.setVisible(true);
            verificar_correock.setSelected(true);
            chiquitin_lbl.setVisible(true);
        } else {
            verificar_correock.setVisible(false);
            verificar_correock.setSelected(false);
            chiquitin_lbl.setVisible(false);
        }


    }//GEN-LAST:event_escribir_correo_fieldKeyReleased

    private void apagarOtrosBotones(JRadioButton boton) {
        int esboton = 0;
        if (boton.equals(opcion1rb)) {
            esboton = 1;
        }
        if (boton.equals(opcion2rb)) {
            esboton = 2;
        }
        if (boton.equals(opcion3rb)) {
            esboton = 3;
        }

        // apagar los otros botones
        switch (esboton) {
            case 1:
                opcion2rb.setSelected(false);
                opcion2_clonerb.setSelected(opcion2rb.isSelected());
                opcion3rb.setSelected(false);
                opcion3_clonerb.setSelected(opcion3rb.isSelected());
                break;
            case 2:
                opcion1rb.setSelected(false);
                opcion1_clonerb.setSelected(opcion1rb.isSelected());
                opcion3rb.setSelected(false);
                opcion3_clonerb.setSelected(opcion3rb.isSelected());
                break;
            case 3:
                opcion1rb.setSelected(false);
                opcion1_clonerb.setSelected(opcion1rb.isSelected());
                opcion2rb.setSelected(false);
                opcion2_clonerb.setSelected(opcion2rb.isSelected());
                break;
            default:
                // Si ningún botón coincide, no hace nada
                break;
        }
    }
    private void spinner1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_spinner1KeyReleased

    }//GEN-LAST:event_spinner1KeyReleased

    private void spinner1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinner1StateChanged
        spinner1_clone.setValue(spinner1.getValue());
    }//GEN-LAST:event_spinner1StateChanged

    private void volumen_sldrStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_volumen_sldrStateChanged
        volumen_clone_sldr.setValue(volumen_sldr.getValue());
    }//GEN-LAST:event_volumen_sldrStateChanged

    private void verificar_correockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verificar_correockActionPerformed

    }//GEN-LAST:event_verificar_correockActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana_1().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton boton_iphone_clone_tb;
    private javax.swing.JToggleButton boton_iphone_tb;
    private javax.swing.JLabel chiquitin_lbl;
    private javax.swing.JComboBox<String> combobox1;
    private javax.swing.JComboBox<String> combobox1_clone;
    private javax.swing.JTextField escribir_correo_clone_field;
    private javax.swing.JTextField escribir_correo_field;
    private javax.swing.ButtonGroup grup_botones123;
    private javax.swing.ButtonGroup grup_botones123_clone;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton opcion1_clonerb;
    private javax.swing.JRadioButton opcion1rb;
    private javax.swing.JRadioButton opcion2_clonerb;
    private javax.swing.JRadioButton opcion2rb;
    private javax.swing.JRadioButton opcion3_clonerb;
    private javax.swing.JRadioButton opcion3rb;
    private javax.swing.JCheckBox opcion4_cloneck;
    private javax.swing.JCheckBox opcion4ck;
    private javax.swing.JCheckBox opcion5_cloneck;
    private javax.swing.JCheckBox opcion5ck;
    private javax.swing.JCheckBox opcion6_cloneck;
    private javax.swing.JCheckBox opcion6ck;
    private javax.swing.JSeparator separador;
    private javax.swing.JSpinner spinner1;
    private javax.swing.JSpinner spinner1_clone;
    private javax.swing.JLabel texto_correo;
    private javax.swing.JLabel texto_correo_2;
    private javax.swing.JTextField texto_random_clone_field;
    private javax.swing.JTextField texto_random_field;
    private javax.swing.JCheckBox verificar_correock;
    private javax.swing.JSlider volumen_clone_sldr;
    private javax.swing.JSlider volumen_sldr;
    // End of variables declaration//GEN-END:variables
}
