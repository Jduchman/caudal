
package vista;

import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import modelo.Poligono;

/**
 *
 * @author Duchman
 */
public final class SeccionRectangulo extends javax.swing.JFrame {
    /** 
     * Creates new form NewJFrame
     */
    
    
    public void ConfiguracioFrame(){
        this.setSize(810, 610);
        this.setResizable(false);
        this.setLocationRelativeTo(this);
    }
    
    
    public SeccionRectangulo() {
        initComponents();
        ConfiguracioFrame();
        //fondo.setIcon(new ImageIcon( getClass().getResource( "./modelo/caudal-circular.png" ) ) );
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
        btn_limpiar = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_caudal = new javax.swing.JTextField();
        txt_pendiente = new javax.swing.JTextField();
        txt_rugosidad = new javax.swing.JTextField();
        txt_ancho = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btn_calcular = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_tirante = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txt_tirante = new javax.swing.JTextField();
        txt_perimetro = new javax.swing.JTextField();
        txt_area = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        txt_velocidad = new javax.swing.JTextField();
        txt_radio = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        btn_volver = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        btn_limpiar.setBackground(new java.awt.Color(0, 51, 51));
        btn_limpiar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btn_limpiar.setForeground(new java.awt.Color(255, 255, 255));
        btn_limpiar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_limpiar.setText("Limpiar");
        btn_limpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_limpiar.setFocusable(false);
        btn_limpiar.setOpaque(true);
        btn_limpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_limpiarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_limpiarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_limpiarMouseExited(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Datos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 12), new java.awt.Color(0, 51, 51))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setText("Caudal (m3/s)");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel6.setText("Ancho de Solera (m)");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel7.setText("Rugosidad");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel8.setText("Pendiente (m/m)");

        txt_caudal.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txt_caudal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txt_caudal.setMinimumSize(new java.awt.Dimension(64, 26));
        txt_caudal.setPreferredSize(new java.awt.Dimension(64, 26));

        txt_pendiente.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txt_pendiente.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txt_pendiente.setMinimumSize(new java.awt.Dimension(64, 26));
        txt_pendiente.setPreferredSize(new java.awt.Dimension(64, 26));

        txt_rugosidad.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txt_rugosidad.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txt_rugosidad.setMinimumSize(new java.awt.Dimension(64, 26));
        txt_rugosidad.setPreferredSize(new java.awt.Dimension(64, 26));

        txt_ancho.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txt_ancho.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txt_ancho.setMinimumSize(new java.awt.Dimension(64, 26));
        txt_ancho.setPreferredSize(new java.awt.Dimension(64, 26));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addGap(74, 74, 74)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txt_rugosidad, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_ancho, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_caudal, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_pendiente, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_caudal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_ancho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txt_rugosidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txt_pendiente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jLabel2.setBackground(new java.awt.Color(0, 0, 102));
        jLabel2.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("SECCIÓN RECTANGULAR");
        jLabel2.setOpaque(true);

        btn_calcular.setBackground(new java.awt.Color(0, 51, 51));
        btn_calcular.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btn_calcular.setForeground(new java.awt.Color(255, 255, 255));
        btn_calcular.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_calcular.setText("Calcular");
        btn_calcular.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_calcular.setFocusable(false);
        btn_calcular.setOpaque(true);
        btn_calcular.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_calcularMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_calcularMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_calcularMouseExited(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Resultados", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 12), new java.awt.Color(0, 51, 51))); // NOI18N

        tbl_tirante.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tbl_tirante.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "y", "F(y)"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_tirante.setGridColor(new java.awt.Color(255, 255, 255));
        tbl_tirante.setSelectionBackground(new java.awt.Color(51, 51, 51));
        tbl_tirante.setSelectionForeground(new java.awt.Color(255, 255, 255));
        tbl_tirante.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tbl_tirante.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tbl_tirante.getTableHeader().setResizingAllowed(false);
        tbl_tirante.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tbl_tirante);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel9.setText("Iteración para el calculo de y:");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel10.setText("Tirante Normal (m):");

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel11.setText("Area Hidraulica (m2)");

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel12.setText("Perimetro (m)");

        txt_tirante.setEditable(false);
        txt_tirante.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txt_tirante.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txt_tirante.setPreferredSize(new java.awt.Dimension(65, 26));

        txt_perimetro.setEditable(false);
        txt_perimetro.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txt_perimetro.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txt_perimetro.setPreferredSize(new java.awt.Dimension(65, 26));

        txt_area.setEditable(false);
        txt_area.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txt_area.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txt_area.setPreferredSize(new java.awt.Dimension(65, 26));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        txt_velocidad.setEditable(false);
        txt_velocidad.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txt_velocidad.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txt_velocidad.setPreferredSize(new java.awt.Dimension(65, 26));

        txt_radio.setEditable(false);
        txt_radio.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txt_radio.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txt_radio.setPreferredSize(new java.awt.Dimension(65, 26));

        jLabel18.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel18.setText("Velocidad (m/s)");

