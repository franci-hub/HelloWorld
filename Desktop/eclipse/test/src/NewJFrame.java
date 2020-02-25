
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.DefaultListModel;
import entity.Doctor;
import entity.Pacient;
import entity.Spitali;

public class NewJFrame extends javax.swing.JFrame { 
    public NewJFrame() {
        initComponents();
        pcIdTxt.requestFocus(true);
        DoctIdTxt.requestFocus(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        doctorPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        fNameLbl1 = new javax.swing.JLabel();
        fNameTxt1 = new javax.swing.JTextField();
        lNameLbl1 = new javax.swing.JLabel();
        lNameTxt1 = new javax.swing.JTextField();
        comboBxLbl1 = new javax.swing.JLabel();
        genderCmb1 = new javax.swing.JComboBox<>();
        addBtn1 = new javax.swing.JButton();
        cancelBtn1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        deleteBtn1 = new javax.swing.JButton();
        updateBtn1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        DoctIdTxt = new javax.swing.JTextField();
        pacientPanel = new javax.swing.JPanel();
        fNameLbl = new javax.swing.JLabel();
        fNameTxt = new javax.swing.JTextField();
        lNameLbl = new javax.swing.JLabel();
        lNameTxt = new javax.swing.JTextField();
        comboBxLbl = new javax.swing.JLabel();
        genderCmb = new javax.swing.JComboBox<>();
        addBtn = new javax.swing.JButton();
        cancelBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        deleteBtn = new javax.swing.JButton();
        updateBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        pcIdTxt = new javax.swing.JTextField();
        assignPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList3 = new javax.swing.JList<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        jList4 = new javax.swing.JList<>();
        assignBtn = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        jList5 = new javax.swing.JList<>();
        jScrollPane6 = new javax.swing.JScrollPane();
        jList6 = new javax.swing.JList<>();
        menuBar = new javax.swing.JMenuBar();
        doctorMenu = new javax.swing.JMenu();
        doctorItem = new javax.swing.JMenuItem();
        pacientMenu = new javax.swing.JMenu();
        pacientItem = new javax.swing.JMenuItem();
        assignMenu = new javax.swing.JMenu();
        assignMenuItem = new javax.swing.JMenuItem();
        reportMenu = new javax.swing.JMenu();
        reportMenuItem = new javax.swing.JMenuItem();
        jMenuItem1.setText("jMenuItem1");

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("The Main Page of the System");
        setResizable(false);
        getContentPane().setLayout(new java.awt.CardLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel1.setText("Doctor Panel");

        fNameLbl1.setText("FirstName:");

        lNameLbl1.setText("LastName:");

        comboBxLbl1.setText("Gender:");

        genderCmb1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Female", "Male" }));

        addBtn1.setBackground(new java.awt.Color(0, 255, 0));
        addBtn1.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        addBtn1.setText("Add");
        addBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtn1ActionPerformed(evt);
            }
        });

