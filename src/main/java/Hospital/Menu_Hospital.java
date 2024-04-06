package Hospital;

import javax.swing.ImageIcon;

public class Menu_Hospital extends javax.swing.JFrame {

    ImageIcon imagen_Menu=new ImageIcon("hospi_imagen.png");
    ImageIcon imagen_M_General=new ImageIcon("imagen_General.png");
    ImageIcon imagen_M_General2=new ImageIcon("imagen_General2.png");
    ImageIcon imagen_M_Especialista=new ImageIcon("Imagen_Especialista.png");
    ImageIcon imagen_M_Especialista2=new ImageIcon("Imagen_Especialista2.png");
    public Menu_Hospital() {
        initComponents();
        this.setLocationRelativeTo(null);
        btn_imagen.doClick();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Ventana_Medico_General = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        Titulo_Medico_General = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_Area_General = new javax.swing.JTextArea();
        btn_Regresar_Medico_General = new javax.swing.JButton();
        Imagen_Medico_General = new javax.swing.JLabel();
        btn_imagen_General = new javax.swing.JButton();
        btn_imagen_General2 = new javax.swing.JButton();
        Imagen2 = new javax.swing.JLabel();
        Ventana_Medico_Especialista = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        Titulo_Medico_Especialista = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_Area_Especialista = new javax.swing.JTextArea();
        Imagen_Medico_Especialista = new javax.swing.JLabel();
        btn_Imagen_Especialista = new javax.swing.JButton();
        btn_Regresar_Medico_Especialista = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        Imagen3 = new javax.swing.JLabel();
        Panel_Principal = new javax.swing.JPanel();
        Titulo = new javax.swing.JLabel();
        btn_general = new javax.swing.JButton();
        btn_especialista = new javax.swing.JButton();
        btn_Salir = new javax.swing.JButton();
        Imagen = new javax.swing.JLabel();
        btn_imagen = new javax.swing.JButton();

        Ventana_Medico_General.setTitle("Medicos Generales");
        Ventana_Medico_General.setMinimumSize(new java.awt.Dimension(660, 493));
        Ventana_Medico_General.setResizable(false);

        jPanel1.setMinimumSize(new java.awt.Dimension(660, 493));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Titulo_Medico_General.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        Titulo_Medico_General.setText("Medico General:");
        jPanel1.add(Titulo_Medico_General, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, -1, -1));

