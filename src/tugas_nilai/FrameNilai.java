/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas_nilai;

/**
 *
 * @author YeniNAzizah
 */
public class FrameNilai extends javax.swing.JFrame {

    /**
     * Creates new form FrameNilai
     */
    public FrameNilai() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Nama = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Absen = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Mapel = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        Nilai = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TA = new javax.swing.JTextArea();
        Btnproses = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Penilaian Siswa");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(110, 10, 120, 40);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("Nama    :");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(40, 40, 60, 20);
        getContentPane().add(Nama);
        Nama.setBounds(110, 40, 130, 30);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("Absen   :");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(40, 80, 70, 30);
        getContentPane().add(Absen);
        Absen.setBounds(110, 80, 130, 30);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setText("Mapel   :");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(40, 120, 60, 20);
        getContentPane().add(Mapel);
        Mapel.setBounds(110, 120, 130, 30);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("Nilai      :");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(40, 160, 80, 30);
        getContentPane().add(Nilai);
        Nilai.setBounds(110, 160, 130, 30);

        TA.setEditable(false);
        TA.setColumns(20);
        TA.setRows(5);
        jScrollPane1.setViewportView(TA);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(40, 230, 270, 110);

        Btnproses.setText("PROSES");
        Btnproses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnprosesActionPerformed(evt);
            }
        });
        getContentPane().add(Btnproses);
        Btnproses.setBounds(140, 200, 80, 23);

        setBounds(0, 0, 349, 385);
    }// </editor-fold>//GEN-END:initComponents

    private void BtnprosesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnprosesActionPerformed
        // TODO add your handling code here:
        String nama = Nama.getText();
        int absen = Integer.parseInt(Absen.getText());
        String mapel = Mapel.getText();
        int nilai = Integer.parseInt(Nilai.getText());
        String predikat;

        if (nilai <= 74)
        predikat = "Predikat = Tidak Lulus";
        else if (nilai >= 75 && nilai <= 84)
        predikat = "Predikat = Lulus";
        else if (nilai >=85 && nilai <= 100)
        predikat = "Predikat = Sempurna";
        else if (nilai >100)
        predikat = "Nilai Melebihi Batas";
        else
        predikat = "";

        TA.setText("Nama= "+nama+"\n"+"Absen= "+absen+"\n"+"Mapel= "+mapel+"\n"+predikat);
    }//GEN-LAST:event_BtnprosesActionPerformed

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
            java.util.logging.Logger.getLogger(FrameNilai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameNilai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameNilai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameNilai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameNilai().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Absen;
    private javax.swing.JButton Btnproses;
    private javax.swing.JTextField Mapel;
    private javax.swing.JTextField Nama;
    private javax.swing.JTextField Nilai;
    private javax.swing.JTextArea TA;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