        jLabel19.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel19.setText("Radio Hidraúlico (m)");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(txt_tirante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19)
                    .addComponent(jLabel18)
                    .addComponent(jLabel12)
                    .addComponent(jLabel11))
                .addGap(65, 65, 65)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_velocidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_radio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_perimetro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_area, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap(12, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(18, 18, 18)
                                .addComponent(txt_tirante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(57, 57, 57)))))
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_area, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_perimetro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_radio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_velocidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btn_volver.setBackground(new java.awt.Color(204, 0, 0));
        btn_volver.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btn_volver.setForeground(new java.awt.Color(255, 255, 255));
        btn_volver.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_volver.setText("Volver");
        btn_volver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_volver.setFocusable(false);
        btn_volver.setOpaque(true);
        btn_volver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_volverMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_volverMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_volverMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(btn_volver, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_calcular, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(155, 155, 155)
                        .addComponent(btn_limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_volver, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_calcular, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_limpiarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_limpiarMouseEntered
        btn_limpiar.setBackground(new java.awt.Color(0, 102, 102));
    }//GEN-LAST:event_btn_limpiarMouseEntered

    private void btn_limpiarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_limpiarMouseExited
        btn_limpiar.setBackground(new java.awt.Color(0, 51, 51));
    }//GEN-LAST:event_btn_limpiarMouseExited

    private void btn_calcularMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_calcularMouseEntered
        btn_calcular.setBackground(new java.awt.Color(0, 102, 102));
    }//GEN-LAST:event_btn_calcularMouseEntered

    private void btn_calcularMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_calcularMouseExited
        btn_calcular.setBackground(new java.awt.Color(0, 51, 51));
    }//GEN-LAST:event_btn_calcularMouseExited

    private void btn_limpiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_limpiarMouseClicked
        txt_caudal.setText("");txt_ancho.setText("");txt_pendiente.setText("");txt_rugosidad.setText("");
        txt_perimetro.setText("");txt_area.setText("");txt_tirante.setText("");txt_velocidad.setText("");
        txt_radio.setText(""); tbl_tirante.setModel(new DefaultTableModel());
        
    }//GEN-LAST:event_btn_limpiarMouseClicked

    private void btn_volverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_volverMouseClicked
        Main menuP = new Main();
        menuP.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_volverMouseClicked

    private void btn_volverMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_volverMouseEntered
        btn_volver.setBackground(new java.awt.Color(104, 0, 0));
    }//GEN-LAST:event_btn_volverMouseEntered

    private void btn_volverMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_volverMouseExited
        btn_volver.setBackground(new java.awt.Color(204, 0, 0));
    }//GEN-LAST:event_btn_volverMouseExited

    private void btn_calcularMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_calcularMouseClicked
        Poligono rect = new Poligono();
        float valorC = Float.valueOf(txt_caudal.getText());
        float valorA = Float.valueOf(txt_ancho.getText());
        float valorR = Float.valueOf(txt_rugosidad.getText());
        float valorP = Float.valueOf(txt_pendiente.getText());

        rect.setCaudal(valorC);
        rect.setAncho_solera(valorA);
        rect.setPendiente(valorP);
        rect.setTalud( 0 );
        rect.setRugosidad(valorR);
        
        
        rect.calcularCanalRectangular();
        cargarTabla(rect.getListaIteración());
        
        txt_tirante.setText(String.valueOf(new DecimalFormat("#.0000").format(rect.getTirante())));
        txt_perimetro.setText(String.valueOf(new DecimalFormat("#.0000").format(rect.getPerimetro())));
        txt_area.setText(String.valueOf(new DecimalFormat("#.0000").format(rect.getArea())));
        txt_radio.setText(String.valueOf(new DecimalFormat("#.0000").format(rect.getRadioHidraulico())));
        txt_velocidad.setText(String.valueOf(new DecimalFormat("#.0000").format(rect.getVelocidad())));

        
    }//GEN-LAST:event_btn_calcularMouseClicked

    public void cargarTabla(ArrayList<Float> lista){
        DefaultTableModel modelo = new DefaultTableModel();
        String[] columNames = {"F(y)", "y"};
        modelo.setColumnIdentifiers(columNames);
        
        try {
            Object[] fila = new Object[modelo.getColumnCount()];
            for (int i = 0; i < lista.size(); i = i + 2) {
                fila[0] = lista.get(i);
                fila[1] = lista.get(i+1);
                modelo.addRow(fila);
            }
            tbl_tirante.setModel(modelo);
        } catch (Exception e) {
            System.out.println("Error");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btn_calcular;
    private javax.swing.JLabel btn_limpiar;
    private javax.swing.JLabel btn_volver;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tbl_tirante;
    private javax.swing.JTextField txt_ancho;
    private javax.swing.JTextField txt_area;
    private javax.swing.JTextField txt_caudal;
    private javax.swing.JTextField txt_pendiente;
    private javax.swing.JTextField txt_perimetro;
    private javax.swing.JTextField txt_radio;
    private javax.swing.JTextField txt_rugosidad;
    private javax.swing.JTextField txt_tirante;
    private javax.swing.JTextField txt_velocidad;
    // End of variables declaration//GEN-END:variables
}
