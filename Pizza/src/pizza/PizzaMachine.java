package pizza;
import java.util.ArrayList;
import java.util.List;

public class PizzaMachine extends javax.swing.JFrame {
    consolLog logger = new consolLog();
     String s;
//    FileLog logger = new FileLog();
    public PizzaMachine() {
        initComponents();
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PizzaMachine().setVisible(true);
            }
        });
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        javax.swing.ButtonGroup buttonGroup3 = new javax.swing.ButtonGroup();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        jLabel1 = new javax.swing.JLabel();
        small = new javax.swing.JRadioButton();
        meduim = new javax.swing.JRadioButton();
        large = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        deepDish = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        pan = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        viewInformation = new javax.swing.JButton();
        newOrder = new javax.swing.JButton();
        confirmTheOrder = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pizza Machine");
        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(java.awt.Color.white);
        setResizable(false);

        jLabel1.setBackground(new java.awt.Color(102, 255, 102));
        jLabel1.setText("Choose the size of pizza ");
        jLabel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 0, 255)));

        buttonGroup1.add(small);
        small.setText("Small");
        small.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smallActionPerformed(evt);
            }
        });

        buttonGroup1.add(meduim);
        meduim.setText("Medium");
        meduim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meduimActionPerformed(evt);
            }
        });

        buttonGroup1.add(large);
        large.setText("Large");
        large.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                largeActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(102, 255, 102));
        jLabel3.setText("Choose the type of pizza ");
        jLabel3.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 0, 255)));

        buttonGroup2.add(deepDish);
        deepDish.setText("Deep dish");
        deepDish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deepDishActionPerformed(evt);
            }
        });

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        buttonGroup2.add(pan);
        pan.setText("Pan");
        pan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                panActionPerformed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(102, 255, 102));
        jLabel4.setText("Choose the toppings as you wish  ");
        jLabel4.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 0, 255)));

        jLabel5.setBackground(new java.awt.Color(102, 255, 102));
        jLabel5.setText("Pizza Informations : ");
        jLabel5.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 0, 255)));

        viewInformation.setText("View Information");
        viewInformation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewInformationActionPerformed(evt);
            }
        });

        newOrder.setText("New Order");
        newOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newOrderActionPerformed(evt);
            }
        });

        confirmTheOrder.setText("Confirm the order");
        confirmTheOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmTheOrderActionPerformed(evt);
            }
        });

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Mozzerlla Cheese", "Tomatoes", "Garlic", "Onion", "Pizza Sauce", "Oregano", "Olives", "Red Peppers" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList1);

        jLabel2.setText("Hint: use ctrl key to select multiple choices");

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(confirmTheOrder)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(viewInformation)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(newOrder)
                                .addGap(12, 12, 12))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(deepDish)
                                    .addComponent(jLabel3)
                                    .addComponent(pan)
                                    .addComponent(meduim)
                                    .addComponent(small)
                                    .addComponent(large)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel1)
                        .addGap(9, 9, 9)
                        .addComponent(small)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(meduim)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(large)
                        .addGap(52, 52, 52)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(deepDish)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewInformation)
                    .addComponent(confirmTheOrder)
                    .addComponent(newOrder))
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void smallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smallActionPerformed
        
    }//GEN-LAST:event_smallActionPerformed

    private void deepDishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deepDishActionPerformed
      
    }//GEN-LAST:event_deepDishActionPerformed

    private void meduimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meduimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_meduimActionPerformed

    private void largeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_largeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_largeActionPerformed

    private void panActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_panActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_panActionPerformed

    private void viewInformationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewInformationActionPerformed
        // TODO add your handling code here:
        //if view is enabled then display the information on the Text Area
        jTextArea1.setText(s);
    }//GEN-LAST:event_viewInformationActionPerformed

    private void confirmTheOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmTheOrderActionPerformed
       int size, type;
       // getting size
       if(small.isSelected())
           size = 1;
       else if(meduim.isSelected())
           size = 2;
       else
           size = 3;
       
       // getting pan type
       if(pan.isSelected())
           type = 1;
       else
           type = 2;
       
       Pizza pizza = new Pizza(size, type, logger);
       //********************************************
        ArrayList<Ingredient> toppings = new ArrayList<>();
        toppings.add(new Ingredient("Mozzarella Cheese", 170 * size, 476 * size)); // index : 0
        toppings.add(new Ingredient("Tomatoes", 120 * size, 22 * size));
        toppings.add(new Ingredient("Garlic", 7 * size, 4 * size));
        toppings.add(new Ingredient("Onion", 115 * size, 44 * size));
        toppings.add(new Ingredient("Pizza Sauce", 56 * size, 28 * size));
        toppings.add(new Ingredient("Oregano ", 10 * size, 31 * size));
        toppings.add(new Ingredient("Olives ", 10 * size, 31 * size));
        toppings.add(new Ingredient("Red Peppers", 10 * size, 31 * size)); 

        //toppings
        int[] selectedToppings = jList1.getSelectedIndices();
        for(int i = 0, n = selectedToppings.length; i < n; i++){
            pizza.pan.addTopping(toppings.get(selectedToppings[i]));
        }
        
        s = pizza.getInfo(); 
//        jTextArea1.setText(s);
        logger.log("Pizza was delivered\n****************************************");
    }//GEN-LAST:event_confirmTheOrderActionPerformed

    private void newOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newOrderActionPerformed
        // TODO add your handling code here:
        //if this botton is enabled then the screen will be cleared...
        int[] cleredArray = jList1.getSelectedIndices();
        for(int i = 0 ; i < jList1.getSelectedIndices().length ; i++)
            cleredArray[i] = -1;
        buttonGroup1.clearSelection();
        buttonGroup2.clearSelection();
        jList1.setSelectedIndices(cleredArray);
        jTextArea1.setText("");
        
    }//GEN-LAST:event_newOrderActionPerformed

    /**
     * @param args the command line arguments
     */
    

   
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton confirmTheOrder;
    private javax.swing.JRadioButton deepDish;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JList<String> jList1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JRadioButton large;
    private javax.swing.JRadioButton meduim;
    private javax.swing.JButton newOrder;
    private javax.swing.JRadioButton pan;
    private javax.swing.JRadioButton small;
    private javax.swing.JButton viewInformation;
    // End of variables declaration//GEN-END:variables
}
