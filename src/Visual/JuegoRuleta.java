package Visual;

import java.util.LinkedList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import logica.Generador;
import logica.Jugador;

public class JuegoRuleta extends javax.swing.JFrame {

    /**
     * Creates new form JuegoRuleta
     */
    ControladoraVisual miVisual;
    private int capitalInicialCasino=1000000;//fondo con el que comienza el casino, no es el dinero que se reparte entre los jugadores
    private int dineroRepartir=0;
    private int [] nrosRojos = {1,2,5,7,9,12,14,16,18,19,21,23,25,27,30,32,34,35,36};
    private int [] nrosNegros = {3,4,6,8,10,11,13,15,17,20,22,24,26,28,29,31,33};
    private int opcionParada;
    Generador unGenerador;
    LinkedList<Jugador> jugadores = new LinkedList();
    LinkedList<Integer> numerosRuleta= new LinkedList();
    //TAblas
    DefaultTableModel tablaRuleta;
    DefaultTableModel tablaJugadores;
    String cabeceraTblJugadores[] = {"N° Ronda", "Numero J" , "Dinero Disp.", "N° Apuesta R.", "Monto Ap. R."};
    String[][] datosTblJugadores = {};
    
    String cabeceraTblRuleta[] = {"N° Ronda", "Bolillero", "Capital Casino"};
    String[][] datosTblRuleta = {};
    //Fin tablas
    
