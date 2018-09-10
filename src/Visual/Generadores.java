package Visual;

import java.awt.event.KeyEvent;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.TableColumn;

import modeloDeTablas.ModeloTablaDetalles;
import javax.swing.JOptionPane;
import logica.Generador;

/**
 *
 * @author elias
 */
public class Generadores extends javax.swing.JFrame {

    ControladoraVisual miVisual;
    private ModeloTablaDetalles miModeloTablaDetalles;
    private List<Generador> generadores= new LinkedList();
   // private boolean flag=false;
    int miPeriodo;
    int miModulo;
    int miIncremento;
    int miMultiplicador;
    
    public Generadores(ControladoraVisual visual, int periodo, int modulo, int incremento, int multiplicador, int semilla) {
        initComponents();
        miVisual = visual;
        this.setTitle("Generador congruencial lineal");
        txtModulo.setText(String.valueOf(modulo));
        txtIncremento.setText(String.valueOf(incremento));
        txtMultiplicador.setText(String.valueOf(multiplicador));
        txtSemilla.setText(String.valueOf(semilla));
        //setearTamañoTabla();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        jTableDetalles = new javax.swing.JTable();
        btnSalir = new javax.swing.JButton();
        btnGCL = new javax.swing.JButton();
        btnGCM = new javax.swing.JButton();
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

        jTableDetalles.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTableDetalles);

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnGCL.setText("GCL");
        btnGCL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGCLActionPerformed(evt);
            }
        });

        btnGCM.setText("GCM");
        btnGCM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGCMActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtModulo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSemilla)
                            .addComponent(txtMultiplicador)
                            .addComponent(txtIncremento)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnGCM, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnGCL, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(313, 313, 313)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSalir))
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
                        .addComponent(btnGCL)
                        .addGap(18, 18, 18)
                        .addComponent(btnGCM)))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
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

    private void btnGCMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGCMActionPerformed
        if (controlarCamposGenerador()){
            //setearTamañoTabla();
            int semilla2 = Integer.parseInt(txtSemilla.getText());
            int multiplicador2 = Integer.parseInt(txtMultiplicador.getText());
            int modulo2 = Integer.parseInt(txtModulo.getText());

            Generador miGenerador = miVisual.altaGenerador(modulo2, multiplicador2, semilla2);
        }
    }//GEN-LAST:event_btnGCMActionPerformed

    private void btnGCLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGCLActionPerformed
        if (controlarCamposGenerador()){
            //setearTamañoTabla();
            int semilla2 = Integer.parseInt(txtSemilla.getText());
            int incremento2 = Integer.parseInt(txtIncremento.getText());
            int multiplicador2 = Integer.parseInt(txtMultiplicador.getText());
            int modulo2 = Integer.parseInt(txtModulo.getText());

            //try {
                Generador miGenerador = miVisual.altaGenerador(modulo2, multiplicador2, incremento2, semilla2);
                cargarFilaTabla(miGenerador);
                //JOptionPane.showMessageDialog(null, "Generador creado exitosamente", "COMFIRMACION", 0);
            //} catch (Exception ex) {
                //JOptionPane.showMessageDialog(null, "No se pudo crear el generador", "ERROR",0);
            //}
        }
    }//GEN-LAST:event_btnGCLActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void txtModuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtModuloActionPerformed

    }//GEN-LAST:event_txtModuloActionPerformed

    /*public void setearTamañoTabla() {
        TableColumn columna1 = jTableDetalles.getColumn("n");
        columna1.setPreferredWidth(25);
        TableColumn columna2 = jTableDetalles.getColumn("semilla");
        columna2.setPreferredWidth(25);
        TableColumn columna3 = jTableDetalles.getColumn("Xn+1");
        columna3.setPreferredWidth(25);
        TableColumn columna4 = jTableDetalles.getColumn("estandarizado");
        columna4.setPreferredWidth(25);
    }*/

    public void cargarFilaTabla(Generador miGenerador) {
        //if (flag == false) {
            generadores.add(miGenerador);
            //flag = true;
            miModeloTablaDetalles = new ModeloTablaDetalles(miGenerador);
        //} else {
            //int cantidadFilas = cantidades.length + 1;
            //int[] misCantidades = new int[cantidadFilas];
            //double[] misPrecios = new double[cantidadFilas];
            //for (int i = 0; i < (cantidades.length + 1); i++) {
                //if (i < cantidades.length) {
                    //misCantidades[i] = cantidades[i];
                    //misPrecios[i] = precios[i];
                //} else {
                    //misCantidades[i] = Integer.parseInt(txtCantidad.getText());
                    //misPrecios[i] = precio;
                    //productos.add(unProducto);
                //}
            //}
            //miModeloTablaDetalles = new ModeloTablaDetalles(productos, misCantidades, misPrecios);
            //cantidades = new int[cantidadFilas];
            //cantidades = misCantidades;
            //precios = new double[cantidadFilas];
            //precios = misPrecios;
        //}
        jTableDetalles.setModel(miModeloTablaDetalles);
    }
    
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
    private javax.swing.JButton btnGCL;
    private javax.swing.JButton btnGCM;
    private javax.swing.JButton btnMonobit;
    private javax.swing.JButton btnPoker;
    private javax.swing.JButton btnRachas;
    private javax.swing.JButton btnRachasLargas;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableDetalles;
    private javax.swing.JLabel lblTest;
    private javax.swing.JTextField txtIncremento;
    private javax.swing.JTextField txtModulo;
    private javax.swing.JTextField txtMultiplicador;
    private javax.swing.JTextField txtSemilla;
    // End of variables declaration//GEN-END:variables
}
