/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bill.generator;

import java.awt.HeadlessException;
import java.util.HashMap;
import java.util.Map;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.data.JRTableModelDataSource;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author SRIRAM
 */
public class ProductDetails extends javax.swing.JFrame {

    DefaultTableModel tab;
    
    String name;
    String address,email,pan,gstin,date,invoice,party;
    float totalAmount=0,tcgst=0,tsgst=0,tcgstAm=0,tsgstAm=0,netAmount=0;
    public ProductDetails(String n,String a,String em,String gsti,String da,String pa,String inv,String pno) {
        
        initComponents();
        tab = (DefaultTableModel) tblproduct.getModel();
        this.name=n;
        this.address=a;
        this.email=em;
        this.gstin=gsti;
        this.date=da;
        this.pan=pa;
        this.invoice=inv;
        this.party=pno;
    
    }

    private ProductDetails() {
        
        initComponents();tab = (DefaultTableModel) tblproduct.getModel();
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        prductDet = new javax.swing.JInternalFrame();
        jLabel2 = new javax.swing.JLabel();
        snText = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        hsnBox = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        rateText = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        qtyText = new javax.swing.JSpinner();
        jLabel7 = new javax.swing.JLabel();
        amountText = new javax.swing.JTextField();
        addBut = new javax.swing.JButton();
        delBut = new javax.swing.JButton();
        clearBut = new javax.swing.JButton();
        printbbut = new javax.swing.JButton();
        productBox = new javax.swing.JComboBox();
        fetchProducts = new javax.swing.JButton();
        fetchDetails = new javax.swing.JButton();
        cgstText = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        sgstText = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblproduct = new javax.swing.JTable();
        finish = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Invoice Generator");

        jLabel1.setBackground(new java.awt.Color(0, 0, 255));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\SRIRAM\\Downloads\\billicon.png")); // NOI18N
        jLabel1.setText("INVOICE GENERATOR");

        prductDet.setTitle("PRODUCT DETAILS");
        prductDet.setVisible(true);
        prductDet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                prductDetMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 11)); // NOI18N
        jLabel2.setText("S/N");

        snText.setEditable(false);
        snText.setText("1");

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 11)); // NOI18N
        jLabel3.setText("Select HSN");

        hsnBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "AA0A7841001", "AA0B7481002" }));
        hsnBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                hsnBoxItemStateChanged(evt);
            }
        });
        hsnBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hsnBoxMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                hsnBoxMouseExited(evt);
            }
        });
        hsnBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hsnBoxActionPerformed(evt);
            }
        });
        hsnBox.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                hsnBoxPropertyChange(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 11)); // NOI18N
        jLabel4.setText("Select Product");

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 1, 11)); // NOI18N
        jLabel5.setText("Rate/Item");

        rateText.setEditable(false);

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 1, 11)); // NOI18N
        jLabel6.setText("Quantity");

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 1, 11)); // NOI18N
        jLabel7.setText("Amount");

        amountText.setEditable(false);

        addBut.setFont(new java.awt.Font("Trebuchet MS", 1, 11)); // NOI18N
        addBut.setForeground(new java.awt.Color(0, 0, 153));
        addBut.setText("ADD");
        addBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButActionPerformed(evt);
            }
        });

        delBut.setFont(new java.awt.Font("Trebuchet MS", 1, 11)); // NOI18N
        delBut.setForeground(new java.awt.Color(255, 0, 0));
        delBut.setText("DELETE");
        delBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delButActionPerformed(evt);
            }
        });

        clearBut.setFont(new java.awt.Font("Trebuchet MS", 1, 11)); // NOI18N
        clearBut.setForeground(new java.awt.Color(51, 51, 51));
        clearBut.setText(" CLEAR ALL");
        clearBut.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        clearBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButActionPerformed(evt);
            }
        });

        printbbut.setFont(new java.awt.Font("Trebuchet MS", 1, 11)); // NOI18N
        printbbut.setForeground(new java.awt.Color(0, 153, 0));
        printbbut.setText("PRINT");
        printbbut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printbbutActionPerformed(evt);
            }
        });

        fetchProducts.setText("Fetch Products");
        fetchProducts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fetchProductsActionPerformed(evt);
            }
        });

        fetchDetails.setText("Fetch Details");
        fetchDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fetchDetailsActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 1, 11)); // NOI18N
        jLabel8.setText("CGST %");

        jLabel9.setFont(new java.awt.Font("Trebuchet MS", 1, 11)); // NOI18N
        jLabel9.setText("SGST %");

        tblproduct.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "S/N", "HSN", "Product", "Rate", "Qty", "Amount", "CGST %", "SGST %"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tblproduct);

        finish.setFont(new java.awt.Font("Trebuchet MS", 1, 11)); // NOI18N
        finish.setText("Finish");
        finish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finishActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Trebuchet MS", 3, 11)); // NOI18N
        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\SRIRAM\\Documents\\NetBeansProjects\\Bill Generator\\src\\bill\\generator\\powered_by_foursquare-512.png")); // NOI18N
        jLabel10.setText("Powered By Alpha Creators");

        javax.swing.GroupLayout prductDetLayout = new javax.swing.GroupLayout(prductDet.getContentPane());
        prductDet.getContentPane().setLayout(prductDetLayout);
        prductDetLayout.setHorizontalGroup(
            prductDetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(prductDetLayout.createSequentialGroup()
                .addGroup(prductDetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(prductDetLayout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(prductDetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(prductDetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, prductDetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel8)
                                .addComponent(jLabel5)
                                .addComponent(jLabel6))
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addGroup(prductDetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(snText, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rateText)
                            .addComponent(qtyText)
                            .addComponent(hsnBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(addBut)
                            .addComponent(productBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(amountText)
                            .addComponent(cgstText)
                            .addComponent(sgstText))
                        .addGap(18, 18, 18)
                        .addGroup(prductDetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(prductDetLayout.createSequentialGroup()
                                .addComponent(delBut)
                                .addGap(33, 33, 33)
                                .addComponent(printbbut)
                                .addGap(49, 49, 49)
                                .addComponent(clearBut)
                                .addGap(18, 18, 18)
                                .addComponent(finish, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(prductDetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(fetchProducts, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(fetchDetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(prductDetLayout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 688, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 134, Short.MAX_VALUE)
                .addComponent(jLabel10))
        );
        prductDetLayout.setVerticalGroup(
            prductDetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(prductDetLayout.createSequentialGroup()
                .addContainerGap(65, Short.MAX_VALUE)
                .addGroup(prductDetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(prductDetLayout.createSequentialGroup()
                        .addGroup(prductDetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, prductDetLayout.createSequentialGroup()
                                .addGroup(prductDetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(snText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(prductDetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(prductDetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(hsnBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(fetchProducts))
                                    .addGroup(prductDetLayout.createSequentialGroup()
                                        .addGap(4, 4, 4)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(18, 18, 18)
                                .addGroup(prductDetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fetchDetails)
                                    .addGroup(prductDetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel4)
                                        .addComponent(productBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(prductDetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(qtyText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(17, 17, 17)
                                .addGroup(prductDetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(rateText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(prductDetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(amountText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7))
                                .addGap(23, 23, 23)
                                .addGroup(prductDetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(cgstText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(21, 21, 21)
                                .addGroup(prductDetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(sgstText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(69, 69, 69))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, prductDetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(addBut)
                                .addComponent(delBut)
                                .addComponent(printbbut)
                                .addComponent(finish)
                                .addComponent(clearBut)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(prductDet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(139, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(prductDet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void prductDetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prductDetMouseClicked
        tblproduct.clearSelection();
    }//GEN-LAST:event_prductDetMouseClicked

    private void fetchDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fetchDetailsActionPerformed
        if(validateFields()){
            product=(String) productBox.getSelectedItem();
            qty=(int)qtyText.getValue();
            hsn=(String)hsnBox.getSelectedItem();

            switch(product){
                case "PRODUCT 1":
                rate=399;amount=qty*rate;
                break;
                case "PRODUCT 2":
                rate=459;amount=qty*rate;
                break;
                case "PRODUCT 3":
                rate=199;amount=qty*rate;
                break;
                case "PRODUCT 4":
                rate=269;amount=qty*rate;
                break;
                case "PRODUCT 5":rate=449;amount=qty*rate;break;
                case "PRODUCT 6":rate=799;amount=qty*rate;break;
                case "PRODUCT 7":rate=999;amount=qty*rate;break;
                case "PRODUCT 8":rate=399;amount=qty*rate;break;
            }
        }
        amountText.setText(Float.toString(amount));
        rateText.setText(Float.toString(rate));
    }//GEN-LAST:event_fetchDetailsActionPerformed

    private void fetchProductsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fetchProductsActionPerformed
        productBox.removeAllItems();
        hs1.removeAllElements();
        hs2.removeAllElements();
        getData();
        if(hsnBox.getSelectedIndex()==0){
            productBox.removeAllItems();
            JOptionPane.showMessageDialog(this,"Please Select any one of HSN NO!!");
        }
        else{
            if(hsnBox.getSelectedIndex()==1){

                productBox.setModel(hs1);
            }
            else if(hsnBox.getSelectedIndex()==2){
                productBox.setModel(hs2);
            }
        }
    }//GEN-LAST:event_fetchProductsActionPerformed

    private void printbbutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printbbutActionPerformed
        BillGenerator bill = new BillGenerator();

        try{
            DefaultTableModel  tb;
            tb = (DefaultTableModel) tblproduct.getModel();
            JRTableModelDataSource dataSource = new JRTableModelDataSource(tb);

            JasperReport report = JasperCompileManager.compileReport("C:\\Users\\SRIRAM\\Documents\\NetBeansProjects\\Bill Generator\\src\\bill\\generator\\printInvoice.jrxml");
            param.put("name",name);
            param.put("address",address);
            param.put("email",email);
            param.put("gstin",gstin);
            param.put("pan",pan);
            param.put("invoice",invoice);
            param.put("invoiceDate",date);
            param.put("total", Float.toString(totalAmount));
            param.put("cgst", Float.toString(tcgst));
            param.put("sgst",Float.toString(tsgst));
            param.put("cgstAmount",Float.toString(tcgstAm));
            param.put("sgstAmount", Float.toString(tsgstAm));
            param.put("netAmount",Float.toString(Math.round(totalAmount+tcgstAm+tsgstAm)));
            param.put("roundOff",Float.toString(Math.round(totalAmount+tcgstAm+tsgstAm)));
            param.put("partyPo",party);
            JasperPrint jpr = JasperFillManager.fillReport(report, param,dataSource);
            JasperViewer.viewReport(jpr,false);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());

        }
    }//GEN-LAST:event_printbbutActionPerformed

    private void clearButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButActionPerformed
        if(tblproduct.getRowCount()!=0){
            tab.setRowCount(0);
            snText.setText("1");
        }
    }//GEN-LAST:event_clearButActionPerformed

    private void delButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delButActionPerformed
        if(tblproduct.getSelectedRow()==-1){
            JOptionPane.showMessageDialog(this,"Please Select any one product to delete!!");
        }
        else{
            totalAmount-=amount;
            tcgst-=cgst;tsgst-=sgst;
            tcgstAm-= amount*(cgst/100);
            tsgstAm-= amount*(sgst/100);
            tab.removeRow(tblproduct.getSelectedRow());
        }
    }//GEN-LAST:event_delButActionPerformed

    private void addButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButActionPerformed

        try{if(Integer.parseInt(cgstText.getText())==0 || Integer.parseInt(sgstText.getText())==0){
            JOptionPane.showMessageDialog(this, "Please Enter GST details!!!");
            return;
        }}
        catch (NumberFormatException | HeadlessException e){
            JOptionPane.showMessageDialog(this,"Please Enter valid GST Details!!!");
            return;
        }
        if(tblproduct.getRowCount()==-1){
            sn=1;

        }else{
            sn=tblproduct.getRowCount()+1;
            System.out.print(sn+" "+hsn+" "+product+" "+rate+" "+qty+" "+amount);
            cgst=Float.parseFloat(cgstText.getText());
            sgst=Float.parseFloat(sgstText.getText());
            totalAmount+=amount;
            tcgst+=cgst;tsgst+=sgst;
            tcgstAm+= amount*(cgst/100);
            tsgstAm+= amount*(sgst/100);
            
            tab.insertRow(tab.getRowCount(),new Object[] {Integer.toString(sn),hsn,product,Float.toString(rate),Integer.toString(qty),Float.toString(amount),cgstText.getText(),sgstText.getText()});

        }

        snText.setText(Integer.toString(sn+1));
    }//GEN-LAST:event_addButActionPerformed

    private void hsnBoxPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_hsnBoxPropertyChange

    }//GEN-LAST:event_hsnBoxPropertyChange

    private void hsnBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hsnBoxActionPerformed

    }//GEN-LAST:event_hsnBoxActionPerformed

    private void hsnBoxMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hsnBoxMouseExited

    }//GEN-LAST:event_hsnBoxMouseExited

    private void hsnBoxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hsnBoxMouseClicked

    }//GEN-LAST:event_hsnBoxMouseClicked

    private void hsnBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_hsnBoxItemStateChanged

    }//GEN-LAST:event_hsnBoxItemStateChanged

    private void finishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finishActionPerformed
        new BilGenerate().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_finishActionPerformed

           String product;
    int qty,sn=1;
    String hsn;
    float rate,amount;
    float cgst,sgst;
    Map<String,Object> param= new HashMap<>();
        private boolean validateFields(){
        if(productBox.getSelectedItem().equals("")) {
            JOptionPane.showMessageDialog(this, "Please Select any Product!!");
            return false;
        }
        if(0==(int)qtyText.getValue()){
            JOptionPane.showMessageDialog(this,"Please select some quantity to the product!!");
            return false;
        }
        return true;       
         }
         DefaultComboBoxModel hs1= new DefaultComboBoxModel();
     DefaultComboBoxModel hs2=new DefaultComboBoxModel();
     private void getData(){
         hs1.addElement("");
         hs1.addElement("PRODUCT 1");
         hs1.addElement("PRODUCT 2");
         hs1.addElement("PRODUCT 3");
         hs1.addElement("PRODUCT 4");
         hs2.addElement("");
         hs2.addElement("PRODUCT 5");
         hs2.addElement("PRODUCT 6");
         hs2.addElement("PRODUCT 7");
         hs2.addElement("PRODUCT 8");
         
     }
     
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
            java.util.logging.Logger.getLogger(ProductDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProductDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProductDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProductDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new ProductDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBut;
    private javax.swing.JTextField amountText;
    private javax.swing.JTextField cgstText;
    private javax.swing.JButton clearBut;
    private javax.swing.JButton delBut;
    private javax.swing.JButton fetchDetails;
    private javax.swing.JButton fetchProducts;
    private javax.swing.JButton finish;
    private javax.swing.JComboBox hsnBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JInternalFrame prductDet;
    private javax.swing.JButton printbbut;
    private javax.swing.JComboBox productBox;
    private javax.swing.JSpinner qtyText;
    private javax.swing.JTextField rateText;
    private javax.swing.JTextField sgstText;
    private javax.swing.JTextField snText;
    private javax.swing.JTable tblproduct;
    // End of variables declaration//GEN-END:variables
}
