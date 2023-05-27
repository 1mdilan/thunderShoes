package main.java.com.dilanfierro.thundershoes.view;

import java.awt.*;
import javax.swing.*;

public class Login extends javax.swing.JInternalFrame {

        public Login() {
                initComponents();

                // Se le asigna un nombre al marco
                setTitle("Inicio de Sesión");
                setFrameIcon(null); // Quita el icono predeterminado

                // Eliminación de los bordes del marco
                setBorder(null);

                // Se asignan los textos de los elementos visuales
                lblUsuario.setText("Usuario:");
                lblContraseña.setText("Contraseña:");
                btnAceptar.setText("Continuar");
                btnCancelar.setText("Cancelar");

                txtNombre.setText("");
                passContraseña.setText("");

                pnlFoto.setBackground(Color.decode("#040404"));

        }

        // Code">//GEN-BEGIN:initComponents
        private void initComponents() {
                java.awt.GridBagConstraints gridBagConstraints;

                pnlBg = new javax.swing.JPanel();
                pnlFoto = new javax.swing.JPanel();
                jProgressBar1 = new javax.swing.JProgressBar();
                lblUsuario = new javax.swing.JLabel();
                txtNombre = new javax.swing.JTextField();
                lblContraseña = new javax.swing.JLabel();
                passContraseña = new javax.swing.JPasswordField();
                btnAceptar = new javax.swing.JButton();
                btnCancelar = new javax.swing.JButton();

                getContentPane().setLayout(new java.awt.GridBagLayout());

                javax.swing.GroupLayout pnlFotoLayout = new javax.swing.GroupLayout(pnlFoto);
                pnlFoto.setLayout(pnlFotoLayout);
                pnlFotoLayout.setHorizontalGroup(
                                pnlFotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGap(0, 0, Short.MAX_VALUE));
                pnlFotoLayout.setVerticalGroup(
                                pnlFotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGap(0, 175, Short.MAX_VALUE));

                lblUsuario.setText("jLabel1");

                txtNombre.setText("jTextField1");

                lblContraseña.setText("jLabel2");

                passContraseña.setText("jPasswordField1");

                btnAceptar.setText("jButton1");

                btnCancelar.setText("jButton1");

                javax.swing.GroupLayout pnlBgLayout = new javax.swing.GroupLayout(pnlBg);
                pnlBg.setLayout(pnlBgLayout);
                pnlBgLayout.setHorizontalGroup(
                                pnlBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(pnlBgLayout.createSequentialGroup()
                                                                .addGap(0, 0, 0)
                                                                .addGroup(pnlBgLayout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                false)
                                                                                .addComponent(jProgressBar1,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                175, Short.MAX_VALUE)
                                                                                .addComponent(pnlFoto,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE))
                                                                .addGap(25, 25, 25)
                                                                .addGroup(pnlBgLayout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                false)
                                                                                .addComponent(lblUsuario)
                                                                                .addComponent(lblContraseña)
                                                                                .addGroup(pnlBgLayout
                                                                                                .createSequentialGroup()
                                                                                                .addComponent(btnAceptar,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                110,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                                .addComponent(btnCancelar,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                118,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addComponent(passContraseña)
                                                                                .addComponent(txtNombre))
                                                                .addGap(0, 0, Short.MAX_VALUE)));
                pnlBgLayout.setVerticalGroup(
                                pnlBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(pnlBgLayout.createSequentialGroup()
                                                                .addComponent(pnlFoto,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(0, 0, 0)
                                                                .addComponent(jProgressBar1,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(pnlBgLayout.createSequentialGroup()
                                                                .addComponent(lblUsuario)
                                                                .addGap(6, 6, 6)
                                                                .addComponent(txtNombre,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                35,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(19, 19, 19)
                                                                .addComponent(lblContraseña)
                                                                .addGap(6, 6, 6)
                                                                .addComponent(passContraseña,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                38,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(19, 19, 19)
                                                                .addGroup(pnlBgLayout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(btnCancelar,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE)
                                                                                .addComponent(btnAceptar,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE))));

                gridBagConstraints = new java.awt.GridBagConstraints();
                gridBagConstraints.gridx = 0;
                gridBagConstraints.gridy = 0;
                gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
                gridBagConstraints.insets = new java.awt.Insets(27, 25, 27, 25);
                getContentPane().add(pnlBg, gridBagConstraints);

                pack();
        }// </editor-fold>//GEN-END:initComponents

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton btnAceptar;
        private javax.swing.JButton btnCancelar;
        private javax.swing.JProgressBar jProgressBar1;
        private javax.swing.JLabel lblContraseña;
        private javax.swing.JLabel lblUsuario;
        private javax.swing.JPasswordField passContraseña;
        private javax.swing.JPanel pnlBg;
        private javax.swing.JPanel pnlFoto;
        private javax.swing.JTextField txtNombre;
        // End of variables declaration//GEN-END:variables
}
