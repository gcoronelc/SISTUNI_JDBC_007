
package FORMULARIOS;

import CONEXION.Conectividad;
import ENTIDADES.*;
import java.awt.Color;

public class Paso3_Declaracion extends javax.swing.JFrame {
    static Persona per3;
    static Derechohabiente der3;
    static Titular tit3;
    static Detalle_Latencia det_lat3;
    static Detalle_Prest_Eco det_prest_eco3;
    static Detalle_Registro det_reg3;
    static Solicitante sol3;
    static Empleador emp3;
    Formulario f=new Formulario();

    public Paso3_Declaracion(Persona p, Derechohabiente d, Titular t, Detalle_Latencia dl, Detalle_Prest_Eco dp, Detalle_Registro dr, Solicitante s, Empleador e) {
        initComponents();
        this.setTitle("Formulario-Paso3");
        this.getContentPane().setBackground(Color.WHITE);
        per3=p;
        der3=d;
        tit3=t;
        det_lat3=dl;
        det_prest_eco3=dp;
        det_reg3=dr;
        sol3=s;
        emp3=e;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rbtngauto = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        txt_mont_agro = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        rbtn_si_auto = new javax.swing.JRadioButton();
        rbtn_no_auto = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_firm_sol = new javax.swing.JTextField();
        txt_firm_emp = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("III. DECLARACIÓN JURADA");

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("El(los) firmantes declaran bajo juramento, que la información consignada y la\ndocumentación que se adjunta a la presente declaración es verdadera, no es\nadulterada, sujeta al principio de veracidad y fiscalización posterior \nestablecida en la Ley N° 27444 - Ley de Procedimiento Administrativo General.\nTratándose de afiliación al Seguro de Salud Agrario Independiente, declara(n)\nque desarrolla(n) actividades de cultivo, crianza avicola, acuícola y/o\nagroindustria y los ingresos netos por otras actividades no superan el 20% de \ningreso neto actual proyectado que asciende a:");
        jTextArea1.setAutoscrolls(false);
        jScrollPane1.setViewportView(jTextArea1);

        txt_mont_agro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_mont_agroActionPerformed(evt);
            }
        });

        jTextArea2.setEditable(false);
        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        jTextArea2.setRows(5);
        jTextArea2.setText("Asímismo, tiene conociemiento que de comprobarse falsedad en la declaración,\ninformación o documentación presentada, se encuentra obligado(a) a resarcir\nlos daños ocasionados, asi como a asumir la responsabilidad penal a que\nhubiere lugar.\nIgualmente, autorizo que las notificaciones de actos administrativos se\nremitan a los correos electronicos consignados en el presente formulario.  ");
        jTextArea2.setAutoscrolls(false);
        jScrollPane2.setViewportView(jTextArea2);

        rbtngauto.add(rbtn_si_auto);
        rbtn_si_auto.setText("Sí");
        rbtn_si_auto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtn_si_autoActionPerformed(evt);
            }
        });

        rbtngauto.add(rbtn_no_auto);
        rbtn_no_auto.setText("No");
        rbtn_no_auto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtn_no_autoActionPerformed(evt);
            }
        });

        jButton1.setText("CONTINUAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Firma del Solicitante:");

        jLabel3.setText("Firma del Empleador:");

        txt_firm_sol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_firm_solActionPerformed(evt);
            }
        });

        jLabel4.setText("(en soles)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(51, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(51, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(187, 187, 187)
                .addComponent(rbtn_si_auto)
                .addGap(91, 91, 91)
                .addComponent(rbtn_no_auto)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_firm_sol, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addComponent(txt_firm_emp))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(217, 217, 217)
                .addComponent(txt_mont_agro, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_mont_agro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtn_si_auto)
                    .addComponent(rbtn_no_auto))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_firm_sol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_firm_emp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_mont_agroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_mont_agroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_mont_agroActionPerformed

    private void rbtn_si_autoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtn_si_autoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtn_si_autoActionPerformed

    private void rbtn_no_autoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtn_no_autoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtn_no_autoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(!"".equals(txt_mont_agro.getText())){
            det_reg3.setMonto_ing_neto_agro(Integer.parseInt(txt_mont_agro.getText()));
        }
        if(rbtn_si_auto.isSelected()){
            f.setAut_correo("SI");
        }else{
           if(rbtn_si_auto.isSelected()){
                f.setAut_correo("NO");
            } 
        }
        Conectividad fun=new Conectividad(); 
        fun.conectar();
        
        sol3.setFirma_bene_prest(txt_firm_sol.getText());
        emp3.setFirm_emp(txt_firm_emp.getText());
        
        if(emp3.getCod_emp()!=null){
            String  sql2;
            sql2 ="INSERT INTO EMPLEADOR VALUES ('"+ emp3.getNro_doc_emp()+"','"+ emp3.getNom_emp()+"','"+ emp3.getFirm_emp()+"','"+ emp3.getCod_emp()+"')";
            insertar(sql2, fun);
        }
        if(per3.getCod_aseg()!=null){
            String  sql2;
            sql2 ="INSERT INTO PERSONA VALUES ('"+ per3.getAp_mat_per()+"','"+ per3.getAp_pat_per()+"','"+ per3.getAp_cas_per()+"','"+ per3.getNom_per()+"','"+ per3.getGen_per()+"','"+ per3.getEst_civil_per()+"','"+ per3.getFech_nac_per()+"',"+ per3.getTelf_per()+",'"+ per3.getCorreo_per()+"','"+ per3.getVia_per_dir()+"',"+ per3.getNum_dir_per()+",'"+ per3.getDepa_dir_per()+"',"+ per3.getInt_dir_per()+",'"+ per3.getMz_dir_per()+"',"+ per3.getLote_dir_per()+","+ per3.getKm_dir_per()+","+ per3.getBlock_dir_per()+","+ per3.getEtap_dir_per()+",'"+ per3.getZon_dir_per()+"','"+ per3.getDep_dir_per()+"','"+ per3.getProv_dir_per()+"','"+ per3.getDist_dir_per()+"','"+ per3.getRef_dir_per()+"','"+ per3.getCod_aseg()+"','"+ per3.getNro_doc_per()+"')";
            insertar(sql2, fun);
        }

        
        Paso4_UsodeEssalud p4= new Paso4_UsodeEssalud(per3,der3,tit3,det_lat3,det_prest_eco3,det_reg3,sol3,emp3,f);
        p4.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txt_firm_solActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_firm_solActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_firm_solActionPerformed

    private void insertar(String cad, Conectividad f){
        boolean k = f.escribir(cad); 
    }
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
            java.util.logging.Logger.getLogger(Paso3_Declaracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Paso3_Declaracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Paso3_Declaracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Paso3_Declaracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Paso3_Declaracion(per3,der3,tit3,det_lat3,det_prest_eco3,det_reg3,sol3,emp3).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JRadioButton rbtn_no_auto;
    private javax.swing.JRadioButton rbtn_si_auto;
    private javax.swing.ButtonGroup rbtngauto;
    private javax.swing.JTextField txt_firm_emp;
    private javax.swing.JTextField txt_firm_sol;
    private javax.swing.JTextField txt_mont_agro;
    // End of variables declaration//GEN-END:variables
}