        txt_Area_General.setColumns(20);
        txt_Area_General.setRows(5);
        txt_Area_General.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos del medico General:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14))); // NOI18N
        jScrollPane1.setViewportView(txt_Area_General);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 270, 270));

        btn_Regresar_Medico_General.setText("Regresar");
        btn_Regresar_Medico_General.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Regresar_Medico_GeneralActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Regresar_Medico_General, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 410, 120, 40));

        Imagen_Medico_General.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Imagen_Medico_General.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Fotografia del medico General:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14))); // NOI18N
        Imagen_Medico_General.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(Imagen_Medico_General, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 120, 280, 270));

        btn_imagen_General.setFont(new java.awt.Font("Arial", 2, 12)); // NOI18N
        btn_imagen_General.setText("General 1");
        btn_imagen_General.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_imagen_GeneralActionPerformed(evt);
            }
        });
        jPanel1.add(btn_imagen_General, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 160, 40));

        btn_imagen_General2.setFont(new java.awt.Font("Arial", 2, 12)); // NOI18N
        btn_imagen_General2.setText("General 2");
        btn_imagen_General2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_imagen_General2ActionPerformed(evt);
            }
        });
        jPanel1.add(btn_imagen_General2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 60, 160, 40));
        jPanel1.add(Imagen2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 490));

        javax.swing.GroupLayout Ventana_Medico_GeneralLayout = new javax.swing.GroupLayout(Ventana_Medico_General.getContentPane());
        Ventana_Medico_General.getContentPane().setLayout(Ventana_Medico_GeneralLayout);
        Ventana_Medico_GeneralLayout.setHorizontalGroup(
            Ventana_Medico_GeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        Ventana_Medico_GeneralLayout.setVerticalGroup(
            Ventana_Medico_GeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Ventana_Medico_Especialista.setTitle("Medicos Especialistas");
        Ventana_Medico_Especialista.setMinimumSize(new java.awt.Dimension(660, 493));
        Ventana_Medico_Especialista.setResizable(false);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Titulo_Medico_Especialista.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        Titulo_Medico_Especialista.setText("Medico Especialista:");
        jPanel2.add(Titulo_Medico_Especialista, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, -1, -1));

        txt_Area_Especialista.setColumns(20);
        txt_Area_Especialista.setRows(5);
        txt_Area_Especialista.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos del Medico Especialista: ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14))); // NOI18N
        jScrollPane2.setViewportView(txt_Area_Especialista);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 280, 290));

        Imagen_Medico_Especialista.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Imagen_Medico_Especialista.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Fotografia del Medico Especialista:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14))); // NOI18N
        jPanel2.add(Imagen_Medico_Especialista, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 100, 280, 290));

        btn_Imagen_Especialista.setText("Especialista 1");
        btn_Imagen_Especialista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Imagen_EspecialistaActionPerformed(evt);
            }
        });
        jPanel2.add(btn_Imagen_Especialista, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 160, 40));

        btn_Regresar_Medico_Especialista.setText("Regresar");
        btn_Regresar_Medico_Especialista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Regresar_Medico_EspecialistaActionPerformed(evt);
            }
        });
        jPanel2.add(btn_Regresar_Medico_Especialista, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 400, 120, 50));

        jButton1.setText("Especialista 2");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 50, 160, 40));
        jPanel2.add(Imagen3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-3, -4, 660, 500));

        javax.swing.GroupLayout Ventana_Medico_EspecialistaLayout = new javax.swing.GroupLayout(Ventana_Medico_Especialista.getContentPane());
        Ventana_Medico_Especialista.getContentPane().setLayout(Ventana_Medico_EspecialistaLayout);
        Ventana_Medico_EspecialistaLayout.setHorizontalGroup(
            Ventana_Medico_EspecialistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        Ventana_Medico_EspecialistaLayout.setVerticalGroup(
            Ventana_Medico_EspecialistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu Hospital");
        setIconImage(getIconImage());
        setResizable(false);

        Panel_Principal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Titulo.setFont(new java.awt.Font("Arial", 2, 48)); // NOI18N
        Titulo.setForeground(new java.awt.Color(0, 153, 153));
        Titulo.setText("Hospital Santa Cruz");
        Panel_Principal.add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 430, 60));

        btn_general.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btn_general.setText("General");
        btn_general.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_generalActionPerformed(evt);
            }
        });
        Panel_Principal.add(btn_general, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 110, 70));

        btn_especialista.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btn_especialista.setText("Especialista");
        btn_especialista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_especialistaActionPerformed(evt);
            }
        });
        Panel_Principal.add(btn_especialista, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 200, -1, 70));

        btn_Salir.setText("Salir");
        btn_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SalirActionPerformed(evt);
            }
        });
        Panel_Principal.add(btn_Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 390, 120, 50));

        Imagen.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Panel_Principal.add(Imagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 490));

        btn_imagen.setText("Ver Fondo");
        btn_imagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_imagenActionPerformed(evt);
            }
        });
        Panel_Principal.add(btn_imagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 90, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel_Principal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel_Principal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_imagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_imagenActionPerformed
        Imagen.setIcon(imagen_Menu);
         Imagen2.setIcon(imagen_Menu);
         Imagen3.setIcon(imagen_Menu);
    }//GEN-LAST:event_btn_imagenActionPerformed

    private void btn_imagen_GeneralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_imagen_GeneralActionPerformed
       Imagen_Medico_General.setIcon(imagen_M_General);
       txt_Area_General.setText("");
       txt_Area_General.append("Id del Medico: 4752977");
       txt_Area_General.append(System.getProperty("line.separator"));
       txt_Area_General.append("El nombre del medico general es: Mario ochoa");
       txt_Area_General.append(System.getProperty("line.separator"));
       txt_Area_General.append("La antiguedad del medico es: 5 años");
       
    }//GEN-LAST:event_btn_imagen_GeneralActionPerformed

    private void btn_generalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_generalActionPerformed
      Ventana_Medico_General.setLocationRelativeTo(null);
        Ventana_Medico_General.setVisible(true);
    }//GEN-LAST:event_btn_generalActionPerformed

    private void btn_Regresar_Medico_GeneralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Regresar_Medico_GeneralActionPerformed
        Ventana_Medico_General.setVisible(false);
    }//GEN-LAST:event_btn_Regresar_Medico_GeneralActionPerformed

    private void btn_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SalirActionPerformed
       System.exit(0);
    }//GEN-LAST:event_btn_SalirActionPerformed

    private void btn_Imagen_EspecialistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Imagen_EspecialistaActionPerformed
       Imagen_Medico_Especialista.setIcon(imagen_M_Especialista);
       txt_Area_Especialista.setText("");
       txt_Area_Especialista.append("Id del Medico: 7527272");
       txt_Area_Especialista.append(System.getProperty("line.separator"));
       txt_Area_Especialista.append("El nombre del medico general es: Ernesto salazar");
       txt_Area_Especialista.append(System.getProperty("line.separator"));
       txt_Area_Especialista.append("Su Especialidad es: Oncologo");
    }//GEN-LAST:event_btn_Imagen_EspecialistaActionPerformed

    private void btn_Regresar_Medico_EspecialistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Regresar_Medico_EspecialistaActionPerformed
        Ventana_Medico_Especialista.setVisible(false);
    }//GEN-LAST:event_btn_Regresar_Medico_EspecialistaActionPerformed

    private void btn_especialistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_especialistaActionPerformed
         Ventana_Medico_Especialista.setLocationRelativeTo(null);
        Ventana_Medico_Especialista.setVisible(true);
    }//GEN-LAST:event_btn_especialistaActionPerformed

    private void btn_imagen_General2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_imagen_General2ActionPerformed
        Imagen_Medico_General.setIcon(imagen_M_General2);
       txt_Area_General.setText("");
       txt_Area_General.append("Id del Medico: 1537579");
       txt_Area_General.append(System.getProperty("line.separator"));
       txt_Area_General.append("El nombre del medico general es: Hernesto santos");
       txt_Area_General.append(System.getProperty("line.separator"));
       txt_Area_General.append("La antiguedad del medico es: 12 años");
    }//GEN-LAST:event_btn_imagen_General2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      Imagen_Medico_Especialista.setIcon(imagen_M_Especialista2);
       txt_Area_Especialista.setText("");
       txt_Area_Especialista.append("Id del Medico: 2478035");
       txt_Area_Especialista.append(System.getProperty("line.separator"));
       txt_Area_Especialista.append("El nombre del medico general es: Fabiola Vazquez");
       txt_Area_Especialista.append(System.getProperty("line.separator"));
       txt_Area_Especialista.append("Su Especialidad es: Radiologo");
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
   
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu_Hospital.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu_Hospital.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu_Hospital.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu_Hospital.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu_Hospital().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Imagen;
    private javax.swing.JLabel Imagen2;
    private javax.swing.JLabel Imagen3;
    private javax.swing.JLabel Imagen_Medico_Especialista;
    private javax.swing.JLabel Imagen_Medico_General;
    private javax.swing.JPanel Panel_Principal;
    private javax.swing.JLabel Titulo;
    private javax.swing.JLabel Titulo_Medico_Especialista;
    private javax.swing.JLabel Titulo_Medico_General;
    private javax.swing.JDialog Ventana_Medico_Especialista;
    private javax.swing.JDialog Ventana_Medico_General;
    private javax.swing.JButton btn_Imagen_Especialista;
    private javax.swing.JButton btn_Regresar_Medico_Especialista;
    private javax.swing.JButton btn_Regresar_Medico_General;
    private javax.swing.JButton btn_Salir;
    private javax.swing.JButton btn_especialista;
    private javax.swing.JButton btn_general;
    private javax.swing.JButton btn_imagen;
    private javax.swing.JButton btn_imagen_General;
    private javax.swing.JButton btn_imagen_General2;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea txt_Area_Especialista;
    private javax.swing.JTextArea txt_Area_General;
    // End of variables declaration//GEN-END:variables
}