        cancelBtn1.setBackground(new java.awt.Color(255, 0, 0));
        cancelBtn1.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        cancelBtn1.setText("Cancel");
        cancelBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtn1ActionPerformed(evt);
            }
        });

        jList2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList2MouseClicked(evt);
            }
        });
        jList2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jList2KeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(jList2);

        deleteBtn1.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        deleteBtn1.setText("Delete");
        deleteBtn1.setEnabled(false);
        deleteBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtn1ActionPerformed(evt);
            }
        });

        updateBtn1.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        updateBtn1.setText("Update");
        updateBtn1.setEnabled(false);
        updateBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtn1ActionPerformed(evt);
            }
        });

        jLabel6.setText("Doct Id:");

        javax.swing.GroupLayout doctorPanelLayout = new javax.swing.GroupLayout(doctorPanel);
        doctorPanel.setLayout(doctorPanelLayout);
        doctorPanelLayout.setHorizontalGroup(
            doctorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(doctorPanelLayout.createSequentialGroup()
                .addGroup(doctorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(doctorPanelLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(addBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(cancelBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(doctorPanelLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1))
                    .addGroup(doctorPanelLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(doctorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(doctorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, doctorPanelLayout.createSequentialGroup()
                                    .addComponent(lNameLbl1)
                                    .addGap(14, 14, 14)
                                    .addComponent(lNameTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, doctorPanelLayout.createSequentialGroup()
                                    .addGroup(doctorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(fNameLbl1)
                                        .addComponent(jLabel6))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(doctorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(fNameTxt1, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                                        .addComponent(DoctIdTxt))))
                            .addGroup(doctorPanelLayout.createSequentialGroup()
                                .addComponent(comboBxLbl1)
                                .addGap(26, 26, 26)
                                .addComponent(genderCmb1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addGroup(doctorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(doctorPanelLayout.createSequentialGroup()
                        .addComponent(deleteBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(updateBtn1))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44))
        );
        doctorPanelLayout.setVerticalGroup(
            doctorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(doctorPanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(doctorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(doctorPanelLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(29, 29, 29)
                        .addGroup(doctorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(DoctIdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(doctorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fNameLbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fNameTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3)
                        .addGroup(doctorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lNameLbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lNameTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(doctorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboBxLbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(genderCmb1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(doctorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteBtn1)
                    .addComponent(updateBtn1)
                    .addComponent(addBtn1)
                    .addComponent(cancelBtn1))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        getContentPane().add(doctorPanel, "card3");

        pacientPanel.setEnabled(false);

        fNameLbl.setText("FirstName:");

        lNameLbl.setText("LastName:");

        comboBxLbl.setText("Gender:");

        genderCmb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Female", "Male" }));

        addBtn.setBackground(new java.awt.Color(0, 204, 0));
        addBtn.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        addBtn.setText("Add");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        cancelBtn.setBackground(new java.awt.Color(255, 0, 0));
        cancelBtn.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        cancelBtn.setText("Cancel");
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });

        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jList1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jList1KeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        deleteBtn.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        deleteBtn.setText("Delete");
        deleteBtn.setEnabled(false);
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        updateBtn.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        updateBtn.setText("Update");
        updateBtn.setEnabled(false);
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Pacient Panel");

        jLabel5.setText("Pacient id:");

        javax.swing.GroupLayout pacientPanelLayout = new javax.swing.GroupLayout(pacientPanel);
        pacientPanel.setLayout(pacientPanelLayout);
        pacientPanelLayout.setHorizontalGroup(
            pacientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pacientPanelLayout.createSequentialGroup()
                .addGroup(pacientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pacientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(pacientPanelLayout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addComponent(comboBxLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(genderCmb, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(pacientPanelLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel2))
                        .addGroup(pacientPanelLayout.createSequentialGroup()
                            .addGap(28, 28, 28)
                            .addGroup(pacientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(pacientPanelLayout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addGap(18, 18, 18)
                                    .addComponent(pcIdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(pacientPanelLayout.createSequentialGroup()
                                    .addGroup(pacientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(fNameLbl, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lNameLbl, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addGap(18, 18, 18)
                                    .addGroup(pacientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(fNameTxt)
                                        .addComponent(lNameTxt))))))
                    .addGroup(pacientPanelLayout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pacientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pacientPanelLayout.createSequentialGroup()
                        .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(updateBtn)
                        .addGap(32, 32, 32))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50))
        );
        pacientPanelLayout.setVerticalGroup(
            pacientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pacientPanelLayout.createSequentialGroup()
                .addGroup(pacientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pacientPanelLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addGroup(pacientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(pcIdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addGroup(pacientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fNameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pacientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lNameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pacientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comboBxLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(genderCmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pacientPanelLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32)
                .addGroup(pacientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addBtn)
                    .addComponent(cancelBtn)
                    .addComponent(deleteBtn)
                    .addComponent(updateBtn))
                .addContainerGap(93, Short.MAX_VALUE))
        );

        pacientPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {fNameTxt, genderCmb, lNameTxt});

        getContentPane().add(pacientPanel, "card2");

        assignPanel.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                assignPanelComponentShown(evt);
            }
        });

        jLabel3.setText("List of pacients");

        jLabel4.setText("List of doctors");

        jScrollPane3.setViewportView(jList3);

        jList4.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane4.setViewportView(jList4);

        assignBtn.setText("Assign");
        assignBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignBtnActionPerformed(evt);
            }
        });

        jScrollPane5.setViewportView(jList5);

        jList6.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jList6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList6MouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(jList6);

        javax.swing.GroupLayout assignPanelLayout = new javax.swing.GroupLayout(assignPanel);
        assignPanel.setLayout(assignPanelLayout);
        assignPanelLayout.setHorizontalGroup(
            assignPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(assignPanelLayout.createSequentialGroup()
                .addGroup(assignPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, assignPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, assignPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, assignPanelLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(assignPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(assignPanelLayout.createSequentialGroup()
                        .addGap(225, 225, 225)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(32, Short.MAX_VALUE))
                    .addGroup(assignPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(assignBtn)
                        .addGap(53, 53, 53)
                        .addGroup(assignPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        assignPanelLayout.setVerticalGroup(
            assignPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(assignPanelLayout.createSequentialGroup()
                .addGroup(assignPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4))
                .addGroup(assignPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(assignPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(assignPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                            .addComponent(jScrollPane4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(assignPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                            .addComponent(jScrollPane6))
                        .addContainerGap())
                    .addGroup(assignPanelLayout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(assignBtn)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        getContentPane().add(assignPanel, "card4");

        doctorMenu.setText("Doctor");
        doctorMenu.setBorderPainted(true);

        doctorItem.setText("Doctor Panel");
        doctorItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doctorItemActionPerformed(evt);
            }
        });
        doctorMenu.add(doctorItem);

        menuBar.add(doctorMenu);

        pacientMenu.setText("Pacient");

        pacientItem.setText("Pacient Panel");
        pacientItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pacientItemActionPerformed(evt);
            }
        });
        pacientMenu.add(pacientItem);

        menuBar.add(pacientMenu);

        assignMenu.setText("Assign");

        assignMenuItem.setText("Assign paciets to docotr");
        assignMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignMenuItemActionPerformed(evt);
            }
        });
        assignMenu.add(assignMenuItem);

        menuBar.add(assignMenu);
        
//test

        reportMenu.setText("Report");

        reportMenuItem.setText("Reports");
        reportMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportMenuItemActionPerformed(evt);
            }
        });
        reportMenu.add(reportMenuItem);

        menuBar.add(reportMenu);
        
        
        
        

        setJMenuBar(menuBar);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        //Add button in paciet panel
        Pacient s = new Pacient();
        s.setPc_id(pcIdTxt.getText());
        s.setfName(fNameTxt.getText());
        s.setlName(lNameTxt.getText());
        String gender=(String) genderCmb.getSelectedItem();
        s.setGender(gender);
        
        Spitali.getInstance().getPacients().add(s);
            if(ListFunctions.checkFields(fNameTxt.getText(), lNameTxt.getText())==false)//check if TextFields are empty
            {
                ListFunctions.addElementToList(jList1, s);
            }//adding an element to the list
        
        try{
        //DBManager controler = DBManager.getInstance();
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost/SPITALI","root","password");
        //Statement stmt = DBManager.getStatement();
        
        Statement stmt=con.createStatement();  
        String query = "INSERT INTO `PACIENT` (`pc_id`, `fName`, `lName`, `gender`, `doct_id`) VALUES\n" +
            "('"+pcIdTxt.getText()+"', '"+fNameTxt.getText()+"', '"+lNameTxt.getText()+"', '"+(String)genderCmb.getSelectedItem()+"', '-1')";
        stmt.execute(query);
        }
        catch(Exception e){ 
            System.out.println(e+" this went wrong std");
        }        
        //set the fields in the original condition
        fNameTxt.setText("");
        lNameTxt.setText("");
        pcIdTxt.setText("");
        genderCmb.setSelectedIndex(0);
        pcIdTxt.requestFocus(true);
        
        //storing data into the database
        
    }//GEN-LAST:event_addBtnActionPerformed

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        //Cancel button in paciet panel
        fNameTxt.setText("");
        lNameTxt.setText("");
        pcIdTxt.setText("");
        genderCmb.setSelectedIndex(0);
        pcIdTxt.requestFocus(true);
    }//GEN-LAST:event_cancelBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        //delete an element from the list ---- Delete button in paciet panel
        int index= jList1.getSelectedIndex(); 
        Object obj = jList1.getModel().getElementAt(index);
        ListFunctions.deleteElementFromList(jList1, obj);
        Spitali.getInstance().getPacients().remove(obj);
        
        fNameTxt.setText("");
        lNameTxt.setText("");
        pcIdTxt.setText("");
        genderCmb.setSelectedIndex(0);
        //turn off deleteBtn and updateBtn
        deleteBtn.setEnabled(false);
        updateBtn.setEnabled(false);
        pcIdTxt.requestFocus(true);
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked
        //MouseClick event for the list in paciet panel
        jList1.requestFocus();
        int index= jList1.getSelectedIndex();
        if(index>=0 && index < jList1.getModel().getSize())
        {
            deleteBtn.setEnabled(true);
            updateBtn.setEnabled(true);
        }
        
        DefaultListModel dm= new DefaultListModel();
        for(int i=0;i<jList1.getModel().getSize();i++)
        {
            dm.addElement(jList1.getModel().getElementAt(i));
        }
        
        Pacient s= (Pacient) dm.getElementAt(index);
        
        //populate the textFields
        fNameTxt.setText(s.getfName());
        lNameTxt.setText(s.getlName());
        pcIdTxt.setText(s.getPc_id());
        genderCmb.setSelectedItem(s.getGender());
    }//GEN-LAST:event_jList1MouseClicked

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        //Update button in paciet panel
        int index= jList1.getSelectedIndex(); 
        Object obj = jList1.getModel().getElementAt(index);
        
        Spitali.getInstance().getPacients().remove(obj);
        
        ListFunctions.deleteElementFromList(jList1,obj);
        
        // update the selected paciet
        Pacient s = new Pacient();
        s.setfName(fNameTxt.getText());
        s.setlName(lNameTxt.getText());
        String gender=(String) genderCmb.getSelectedItem();
        s.setGender(gender);
                
        if(ListFunctions.checkFields(fNameTxt.getText(), lNameTxt.getText())==false)//check if TextFields are empty
            {ListFunctions.addElementToList(jList1, s);}
        Spitali.getInstance().getPacients().add(s);
        
        fNameTxt.setText("");
        lNameTxt.setText("");
        pcIdTxt.setText("");
        genderCmb.setSelectedIndex(0);
        pcIdTxt.requestFocus(true);
    }//GEN-LAST:event_updateBtnActionPerformed

    private void doctorItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doctorItemActionPerformed
        doctorPanel.setVisible(true);//doctorItem event that will set true the panel for the docotr and false for the paciet & assignPanel
        pacientPanel.setVisible(false);
        assignPanel.setVisible(false);
        DoctIdTxt.requestFocus(true);
    }//GEN-LAST:event_doctorItemActionPerformed

    private void pacientItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pacientItemActionPerformed
        pacientPanel.setVisible(true);//pacientItem event that will set false the panel for the docotr and true for the paciet & assignPanel
        doctorPanel.setVisible(false);
        assignPanel.setVisible(false);
        pcIdTxt.requestFocus(true);
    }//GEN-LAST:event_pacientItemActionPerformed

    private void jList1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jList1KeyPressed
        //KeyPress event in paciet panel to select the elements from the list with up and down key
        
        Pacient s= new Pacient();
        
        if (evt.getKeyCode()==KeyEvent.VK_UP) 
        {
        int index= jList1.getSelectedIndex();
        
        if(index>=0 && index < jList1.getModel().getSize())
        {
            deleteBtn.setEnabled(true);
            updateBtn.setEnabled(true);
        }
        
        DefaultListModel dm= new DefaultListModel();
        for(int i=0;i<jList1.getModel().getSize();i++)
        {
            dm.addElement(jList1.getModel().getElementAt(i));
        }
        if(index!=0) // if the index of the element is not 0, then continue selecting the previous paciet, otherwise do not do anything. 
                     //In this way we will not get an OutOfBounds exception
            s= (Pacient) dm.getElementAt(index-1);
        else if(index==0)
            s= (Pacient) dm.getElementAt(index);
        //populate the textFields
        fNameTxt.setText(s.getfName());
        lNameTxt.setText(s.getlName());
        genderCmb.setSelectedItem(s.getGender());
        }
        
        else if(evt.getKeyCode()==KeyEvent.VK_DOWN) 
        {
        int index= jList1.getSelectedIndex();
        
        if(index>=0 && index < jList1.getModel().getSize())
        {
            deleteBtn.setEnabled(true);
            updateBtn.setEnabled(true);
        }
        
        DefaultListModel dm= new DefaultListModel();
        
        for(int i=0;i<jList1.getModel().getSize();i++)
        {
            dm.addElement(jList1.getModel().getElementAt(i));
        }
        if(index!=jList1.getModel().getSize()-1)// if the index of the element is not in the end of the list, then continue selecting the next paciet, otherwise do not do anything. 
                                                //In this way we will not get an OutOfBounds exception
            s= (Pacient) dm.getElementAt(index+1);
        else if(index==jList1.getModel().getSize()-1)
            s= (Pacient) dm.getElementAt(index);
        //populate the textFields
        fNameTxt.setText(s.getfName());
        lNameTxt.setText(s.getlName());
        pcIdTxt.setText(s.getPc_id());
        genderCmb.setSelectedItem(s.getGender());
        }   
    }//GEN-LAST:event_jList1KeyPressed
    
    private void assignBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignBtnActionPerformed
        int    id=0/*save the docotr id*/;
        String query1="";
        int index= jList4.getSelectedIndex();
        
        Object obj=jList4.getModel().getElementAt(index); //get the selected docotr
        Doctor in = (Doctor) obj;
        System.out.println("Index of the selected docotr is: "+index + " and name is: "+ in.getFName());
        in.setPacients(new ArrayList<> ());
        
        int[] selectedIndices = jList3.getSelectedIndices();
              
        //String id=in.getId();
        System.out.println("id of docotr is: "+ in.getDoct_id());
//        for (int i=0;i<selectedIndices.length;i++)
//        {
//            Object nObj = jList3.getModel().getElementAt(selectedIndices[i]);//get the selected paciets
//            in.getPacients().add((Pacient)nObj);
//        }
//        
//        Iterator iterator1 = in.getPacients().iterator();
//        while(iterator1.hasNext())
//        {
//            Pacient st = (Pacient)iterator1.next();
//            System.out.println(st.getFName()+" "+st.getLName());
//        }
        
        try{
        for (int i=0;i<selectedIndices.length;i++)
        {
            Object nObj = jList3.getModel().getElementAt(selectedIndices[i]);
     
            in.getPacients().add((Pacient)nObj);//add sdutents to docotr=
            System.out.println(in.getPacients().size()+"");
            System.out.println(in.getPacients().get(0).getPc_id());
        }
            
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost/SPITALI","root","password");
        Statement stmt=con.createStatement();             
        
//        Statement stmt1=con.createStatement(); //create a new statement for the execution of update query for each selected paciet
//        String query= "SELECT * FROM `PACIENT`";
//        ResultSet st1 = stmt.executeQuery(query);//save in a resultSet all the docotrs from database
        
       Iterator paciets =  in.getPacients().iterator();
       
       System.out.println("pacients iteratorooooooooo"+in.getPacients().size());
       while (paciets.hasNext()) {
       Pacient st = (Pacient)paciets.next();
           System.out.println(" paciet name "+ st.getfName()+ " "+st.getlName());
           System.out.println("Id e pacietit: "+st.getPc_id());
           query1= "UPDATE `PACIENT` SET doct_id='"+in.getDoct_id()+"' WHERE pc_id='"+st.getPc_id()+"'";
           System.out.println(query1.toString());
           stmt.execute(query1);
           st.setDoct_id(in.getDoct_id());
       }
//        while(st1.next())
//        {    k++; 
//           if(k==selectedIndices[m])
//             { 
//                 //System.out.println("k:"+k+" "+"selectedIndices[i]:"+selectedIndices[m]);
//                 int s_id  = st1.getInt(1);
//                 System.out.println("Id e pacietit: "+s_id);
//                 query1= "UPDATE `PACIENT` SET doct_id='"+id+"' WHERE st_id='"+s_id+"'";
//                 stmt1.execute(query1);
//                 if(m<selectedIndices.length-1)
//                    m++;
//              }
//           }
        } 
        
        catch(Exception e){ 
            System.out.println(e+" this went wrong.");
        }
        DefaultListModel dlmInst = new DefaultListModel();
        for (int l=0;l<jList4.getModel().getSize();l++) {   
            dlmInst.addElement(jList4.getModel().getElementAt(l));
        }        
        dlmInst.removeElementAt(index);//removed the docotr that is assigned paciets
        jList4.setModel(dlmInst);
        
        DefaultListModel dlm = new DefaultListModel();
        
       //adding paciet to the list
       int size = jList3.getModel().getSize();
       for (int i=0;i<size;i++){
          dlm.addElement(jList3.getModel().getElementAt(i));
      }
       
//       ArrayList toBeDeleted = new ArrayList();
//        for (int h=0;h<dlm.getSize();h++) {
//           System.out.println("h ====== "+h);
//           Pacient s = (Pacient) dlm.getElementAt(h);
//           String I_id = s.getDoct_id();
//           System.out.println(I_id);
//           //System.out.println("Inst id of this paciet "+I_id + " and name "+s.getFName());
//           if(!I_id.equals("-1")){   
//            toBeDeleted.add(s);            
//           }
//       }
        
//        Iterator it = toBeDeleted.iterator();
//        while (it.hasNext()){
//        Pacient s = (Pacient)it.next();
//        dlm.removeElement(s);
//        }
      jList3.setModel(dlm);
        
    }//GEN-LAST:event_assignBtnActionPerformed

    private void assignMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignMenuItemActionPerformed
        assignPanel.setVisible(true);
        pacientPanel.setVisible(false);
        doctorPanel.setVisible(false);
    }//GEN-LAST:event_assignMenuItemActionPerformed

    private void reportMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportMenuItemActionPerformed
        assignPanel.setVisible(true);
        pacientPanel.setVisible(false);
        doctorPanel.setVisible(false);
    }//GEN-LAST:event_reportMenuItemActionPerformed

    private void jList6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList6MouseClicked
        //displaying paciets assigned to the selected professor
        Statement stmt = null;
        ResultSet st1 = null;
        DefaultListModel dm3 = new DefaultListModel();
        int index = jList6.getSelectedIndex();
        Object obj = jList6.getModel().getElementAt(index);
        Doctor docotr1 = (Doctor) obj;
        String doct_id = docotr1.getDoct_id(); //get docotr's id
        try {
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost/SPITALI","root","password");
        stmt=con.createStatement();  
        String query= "SELECT * FROM `PACIENT` WHERE doct_id = '"+doct_id+"' ";
        st1 = stmt.executeQuery(query);
        
        while(st1.next()) {
            Pacient paciet = new Pacient();
            String id= st1.getString(1);//id
            paciet.setPc_id(id);
            String fN = st1.getString(2);
            paciet.setfName(fN);
            String lN = st1.getString(3);
            paciet.setlName(lN);
            String gen = st1.getString(4);
            paciet.setGender(gen);
            String i_Id= st1.getString(5);
            paciet.setDoct_id(i_Id);
            dm3.addElement(paciet);
        }
        jList5.setModel(dm3);
        stmt.close();// to study whether this is the case
        }
        catch(Exception e){}
        
         
        
        //Statement stmt1=con.createStatement(); //create a new statement for the execution of update query for each selected paciet
        
        
        
        
//        Iterator iterator4 = docotr1.getPacients().iterator();
//        while(iterator4.hasNext())
//        {
//            Pacient st = (Pacient) iterator4.next();
//            dm3.addElement(st);
//        }
//        jList5.setModel(dm3);
        
    }//GEN-LAST:event_jList6MouseClicked

    private void updateBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtn1ActionPerformed
        //update button in docotr panel
        int index= jList2.getSelectedIndex();
        Object obj= jList2.getModel().getElementAt(index);

        Spitali.getInstance().getDoctors().remove(obj);
        ListFunctions.deleteElementFromList(jList2, obj);

        Doctor in= new Doctor();
        in.setFName(fNameTxt1.getText());
        in.setLname(lNameTxt1.getText());
        genderCmb1.setSelectedItem(in.getGender());

        Spitali.getInstance().getDoctors().add(in);
        if(ListFunctions.checkFields(fNameTxt1.getText(), lNameTxt1.getText())==false)//check if TextFields are empty
        {ListFunctions.addElementToList(jList2, in);}

        fNameTxt1.setText("");
        lNameTxt1.setText("");
        DoctIdTxt.setText("");
        genderCmb1.setSelectedIndex(0);
        DoctIdTxt.requestFocus(true);
    }//GEN-LAST:event_updateBtn1ActionPerformed

    private void deleteBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtn1ActionPerformed
        //delete button in docotr panel
        int index= jList2.getSelectedIndex();
        Object obj=jList2.getModel().getElementAt(index);
        Spitali.getInstance().getDoctors().remove(obj);
        ListFunctions.deleteElementFromList(jList2, obj);

        fNameTxt1.setText("");
        lNameTxt1.setText("");
        DoctIdTxt.setText("");
        genderCmb1.setSelectedIndex(0);

        //turn off deleteBtn and updateBtn
        deleteBtn1.setEnabled(false);
        updateBtn1.setEnabled(false);
        DoctIdTxt.requestFocus(true);
    }//GEN-LAST:event_deleteBtn1ActionPerformed

    private void jList2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jList2KeyPressed
        //KeyPress event in docotr panel to select the elements from the list with up and down key
        
        Doctor doct= new Doctor();

        if (evt.getKeyCode()==KeyEvent.VK_UP)
        {
            int index= jList2.getSelectedIndex();
            if(index>=0 && index<jList2.getModel().getSize())
            {
                deleteBtn1.setEnabled(true);
                updateBtn1.setEnabled(true);
            }
            DefaultListModel dm= new DefaultListModel();
            for(int i=0;i<jList2.getModel().getSize();i++)
            {
                dm.addElement(jList2.getModel().getElementAt(i));
            }
            if(index!=0)
            doct= (Doctor) dm.getElementAt(index-1);// if the index of the element is not 0 then continue selecting the previous paciet, otherwise do not do anything.
            else if(index==0)                                                //In this way we will not get an OutOfBounds exception
            doct= (Doctor) dm.getElementAt(index);
            fNameTxt1.setText(doct.getFName());
            lNameTxt1.setText(doct.getLname());
            genderCmb1.setSelectedItem(doct.getGender());
        }
        else if(evt.getKeyCode()==KeyEvent.VK_DOWN)
        {
            int index= jList2.getSelectedIndex();
            if(index>=0 && index<jList2.getModel().getSize())
            {
                deleteBtn1.setEnabled(true);
                updateBtn1.setEnabled(true);
            }
            DefaultListModel dm= new DefaultListModel();
            for(int i=0;i<jList2.getModel().getSize();i++)
            {
                dm.addElement(jList2.getModel().getElementAt(i));
            }
            if(index!=jList2.getModel().getSize()-1)
            doct= (Doctor) dm.getElementAt(index+1);// if the index of the element is not in the end of the list, then continue selecting the next paciet, otherwise do not do anything.
            //In this way we will not get an OutOfBounds exception
            else if (index==jList2.getModel().getSize()-1)
            doct=(Doctor) dm.getElementAt(index);
            fNameTxt1.setText(doct.getFName());
            lNameTxt1.setText(doct.getLname());
            DoctIdTxt.setText(doct.getDoct_id());
            genderCmb1.setSelectedItem(doct.getGender());
        }
    }//GEN-LAST:event_jList2KeyPressed

    private void jList2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList2MouseClicked
        //Mouseclick listener in docotr panel
        jList2.requestFocus();
        int index= jList2.getSelectedIndex();
        if(index>=0 && index<jList2.getModel().getSize())
        {
            deleteBtn1.setEnabled(true);
            updateBtn1.setEnabled(true);
        }
        DefaultListModel dm= new DefaultListModel();
        for(int i=0;i<jList2.getModel().getSize();i++)
        {
            dm.addElement(jList2.getModel().getElementAt(index));
        }
        Doctor doct= (Doctor) dm.getElementAt(index);

        fNameTxt1.setText(doct.getFName());
        lNameTxt1.setText(doct.getLname());
        DoctIdTxt.setText(doct.getDoct_id());
        genderCmb1.setSelectedItem(doct.getGender());
    }//GEN-LAST:event_jList2MouseClicked

    private void cancelBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtn1ActionPerformed
        //Cancel button in docotr panel
        fNameTxt1.setText("");
        lNameTxt1.setText("");
        DoctIdTxt.setText("");
        genderCmb1.setSelectedIndex(0);
        DoctIdTxt.requestFocus(true);
    }//GEN-LAST:event_cancelBtn1ActionPerformed

    private void addBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtn1ActionPerformed
        //Add button in docotr panel
        Doctor in=new Doctor();
        in.setDoct_id(DoctIdTxt.getText());
        in.setFName(fNameTxt1.getText());
        in.setLname(lNameTxt1.getText());
        in.setGender(genderCmb1.getSelectedItem().toString());

        Spitali.getInstance().getDoctors().add(in);
        if(ListFunctions.checkFields(fNameTxt1.getText(), lNameTxt1.getText())==false)//check if TextFields are empty
        {ListFunctions.addElementToList(jList2, in);}

        try{
        //DBManager controler = DBManager.getInstance();
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost/SPITALI","root","password");
        //Statement stmt = DBManager.getStatement();
        String defId = "-1";
        Statement stmt=con.createStatement();  
        String query = "INSERT INTO `DOCTOR` (`doct_id`, `fName`, `lName`, `gender`) VALUES\n" +
            "(  '" + DoctIdTxt.getText()+"', '" +fNameTxt1.getText()+"', '"+lNameTxt1.getText()+"', '"+(String)genderCmb1.getSelectedItem()+"' )";
        stmt.execute(query);
        }
        catch(Exception e){ 
            System.out.println(e+" this went wrong doct");
        }  
        
        DoctIdTxt.setText("");
        fNameTxt1.setText("");
        lNameTxt1.setText("");
        genderCmb1.setSelectedIndex(0);
        DoctIdTxt.requestFocus(true);
    }//GEN-LAST:event_addBtn1ActionPerformed

    private void assignPanelComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_assignPanelComponentShown

