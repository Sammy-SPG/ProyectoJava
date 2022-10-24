package Ventanas;

import clases.Información;
import clases.cronometro1;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import clases.imm;
import clases.in;
import java.awt.Desktop;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public final class Contenidos extends javax.swing.JFrame {

    private static int i;
    int xx, xy;
    Información inf = new Información();
    cronometro1 cnm = new cronometro1();

    public Contenidos() {
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/iconos/iconoframe.png")));
        ValidarPanel();
        frame();
        DiseñoRegistro.Libreria();
    }

    public void frame() {
        if (jPanel5.isVisible()) {
            this.setSize(700, 340);
        }
        this.setLocationRelativeTo(null);
    }

    public static int getI() {
        return i;
    }

    public JPanel Perfil() {
        return jPanel6;
    }

    public JPanel Panel5() {
        return jPanel5;
    }

    public JPanel getJpanel1() {
        return jPanel1;
    }

    public JPanel getJpanel6() {
        return jPanel6;
    }

    public void ValidarPanel() {
        jPanel1.setVisible(false);
        jPanel6.setVisible(false);
    }

    public void perfil() {
        if (jPanel6.isVisible()) {
            jPanel1.setVisible(false);
            jPanel5.setVisible(false);
            cnm.getTimer().stop();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel1 = new imm();
        jPanel3 = new javax.swing.JPanel();
        btnVideo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tpnInf = new javax.swing.JTextPane();
        jButton4 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel4 = new javax.swing.JPanel();
        btnPlano = new javax.swing.JButton();
        btnD2P = new javax.swing.JButton();
        btnCPR = new javax.swing.JButton();
        btnPM = new javax.swing.JButton();
        btnElipse = new javax.swing.JButton();
        btnPendiente1 = new javax.swing.JButton();
        btnEcuacion = new javax.swing.JButton();
        btnAngulos = new javax.swing.JButton();
        btnFamilias = new javax.swing.JButton();
        btnDistancia = new javax.swing.JButton();
        btnRectasP = new javax.swing.JButton();
        btnCirc = new javax.swing.JButton();
        btnParabola = new javax.swing.JButton();
        btnFormaN = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jPanel5 = new in();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnGeo = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtNoControl = new javax.swing.JTextField();
        txtSemestre = new javax.swing.JTextField();
        txtGrupo = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        txtContrasena = new javax.swing.JPasswordField();
        btnRegresar = new javax.swing.JButton();
        bntModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 531, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 19, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Materias");
        setUndecorated(true);
        setResizable(false);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true));
        jPanel1.setForeground(new java.awt.Color(51, 51, 51));

        jPanel3.setBackground(new java.awt.Color(204, 255, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Información", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("PMingLiU-ExtB", 1, 18), new java.awt.Color(51, 51, 51))); // NOI18N

        btnVideo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnVideo.setText("Ir al Video");
        btnVideo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVideoActionPerformed(evt);
            }
        });

        jScrollPane1.setBackground(new java.awt.Color(204, 255, 204));

        tpnInf.setEditable(false);
        tpnInf.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tpnInf.setForeground(new java.awt.Color(51, 51, 51));
        tpnInf.setText("La información aparecera aqui.");
        tpnInf.setToolTipText("");
        jScrollPane1.setViewportView(tpnInf);

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton4.setText("Examen");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setText("regresar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel9.setText("¿No entiendes alguna palabra? abre diccionario -->");

        jButton7.setText("Diccionario");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton7)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 112, Short.MAX_VALUE)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(109, 109, 109)
                                .addComponent(btnVideo, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVideo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jButton7))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane2.setBackground(new java.awt.Color(153, 255, 153));
        jScrollPane2.setBorder(null);
        jScrollPane2.setToolTipText("");
        jScrollPane2.setViewportBorder(javax.swing.BorderFactory.createTitledBorder(null, "Selección Tema", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Semilight", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        jScrollPane2.setAutoscrolls(true);
        jScrollPane2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jPanel4.setBackground(new java.awt.Color(204, 255, 204));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Selecciona un Tema", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Semilight", 1, 18))); // NOI18N
        jPanel4.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnPlano.setFont(new java.awt.Font("Segoe UI Symbol", 1, 12)); // NOI18N
        btnPlano.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/plano_opt2.png"))); // NOI18N
        btnPlano.setText("Plano Cartesiano");

        btnPlano.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnPlano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlanoActionPerformed(evt);
            }
        });
        jPanel4.add(btnPlano, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, 50));

        btnD2P.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        btnD2P.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Distanciaentre.jpg"))); // NOI18N
        btnD2P.setText("Distancia entre 2 puntos");
        btnD2P.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnD2P.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnD2PActionPerformed(evt);
            }
        });
        jPanel4.add(btnD2P, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 270, -1));

        btnCPR.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        btnCPR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Cordenadas P-R.png"))); // NOI18N
        btnCPR.setText("Cordenadas Polares-Rectangulares");
        btnCPR.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnCPR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCPRActionPerformed(evt);
            }
        });
        jPanel4.add(btnCPR, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 270, 50));

        btnPM.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        btnPM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/puntoM.png"))); // NOI18N
        btnPM.setText("Punto medio");
        btnPM.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnPM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPMActionPerformed(evt);
            }
        });
        jPanel4.add(btnPM, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 270, 50));

        btnElipse.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        btnElipse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/elipse.png"))); // NOI18N
        btnElipse.setText("Elipse");
        btnElipse.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnElipse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnElipseActionPerformed(evt);
            }
        });
        jPanel4.add(btnElipse, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 780, 270, 50));

        btnPendiente1.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        btnPendiente1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/pendiente.png"))); // NOI18N
        btnPendiente1.setText("Pendiente");
        btnPendiente1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnPendiente1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPendiente1ActionPerformed(evt);
            }
        });
        jPanel4.add(btnPendiente1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 270, 50));

        btnEcuacion.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        btnEcuacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/ecuacionrecta.png"))); // NOI18N
        btnEcuacion.setText("Ecuación de la recta");
        btnEcuacion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnEcuacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEcuacionActionPerformed(evt);
            }
        });
        jPanel4.add(btnEcuacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 270, 50));

        btnAngulos.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        btnAngulos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/angulos entre rectas.png"))); // NOI18N
        btnAngulos.setText("Ángulos entre rectas");
        btnAngulos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnAngulos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAngulosActionPerformed(evt);
            }
        });
        jPanel4.add(btnAngulos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 270, 50));

        btnFamilias.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        btnFamilias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/familia de rectas_opt.png"))); // NOI18N
        btnFamilias.setText("Familias de rectas");
        btnFamilias.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnFamilias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFamiliasActionPerformed(evt);
            }
        });
        jPanel4.add(btnFamilias, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, 270, 50));

        btnDistancia.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        btnDistancia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/plano_opt2.png"))); // NOI18N
        btnDistancia.setText("Distancia entre rectas");
        btnDistancia.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnDistancia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDistanciaActionPerformed(evt);
            }
        });
        jPanel4.add(btnDistancia, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 540, 270, 50));

        btnRectasP.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        btnRectasP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/puntos notables.jpg"))); // NOI18N
        btnRectasP.setText("Rectas y puntos notables");
        btnRectasP.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnRectasP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRectasPActionPerformed(evt);
            }
        });
        jPanel4.add(btnRectasP, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 600, 270, 50));

        btnCirc.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        btnCirc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/circunferencia.png"))); // NOI18N
        btnCirc.setText("Circunferencia");
        btnCirc.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnCirc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCircActionPerformed(evt);
            }
        });
        jPanel4.add(btnCirc, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 660, 270, 50));

        btnParabola.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        btnParabola.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/parabola.png"))); // NOI18N
        btnParabola.setText("Parábola");
        btnParabola.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnParabola.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnParabolaActionPerformed(evt);
            }
        });
        jPanel4.add(btnParabola, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 720, 270, 50));

        btnFormaN.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        btnFormaN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/formanorma_opt.png"))); // NOI18N
        btnFormaN.setText("Forma normal de la recta");
        btnFormaN.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnFormaN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFormaNActionPerformed(evt);
            }
        });
        jPanel4.add(btnFormaN, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 270, 50));

        jScrollPane2.setViewportView(jPanel4);

        jButton5.setBackground(new java.awt.Color(255, 255, 255));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/iconoCerrar (1).png"))); // NOI18N
        jButton5.setBorder(null);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(255, 255, 255));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/minimize-window (1).png"))); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 543, Short.MAX_VALUE)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addGap(0, 364, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 506, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(33, 33, 33)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(20, Short.MAX_VALUE)))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 960, 530);

        jPanel5.setBackground(new java.awt.Color(204, 255, 204));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Selecciona la Materia", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Courier New", 1, 18))); // NOI18N

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Signo_opt.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        jLabel1.setText("Geometria Analitica");

        btnGeo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/plano_opt.png"))); // NOI18N
        btnGeo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGeoActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Signo_opt.png"))); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(btnGeo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(130, 130, 130)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 138, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnGeo)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jButton1))
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel5);
        jPanel5.setBounds(0, 0, 695, 320);

        jPanel6.setBackground(new java.awt.Color(153, 255, 153));

        jLabel3.setText("NOMBRE");

        jLabel4.setText("NO. CONTROL");

        jLabel5.setText("CORREO INSTITUCIONAL");

        jLabel6.setText("CONTRASEÑA");

        jLabel7.setText("SEMESTRE");

        jLabel8.setText("GRUPO");

        txtNombre.setEditable(false);

        txtNoControl.setEditable(false);

        txtCorreo.setEditable(false);

        btnRegresar.setText("REGRESAR");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        bntModificar.setText("MODIFICAR");
        bntModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntModificarActionPerformed(evt);
            }
        });

        btnEliminar.setText("ELIMINAR");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(260, 260, 260)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(btnRegresar)
                        .addGap(75, 75, 75)
                        .addComponent(bntModificar)
                        .addGap(69, 69, 69)
                        .addComponent(btnEliminar))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(56, 56, 56)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSemestre, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNoControl, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(20, 20, 20)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel4))
                    .addComponent(txtNoControl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSemestre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(40, 40, 40)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRegresar)
                    .addComponent(bntModificar)
                    .addComponent(btnEliminar))
                .addContainerGap(57, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel6);
        jPanel6.setBounds(0, 0, 470, 430);

        jLabel2.setText("...");
        jLabel2.setAlignmentX(1.0F);
        jLabel2.setAlignmentY(2.0F);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 80, 14);

        jMenuBar1.setBackground(new java.awt.Color(153, 255, 153));
        jMenuBar1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jMenuBar1.setForeground(new java.awt.Color(153, 255, 153));

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/135537501_912326385972422_2175482518960561542_n.png"))); // NOI18N
        jMenu1.setText("Sesión");

        jMenuItem1.setText("Cerrar sesión");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/134122749_1153702135074028_909849680936991689_n.png"))); // NOI18N
        jMenuItem2.setText("salir");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/135431082_157928069109761_200794253014438439_n.png"))); // NOI18N
        jMenu2.setText("Ayuda");

        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/135619825_4051311328230927_7369464450742299889_n.png"))); // NOI18N
        jMenuItem3.setText("Manual");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/tecnico.png"))); // NOI18N
        jMenuItem5.setText("Manual Tecnico");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuBar1.add(jMenu2);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/135834480_824756934736887_1150525141421523857_n.png"))); // NOI18N
        jMenu3.setText("Perfil");

        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/135272596_3603100449780590_4073053140710509718_n.png"))); // NOI18N
        jMenuItem4.setText("Configuración");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem4);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVideoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVideoActionPerformed
        try {
            if (i != 0) {
                Video vid = new Video();
                vid.setVisible(true);
            }
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnVideoActionPerformed

    private void btnGeoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGeoActionPerformed
        jPanel1.setVisible(true);
        jPanel5.setVisible(false);
        cnm.setLabel(jLabel2);
        cnm.getTimer().start();
        this.setSize(960, 560);
        this.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnGeoActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        DiseñoRegistro DR = new DiseñoRegistro();
        DR.setVisible(true);
        dispose();
        cnm.getTimer().stop();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jPanel1.setVisible(false);
        jPanel5.setVisible(true);
        cnm.getTimer().stop();
        frame();
        JOptionPane.showMessageDialog(null, "Hoy estudiaste: " + "Horas :" + cnm.getHrs() + " : " + "Minutos :" + cnm.getMin() + " : " + "Segundos :" + cnm.getSeg() + "\nSigue Aprendiendo!!");

    }//GEN-LAST:event_jButton2ActionPerformed

    private void bntModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntModificarActionPerformed
        int j;
        try {
            Connection con = DiseñoRegistro.getConnection();
            String sql = ("update datos set Semestre = '" + txtSemestre.getText() + "', Grupo = '" + txtGrupo.getText() + "',  Contraseña = '" + txtContrasena.getText() + "' where NumeroDeControl = " + txtNoControl.getText());
            DiseñoRegistro.ps = con.prepareStatement(sql);
            j = DiseñoRegistro.ps.executeUpdate();
            if (j > 0) {
                JOptionPane.showMessageDialog(null, "Cambio exitoso");
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_bntModificarActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        this.setSize(700, 340);
        jPanel5.setVisible(true);
        jPanel6.setVisible(false);
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int j;
        JOptionPane.showMessageDialog(null, "¿estas seguro de eliminar tu cuenta?..");
        try {
            Connection con = DiseñoRegistro.getConnection();
            String sql = "delete from datos where NumeroDeControl = " + txtNoControl.getText();
            DiseñoRegistro.ps = con.prepareStatement(sql);
            j = DiseñoRegistro.ps.executeUpdate();
            if (j > 0) {
                JOptionPane.showMessageDialog(null, "eliminacion exitosa :c");
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnFormaNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFormaNActionPerformed
        tpnInf.setText(inf.Totema_7());
        i = 7;
        System.out.println(i);
    }//GEN-LAST:event_btnFormaNActionPerformed

    private void btnParabolaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnParabolaActionPerformed
        tpnInf.setText(inf.Totema_13());
        i = 13;
        System.out.println(i);
    }//GEN-LAST:event_btnParabolaActionPerformed

    private void btnCircActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCircActionPerformed
        tpnInf.setText(inf.Totema_12());
        i = 12;
        System.out.println(i);
    }//GEN-LAST:event_btnCircActionPerformed

    private void btnRectasPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRectasPActionPerformed
        tpnInf.setText(inf.Totema_11());
        i = 11;
        System.out.println(i);
    }//GEN-LAST:event_btnRectasPActionPerformed

    private void btnDistanciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDistanciaActionPerformed
        tpnInf.setText(inf.Totema_10());
        i = 10;
        System.out.println(i);
    }//GEN-LAST:event_btnDistanciaActionPerformed

    private void btnFamiliasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFamiliasActionPerformed
        tpnInf.setText(inf.Totema_9());
        i = 9;
        System.out.println(i);
    }//GEN-LAST:event_btnFamiliasActionPerformed

    private void btnAngulosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAngulosActionPerformed
        tpnInf.setText(inf.Totema_8());
        i = 8;
        System.out.println(i);
    }//GEN-LAST:event_btnAngulosActionPerformed

    private void btnEcuacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEcuacionActionPerformed
        tpnInf.setText(inf.Totema_6());
        i = 6;
        System.out.println(i);
    }//GEN-LAST:event_btnEcuacionActionPerformed

    private void btnPendiente1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPendiente1ActionPerformed
        tpnInf.setText(inf.Totema_5());
        i = 5;
        System.out.println(i);
    }//GEN-LAST:event_btnPendiente1ActionPerformed

    private void btnElipseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnElipseActionPerformed
        tpnInf.setText(inf.Totema_14());
        i = 14;
    }//GEN-LAST:event_btnElipseActionPerformed

    private void btnPMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPMActionPerformed
        tpnInf.setText(inf.Totema_3());
        i = 3;
        System.out.println(i);
    }//GEN-LAST:event_btnPMActionPerformed

    private void btnCPRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCPRActionPerformed
        tpnInf.setText(inf.Totema_2());
        i = 2;
        System.out.println(i);
    }//GEN-LAST:event_btnCPRActionPerformed

    private void btnD2PActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnD2PActionPerformed
        tpnInf.setText(inf.Totema_4());
        i = 4;
        System.out.println(i);
    }//GEN-LAST:event_btnD2PActionPerformed

    private void btnPlanoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlanoActionPerformed
        tpnInf.setText(inf.Totema_1());
        i = 1;
        System.out.println(i);
    }//GEN-LAST:event_btnPlanoActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        DiseñoRegistro.RecibirPerfil();
        jPanel6.setVisible(true);
        this.setSize(470, 470);
        perfil();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Examen examen = new Examen();
        examen.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        setExtendedState(ICONIFIED);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        try {
            Desktop.getDesktop().browse(new URI("https://drive.google.com/file/d/1EfH75cnHkrW8HA6DLLwfwi4PtpL2ujx0/view?usp=sharing"));
        } catch (IOException | URISyntaxException e) {
            System.out.println("erro en:" + e);
        }
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        Diccionario1 Dc = new Diccionario1();
        Dc.setVisible(false);
        Dc.show();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_formMouseDragged

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        try {
            Desktop.getDesktop().browse(new URI("https://drive.google.com/file/d/1wW62iU7rt-FTD-t0M9vgMj1NJPTVcuUt/view?usp=sharing"));
        } catch (IOException | URISyntaxException e) {
            System.out.println("erro en:" + e);
        }
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntModificar;
    private javax.swing.JButton btnAngulos;
    private javax.swing.JButton btnCPR;
    private javax.swing.JButton btnCirc;
    private javax.swing.JButton btnD2P;
    private javax.swing.JButton btnDistancia;
    private javax.swing.JButton btnEcuacion;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnElipse;
    private javax.swing.JButton btnFamilias;
    private javax.swing.JButton btnFormaN;
    private javax.swing.JButton btnGeo;
    private javax.swing.JButton btnPM;
    private javax.swing.JButton btnParabola;
    private javax.swing.JButton btnPendiente1;
    private javax.swing.JButton btnPlano;
    private javax.swing.JButton btnRectasP;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnVideo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextPane tpnInf;
    public static javax.swing.JPasswordField txtContrasena;
    public static javax.swing.JTextField txtCorreo;
    public static javax.swing.JTextField txtGrupo;
    public static javax.swing.JTextField txtNoControl;
    public static javax.swing.JTextField txtNombre;
    public static javax.swing.JTextField txtSemestre;
    // End of variables declaration//GEN-END:variables
}
