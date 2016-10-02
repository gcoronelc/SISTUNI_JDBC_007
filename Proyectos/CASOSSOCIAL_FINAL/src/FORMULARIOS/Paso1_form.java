
package FORMULARIOS;

import CONEXION.Conectividad;
import ENTIDADES.*;

import java.awt.Color;
import javax.swing.JOptionPane;

public class Paso1_form extends javax.swing.JFrame {
    
    Documento doc_tit = new Documento();
    Documento doc_emp = new Documento();

    public Paso1_form() {
        initComponents();
        this.setTitle("Formulario-Paso1");
        this.getContentPane().setBackground(Color.WHITE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_volver = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cmb_tip_doc_tit = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        txt_num_doc_tit = new javax.swing.JTextField();
        btn_cont = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cmb_tip_doc_emp = new javax.swing.JComboBox<>();
        txt_num_doc_emp = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btn_volver.setBackground(new java.awt.Color(255, 255, 255));
        btn_volver.setText("VOLVER AL MENU DE INICIO");
        btn_volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_volverActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("I. INFORMACIÓN DEL ASEGURADO TITULAR");

        jLabel2.setText("Tipo de Documento: ");

        cmb_tip_doc_tit.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DNI", "CARNET DE EXTRANJERÍA", "PASAPORTE" }));
        cmb_tip_doc_tit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_tip_doc_titActionPerformed(evt);
            }
        });

        jLabel3.setText("Número:");

        txt_num_doc_tit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_num_doc_titActionPerformed(evt);
            }
        });

        btn_cont.setBackground(new java.awt.Color(255, 255, 255));
        btn_cont.setText("CONTINUAR");
        btn_cont.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_contActionPerformed(evt);
            }
        });

        jLabel4.setText("(*) Entidad Empleadora:");
        jLabel4.setToolTipText("");

        jLabel5.setText("- Tipo de Documento:");

        jLabel6.setText("- Número:");

        cmb_tip_doc_emp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "RUC", "NCO", "CIE" }));
        cmb_tip_doc_emp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_tip_doc_empActionPerformed(evt);
            }
        });

        txt_num_doc_emp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_num_doc_empActionPerformed(evt);
            }
        });

        jLabel7.setText("(*) En caso de solicitar prestacion de cobertura por desempleo, llenar los ");

        jLabel8.setText("campos con los datos de la última entidad empleadora.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_num_doc_emp)
                                    .addComponent(cmb_tip_doc_emp, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cmb_tip_doc_tit, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txt_num_doc_tit))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_volver)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_cont)))
                        .addGap(0, 39, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel8)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cmb_tip_doc_tit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_num_doc_tit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cmb_tip_doc_emp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_num_doc_emp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_volver)
                    .addComponent(btn_cont))
                .addGap(27, 27, 27)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_volverActionPerformed
        // TODO add your handling code here:
        Inicio in= new Inicio();
        this.setVisible(false);
    }//GEN-LAST:event_btn_volverActionPerformed

    private void btn_contActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_contActionPerformed
        // TODO add your handling code here:}
        String sql1,sql2;
        doc_tit.setNro_doc(txt_num_doc_tit.getText());
        doc_emp.setNro_doc(txt_num_doc_emp.getText());
        Paso2_Solicitud p2 = new Paso2_Solicitud(doc_tit, doc_emp);
        if(doc_tit.getNro_doc()!=null & doc_emp.getNro_doc()!=null & doc_tit.getTipo_doc()!=null & doc_emp.getTipo_doc()!=null){
            sql1 ="INSERT INTO DOCUMENTO VALUES ('"+ doc_tit.getNro_doc()+"','"+ doc_tit.getTipo_doc()+"','"+ doc_tit.getNom_comp_doc()+"')";
            sql2 ="INSERT INTO DOCUMENTO VALUES ('"+ doc_emp.getNro_doc()+"','"+ doc_emp.getTipo_doc()+"','"+ doc_emp.getNom_comp_doc()+"')";
            Conectividad fun=new Conectividad(); 
            fun.conectar();
            insertar(sql1, fun);
            insertar(sql2, fun);
            p2.setVisible(true);
            this.setVisible(false);
        }
        else{
            JOptionPane.showMessageDialog(rootPane,"No ha ingresado los datos");
        }
    }//GEN-LAST:event_btn_contActionPerformed

    private void cmb_tip_doc_titActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_tip_doc_titActionPerformed
        // TODO add your handling code here:
        if(cmb_tip_doc_tit.getSelectedIndex()==0){
            doc_tit.setTipo_doc("DNI");
            doc_tit.setNom_comp_doc("Documento nacional de identidad");
        }else{
            if(cmb_tip_doc_tit.getSelectedIndex()==1){
                doc_tit.setTipo_doc("CE");
                doc_tit.setNom_comp_doc("Carnet de Extranjería");
            }else{
                if(cmb_tip_doc_tit.getSelectedIndex()==2){
                    doc_tit.setTipo_doc("PAS");
                    doc_tit.setNom_comp_doc("Pasaporte");
                }
            }
        }
    }//GEN-LAST:event_cmb_tip_doc_titActionPerformed

    private void insertar(String cad, Conectividad f){
        boolean k = f.escribir(cad); 
    }
    private void txt_num_doc_titActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_num_doc_titActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_num_doc_titActionPerformed

    private void cmb_tip_doc_empActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_tip_doc_empActionPerformed
        // TODO add your handling code here:
         if(cmb_tip_doc_emp.getSelectedIndex()==0){
            doc_emp.setTipo_doc("RUC");
            doc_emp.setNom_comp_doc("Registro Único de Contribuyentes");
        }else{
            if(cmb_tip_doc_emp.getSelectedIndex()==1){
                doc_emp.setTipo_doc("NCO");
                doc_emp.setNom_comp_doc("N° Correl de Org");
            }else{
                if(cmb_tip_doc_emp.getSelectedIndex()==2){
                    doc_emp.setTipo_doc("CIE");
                    doc_emp.setNom_comp_doc("Cod insc empleador TH");
                }
            }
        }
    }//GEN-LAST:event_cmb_tip_doc_empActionPerformed

    private void txt_num_doc_empActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_num_doc_empActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_num_doc_empActionPerformed

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
            java.util.logging.Logger.getLogger(Paso1_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Paso1_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Paso1_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Paso1_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Paso1_form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cont;
    private javax.swing.JButton btn_volver;
    private javax.swing.JComboBox<String> cmb_tip_doc_emp;
    private javax.swing.JComboBox<String> cmb_tip_doc_tit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField txt_num_doc_emp;
    private javax.swing.JTextField txt_num_doc_tit;
    // End of variables declaration//GEN-END:variables
}