//        University controller = University.getInstance();
//        Iterator iterator1 = controller.getPacients().iterator();
//        DefaultListModel dm = new DefaultListModel();
//        
//        while(iterator1.hasNext())
//        {
//            Pacient st = (Pacient)iterator1.next();
//            dm.addElement(st);
//        }
//        
//        jList3.setModel(dm);
//        
//        Iterator iterator2 = controller.getDoctores().iterator();
//        DefaultListModel dm1 = new DefaultListModel();
//        
//        while(iterator2.hasNext())
//        {
//            Doctore doct = (Doctore) iterator2.next();
//            dm1.addElement(doct);
//        }
//        
//        jList4.setModel(dm1);
//        
//        Iterator iterator3 = controller.getDoctores().iterator();
//        DefaultListModel dm2 = new DefaultListModel();
//        while(iterator3.hasNext())
//        {
//            Doctore doct = (Doctore) iterator3.next();
//            dm2.addElement(doct);
//        }
//        
//        jList6.setModel(dm2);

        try{
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost/SPITALI","root","password");
        Statement stmt=con.createStatement();          
        String query = "SELECT * FROM `PACIENT`";
        
        ResultSet st = stmt.executeQuery(query);
        DefaultListModel dm = new DefaultListModel();
        while(st.next())
        {
            Pacient paciet = new Pacient();
            String id= st.getString(1);//id
            System.out.println("pc_id:"+ id);
            paciet.setPc_id(id);
            String fN = st.getString(2);
            System.out.println("fn: "+fN);
            paciet.setfName(fN);
            String lN = st.getString(3);
            System.out.println("ln: "+ lN);
            paciet.setlName(lN);
            String gen = st.getString(4);
            System.out.println("gender: "+ gen);
            paciet.setGender(gen);
            
            String in_id = st.getString(5);
            System.out.println("doct idL "+ in_id);
            if (in_id.equals("-1")){
            paciet.setPc_id(in_id);
            
            dm.addElement(paciet);
            }
        }
        jList3.setModel(dm);
        
        String query1 = "SELECT * FROM `DOCTOR`";
        
        ResultSet stI = stmt.executeQuery(query1);
        DefaultListModel dm1 = new DefaultListModel();
        while(stI.next())
        { 
            System.out.println("--------------------Doctor ------------------");
            Doctor docotr = new Doctor();
            String id= stI.getString(1);//id
            System.out.println("st id "+ id);
            docotr.setDoct_id(id);
            String fN = stI.getString(2);
             System.out.println("fn "+fN);
            docotr.setFName(fN);
            String lN = stI.getString(3);
             System.out.println("ln "+ lN);
            docotr.setLname(lN);
            String gen = stI.getString(4);
              System.out.println("gender "+ gen);
            docotr.setGender(gen);
            dm1.addElement(docotr);
        }
        jList4.setModel(dm1);
        jList6.setModel(dm1);
        
        }
        catch(Exception e){ 
            System.out.println(e+" at assign panel component shown, this went wrong");
        }  
        
        
    }//GEN-LAST:event_assignPanelComponentShown
    
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField DoctIdTxt;
    private javax.swing.JButton addBtn;
    private javax.swing.JButton addBtn1;
    private javax.swing.JButton assignBtn;
    private javax.swing.JMenu assignMenu;
    private javax.swing.JMenuItem assignMenuItem;
    private javax.swing.JMenu reportMenu;
    private javax.swing.JMenuItem reportMenuItem;
    private javax.swing.JPanel assignPanel;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JButton cancelBtn1;
    private javax.swing.JLabel comboBxLbl;
    private javax.swing.JLabel comboBxLbl1;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JButton deleteBtn1;
    private javax.swing.JLabel fNameLbl;
    private javax.swing.JLabel fNameLbl1;
    private javax.swing.JTextField fNameTxt;
    private javax.swing.JTextField fNameTxt1;
    private javax.swing.JComboBox<String> genderCmb;
    private javax.swing.JComboBox<String> genderCmb1;
    private javax.swing.JMenuItem doctorItem;
    private javax.swing.JMenu doctorMenu;
    private javax.swing.JPanel doctorPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JList<String> jList3;
    private javax.swing.JList<String> jList4;
    private javax.swing.JList<String> jList5;
    private javax.swing.JList<String> jList6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JLabel lNameLbl;
    private javax.swing.JLabel lNameLbl1;
    private javax.swing.JTextField lNameTxt;
    private javax.swing.JTextField lNameTxt1;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JTextField pcIdTxt;
    private javax.swing.JMenuItem pacientItem;
    private javax.swing.JMenu pacientMenu;
    private javax.swing.JPanel pacientPanel;
    private javax.swing.JButton updateBtn;
    private javax.swing.JButton updateBtn1;
    // End of variables declaration//GEN-END:variables
}
