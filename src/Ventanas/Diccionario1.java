package Ventanas;
import clases.ClaseDiccionario1;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Diccionario1 extends javax.swing.JFrame {
    
    private int i;

    ClaseDiccionario1 CD = new ClaseDiccionario1();
    
    public Diccionario1() {
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/iconos/iconoframe.png")));
        this.setLocationRelativeTo(null);
    }
    
    public void evtTabla(){
        TablaPalabras.getSelectionModel().addListSelectionListener(((lse) -> {
            if(TablaPalabras.getSelectedRow() != -1){
                int fila = TablaPalabras.getSelectedRow();
                txtPalabraClave.setText(TablaPalabras.getValueAt(fila, 0).toString());
                i = fila;
                Concepto();
            }
            
            
        }));
    }
    
    
    public void Concepto(){
        CD.setPalabraClave(txtPalabraClave.getText());
        CD.buscar();
        TexSignificado.setText(CD.getAuxsig());
        i = CD.getI();
        if(i == 1){
            jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/planoC.png"))); 
        }
        if(i == 2){
            jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/elips.png"))); 
        }
        if(i == 3){
            //jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/focos.svg")));
        }
        if(i == 4){
            jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/centro.png")));
        }
        if(i == 5){
            jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/semiejeMy.png")));
        }
        if(i == 6){
            jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/semiejeMn.png")));
        }
        if(i == 7){
            jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/radio.png")));
        }
        if(i == 8){
            jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/vertice.png")));
        }
        if(i == 9){
            jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/cuadrante.png")));
        }
        if(i == 10){
            jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/puntoMed.png")));
        }
        if(i == 11){
            jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/conicas.png")));
        }
        if(i == 12){
            jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/circunferencia.png")));
        }
        if(i == 13){
            jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/parabola.png")));
        }
        if(i == 14){
            jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/hiperbola.png")));
        }
        if(i == 15){
            jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/circulo.png")));
        }
        if(i == 16){
            jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/diametro.png")));
        }
        if(i == 17){
            jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/radio.png")));
        }
        if(i == 18){
            //jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/tangente.1")));
        }
        if(i == 19){
            jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/secante.png")));
        }
        if(i == 20){
            jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/angulo.png")));
        }
        if(i == 21){
            //jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/anguloAdy.htm")));
        }
        if(i == 22){
            jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/segmentoDir.png")));
        }
        if(i == 23){
            jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/inclina.png")));
        }
        if(i == 24){
            jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/pendiente.png")));
        }
        if(i == 25){
            jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/abscisa.png")));
        }
        if(i == 26){
            jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/ordenadaOri.png")));
        }
        if(i == 27){
            jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/bisectriz.png")));
        }
        if(i == 28){
            jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/mediatriz.png")));
        }
        if(i == 29){
            jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/circuncentro.png")));
        }
        if(i == 30){
            jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/ortocentro.png")));
        }
        /*if(i == 31){
            jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/asintota.png")));
        }
        if(i == 32){
            jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/hefuvb4rhi.png")));
        }
        if(i == 33){
            jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/hefuvb4rhi.png")));
        }
        if(i == 34){
            jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/hefuvb4rhi.png")));
        }
        if(i == 35){
            jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/hefuvb4rhi.png")));
        }*/
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TexSignificado = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaPalabras = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtPalabraClave = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jButton3 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DICCIONARIO", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Semilight", 3, 18), new java.awt.Color(102, 102, 102))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TexSignificado.setColumns(20);
        TexSignificado.setRows(5);
        jScrollPane2.setViewportView(TexSignificado);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 430, 126));

        TablaPalabras.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(TablaPalabras);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 110, 340, 176));

        jButton1.setText("buscar");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, 110, 30));

        jButton2.setText("ir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 310, 101, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Mostrara todas las palabras clave");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 70, -1, 20));

        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, -1, -1));
        jPanel1.add(txtPalabraClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 190, 30));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 60, -1, 360));

        jButton3.setText("<-- Regresar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-5, 31, 880, 440));

        jPanel2.setBackground(new java.awt.Color(102, 255, 102));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 875, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 875, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    if(!txtPalabraClave.getText().isEmpty()){
        Concepto();
    }else{
        JOptionPane.showMessageDialog(null, "Introduce una palabra o da clic en ir\n"
                + "Para ver las palabras existentes");
    }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    matriz(CD.getPalabras(),i);
    evtTabla();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed
    public void matriz(String []palabras, int i){
        DefaultTableModel model = (DefaultTableModel) TablaPalabras.getModel();
        model.addColumn(i, palabras);
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaPalabras;
    private javax.swing.JTextArea TexSignificado;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txtPalabraClave;
    // End of variables declaration//GEN-END:variables
}
