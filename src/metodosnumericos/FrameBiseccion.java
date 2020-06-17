package metodosnumericos;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import metodosnumericos.interfaces.Funcion;
import metodosnumericos.interfaces.Ifuntion;
import org.lsmp.djep.djep.DJep;
import org.nfunk.jep.Node;
import org.nfunk.jep.ParseException;

/**
 *
 * @author Adrian
 */
public class FrameBiseccion extends javax.swing.JFrame {

    Ifuntion f;
    Funcion fun;
    DefaultTableModel modelo;
    byte controlador = 0;
    Grafica gr;

    public FrameBiseccion() {
        initComponents();
        this.setSize(1000, 550);
        this.setLocationRelativeTo(null);
        lock(controlador);
        ordenar();
    }

    public void lock(byte posicion) {
        switch (posicion) {
            case 0:
                panelNewton.setVisible(false);
                panelSecante.setVisible(false);
                panelBi.setVisible(true);
                GrupoPn.setSelectedIndex(0);
                controlador = 0;
                break;
            case 1:
                panelBi.setVisible(false);
                panelSecante.setVisible(false);
                panelNewton.setVisible(true);
                GrupoPn.setSelectedIndex(1);
                controlador = 1;
                break;
            case 2:

                panelBi.setVisible(false);
                panelNewton.setVisible(false);
                panelSecante.setVisible(true);
                GrupoPn.setSelectedIndex(2);
                controlador = 2;

                break;
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gruprb = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton30 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jButton29 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        pantalla = new javax.swing.JTextField();
        panelBi = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtA = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtB = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtT = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        rdBi = new javax.swing.JRadioButton();
        rdNe = new javax.swing.JRadioButton();
        jSeparator1 = new javax.swing.JSeparator();
        rdSecante = new javax.swing.JRadioButton();
        jButton23 = new javax.swing.JButton();
        panelNewton = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtIter = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtIni = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtTolerancia = new javax.swing.JTextField();
        panelSecante = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        mc = new javax.swing.JLabel();
        txtX0 = new javax.swing.JTextField();
        txtX1 = new javax.swing.JTextField();
        txtIteracionesp = new javax.swing.JTextField();
        txtErrorPermitido = new javax.swing.JTextField();
        GrupoPn = new javax.swing.JTabbedPane();
        pnBi = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbResultado = new javax.swing.JTable();
        lblF_x = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblIntervalo = new javax.swing.JLabel();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel6 = new javax.swing.JPanel();
        lblResultado = new javax.swing.JLabel();
        pnNew = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jTextArea2 = new javax.swing.JTextArea();
        lblF_xNewton = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        lblResultadoNewton = new javax.swing.JLabel();
        lblIterNew = new javax.swing.JLabel();
        lblIninewt = new javax.swing.JLabel();
        lbl_derivada = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jTextArea3 = new javax.swing.JTextArea();
        lblF_xSecante = new javax.swing.JLabel();
        lblItervaloSecante = new javax.swing.JLabel();
        iterYerror = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        lblResultadoSecante = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Método de solución de funciones");

        jPanel1.setBackground(new java.awt.Color(238, 238, 238));

        jPanel2.setBackground(new java.awt.Color(238, 238, 238));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));

        jPanel4.setBackground(new java.awt.Color(238, 238, 238));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "Operadores", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Arial", 0, 12))); // NOI18N

