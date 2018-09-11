package Visual;

import java.awt.event.KeyEvent;
import java.text.DecimalFormat;
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
    Generador miGenerador;
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
        lblTest.setEnabled(false);
        btnMonobit.setEnabled(false);
        btnPoker.setEnabled(false);
        btnRachas.setEnabled(false);
        btnRachasLargas.setEnabled(false);
        btnJugarRuleta.setEnabled(false);
    }
    
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
        btnJugarRuleta = new javax.swing.JButton();
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

        txtSemilla.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSemillaKeyTyped(evt);
            }
        });

        txtModulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtModuloActionPerformed(evt);
            }
        });
        txtModulo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtModuloKeyTyped(evt);
            }
        });

        txtMultiplicador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMultiplicadorKeyTyped(evt);
            }
        });

        txtIncremento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIncrementoKeyTyped(evt);
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

        btnJugarRuleta.setText("Jugar");
        btnJugarRuleta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJugarRuletaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnJugarRuleta, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
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
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(btnGCM, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                                            .addComponent(btnGCL, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE))
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
                        .addComponent(btnGCL)
                        .addGap(18, 18, 18)
                        .addComponent(btnGCM)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalir)
                    .addComponent(btnJugarRuleta))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        btnMonobit.setText("Monobit");
        btnMonobit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMonobitActionPerformed(evt);
            }
        });

        btnPoker.setText("Poker");
        btnPoker.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPokerActionPerformed(evt);
            }
        });

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
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGCMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGCMActionPerformed
        if (controlarCamposGenerador()){
            int semilla = Integer.parseInt(txtSemilla.getText());
            int multiplicador = Integer.parseInt(txtMultiplicador.getText());
            int modulo = Integer.parseInt(txtModulo.getText());
            //try {
                miGenerador = miVisual.altaGenerador(modulo, multiplicador, semilla);
                cargarFilaTabla(miGenerador);
                //JOptionPane.showMessageDialog(null, "Generador creado exitosamente", "COMFIRMACION", 0);
            //} catch (Exception ex) {
                //JOptionPane.showMessageDialog(null, "No se pudo crear el generador", "ERROR",0);
            //}
            lblTest.setEnabled(true);
            btnMonobit.setEnabled(true);
            btnPoker.setEnabled(true);
            btnRachas.setEnabled(true);
            btnRachasLargas.setEnabled(true);
            btnJugarRuleta.setEnabled(true);
        }        
    }//GEN-LAST:event_btnGCMActionPerformed

    private void btnGCLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGCLActionPerformed
        if (controlarCamposGenerador()){
            //setearTamañoTabla();
            int semilla = Integer.parseInt(txtSemilla.getText());
            int incremento = Integer.parseInt(txtIncremento.getText());
            int multiplicador = Integer.parseInt(txtMultiplicador.getText());
            int modulo = Integer.parseInt(txtModulo.getText());
            //try {
                miGenerador = miVisual.altaGenerador(modulo, multiplicador, incremento, semilla);
                /*for (int i=0; i < (miGenerador.getSemillas().size()-1); i++){
                    //System.out.printf("N: %d Xo: %d Xn+1:%d Estandarizado: %f \n",i,miGenerador.getSemillas().get(i),miGenerador.getValoresGeneradosNoEstandarizados().get(i), miGenerador.getValoresGeneradosEstandarizados().get(i));
                    System.out.printf("%d -", miGenerador.getBinarios().get(i));
                }*/
                cargarFilaTabla(miGenerador);
                //JOptionPane.showMessageDialog(null, "Generador creado exitosamente", "COMFIRMACION", 0);
            //} catch (Exception ex) {
                //JOptionPane.showMessageDialog(null, "No se pudo crear el generador", "ERROR",0);
            //}
            lblTest.setEnabled(true);
            btnMonobit.setEnabled(true);
            btnPoker.setEnabled(true);
            btnRachas.setEnabled(true);
            btnRachasLargas.setEnabled(true);
            btnJugarRuleta.setEnabled(true);
        }
    }//GEN-LAST:event_btnGCLActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void txtModuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtModuloActionPerformed

    }//GEN-LAST:event_txtModuloActionPerformed

    private void txtModuloKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtModuloKeyTyped
        char car = evt.getKeyChar();
        if((car<'0')||( car>'9')){
            evt.consume();
        }
    }//GEN-LAST:event_txtModuloKeyTyped

    private void txtIncrementoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIncrementoKeyTyped
        char car = evt.getKeyChar();
        if((car<'0')||( car>'9')){
            evt.consume();
        }
    }//GEN-LAST:event_txtIncrementoKeyTyped

    private void txtMultiplicadorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMultiplicadorKeyTyped
        char car = evt.getKeyChar();
        if((car<'0')||( car>'9')){
            evt.consume();
        }
    }//GEN-LAST:event_txtMultiplicadorKeyTyped

    private void txtSemillaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSemillaKeyTyped
        char car = evt.getKeyChar();
        if((car<'0')||( car>'9')){
            evt.consume();
        }
    }//GEN-LAST:event_txtSemillaKeyTyped

    private void btnMonobitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMonobitActionPerformed
        int cont = 0;
        for(int i=0;i<(miGenerador.getBinarios().size());i++){
            if((miGenerador.getBinarios().get(i))==1){
                cont++;
            }
        }
        if(cont>=9275 && cont<=10275){
            JOptionPane.showMessageDialog(null, "La secuencia paso el test monobit \n"+cont+" [9275-10275]\n");
        }else{
            JOptionPane.showMessageDialog(null, "La secuencia no paso el test monobit \n"+cont+" [9275-10275]\n");
        }
    }//GEN-LAST:event_btnMonobitActionPerformed

    private void btnJugarRuletaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJugarRuletaActionPerformed
        JuegoRuleta nuevoJuego = new JuegoRuleta(miVisual, miGenerador);
        nuevoJuego.setLocation(250, 10);
        nuevoJuego.show();
        this.dispose();
    }//GEN-LAST:event_btnJugarRuletaActionPerformed

    private void btnPokerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPokerActionPerformed
        int[] cantidad; //cantidad[0] es la cantidad de 0000
        int indice=0;
        int decimal; //se va a guardar en esta variable a que num decimal corresponden los 4 digitos corresp
        cantidad = new int[16];
        double resultado=0;
        Integer sumatoriaMult=0;
        for (int i=0;i<15;i++){
            cantidad[i]=0;
        }
        while (indice<miGenerador.getBinarios().size()){
            decimal = pasarADecimal(indice);
            cantidad[decimal]=cantidad[decimal]+1;
            indice=indice+4;
        }
        DecimalFormat objFormato=new DecimalFormat("0.00");
        for(int i=0;i<cantidad.length;i++){
            sumatoriaMult= (int)(Math.pow(cantidad[i], 2))+ sumatoriaMult;
        }
        double algo=16.0/5000.0;
        objFormato.format(algo);
        resultado=(algo)* (double)sumatoriaMult-5000;
        
        if(resultado>= 2.16 && resultado<= 46.17){
                JOptionPane.showMessageDialog(null, "Se pasó el test poker Valor del test:"+resultado+"[2,16-46,17]");
        }else{
                JOptionPane.showMessageDialog(null, "No se pasó el test poker Valor del test:"+resultado+"[2,16-46,17]");
        }    
    }//GEN-LAST:event_btnPokerActionPerformed

    public void cargarFilaTabla(Generador miGenerador) {
            generadores.add(miGenerador);
            miModeloTablaDetalles = new ModeloTablaDetalles(miGenerador);
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
public int pasarADecimal(int indice){
        int num=0;
        for (int i=3;i>=0;i--){
            switch (miGenerador.getBinarios().get(indice)){
                case 0:
                    break;
                case 1:
                    num=(int) (num+(Math.pow(2, i)));
                    break;
            }
            indice++;    
        }
        return num;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGCL;
    private javax.swing.JButton btnGCM;
    private javax.swing.JButton btnJugarRuleta;
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
