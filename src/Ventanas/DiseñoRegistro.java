package Ventanas;

import java.sql.PreparedStatement;
import java.sql.Connection;
import clases.ClaseImagen;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class DiseñoRegistro extends javax.swing.JFrame {
    
    ClaseImagen I1 = new ClaseImagen();
    
    public static final String URL = "jdbc:mysql://localhost/bs_registro";
    public static final String USERNAME = "root";
    public static final String PASSWORD = ("");
    private int i;
    public String Dato;
    
    Contenidos Contenido = new Contenidos();
    
    public String getDato(){
        return Dato;
    }

    public static PreparedStatement ps;
    public static ResultSet rs;
    public static Statement st;

    public DiseñoRegistro() {
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/iconos/iconoframe.png")));
        Inicio();
        Libreria();
    }
    
    private void Inicio(){
        this.setSize(650, 500);
        this.setContentPane(I1);
        this.setLocationRelativeTo(null);
        this.add(jPanel3);
        I1.add(jPanel3);
        I1.add(jPanel1); //, BorderLayout.CENTER
        I1.add(jPanel2); //, BorderLayout.CENTER
        btnSesion.setEnabled(false);
        jPanel2.setVisible(false);
        btnRegistro1.setEnabled(false);
    }
    
    public static void Libreria(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            System.out.println("NO EXISTE LA LIBRERIA");
            Logger.getLogger(DiseñoRegistro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static Connection getConnection() {
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(URL, USERNAME, PASSWORD);
            JOptionPane.showMessageDialog(null, "Conexion exitosa");
        } catch (HeadlessException | ClassNotFoundException | SQLException e) {
            System.out.print(e);
        }
        return con;
    }

    public void validarBoton() {
        if (!txtUsuario.getText().isEmpty() && !ctnContraseña.getText().isEmpty()) {
            btnSesion.setEnabled(true);
        } else {
            btnSesion.setEnabled(false);
        }
    }

    public void BotonRegistro() {
        if (!txtNombre.getText().isEmpty() && !txtControl.getText().isEmpty() && !txtGrupo.getText().isEmpty() && !txtCorreo.getText().isEmpty() && !TxtContrsenaRegistro.getText().isEmpty()) {
            if (txtCorreo.getText().contains("@") && txtCorreo.getText().contains(".mx") && txtCorreo.getText().contains("soycecytem")) {
                btnRegistro1.setEnabled(true);
                ValiCorreo.setText("");
            } else {
                ValiCorreo.setText("ingresa un correo valido");
                btnRegistro1.setEnabled(false);
            }
        }else{
            btnRegistro1.setEnabled(false);
        }
    }
    
    public static void RecibirPerfil(){
        try {
            Connection con = getConnection();
            String sql = ("select * from datos where NumeroDeControl = '" +txtUsuario.getText()+ "'");
            st = con.createStatement();
            rs = st.executeQuery(sql);
            if(rs.next()){
                Contenidos.txtNombre.setText(rs.getString("Nombre"));
                Contenidos.txtNoControl.setText(rs.getString("NumeroDeControl"));
                Contenidos.txtSemestre.setText(rs.getString("Semestre"));
                Contenidos.txtGrupo.setText(rs.getString("Grupo"));
                Contenidos.txtCorreo.setText(rs.getString("CorreoInstitucional"));
                Contenidos.txtContrasena.setText(rs.getString("Contraseña"));
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnRegistro = new javax.swing.JButton();
        txtUsuario = new javax.swing.JTextField();
        ctnContraseña = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        btnSesion = new javax.swing.JButton();
        Olvido = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txtControl = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtGrupo = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        cbxSemestre = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        TxtContrsenaRegistro = new javax.swing.JPasswordField();
        jLabel12 = new javax.swing.JLabel();
        btnRegistro1 = new javax.swing.JToggleButton();
        jButton1 = new javax.swing.JButton();
        ValiCorreo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel3.setBackground(new java.awt.Color(51, 255, 51));

        jButton6.setBackground(new java.awt.Color(255, 255, 255));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/minimize-window (1).png"))); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(255, 255, 255));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/iconoCerrar (1).png"))); // NOI18N
        jButton5.setBorder(null);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(558, Short.MAX_VALUE)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 0, 630, 30);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Courier New", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 0));
        jLabel1.setText("ALUMNOS CECYTEM\n");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 190, 42));

        jLabel2.setText("Iniciar Sesion ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, -1, -1));

        jLabel3.setText("Usuario:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        jLabel4.setText("Contraseña:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        jLabel5.setText("¿NO tienes cuenta? REGISTRATE");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, -1, -1));

        btnRegistro.setText("REGISTRARSE AHORA");
        btnRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 320, -1, -1));

        txtUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtUsuarioKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUsuarioKeyTyped(evt);
            }
        });
        jPanel1.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 100, -1));

        ctnContraseña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ctnContraseñaKeyReleased(evt);
            }
        });
        jPanel1.add(ctnContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 110, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/cecytemj - copia.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 70, 80));

        btnSesion.setText("INICIAR SESION");
        btnSesion.setActionCommand("");
        btnSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSesionActionPerformed(evt);
            }
        });
        jPanel1.add(btnSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, -1, 30));

        Olvido.setName(""); // NOI18N
        Olvido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OlvidoMouseClicked(evt);
            }
        });
        jPanel1.add(Olvido, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 180, 20));

        getContentPane().add(jPanel1);
        jPanel1.setBounds(145, 51, 304, 390);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        txtControl.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtControlKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtControlKeyTyped(evt);
            }
        });

        jLabel7.setText("Numero de control: ");

        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNombreKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });

        jLabel8.setText("Nombre:");

        txtGrupo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtGrupoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtGrupoKeyTyped(evt);
            }
        });

        jLabel9.setText("Grupo:");

        cbxSemestre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Primero", "Segundo", "Tercero", "Cuarto", "Quinto", "Sexto" }));

        jLabel10.setText("Semestre: ");

        txtCorreo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCorreoKeyReleased(evt);
            }
        });

        jLabel11.setText("Correo Institucional:");

        TxtContrsenaRegistro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TxtContrsenaRegistroKeyReleased(evt);
            }
        });

        jLabel12.setText("Contraseña: ");

        btnRegistro1.setText("Registrate");
        btnRegistro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistro1ActionPerformed(evt);
            }
        });

        jButton1.setText("Regresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRegistro1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(txtControl, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel12))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TxtContrsenaRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(34, 34, 34)
                                        .addComponent(ValiCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cbxSemestre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(0, 87, Short.MAX_VALUE)))
                .addGap(21, 21, 21))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtControl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxSemestre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(ValiCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxtContrsenaRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addGap(28, 28, 28)
                        .addComponent(jButton1))
                    .addComponent(btnRegistro1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(76, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(50, 40, 520, 390);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSesionActionPerformed
        
        try {
            Connection con = getConnection();
            String sql = ("select * from datos where NumeroDeControl = '" + txtUsuario.getText() + "'and Contraseña= '" + ctnContraseña.getText() + "'");
            String sql2 = ("select * from datos where NumeroDeControl = '" + txtUsuario.getText() + "'and Contraseña!= '" + ctnContraseña.getText() + "'");

            st = con.createStatement();
            rs = st.executeQuery(sql);

            if (rs.next()) {
                i = 1;

                if (i == 1) {
                    Contenidos sl = new Contenidos();
                    sl.setVisible(true);
                    dispose();
                }
            } else {
                rs = st.executeQuery(sql2);
                if(rs.next()){
                    Dato = txtUsuario.getText();
                    Olvido.setText("¿olvidaste tu contraseña?");
                }else{
                 Olvido.setText("");
                 JOptionPane.showMessageDialog(null, "Usuario no registrado");
                }
            }

        } catch (HeadlessException | SQLException e) {
            System.out.print(e);
        }


    }//GEN-LAST:event_btnSesionActionPerformed

    private void btnRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroActionPerformed
        jPanel2.setVisible(true);
        jPanel1.setVisible(false);
    }//GEN-LAST:event_btnRegistroActionPerformed

    private void txtUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsuarioKeyTyped
        char c = evt.getKeyChar();
        if (c != '-' && c < '0' || c > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_txtUsuarioKeyTyped

    private void txtUsuarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsuarioKeyReleased
        validarBoton();
    }//GEN-LAST:event_txtUsuarioKeyReleased

    private void ctnContraseñaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ctnContraseñaKeyReleased
        validarBoton();
    }//GEN-LAST:event_ctnContraseñaKeyReleased

    private void txtControlKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtControlKeyReleased
        BotonRegistro();
    }//GEN-LAST:event_txtControlKeyReleased

    private void txtControlKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtControlKeyTyped
        char c = evt.getKeyChar();
        if (c != '-' && c < '0' || c > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_txtControlKeyTyped

    private void txtNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyReleased
        BotonRegistro();
    }//GEN-LAST:event_txtNombreKeyReleased

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z') && c != KeyEvent.VK_SPACE) {
            evt.consume();
        }
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtGrupoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtGrupoKeyReleased
        BotonRegistro();
    }//GEN-LAST:event_txtGrupoKeyReleased

    private void txtGrupoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtGrupoKeyTyped
        char c = evt.getKeyChar();
        if (c != '-' && c < '0' || c > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_txtGrupoKeyTyped

    private void txtCorreoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCorreoKeyReleased
        BotonRegistro();
    }//GEN-LAST:event_txtCorreoKeyReleased

    private void TxtContrsenaRegistroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtContrsenaRegistroKeyReleased
        BotonRegistro();
    }//GEN-LAST:event_TxtContrsenaRegistroKeyReleased

    private void btnRegistro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistro1ActionPerformed
          try {
            try (Connection con = getConnection()) {
                String sql = ("select * from datos where NumeroDeControl = '" + txtControl.getText() + "'and Nombre= '" + txtNombre.getText() + "'");
                st = con.createStatement();
                rs = st.executeQuery(sql);
                if (rs.next()) {
                    i = 1;
                    if (i == 1) {
                        JOptionPane.showMessageDialog(null, "usuario ya registrado");
                    }
                } else {
                    ps = (PreparedStatement) con.prepareStatement("INSERT INTO datos (NumeroDeControl, Nombre, Grupo, Semestre, CorreoInstitucional, Contraseña ) VALUES (?, ? , ?, ?, ?, ?)");
                        ps.setString(1, txtControl.getText());
                        ps.setString(2, txtNombre.getText());
                        ps.setString(3, txtGrupo.getText());
                        ps.setString(4, cbxSemestre.getSelectedItem().toString());
                        ps.setString(5, txtCorreo.getText());
                        ps.setString(6, ctnContraseña.getText());

                        int rs1 = ps.executeUpdate();
                        if (rs1 > 0) {
                            JOptionPane.showMessageDialog(null, "Se guardo el registro");
                            DiseñoRegistro Dn = new DiseñoRegistro();
                            Dn.setVisible(true);
                            dispose();
                        } else {
                            JOptionPane.showMessageDialog(null, "No se guardo el registro");
                        }
                }
                jPanel1.setVisible(true);
                jPanel2.setVisible(false);
            }
        } catch (HeadlessException | SQLException e) {
            System.out.print(e);
        }
    }//GEN-LAST:event_btnRegistro1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jPanel1.setVisible(true);
        jPanel2.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void OlvidoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OlvidoMouseClicked
        Contenido.setVisible(true);
        Contenido.setSize(470, 470);
        Contenido.Perfil().setVisible(true);
        Contenido.Panel5().setVisible(false);
        RecibirPerfil();
        setVisible(false);
    }//GEN-LAST:event_OlvidoMouseClicked

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        setExtendedState(ICONIFIED);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton5ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Olvido;
    private javax.swing.JPasswordField TxtContrsenaRegistro;
    private javax.swing.JLabel ValiCorreo;
    private javax.swing.JButton btnRegistro;
    private javax.swing.JToggleButton btnRegistro1;
    private javax.swing.JButton btnSesion;
    private javax.swing.JComboBox<String> cbxSemestre;
    private javax.swing.JPasswordField ctnContraseña;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField txtControl;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtGrupo;
    private javax.swing.JTextField txtNombre;
    public static javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}