        jButton1.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 255));
        jButton1.setText("^");
        jButton1.setBorderPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 255));
        jButton2.setText("√");
        jButton2.setBorderPainted(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 0, 255));
        jButton3.setText("%");
        jButton3.setBorderPainted(false);

        jButton4.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 0, 255));
        jButton4.setText("(");
        jButton4.setBorderPainted(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jButton5.setForeground(new java.awt.Color(0, 0, 255));
        jButton5.setText(")");
        jButton5.setBorderPainted(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jButton6.setForeground(new java.awt.Color(0, 0, 255));
        jButton6.setText("/");
        jButton6.setBorderPainted(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jButton7.setForeground(new java.awt.Color(0, 0, 255));
        jButton7.setText("*");
        jButton7.setBorderPainted(false);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jButton8.setForeground(new java.awt.Color(0, 0, 255));
        jButton8.setText("+");
        jButton8.setBorderPainted(false);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jButton9.setForeground(new java.awt.Color(0, 0, 255));
        jButton9.setText("-");
        jButton9.setBorderPainted(false);
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton22.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton22.setForeground(new java.awt.Color(255, 0, 0));
        jButton22.setText("CE");
        jButton22.setBorderPainted(false);
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });

        jButton10.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButton10.setForeground(new java.awt.Color(255, 0, 0));
        jButton10.setText(".");
        jButton10.setBorderPainted(false);
        jButton10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton30.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButton30.setForeground(new java.awt.Color(255, 0, 0));
        jButton30.setText(",");
        jButton30.setBorderPainted(false);
        jButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton30ActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(238, 238, 238));

        jButton29.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton29.setForeground(new java.awt.Color(255, 0, 0));
        jButton29.setText("e");
        jButton29.setBorderPainted(false);
        jButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton29ActionPerformed(evt);
            }
        });

        jButton26.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton26.setForeground(new java.awt.Color(255, 0, 0));
        jButton26.setText("tan");
        jButton26.setBorderPainted(false);
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });

        jButton28.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton28.setForeground(new java.awt.Color(255, 0, 0));
        jButton28.setText("ln");
        jButton28.setBorderPainted(false);
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });

        jButton24.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton24.setForeground(new java.awt.Color(255, 0, 0));
        jButton24.setText("cos");
        jButton24.setBorderPainted(false);
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });

        jButton25.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton25.setForeground(new java.awt.Color(255, 0, 0));
        jButton25.setText("sen");
        jButton25.setBorderPainted(false);
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });

        jButton27.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton27.setForeground(new java.awt.Color(255, 0, 0));
        jButton27.setText("log");
        jButton27.setBorderPainted(false);
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton29, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButton26, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                        .addComponent(jButton24, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                        .addComponent(jButton25, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                        .addComponent(jButton28, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE))
                    .addComponent(jButton27, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE))
                .addGap(1, 1, 1))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jButton26, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jButton29, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton27, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton3)
                            .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton30, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel5.setBackground(new java.awt.Color(238, 238, 238));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "Números y variables", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Arial", 0, 12))); // NOI18N

        jButton11.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jButton11.setForeground(new java.awt.Color(0, 0, 255));
        jButton11.setText("0");
        jButton11.setBorderPainted(false);
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jButton12.setForeground(new java.awt.Color(0, 0, 255));
        jButton12.setText("1");
        jButton12.setBorderPainted(false);
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton13.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jButton13.setForeground(new java.awt.Color(0, 0, 255));
        jButton13.setText("2");
        jButton13.setBorderPainted(false);
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton14.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jButton14.setForeground(new java.awt.Color(0, 0, 255));
        jButton14.setText("3");
        jButton14.setBorderPainted(false);
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jButton15.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jButton15.setForeground(new java.awt.Color(0, 0, 255));
        jButton15.setText("4");
        jButton15.setBorderPainted(false);
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jButton16.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jButton16.setForeground(new java.awt.Color(0, 0, 255));
        jButton16.setText("5");
        jButton16.setBorderPainted(false);
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jButton17.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jButton17.setForeground(new java.awt.Color(0, 0, 255));
        jButton17.setText("6");
        jButton17.setBorderPainted(false);
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        jButton18.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jButton18.setForeground(new java.awt.Color(0, 0, 255));
        jButton18.setText("7");
        jButton18.setBorderPainted(false);
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        jButton19.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jButton19.setForeground(new java.awt.Color(0, 0, 255));
        jButton19.setText("8");
        jButton19.setBorderPainted(false);
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        jButton20.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jButton20.setForeground(new java.awt.Color(0, 0, 255));
        jButton20.setText("9");
        jButton20.setBorderPainted(false);
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });

        jButton21.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jButton21.setForeground(new java.awt.Color(0, 0, 255));
        jButton21.setText("x");
        jButton21.setBorderPainted(false);
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        pantalla.setEditable(false);
        pantalla.setBackground(new java.awt.Color(255, 255, 255));
        pantalla.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        pantalla.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        pantalla.setBorder(null);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pantalla)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pantalla, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
        );

        panelBi.setBackground(new java.awt.Color(238, 238, 238));
        panelBi.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white), "Configuración", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Arial", 0, 12))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setText("[ a = ");

        txtA.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtA.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtA.setText("0");
        txtA.setToolTipText("Rango inferior.");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText(", b = ");

        txtB.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtB.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtB.setText("4");
        txtB.setToolTipText("Rango superior.");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText("Tolerancia = ");

        txtT.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtT.setText("0.001");
        txtT.setToolTipText("Tolerancia.");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setText("]");

        javax.swing.GroupLayout panelBiLayout = new javax.swing.GroupLayout(panelBi);
        panelBi.setLayout(panelBiLayout);
        panelBiLayout.setHorizontalGroup(
            panelBiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBiLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBiLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtA, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtB, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelBiLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtT, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addContainerGap(42, Short.MAX_VALUE))
        );
        panelBiLayout.setVerticalGroup(
            panelBiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBiLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panelBiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(panelBiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel11.setBackground(new java.awt.Color(238, 238, 238));
        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Resolver con:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Arial", 0, 12))); // NOI18N

        gruprb.add(rdBi);
        rdBi.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        rdBi.setSelected(true);
        rdBi.setText("Método Biseccón");
        rdBi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdBiActionPerformed(evt);
            }
        });

        gruprb.add(rdNe);
        rdNe.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        rdNe.setText("Método Newton - R ");
        rdNe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdNeActionPerformed(evt);
            }
        });

        gruprb.add(rdSecante);
        rdSecante.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        rdSecante.setText("Método Secante ");
        rdSecante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdSecanteActionPerformed(evt);
            }
        });

        jButton23.setBackground(new java.awt.Color(0, 0, 255));
        jButton23.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton23.setForeground(new java.awt.Color(255, 255, 255));
        jButton23.setText("Evaluar");
        jButton23.setBorderPainted(false);
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(rdSecante, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                                .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
                            .addComponent(rdNe, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rdBi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addComponent(rdBi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rdNe, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rdSecante)
                .addGap(5, 5, 5)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panelNewton.setBackground(new java.awt.Color(238, 238, 238));
        panelNewton.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white), "Configuración", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Arial", 0, 12))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setText("Iteraciones:");

        txtIter.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtIter.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtIter.setText("100");
        txtIter.setToolTipText("Rango inferior.");

        jLabel10.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel10.setText("Punto inicial: ");

        txtIni.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtIni.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtIni.setText("1.0");
        txtIni.setToolTipText("Rango inferior.");

        jLabel11.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel11.setText("Tolerancia:");

        txtTolerancia.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtTolerancia.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTolerancia.setText("0.001");
        txtTolerancia.setToolTipText("Rango inferior.");

        javax.swing.GroupLayout panelNewtonLayout = new javax.swing.GroupLayout(panelNewton);
        panelNewton.setLayout(panelNewtonLayout);
        panelNewtonLayout.setHorizontalGroup(
            panelNewtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNewtonLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelNewtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelNewtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtIni)
                    .addComponent(txtIter)
                    .addComponent(txtTolerancia, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        panelNewtonLayout.setVerticalGroup(
            panelNewtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNewtonLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(panelNewtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtIter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(panelNewtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtIni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelNewtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtTolerancia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel5.getAccessibleContext().setAccessibleName("Máximo de iteraciones:");

        panelSecante.setBackground(new java.awt.Color(238, 238, 238));
        panelSecante.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white), "Configuración", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Arial", 0, 12))); // NOI18N

        jLabel12.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel12.setText("x0:");

        jLabel13.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel13.setText("x1:");

        jLabel14.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel14.setText("Iteraciones:");

        mc.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        mc.setText("Tolerancia");

        txtX0.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtX0.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtX0.setText("1");
        txtX0.setToolTipText("Rango inferior.");

        txtX1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtX1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtX1.setText("2");
        txtX1.setToolTipText("Rango inferior.");

        txtIteracionesp.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtIteracionesp.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtIteracionesp.setText("100");
        txtIteracionesp.setToolTipText("Rango inferior.");

        txtErrorPermitido.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtErrorPermitido.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtErrorPermitido.setText("0.001");
        txtErrorPermitido.setToolTipText("Rango inferior.");

        javax.swing.GroupLayout panelSecanteLayout = new javax.swing.GroupLayout(panelSecante);
        panelSecante.setLayout(panelSecanteLayout);
        panelSecanteLayout.setHorizontalGroup(
            panelSecanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSecanteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelSecanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelSecanteLayout.createSequentialGroup()
                        .addComponent(mc, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtErrorPermitido, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE))
                    .addGroup(panelSecanteLayout.createSequentialGroup()
                        .addGroup(panelSecanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelSecanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtX0)
                            .addComponent(txtX1)
                            .addComponent(txtIteracionesp))))
                .addContainerGap())
        );
        panelSecanteLayout.setVerticalGroup(
            panelSecanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSecanteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelSecanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtX0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelSecanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtX1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelSecanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel14)
                    .addComponent(txtIteracionesp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelSecanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mc)
                    .addComponent(txtErrorPermitido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(panelBi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelNewton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(panelSecante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelBi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelNewton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelSecante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        GrupoPn.setBackground(new java.awt.Color(238, 238, 238));
        GrupoPn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(238, 238, 238), new java.awt.Color(238, 238, 238), new java.awt.Color(238, 238, 238), new java.awt.Color(238, 238, 238)));
        GrupoPn.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        GrupoPn.setTabPlacement(javax.swing.JTabbedPane.BOTTOM);
        GrupoPn.setFocusable(false);
        GrupoPn.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        pnBi.setBackground(new java.awt.Color(238, 238, 238));
        pnBi.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));

        tbResultado.setBackground(new java.awt.Color(238, 238, 238));
        tbResultado.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        tbResultado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Paso", "a", "f(a)", "b", "f(b)", "Raiz"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbResultado);
        if (tbResultado.getColumnModel().getColumnCount() > 0) {
            tbResultado.getColumnModel().getColumn(0).setResizable(false);
        }

        lblF_x.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        lblF_x.setText("f(x) =");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setText("Método de bisección");

        lblIntervalo.setFont(new java.awt.Font("Monospaced", 1, 13)); // NOI18N
        lblIntervalo.setText("En el intervalo:");

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(240, 240, 240));
        jTextArea1.setColumns(20);
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setText("Se usa el método de bisección para determinar una solución de:");
        jTextArea1.setBorder(null);

        jPanel6.setBackground(new java.awt.Color(238, 238, 238));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 255, 0), new java.awt.Color(0, 255, 0), new java.awt.Color(0, 255, 0), new java.awt.Color(0, 255, 0)), "Resultado", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Arial", 0, 12))); // NOI18N

        lblResultado.setFont(new java.awt.Font("Monospaced", 0, 13)); // NOI18N
        lblResultado.setText("Raiz = ");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblResultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblResultado)
                .addContainerGap())
        );

        javax.swing.GroupLayout pnBiLayout = new javax.swing.GroupLayout(pnBi);
        pnBi.setLayout(pnBiLayout);
        pnBiLayout.setHorizontalGroup(
            pnBiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnBiLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnBiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextArea1)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblF_x, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addComponent(lblIntervalo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnBiLayout.setVerticalGroup(
            pnBiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnBiLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jTextArea1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lblF_x)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblIntervalo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 23, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        GrupoPn.addTab("Método de Bisección", pnBi);

        pnNew.setBackground(new java.awt.Color(238, 238, 238));
        pnNew.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setText("Método de Newton-Raphson");

        jTextArea2.setEditable(false);
        jTextArea2.setBackground(new java.awt.Color(240, 240, 240));
        jTextArea2.setColumns(20);
        jTextArea2.setLineWrap(true);
        jTextArea2.setRows(5);
        jTextArea2.setText("El método de Newton no garantiza encontrar una raiz de la función desde un punto inicial. En caso de existir varias, solo encuentra una dependiendo del punto inicial.\n\nSe usa el método de Newton-Raphson para determinar una solución de:");
        jTextArea2.setBorder(null);
        jTextArea2.setDoubleBuffered(true);
        jTextArea2.setDragEnabled(true);

        lblF_xNewton.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        lblF_xNewton.setText("f(x) =");

        jPanel8.setBackground(new java.awt.Color(238, 238, 238));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 255, 0), new java.awt.Color(0, 255, 0), new java.awt.Color(0, 255, 0), new java.awt.Color(0, 255, 0)), "Resultado", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Arial", 0, 12))); // NOI18N

        lblResultadoNewton.setFont(new java.awt.Font("Monospaced", 0, 13)); // NOI18N
        lblResultadoNewton.setText("Raiz = ");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblResultadoNewton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblResultadoNewton)
                .addContainerGap())
        );

        lblIterNew.setFont(new java.awt.Font("Monospaced", 1, 13)); // NOI18N
        lblIterNew.setText("Con un máximo de: ");

        lblIninewt.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        lblIninewt.setText("Tomando una estimación inicial de:");

        lbl_derivada.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        lbl_derivada.setText("Derivada: ");

        javax.swing.GroupLayout pnNewLayout = new javax.swing.GroupLayout(pnNew);
        pnNew.setLayout(pnNewLayout);
        pnNewLayout.setHorizontalGroup(
            pnNewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnNewLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnNewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnNewLayout.createSequentialGroup()
                        .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addComponent(lblIninewt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnNewLayout.createSequentialGroup()
                        .addGroup(pnNewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblF_xNewton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblIterNew, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnNewLayout.createSequentialGroup()
                        .addGroup(pnNewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextArea2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(12, 12, 12))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnNewLayout.createSequentialGroup()
                        .addComponent(lbl_derivada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        pnNewLayout.setVerticalGroup(
            pnNewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnNewLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(jTextArea2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblF_xNewton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblIterNew)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblIninewt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_derivada)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );

        GrupoPn.addTab("Método de Newton-Raphoson", pnNew);

        jPanel9.setBackground(new java.awt.Color(238, 238, 238));

        jTextArea3.setEditable(false);
        jTextArea3.setBackground(new java.awt.Color(240, 240, 240));
        jTextArea3.setColumns(20);
        jTextArea3.setLineWrap(true);
        jTextArea3.setRows(5);
        jTextArea3.setText("El método de la secante es un método para encontrar los ceros de una función de forma iterativa. \n\n\nSe usa el método de la Secante para determinar una solución de:");
        jTextArea3.setBorder(null);
        jTextArea3.setDoubleBuffered(true);
        jTextArea3.setDragEnabled(true);

        lblF_xSecante.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        lblF_xSecante.setText("f(x) =");

        lblItervaloSecante.setFont(new java.awt.Font("Monospaced", 1, 13)); // NOI18N
        lblItervaloSecante.setText("Con un intervalo de: ");

        iterYerror.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        iterYerror.setText(":");

        jPanel10.setBackground(new java.awt.Color(238, 238, 238));
        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 255, 0), new java.awt.Color(0, 255, 0), new java.awt.Color(0, 255, 0), new java.awt.Color(0, 255, 0)), "Resultado", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Arial", 0, 12))); // NOI18N

        lblResultadoSecante.setFont(new java.awt.Font("Monospaced", 0, 13)); // NOI18N
        lblResultadoSecante.setText("Raiz = ");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblResultadoSecante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblResultadoSecante)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(iterYerror, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblF_xSecante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblItervaloSecante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextArea3))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextArea3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(lblF_xSecante)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblItervaloSecante)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(iterYerror)
                .addGap(75, 75, 75)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        GrupoPn.addTab("Método de Secante", jPanel9);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(GrupoPn, javax.swing.GroupLayout.PREFERRED_SIZE, 479, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(GrupoPn, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 33, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jMenu1.setText("Archivo");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Salir");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

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

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        pantalla.replaceSelection("0");
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        pantalla.replaceSelection("1");
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        pantalla.replaceSelection("2");
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        pantalla.replaceSelection("3");
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        pantalla.replaceSelection("4");
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        pantalla.replaceSelection("5");
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        pantalla.replaceSelection("6");
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        pantalla.replaceSelection("7");
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        pantalla.replaceSelection("8");
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        pantalla.replaceSelection("9");
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        pantalla.replaceSelection("x");
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        String temp = pantalla.getText();
        int tama = temp.length();
        if (tama > 0) {
            temp = temp.substring(0, tama - 1);
            pantalla.setText(temp);
        }
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        pantalla.replaceSelection("^");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        pantalla.replaceSelection("sqrt(");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        pantalla.replaceSelection("(");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        pantalla.replaceSelection(")");
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        pantalla.replaceSelection("/");
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        pantalla.replaceSelection("*");
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        pantalla.replaceSelection("+");
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        pantalla.replaceSelection("-");
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        String cad = pantalla.getText();
        if (cad.length() <= 0) {
            pantalla.setText("0.");
        } else {
            if (!LocalizarPunto(cad)) {
                pantalla.setText(cad + ".");
            }
        }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
        pantalla.replaceSelection("cos(");
    }//GEN-LAST:event_jButton24ActionPerformed

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
        pantalla.replaceSelection("sin(");
    }//GEN-LAST:event_jButton25ActionPerformed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
        pantalla.replaceSelection("tan(");
    }//GEN-LAST:event_jButton26ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed

        limpiarTabla();
        modelo = (DefaultTableModel) tbResultado.getModel();
        String funcion = pantalla.getText();
        fun = new Funcion(funcion);
        if ((!funcion.equals("")) && fun.contieneX(funcion)) {

            if (controlador == 0) { //cuando sea el método de bisección 0

                try {
                    double a = Double.parseDouble(txtA.getText());
                    double b = Double.parseDouble(txtB.getText());
                    double t = Double.parseDouble(txtT.getText());
                    this.f = fun;
                    metodoBiseccion(funcion, a, b, t);
                    ordenar();
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Verifique que el intervalo o tolerancia sea correcto.", "Error", JOptionPane.ERROR_MESSAGE);
                }

            } else if (controlador == 1) { //cuando se el método de newton 1

                try {
                    Ifuntion der;
                    String derivada = Derivar(funcion);
                    Funcion fun2 = new Funcion(derivada);
                    double iter = Double.parseDouble(txtIter.getText());
                    double ini = Double.parseDouble(txtIni.getText());
                    double error = Double.parseDouble(txtTolerancia.getText());
                    this.f = fun;
                    der = fun2;

                    newtonRaphson(funcion, f, der, ini, error, iter);
                    // newtonRaphson(funcion, ini, iter);
                } catch (NumberFormatException e) {
                    System.out.println("Error desconocido: " + e.getMessage());
                    JOptionPane.showMessageDialog(null, "Verifique el número de iteraciones y el punto inicial.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } else if (controlador == 2) { //cuando sea el método de la secante
                try {

                    double x0 = Double.parseDouble(txtX0.getText());
                    double x1 = Double.parseDouble(txtX1.getText());
                    double iter = Double.parseDouble(txtIteracionesp.getText());
                    double tolerancia = Double.parseDouble(txtErrorPermitido.getText());
                    this.f = fun;
                    
                    secante(funcion, f, x0, x1, iter, tolerancia);

                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Verifique el número de valores x0, x1.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Se requiere que ingrese una función con al menos una variable x.", "No ingreso función", JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_jButton23ActionPerformed

    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed
        pantalla.replaceSelection("log(");
    }//GEN-LAST:event_jButton27ActionPerformed

    private void rdBiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdBiActionPerformed
        lock((byte) 0);
    }//GEN-LAST:event_rdBiActionPerformed

    private void rdNeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdNeActionPerformed
        lock((byte) 1);
    }//GEN-LAST:event_rdNeActionPerformed

    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton28ActionPerformed
        pantalla.replaceSelection("ln(");
    }//GEN-LAST:event_jButton28ActionPerformed

    private void jButton29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton29ActionPerformed
        pantalla.replaceSelection("exp(");
    }//GEN-LAST:event_jButton29ActionPerformed

    private void jButton30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton30ActionPerformed
        pantalla.replaceSelection(",");
    }//GEN-LAST:event_jButton30ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void rdSecanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdSecanteActionPerformed
        lock((byte) 2);
    }//GEN-LAST:event_rdSecanteActionPerformed

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
            java.util.logging.Logger.getLogger(FrameBiseccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameBiseccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameBiseccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameBiseccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>  

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameBiseccion().setVisible(true);
            }
        });
    }

    public void metodoBiseccion(String fff, double a, double b, double t) {
        double aa = a;
        double bb = b;
        double x = Double.NaN;
        int contador = 0;
        double evaA = f.eval(a);
        if (!Double.isNaN(evaA)) {
            double evaB = f.eval(b);
            if ((evaA * evaB) < 0) {
                do {
                    x = (a + b) / 2;
                    contador++;
                    modelo.addRow(new Object[]{contador, a, evaA, b, evaB, x});
                    tbResultado.setModel(modelo);
                    //System.out.println(contador + "-. (a): " + a + " f(a): " + evaA + " (b): " + b + " f(b): " + evaB + " Raiz: " + x);
                    evaA = f.eval(a);
                    evaB = f.eval(b);
                    if (evaA * f.eval(x) < 0) {
                        b = x;
                    } else {
                        a = x;
                    }
                } while (Math.abs(f.eval(x)) > t);
            }//termina if

            if (Double.isNaN(x)) {
                JOptionPane.showMessageDialog(null, "Intervalos no factibles.", "Error de intervalos", JOptionPane.WARNING_MESSAGE);
            } else {
                escribirResultados(x);

                ArrayList<Double> x1 = new ArrayList();
                ArrayList<Double> y1 = new ArrayList();
                int numeroContador = 0;

                for (double i = ((bb + 2) * -1); i < (bb + 2); i += 0.01) {
                    x1.add(i);
                    y1.add(f.eval(i));
                    numeroContador++;
                }

                gr = new Grafica(fff, x1, y1);
                gr.setVisible(true);

            }
        }
    }

    public void newtonRaphson(String fun, Ifuntion f, Ifuntion derivada, double x, double tole, double iter) {

        double r = Double.NaN;
        double inicial = x;
        int k = 0;
        double graf = x;
        
        double temporal = f.eval(x);

        if (!Double.isNaN(temporal)) {



        while (Math.abs(f.eval(x)) > tole && k < iter) {
            x = x - f.eval(x) / derivada.eval(x);            
            k++;
        }

        if (k < iter) {
            r = x;
            lblF_xNewton.setText("f(x) = " + fun);
            lblIterNew.setText("Con un máximo de: " + iter + " iteraciones.");
            lblIninewt.setText("Tomando una estimación inicial de: " + inicial);
            lblResultadoNewton.setText("Raiz = " + r);
            lbl_derivada.setText("Derivada: " + Derivar(fun));
            GrupoPn.setSelectedIndex(1);

            ArrayList<Double> x1 = new ArrayList();
            ArrayList<Double> y1 = new ArrayList();
            int numeroContador = 0;
            y1.add(graf);
            for (double i = (inicial - 3); i < (inicial + 2); i += 0.01) {
                x1.add(i);

                //x = y1.get(numeroContador) - f.eval(x) / derivada.eval(x);
                y1.add(f.eval(x1.get(numeroContador)));
                numeroContador++;
            }

            gr = new Grafica(fun, x1, y1);
            gr.setVisible(true);

        } else {
            JOptionPane.showMessageDialog(null, "Verifiqué la función o que el punto inicial sea correcto.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        } 

    }

    public void secante(String fun, Ifuntion f, double x0, double x1, double iter, double error) {
        double inicial = x0;
         double azfinal = x1;
        double r = Double.NaN;
        double x2 = x0;
        int k = 0;
        double temporal = f.eval(x2);
        
        if (!Double.isNaN(temporal)) {
            
        

        while (Math.abs(f.eval(x2)) > error && k < iter) {
            x2 = x0 - f.eval(x0) * (x1 - x0) / (f.eval(x1) - f.eval(x0));
            x0 = x1;
            x1 = x2;

            k++;
        }

        if (k < iter) {
            r = x2;
            
             lblF_xSecante.setText("f(x) = " + fun);
            lblItervaloSecante.setText("Con un intervalo de: " + inicial + ", "+ azfinal);
            iterYerror.setText("Iteraciones: " + iter + ", Tolerancia: "+ error);
            lblResultadoSecante.setText("Raiz = " + r);
            GrupoPn.setSelectedIndex(2);
            
            

            ArrayList<Double> axisx = new ArrayList();
            ArrayList<Double> axisy = new ArrayList();
            int numeroContador = 0;
            for (double i = (inicial - 2); i < (azfinal + 2); i += 0.01) {
                axisx.add(i);

                axisy.add(f.eval(axisx.get(numeroContador)));
                numeroContador++;
            }

            gr = new Grafica(fun, axisx, axisy);
            gr.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Verifiqué la función o sus datos de entrada.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane GrupoPn;
    private javax.swing.ButtonGroup gruprb;
    private javax.swing.JLabel iterYerror;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JLabel lblF_x;
    private javax.swing.JLabel lblF_xNewton;
    private javax.swing.JLabel lblF_xSecante;
    private javax.swing.JLabel lblIninewt;
    private javax.swing.JLabel lblIntervalo;
    private javax.swing.JLabel lblIterNew;
    private javax.swing.JLabel lblItervaloSecante;
    private javax.swing.JLabel lblResultado;
    private javax.swing.JLabel lblResultadoNewton;
    private javax.swing.JLabel lblResultadoSecante;
    private javax.swing.JLabel lbl_derivada;
    private javax.swing.JLabel mc;
    private javax.swing.JPanel panelBi;
    private javax.swing.JPanel panelNewton;
    private javax.swing.JPanel panelSecante;
    private javax.swing.JTextField pantalla;
    private javax.swing.JPanel pnBi;
    private javax.swing.JPanel pnNew;
    private javax.swing.JRadioButton rdBi;
    private javax.swing.JRadioButton rdNe;
    private javax.swing.JRadioButton rdSecante;
    private javax.swing.JTable tbResultado;
    private javax.swing.JTextField txtA;
    private javax.swing.JTextField txtB;
    private javax.swing.JTextField txtErrorPermitido;
    private javax.swing.JTextField txtIni;
    private javax.swing.JTextField txtIter;
    private javax.swing.JTextField txtIteracionesp;
    private javax.swing.JTextField txtT;
    private javax.swing.JTextField txtTolerancia;
    private javax.swing.JTextField txtX0;
    private javax.swing.JTextField txtX1;
    // End of variables declaration//GEN-END:variables

    public void escribirResultados(double x) {
        lblF_x.setText("f(x) = " + pantalla.getText());
        lblIntervalo.setText("En el intervalo: " + txtA.getText() + " ≤ x ≤ " + txtB.getText());
        lblResultado.setText("Raiz = " + x);
        GrupoPn.setSelectedIndex(0);
    }

    private void ordenar() {
        TableColumnModel columnModel = tbResultado.getColumnModel();
        tbResultado.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        columnModel.getColumn(0).setPreferredWidth(50);
        columnModel.getColumn(1).setPreferredWidth(100);
        columnModel.getColumn(2).setPreferredWidth(100);
        columnModel.getColumn(3).setPreferredWidth(100);
        columnModel.getColumn(4).setPreferredWidth(100);
        columnModel.getColumn(5).setPreferredWidth(100);

    }

    public static boolean LocalizarPunto(String cad) {//---------Metodo que determina donde se localiza el punto
        for (int i = cad.length() - 1; i < cad.length(); i++) {
            if (cad.substring(i, i + 1).equals(".")) {
                return true;
            }
        }
        return false;
    }//--------------------------------------------------------Termina Metodo que determina donde se localiza el punto

    public void limpiarTabla() {
        tbResultado.setModel(new DefaultTableModel(new Object[][]{},
                new String[]{"Paso", "a", "f(a)", "b", "f(b)", "Raiz"}) {
                });
    }

    public String Derivar(String funcion) {

        try {

            DJep djepObject;
            Node node_funcion;
            Node diff_simplificada;

            djepObject = new DJep();
            djepObject.addStandardFunctions();
            djepObject.addStandardConstants();
            djepObject.addComplex();
            djepObject.setAllowUndeclared(true);
            djepObject.setAllowAssignment(true);
            djepObject.setImplicitMul(true);
            djepObject.addStandardDiffRules();

            node_funcion = (Node) djepObject.parse(funcion);

            Node diff = djepObject.differentiate(node_funcion, "x");
            diff_simplificada = djepObject.simplify(diff);

            return djepObject.toString(diff_simplificada);
        } catch (ParseException e) {
            System.out.println("No se puede derivar");
            return "";
        }

    }

    //formula para redondear los decimales

    public double redondearDecimales(double valor, int decimales) {
        double resultado = valor;
        BigDecimal big = new BigDecimal(resultado);
        big = big.setScale(decimales, RoundingMode.HALF_UP);
        resultado = Double.parseDouble(big.toString());

        return resultado;
    }

}
