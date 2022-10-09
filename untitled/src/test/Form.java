package test;

import javax.swing.*;
import java.awt.*;

public class Form extends javax.swing.JPanel {

    public Form(String name) {
        initComponents();
        if (name == "Home") {
            lbName.setText("Created by MagometDevelopment");
            /*"Visualization of algorithms: \n" +
                                "\t select an algorithm from the menu at the top \n" +
                                "\t just enjoy programming \n \n \n" +*/
            //lbName.getIconTextGap()
            lbName.setHorizontalAlignment(SwingConstants.CENTER);
        }
        else {
            lbName.setText(name);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbName = new javax.swing.JLabel();

        setOpaque(false);

        lbName.setFont(new java.awt.Font("sansserif", 1, 48)); // NOI18N
        lbName.setForeground(new java.awt.Color(95, 95, 95));
        lbName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbName.setText("Form Name");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lbName, javax.swing.GroupLayout.DEFAULT_SIZE, 759, Short.MAX_VALUE)
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lbName, javax.swing.GroupLayout.DEFAULT_SIZE, 455, Short.MAX_VALUE)
                                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private javax.swing.JLabel lbName;
}