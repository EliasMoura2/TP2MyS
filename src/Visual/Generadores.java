package Visual;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import logica.Generador;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
/**
 *
 * @author elias
 */
public class Generadores extends javax.swing.JFrame {

    /**
     * Creates new form Generadores
     */
    
    ControladoraVisual miVisual;
    int miPeriodo;
    int miModulo;
    int miIncremento;
    int miMultiplicador;
    Generador unGenerador;
    int tipoGenerador = 0;
    
    public Generadores(ControladoraVisual miVisual, int periodo, int modulo, int incremento, int multiplicador, int semilla) {
        initComponents();
        this.setTitle("Generador congruencial lineal");
        //lblTest.setVisible(false);
        //btnMonobit.setVisible(false);
        //btnPoker.setVisible(false);
        //btnRachas.setVisible(false);
        //btnRachasLargas.setVisible(false);
        txtModulo.setText(String.valueOf(modulo));
        txtIncremento.setText(String.valueOf(incremento));
        txtMultiplicador.setText(String.valueOf(multiplicador));
        txtSemilla.setText(String.valueOf(semilla));
        //miPeriodo=periodo;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        generador = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtSemilla = new javax.swing.JTextField();
        txtModulo = new javax.swing.JTextField();
        txtMultiplicador = new javax.swing.JTextField();
        txtIncremento = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnGenerar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        rbGCL = new javax.swing.JRadioButton();
        rbGCM = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnMonobit = new javax.swing.JButton();
        btnPoker = new javax.swing.JButton();
        btnRachasLargas = new javax.swing.JButton();
        btnRachas = new javax.swing.JButton();
        lblTest = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("Modulo (m):");

        jLabel3.setText("Multiplicador (a):");

        jLabel4.setText("Incremento (c):");

        jLabel5.setText("Semilla (Xo):");

        txtModulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtModuloActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "n", "Semilla", "Xn+1", "Estandarizado"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        btnGenerar.setText("Generar nros");
        btnGenerar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnGenerarMouseMoved(evt);
            }
        });
        btnGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        generador.add(rbGCL);
        rbGCL.setText("GCL");
        rbGCL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbGCLActionPerformed(evt);
            }
        });

        generador.add(rbGCM);
        rbGCM.setText("GCM");
        rbGCM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbGCMActionPerformed(evt);
            }
        });

        jLabel1.setText("Tipo generador:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtModulo))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnGenerar, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel5))
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtSemilla)
                                    .addComponent(txtMultiplicador)
                                    .addComponent(txtIncremento, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(rbGCL)
                                        .addGap(18, 18, 18)
                                        .addComponent(rbGCM)
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtModulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtIncremento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMultiplicador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtSemilla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(rbGCL)
                                .addComponent(jLabel1))
                            .addComponent(rbGCM))
                        .addGap(20, 20, 20)
                        .addComponent(btnGenerar)))
                .addGap(18, 18, 18)
                .addComponent(btnSalir)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        btnMonobit.setText("Monobit");

        btnPoker.setText("Poker");

        btnRachasLargas.setText("Rachas largas");

        btnRachas.setText("Rachas");

        lblTest.setForeground(new java.awt.Color(255, 153, 0));
        lblTest.setText("Tests F.I.P.S.");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTest)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnMonobit, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPoker, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRachas, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRachasLargas, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRachasLargas)
                    .addComponent(btnRachas)
                    .addComponent(btnPoker)
                    .addComponent(btnMonobit)
                    .addComponent(lblTest))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtModuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtModuloActionPerformed

    }//GEN-LAST:event_txtModuloActionPerformed

    private void btnGenerarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGenerarMouseMoved
        btnGenerar.setToolTipText("generar datos para los generadores"); //proporciona un mesaje al pasar el mouse por ensima del objeto
    }//GEN-LAST:event_btnGenerarMouseMoved

    private void btnGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarActionPerformed
        if (controlarCamposGenerador()){
            int semilla = Integer.parseInt(txtSemilla.getText());
            int incremento = Integer.parseInt(txtIncremento.getText());
            int multiplicador = Integer.parseInt(txtMultiplicador.getText());
            int modulo = Integer.parseInt(txtModulo.getText());
            if(tipoGenerador == 1){
                //==try {
                    unGenerador = miVisual.altaGenerador(modulo, multiplicador, incremento, semilla);
                //} catch (Exception ex) {
                    //JOptionPane.showMessageDialog(null, "ERROR");
                //}
            } 
            if (tipoGenerador == 2){
                //try {
                    unGenerador = miVisual.altaGenerador(modulo, multiplicador, semilla);
                //} catch (Exception ex) {
                    //JOptionPane.showMessageDialog(null, "ERROR");
                //}
            }
            
        }
    }//GEN-LAST:event_btnGenerarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void rbGCLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbGCLActionPerformed
        tipoGenerador = 1;
    }//GEN-LAST:event_rbGCLActionPerformed

    private void rbGCMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbGCMActionPerformed
        tipoGenerador = 2;
    }//GEN-LAST:event_rbGCMActionPerformed

public boolean controlarCamposGenerador(){
        boolean flag = true;
        if ("".equals(txtModulo.getText())) {
            flag = false;
            JOptionPane.showMessageDialog(null, "Ingrese el modulo");
        } else {
            if ("".equals(txtMultiplicador.getText())) {
                flag = false;
                JOptionPane.showMessageDialog(null, "Ingrese el multiplicador");
            } else {
                if ("".equals(txtIncremento.getText())) {
                    flag = false;
                    JOptionPane.showMessageDialog(null, "Ingrese el incremento");
                } else {
                    if ("".equals(txtSemilla.getText())) {
                        flag = false;
                        JOptionPane.showMessageDialog(null, "Ingrese la semilla");
                    } 
                }
            }
        }
        return flag;
    }    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGenerar;
    private javax.swing.JButton btnMonobit;
    private javax.swing.JButton btnPoker;
    private javax.swing.JButton btnRachas;
    private javax.swing.JButton btnRachasLargas;
    private javax.swing.JButton btnSalir;
    public static javax.swing.ButtonGroup generador;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblTest;
    private javax.swing.JRadioButton rbGCL;
    private javax.swing.JRadioButton rbGCM;
    private javax.swing.JTextField txtIncremento;
    private javax.swing.JTextField txtModulo;
    private javax.swing.JTextField txtMultiplicador;
    private javax.swing.JTextField txtSemilla;
    // End of variables declaration//GEN-END:variables
}