    public JuegoRuleta(ControladoraVisual visual, Generador unGenerador) {
        initComponents();
        miVisual = visual;
        this.unGenerador = unGenerador;
        this.setTitle("Ruleta");
        System.out.println("opcion parada "+ this.opcionParada);
        //Inicializar tablas
        tablaJugadores = new DefaultTableModel(datosTblJugadores, cabeceraTblJugadores);
        tblJugadores.setModel(tablaJugadores);
        
        tablaRuleta = new DefaultTableModel(datosTblRuleta, cabeceraTblRuleta);
        tblRuleta.setModel(tablaRuleta);
        //FinInicializarTablas
        
        this.lblCapitalCasino.setText(String.valueOf(this.capitalInicialCasino));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtDinero = new javax.swing.JTextField();
        txtCantidadMinJugadores = new javax.swing.JTextField();
        txtCantidadMaxJugadores = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        lblOpcionParada = new javax.swing.JLabel();
        txtMargen = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtPorcentajeApuestaMaxJugador = new javax.swing.JTextField();
        rbtOp3 = new javax.swing.JRadioButton();
        rbtOp2 = new javax.swing.JRadioButton();
        rbtOp1 = new javax.swing.JRadioButton();
        btnIniciarJuego = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblRuleta = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblJugadores = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        lblCapitalCasino = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setForeground(new java.awt.Color(255, 153, 0));
        jLabel1.setText("Nro Jugadores:");

        jLabel2.setForeground(new java.awt.Color(255, 153, 0));
        jLabel2.setText("Dinero a repartir: $");

        txtDinero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDineroKeyTyped(evt);
            }
        });

        txtCantidadMinJugadores.setToolTipText("Mínimo");
        txtCantidadMinJugadores.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCantidadMinJugadoresKeyTyped(evt);
            }
        });

        txtCantidadMaxJugadores.setToolTipText("Máximo");
        txtCantidadMaxJugadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadMaxJugadoresActionPerformed(evt);
            }
        });
        txtCantidadMaxJugadores.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCantidadMaxJugadoresKeyTyped(evt);
            }
        });

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("-");

        lblOpcionParada.setForeground(new java.awt.Color(255, 153, 0));
        lblOpcionParada.setText("Margen ganancia casino (%): ");

        txtMargen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMargenActionPerformed(evt);
            }
        });
        txtMargen.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMargenKeyTyped(evt);
            }
        });

        jLabel6.setForeground(new java.awt.Color(255, 153, 0));
        jLabel6.setText("Porcentaje Apuesta Max Jugador:");

        txtPorcentajeApuestaMaxJugador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPorcentajeApuestaMaxJugadorKeyTyped(evt);
            }
        });

        buttonGroup1.add(rbtOp3);
        rbtOp3.setText("Cantidad de bolillas");
        rbtOp3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtOp3ActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbtOp2);
        rbtOp2.setText("Perdida Jugadores");
        rbtOp2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtOp2ActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbtOp1);
        rbtOp1.setText("Ganancia casino");
        rbtOp1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtOp1ActionPerformed(evt);
            }
        });

        btnIniciarJuego.setText("Iniciar");
        btnIniciarJuego.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarJuegoActionPerformed(evt);
            }
        });

        jLabel9.setForeground(new java.awt.Color(255, 153, 0));
        jLabel9.setText("Opciones de Parada:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(3, 3, 3)
                        .addComponent(txtCantidadMinJugadores, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(txtCantidadMaxJugadores, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDinero, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(rbtOp1)
                        .addGap(18, 18, 18)
                        .addComponent(rbtOp2)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtPorcentajeApuestaMaxJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(rbtOp3)
                        .addGap(36, 36, 36)
                        .addComponent(lblOpcionParada)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtMargen, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64)
                        .addComponent(btnIniciarJuego, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCantidadMinJugadores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtDinero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCantidadMaxJugadores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtPorcentajeApuestaMaxJugador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(rbtOp1)
                        .addComponent(rbtOp2)
                        .addComponent(rbtOp3))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblOpcionParada)
                        .addComponent(txtMargen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnIniciarJuego)))
                .addGap(9, 9, 9))
        );

        tblRuleta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "N° Ronda", "Bolillero", "Capital casino"
            }
        ));
        jScrollPane2.setViewportView(tblRuleta);

        tblJugadores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "N° Ronda", "Numero J.", "Dinero Disp.", "N° Apuesta R.", "Monto Ap.R."
            }
        ));
        jScrollPane1.setViewportView(tblJugadores);

        jLabel5.setText("Capital casino: ");

        lblCapitalCasino.setText("jLabel6");

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon("/media/elias/Datos/MesaRuleta.jpg")); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(lblCapitalCasino)
                        .addGap(116, 116, 116)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jLabel3))
                                    .addComponent(jLabel8))
                                .addGap(508, 508, 508))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSalir)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblCapitalCasino)
                                .addComponent(jLabel5))))
                    .addComponent(jLabel4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 562, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIniciarJuegoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarJuegoActionPerformed
        if(controlarCamposGenerador()){
        //codigo repartir dinero
        int cantidadMaxJugadores, cantidadMinJugadores, cantidadJugadores;
        cantidadMaxJugadores = Integer.parseInt(this.txtCantidadMaxJugadores.getText());
        cantidadMinJugadores = Integer.parseInt(this.txtCantidadMinJugadores.getText());
        this.dineroRepartir = Integer.parseInt(this.txtDinero.getText());
        
        cantidadJugadores = this.unGenerador.obtenerCantidadJugadores(cantidadMaxJugadores, cantidadMinJugadores);
        
        this.crearJugadores(cantidadJugadores);
        this.repartirDinero();
        this.generarSecuenciasJugadores();
        this.generarNumerosRuleta();
        this.mostrar(); //para ir probando los valores que se generan
        
        //codigo iniciar
        boolean bandera = false;
        int indice=0;
        int gananciaMaximaCasino = this.capitalInicialCasino + (int)(this.capitalInicialCasino * (Double.parseDouble(this.txtMargen.getText())/100));
        int cantidadMinimaJugadores = (int)((cantidadJugadores * Integer.parseInt(this.txtMargen.getText()))/100);
        int cantidadBolillas = Integer.parseInt(this.txtMargen.getText());
        System.out.println("GANANCIA MAXIMA "+ gananciaMaximaCasino);
        int numeroRuleta, numeroApuestaJugador, montoApostado, montoGanado;
        int apostadoresRonda;
        while(!bandera){
            int indiceRuleta = (int)((this.numerosRuleta.size()-1-0+1)*Math.random()+0);//si no uso este indice hay problemas..
            numeroRuleta = this.numerosRuleta.get(indiceRuleta);
            System.out.println("CAPITAL INICIAL CASINO "+ this.capitalInicialCasino);
            this.cargarTablaRuleta(indice, numeroRuleta);
            apostadoresRonda = 0;
            for(Jugador aux : this.jugadores){
                if(aux.getDinero()>=1){
                    numeroApuestaJugador = aux.getNumerosApostados().get(indice);
                    aux.setNumeroApuesta(numeroApuestaJugador);
                    montoApostado=aux.elegirMontoApuesta(Double.parseDouble(this.txtPorcentajeApuestaMaxJugador.getText())/100);
                    this.cargarTablaJugadores(indice, aux);
                    //
                    if(numeroRuleta == 0){//si sale 0 ya se lleva el casino las apuestas de cada uno
                        aux.setDinero(aux.getDinero()-aux.getApuestaDinero());
                        this.aumentarCapitalInicial((int)aux.getApuestaDinero());
                    }else{
                        if(numeroApuestaJugador>=1 && numeroApuestaJugador <=36){ //si se aposto del 1 al 36 evalua si coincide nro de apuesta con nro de ruleta
                            if(numeroRuleta == numeroApuestaJugador){//si coincide gana
                                System.out.println("------------------------------------------son iguales-----------------------------------");
                                System.out.println("ronda: " + indice + "numero ruleta: " + numeroRuleta);
                                montoGanado = (int)aux.getApuestaDinero()*34;//la apuesta es 35:1 pero como todavia no se le desconto la apuesta solo entregamos 34 veces lo apostado
                                //this.capitalInicialCasino =this.capitalInicialCasino - montoGanado;
                                aux.setDinero(aux.getDinero()+montoGanado);
                                this.disminuirCapitalInicial(montoGanado);
                                System.out.println("entre 1-36");
                            }else{//si no coincide pierde lo apostado
                                aux.setDinero(aux.getDinero()-aux.getApuestaDinero());
                                this.aumentarCapitalInicial((int)aux.getApuestaDinero());
                            }
                        }else{  //si no jugo a un nro del 1 al 36
                            boolean coincide = false; 
                            if(numeroApuestaJugador==37){//si salio 37 como apuesta es que jugo al rojo
                                for(int i=0;i<this.nrosRojos.length;i++){
                                    if(this.nrosRojos[i]== numeroRuleta){
                                        coincide = true;
                                        i=19;//para salir del bucle, son 19 nros rojos
                                    }
                                }
                            }
                            if(numeroApuestaJugador==38){//jugo al negro
                                for(int i=0;i<this.nrosNegros.length;i++){
                                    if(this.nrosNegros[i]== numeroRuleta){
                                        coincide = true;
                                        i=17;//para salir del bucle, son 19 nros rojos
                                    }
                                }
                            }
                            if(numeroApuestaJugador==39){
                                if(numeroRuleta % 2 == 0){//si aposto por nro par
                                    coincide = true;
                                }
                            }
                            if(numeroApuestaJugador==40){
                                if(numeroRuleta % 2 != 0){//si aposto por nro impar
                                    coincide = true;
                                }
                            }
                            if(coincide==true){
                                montoGanado = (int)aux.getApuestaDinero();
                                aux.setDinero(aux.getDinero()+montoGanado);
                                this.disminuirCapitalInicial(montoGanado);
                                //this.capitalInicialCasino =this.capitalInicialCasino - montoGanado;
                                System.out.println("entre 37-40");
                            }else{
                                aux.setDinero(aux.getDinero()-aux.getApuestaDinero());
                                this.aumentarCapitalInicial((int)aux.getApuestaDinero());
                            }  
                        }
                    }
                    apostadoresRonda ++;
                }
                aux.setIndice(0);
            }
            indice++;
          if(indice >= this.numerosRuleta.size()){
              JOptionPane.showMessageDialog(null, "No hay mas bolillas");
              bandera=true;
          }
          switch (this.opcionParada){
                case 1:
                    if(gananciaMaximaCasino<=this.capitalInicialCasino){
                        JOptionPane.showMessageDialog(null, "Porcentaje de ganancias alcanzado");
                        bandera=true;
                    }
                    break;
                case 2:
                    if(cantidadMinimaJugadores>=apostadoresRonda){
                        JOptionPane.showMessageDialog(null, "Porcentaje de jugadores sin dinero alcanzado");
                        bandera=true;
                    }
                    break;
                case 3:
                    if(cantidadBolillas<=indice){
                        JOptionPane.showMessageDialog(null, "Cantidad máxima de bolillas alcanzada");
                        bandera=true;
                    }
                break;
            }
//            if(indice >= this.numerosRuleta.size() || gananciaMaximaCasino<=this.capitalInicialCasino || this.capitalInicialCasino<=0){
//                if(this.capitalInicialCasino<=0){
//                    System.out.println("EL CASINO ESTA EN QUIEBRA");
//                }
//                if(this.capitalInicialCasino<=0){
//                    System.out.println("LA RULETA CUMPLIO SU PERIODO");
//                }
//                if(gananciaMaximaCasino<=this.capitalInicialCasino){
//                    System.out.println("EL CASINO CUMPLIO EL OBJETIVO DE AUMENTAR SU CAPITAL");
//                }
//                System.out.println("entra al if " +capitalInicialCasino+ " - "+gananciaMaximaCasino);
//                bandera=true;
//                indice =0;
//            }
        }
        this.lblCapitalCasino.setText(String.valueOf(this.capitalInicialCasino));
        }
    }//GEN-LAST:event_btnIniciarJuegoActionPerformed

    private void txtMargenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMargenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMargenActionPerformed

    private void txtCantidadMinJugadoresKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadMinJugadoresKeyTyped
    char car = evt.getKeyChar();
        if((car<'0')||( car>'9')){
            evt.consume();
        }
    }//GEN-LAST:event_txtCantidadMinJugadoresKeyTyped

    private void txtDineroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDineroKeyTyped
    char car = evt.getKeyChar();
        if((car<'0')||( car>'9')){
            evt.consume();
        }
    }//GEN-LAST:event_txtDineroKeyTyped

    private void txtMargenKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMargenKeyTyped
    char car = evt.getKeyChar();
        if((car<'0')||( car>'9')){
            evt.consume();
        }
    }//GEN-LAST:event_txtMargenKeyTyped

    private void txtPorcentajeApuestaMaxJugadorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPorcentajeApuestaMaxJugadorKeyTyped
    char car = evt.getKeyChar();
        if((car<'0')||( car>'9')){
            evt.consume();
        }
    }//GEN-LAST:event_txtPorcentajeApuestaMaxJugadorKeyTyped

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void txtCantidadMaxJugadoresKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadMaxJugadoresKeyTyped
        char car = evt.getKeyChar();
        if((car<'0')||( car>'9')){
            evt.consume();
        }
    }//GEN-LAST:event_txtCantidadMaxJugadoresKeyTyped

    private void txtCantidadMaxJugadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadMaxJugadoresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantidadMaxJugadoresActionPerformed

    private void rbtOp1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtOp1ActionPerformed
        rbtOp1.setSelected(true);
        rbtOp2.setSelected(false);
        rbtOp3.setSelected(false);
        this.opcionParada = 1;
        lblOpcionParada.setText("Margen ganancia casino (%): ");
    }//GEN-LAST:event_rbtOp1ActionPerformed

    private void rbtOp3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtOp3ActionPerformed
        rbtOp3.setSelected(true);
        rbtOp1.setSelected(false);
        rbtOp2.setSelected(false);
        this.opcionParada = 3;
        lblOpcionParada.setText("Cantidad maxima de bolillas: ");
    }//GEN-LAST:event_rbtOp3ActionPerformed

    private void rbtOp2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtOp2ActionPerformed
        rbtOp2.setSelected(true);
        rbtOp1.setSelected(false);
        rbtOp3.setSelected(false);
        this.opcionParada = 2;
        lblOpcionParada.setText("Margen jugadores sin dinero (%): ");
    }//GEN-LAST:event_rbtOp2ActionPerformed

    /**
     * @param args the command line arguments
     */

    private void disminuirCapitalInicial(int monto){
        capitalInicialCasino -=monto; 
    }
    private void aumentarCapitalInicial(int monto){
        capitalInicialCasino +=monto; 
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIniciarJuego;
    private javax.swing.JButton btnSalir;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblCapitalCasino;
    private javax.swing.JLabel lblOpcionParada;
    private javax.swing.JRadioButton rbtOp1;
    private javax.swing.JRadioButton rbtOp2;
    private javax.swing.JRadioButton rbtOp3;
    private javax.swing.JTable tblJugadores;
    private javax.swing.JTable tblRuleta;
    private javax.swing.JTextField txtCantidadMaxJugadores;
    private javax.swing.JTextField txtCantidadMinJugadores;
    private javax.swing.JTextField txtDinero;
    private javax.swing.JTextField txtMargen;
    private javax.swing.JTextField txtPorcentajeApuestaMaxJugador;
    // End of variables declaration//GEN-END:variables

    private Jugador crearJugador(){
        Jugador unJugador =new Jugador(this.jugadores.size()+1);
        this.jugadores.add(unJugador);
        return unJugador;
    }
    
    private void crearJugadores(int cantidad){
        this.jugadores.clear();
        for(int i=0;i<cantidad;i++){
            this.crearJugador();
        }
    }
    
    private void repartirDinero(){
        int cantidadJugadores = this.jugadores.size();
        //if(this.dineroRepartir<=this.capitalInicialCasino){
            for(Jugador aux : this.jugadores){
                if(aux.getNumero()==cantidadJugadores){
                    aux.setDinero(dineroRepartir);
                    this.dineroRepartir=0;
                }else{
                    //int valorMaximo=dineroRepartir-this.jugadores.size()-1+contador;
                    int monto = this.unGenerador.obtenerEnteroEnRango(this.dineroRepartir, 10, this.unGenerador.obtenerRNDDinero());
                    aux.setDinero(monto);
                    this.dineroRepartir=this.dineroRepartir-monto;
                }
            }
        //}
    }
    
    private void mostrar(){//PARA HACER PRUEBAS
        for(Jugador aux : jugadores){
            System.out.println("numero Jugador " + aux.getNumero());
            System.out.println("dinero disponible "+ aux.getDinero());
        }
        for(int aux :this.numerosRuleta){
            System.out.println("numero ruleta: "+aux);
        }
    }

    private void generarSecuenciasJugadores(){
        int modulo = (int)this.unGenerador.getModulo(), incremento = (int)this.unGenerador.getIncremento(), multiplicador = (int)this.unGenerador.getMultiplicador();
        for(Jugador aux : this.jugadores){
            double RND = this.unGenerador.obtenerRND();
            aux.generarSecuenciaApuestasNoEstandar(modulo, multiplicador, incremento, RND);
            aux.generarSecuenciaApuestasEstandar(modulo);
            aux.generarNumerosApostados();
            aux.imprimirSecuencias();
        }
    }
    
    private void generarNumerosRuleta(){//genera y carga la lista de los numero que saldran en la ruleta [0-36 || 37-38=rojo-negro || 39-40=par-impar]
        this.unGenerador.cargarSecuenciaNumerosParaRuleta();
        for(double aux:this.unGenerador.getSecuenciaParaNumerosRuletaEstandar()){
            this.numerosRuleta.add(this.unGenerador.obtenerEnteroEnRango(40, 0, aux));
        }
    }
    
    
    public String evaluarApuesta(int numero){
        String retorno = "Nada que apostar?";
        if(numero >=0 && numero<=36){
            retorno = String.valueOf(numero);
        }
        if(numero==37){
            retorno="Rojo";
        }
        if(numero==38){
            retorno="Negro";
        }
        if(numero==39){
            retorno ="Par";
         }
        if(numero==40){
            retorno="Impar";
         }
        return retorno;
    }
    
    
    
    
    
    
    /*
    TABLAS
    */
    public void cargarTablaJugadores(int numeroRonda, Jugador unJugador){
        
            Object datosRow[] = {numeroRonda, unJugador.getNumero(), unJugador.getDinero(), this.evaluarApuesta(unJugador.getNumeroApuesta()), unJugador.getApuestaDinero()};
            this.tablaJugadores.addRow(datosRow);
        
    }
    
    public void cargarTablaRuleta(int numeroRonda, int bolillero){
        
            Object datosRow[] = {numeroRonda, bolillero, this.capitalInicialCasino};
            this.tablaRuleta.addRow(datosRow);
        
    }
    /*
    FIN TABLAS
    */
    public boolean controlarCamposGenerador(){
        boolean flag = true;
        if ("".equals(txtCantidadMinJugadores.getText())) {
            flag = false;
            JOptionPane.showMessageDialog(null, "Ingrese la cantidad minima de jugadores");
        } else {
            if ("".equals(txtCantidadMaxJugadores.getText())) {
                flag = false;
                JOptionPane.showMessageDialog(null, "Ingrese la cantidad maxima de jugadores");
            } else {
                if ("".equals(txtDinero.getText())) {
                    flag = false;
                    JOptionPane.showMessageDialog(null, "Ingrese el dinero a repartir");
                } else {
                    if ("".equals(txtMargen.getText())) {
                        flag = false;
                        JOptionPane.showMessageDialog(null, "Ingrese el margen de ganancia para el casino");
                    }else {
                        if ("".equals(txtPorcentajeApuestaMaxJugador.getText())) {
                        flag = false;
                        JOptionPane.showMessageDialog(null, "Ingrese el porcentaje de apuestas para un jugador");
                    }
                }
                }
            }
        }
        return flag;
    }
    
    
}
