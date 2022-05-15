package pizza;
import classes.Ingredient;
import classes.Pizza;
import loggers.FileLog;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class PizzaMachine    extends javax.swing.JFrame {
   // consolLog logger = new consolLog();
    boolean ordered = false;
    String s;
    FileLog logger = new FileLog();
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
        jDesktopPane1 = new javax.swing.JDesktopPane();
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
        jLabel6 = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        progressVal = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        CloseBtn = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Pizza Machine");
        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(java.awt.Color.white);
        setResizable(false);
        setType(java.awt.Window.Type.POPUP);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Choose the size of pizza ");

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

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Choose the type of pizza ");

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
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Choose the toppings as you wish  ");

        jLabel5.setBackground(new java.awt.Color(102, 255, 102));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Pizza Informations : ");

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

        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("Hint: use ctrl key to select multiple choices");

        jLabel6.setForeground(new java.awt.Color(255, 0, 0));
        jLabel6.setText("Note: to close this window, go to [File -> Close] or use the shortcut [Shift + c]");

        jProgressBar1.setMaximum(5);
        jProgressBar1.setEnabled(false);

        progressVal.setText("0%");
        progressVal.setEnabled(false);

        jMenu1.setText("File");

        CloseBtn.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        CloseBtn.setText("Close");
        CloseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseBtnActionPerformed(evt);
            }
        });
        jMenu1.add(CloseBtn);

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
                            .addComponent(deepDish)
                            .addComponent(jLabel3)
                            .addComponent(pan)
                            .addComponent(meduim)
                            .addComponent(small)
                            .addComponent(large)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(22, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(confirmTheOrder)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(viewInformation)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(newOrder)
                                .addGap(23, 23, 23))
                            .addComponent(jLabel6))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(progressVal)
                        .addGap(0, 0, Short.MAX_VALUE))))
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
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(deepDish)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pan))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jProgressBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(progressVal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewInformation)
                    .addComponent(confirmTheOrder)
                    .addComponent(newOrder))
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
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
        if(ordered)
            jTextArea1.setText(s);
        else
            JOptionPane.showMessageDialog(this, "you must confirm your order first");
    }//GEN-LAST:event_viewInformationActionPerformed

    private void confirmTheOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmTheOrderActionPerformed
       jProgressBar1.setVisible(false);
       progressVal.setVisible(false);
       int size = 0, type = 0;
       // getting size
       if(small.isSelected())
           size = 1;
       else if(meduim.isSelected())
           size = 2;
       else if(large.isSelected())
           size = 3;
              
       // getting pan type
       if(pan.isSelected())
           type = 1;
       else if(deepDish.isSelected())
           type = 2;
       
       if(size != 0 && type != 0){
           Pizza pizza = new Pizza(size, type, logger);
           ordered = true;
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
                pizza.getPan().addTopping(toppings.get(selectedToppings[i]));
            }
            jProgressBar1.setVisible(true);
            progressVal.setVisible(true);
           try {
               
                logger.log("baking the pizza");
                for(int i = 0; i <= 100; i++){
                    pizza.getPan().bake();
                    progressVal.setText(i + "%");
                    jProgressBar1.setValue(i);
                }
           } catch (InterruptedException ex) {
               logger.log(ex + "");
           }
           
            s = pizza.getInfo(); 
    //        jTextArea1.setText(s);
            logger.log("Pizza delivered\n****************************************");
            size = type = 0;
       }
       else{
           JOptionPane.showMessageDialog(this, "please specify the type and size of your pizza");
       } 
    }//GEN-LAST:event_confirmTheOrderActionPerformed

    private void newOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newOrderActionPerformed
        // TODO add your handling code here:
        //if this botton is enabled then the screen will be cleared... //I GUESS THERE IS A BETTER WAY TO DO THIS
        ordered = false;
        int[] clearedArray = jList1.getSelectedIndices();
        for(int i = 0 ; i < jList1.getSelectedIndices().length ; i++)
            clearedArray[i] = -1;
        buttonGroup1.clearSelection();
        buttonGroup2.clearSelection();
        jList1.setSelectedIndices(clearedArray);
        jTextArea1.setText("");
        jProgressBar1.setValue(0);
        progressVal.setText("0%");
        
    }//GEN-LAST:event_newOrderActionPerformed

    private void CloseBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CloseBtnActionPerformed
        logger.log("\n--------------------\n|RESTAURANT CLOSED|\n--------------------");
        System.exit(0);
    }//GEN-LAST:event_CloseBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    

   
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem CloseBtn;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton confirmTheOrder;
    private javax.swing.JRadioButton deepDish;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JList<String> jList1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JRadioButton large;
    private javax.swing.JRadioButton meduim;
    private javax.swing.JButton newOrder;
    private javax.swing.JRadioButton pan;
    private javax.swing.JLabel progressVal;
    private javax.swing.JRadioButton small;
    private javax.swing.JButton viewInformation;
    // End of variables declaration//GEN-END:variables

}
