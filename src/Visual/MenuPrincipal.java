package Visual;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author elias
 */
public class MenuPrincipal extends javax.swing.JFrame {

    ControladoraVisual miVisual;
    DefaultComboBoxModel miModeloComboMultiplicador = new DefaultComboBoxModel();
    DefaultComboBoxModel miModeloComboIncremento = new DefaultComboBoxModel();
    
    public MenuPrincipal(ControladoraVisual miVisual) {
        initComponents();
        this.setTitle("Menu principal");
        txtModulo.setEnabled(false);
        txtMultiplicador.setEnabled(false);
        txtSemilla.setEnabled(false);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtPeriodo = new javax.swing.JTextField();
        btnGenerar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnSalir = new javax.swing.JButton();
        txtModulo = new javax.swing.JTextField();
        txtMultiplicador = new javax.swing.JTextField();
        btnGCL = new javax.swing.JButton();
        txtSemilla = new javax.swing.JTextField();
        btnGCM = new javax.swing.JButton();
        btnRuleta = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        cmbIncrementos = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();

        jLabel6.setText("jLabel6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setForeground(new java.awt.Color(255, 153, 51));
        jLabel1.setText("Ingrese el periodo:");

        btnGenerar.setText("Generar");
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(btnGenerar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGenerar))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        txtModulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtModuloActionPerformed(evt);
            }
        });

        btnGCL.setText("G.C.L");
        btnGCL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGCLMouseClicked(evt);
            }
        });
        btnGCL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGCLActionPerformed(evt);
            }
        });

        btnGCM.setText("G.C.M.");

        btnRuleta.setText("Ruleta");

        jLabel7.setText("Valores recomendados:");

        cmbIncrementos.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                cmbIncrementosMouseMoved(evt);
            }
        });

        jLabel2.setText("Modulo (m):");

        jLabel3.setText("Multiplicador (a):");

        jLabel4.setText("Incremento (c):");

        jLabel5.setText("Semilla (Xo):");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)))
                            .addComponent(jLabel3)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtMultiplicador)
                                .addComponent(txtSemilla, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cmbIncrementos, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(txtModulo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnGCL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnGCM, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                            .addComponent(btnRuleta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtModulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGCL))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGCM)
                    .addComponent(cmbIncrementos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMultiplicador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(btnRuleta))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnSalir)
                        .addComponent(txtSemilla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        jMenuBar1.setBackground(new java.awt.Color(255, 153, 51));
        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarActionPerformed
        boolean salir = true;
        int a; //multiplicador
        int c; //incremento
        int Xo; //semilla
        int m = 0; // modulo
        int periodo;

        int k = 4;
        int i = 2;
        int a1,b1;
        
        List <Integer> coPrimos = new LinkedList();
        miModeloComboMultiplicador = new DefaultComboBoxModel();
        miModeloComboIncremento = new DefaultComboBoxModel();
        periodo = Integer.parseInt(txtPeriodo.getText());
        
        while (salir == true){ // bucle que sale a partir de la bandera
            //if (periodo >= 20000){ // controla que el periodo ingresado sea >= 20000
                while (m < periodo){ // mientra m sea menor al periodo calcula m = 2^k
                    m =  (int) Math.pow(2, k); // funcion que devuelve los valores de m = 2^k
                    if (m < periodo){ // controla m para que k se quede con el ultimo valor usado en m=2^k
                        k ++;
                    }
                }
               salir = false;
            //} else {
                //JOptionPane.showMessageDialog(null, "Ingrese el periodo maximo siempre mayor a 20.000", "ADVERTENCIA", 0);
                //txtPeriodo.setText(String.valueOf(20000));
            //}
        } // end while       
  
        txtModulo.setText(String.valueOf(m));
        
        for(i=2;i<=m;i++){ //Algoritmo de Euclides
            a1 = m;
            b1=i;
            while( a1 != b1) {
                if( a1 < b1 ) {
                    b1 = b1 - a1;
                } else {
                    a1 = a1 - b1;
                }
            }
            if ((a1 == 1) || (b1 == 1)){
                //System.out.printf("El m.c.d. entre a: %d y %d es: %d\n",m,i,a1);
                coPrimos.add(i);
            }
        }
        
        miModeloComboMultiplicador = new DefaultComboBoxModel(); //Defino un modelo para cargar el combobox
        Integer x =coPrimos.size(); //obtiene la cantidad de elementos de el array coPrimos
        //System.out.print(x);
        for (Integer coPrimo: coPrimos){
            miModeloComboMultiplicador.addElement(coPrimo.intValue());
        }
        cmbIncrementos.setModel(miModeloComboMultiplicador);
 
    }//GEN-LAST:event_btnGenerarActionPerformed

    private void txtModuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtModuloActionPerformed
        
    }//GEN-LAST:event_txtModuloActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnGenerarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGenerarMouseMoved
        btnGenerar.setToolTipText("generar datos para los generadores"); //proporciona un mesaje al pasar el mouse por ensima del objeto
    }//GEN-LAST:event_btnGenerarMouseMoved

    private void cmbIncrementosMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbIncrementosMouseMoved
        cmbIncrementos.setToolTipText("Primos relativos del modulo");//proporciona un mesaje al pasar el mouse por ensima del objeto
    }//GEN-LAST:event_cmbIncrementosMouseMoved

    private void btnGCLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGCLActionPerformed
        GCL nuevaGCL = new GCL(miVisual);//(miVisual, miEmpleado)
        nuevaGCL.setLocation(250, 10);
        nuevaGCL.show();
    }//GEN-LAST:event_btnGCLActionPerformed

    private void btnGCLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGCLMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGCLMouseClicked



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGCL;
    private javax.swing.JButton btnGCM;
    private javax.swing.JButton btnGenerar;
    private javax.swing.JButton btnRuleta;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cmbIncrementos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtModulo;
    private javax.swing.JTextField txtMultiplicador;
    private javax.swing.JTextField txtPeriodo;
    private javax.swing.JTextField txtSemilla;
    // End of variables declaration//GEN-END:variables
}
