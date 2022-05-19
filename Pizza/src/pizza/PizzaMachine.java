package pizza;
import classes.Ingredient;
import classes.Pizza;
import exceptions.AmountNotAvailableException;
import loggers.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class PizzaMachine extends javax.swing.JFrame {
    boolean ordered = false;
    String s;
    FileLog logger = new FileLog();
//    consolLog logger = new consolLog();
    
    ArrayList<Ingredient> DoughTotalIng;
    ArrayList<Ingredient> totalToppings;
    ArrayList<Ingredient> toppings = new ArrayList<>();
    ArrayList<Ingredient> Selectedtoppings = new ArrayList<>();
    int[] selectedToppingsIndecies;

    
    public PizzaMachine() {
        initComponents();
        
        loadMachine(6);
    }

    void loadMachine(double shares){
        // each time this method is called.. the machine is filled to the max (without considering what it already had) 
        DoughTotalIng = new ArrayList<>();
        totalToppings = new ArrayList<>();
        
        DoughTotalIng.add(new Ingredient("total Flour", 3000 * shares));//300 * shares                  // index = 0
        DoughTotalIng.add(new Ingredient("total Oil", 108 * shares));
        DoughTotalIng.add(new Ingredient("total Sugar", 4.25 * shares));
        DoughTotalIng.add(new Ingredient("total Salt", 6 * shares));
        DoughTotalIng.add(new Ingredient("total Yeast", 3.1 * (shares + 3 * shares/2)));
        DoughTotalIng.add(new Ingredient("total Milk", 240 * shares)); // 240 * shares

        totalToppings.add(new Ingredient("total Mmozzarella Cheese", 170 * shares)); //170 * shares    //index = 0
        totalToppings.add(new Ingredient("total Tomatoes", 120 * shares));//120 * shares
        totalToppings.add(new Ingredient("total Garlic", 40 * shares)); // 7 * shares
        totalToppings.add(new Ingredient("total Onion", 115 * shares));
        totalToppings.add(new Ingredient("total Sauce", 100 * shares));
        totalToppings.add(new Ingredient("total Oregano", 60 * shares));
        totalToppings.add(new Ingredient("total Olives", 60 * shares));
        totalToppings.add(new Ingredient("total Red Peppers", 70 * shares));

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
        jPanel2 = new javax.swing.JPanel();
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
        jProgressBar1 = new javax.swing.JProgressBar();
        progressVal = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Pizza Machine");
        setBackground(new java.awt.Color(248, 223, 157));
        setForeground(new java.awt.Color(248, 223, 157));
        setUndecorated(true);
        setResizable(false);
        setType(java.awt.Window.Type.POPUP);

        jPanel2.setBackground(new java.awt.Color(252, 236, 180));
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.setPreferredSize(new java.awt.Dimension(1000, 1000));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tw Cen MT", 0, 20)); // NOI18N
        jLabel1.setText("Choose the size of pizza: ");

        small.setBackground(new java.awt.Color(252, 236, 180));
        buttonGroup1.add(small);
        small.setFont(new java.awt.Font("Tw Cen MT", 0, 17)); // NOI18N
        small.setText("Small");
        small.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smallActionPerformed(evt);
            }
        });

        meduim.setBackground(new java.awt.Color(252, 236, 180));
        buttonGroup1.add(meduim);
        meduim.setFont(new java.awt.Font("Tw Cen MT", 0, 17)); // NOI18N
        meduim.setText("Medium");
        meduim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meduimActionPerformed(evt);
            }
        });

        large.setBackground(new java.awt.Color(252, 236, 180));
        buttonGroup1.add(large);
        large.setFont(new java.awt.Font("Tw Cen MT", 0, 17)); // NOI18N
        large.setText("Large");
        large.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                largeActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tw Cen MT", 0, 20)); // NOI18N
        jLabel3.setText("Choose the type of pizza: ");

        deepDish.setBackground(new java.awt.Color(252, 236, 180));
        buttonGroup2.add(deepDish);
        deepDish.setFont(new java.awt.Font("Tw Cen MT", 0, 17)); // NOI18N
        deepDish.setText("Deep dish");
        deepDish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deepDishActionPerformed(evt);
            }
        });

        jScrollPane1.setBackground(new java.awt.Color(248, 223, 157));

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Tw Cen MT", 0, 17)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        pan.setBackground(new java.awt.Color(252, 236, 180));
        buttonGroup2.add(pan);
        pan.setFont(new java.awt.Font("Tw Cen MT", 0, 17)); // NOI18N
        pan.setText("Pan");
        pan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                panActionPerformed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(102, 255, 102));
        jLabel4.setFont(new java.awt.Font("Tw Cen MT", 0, 20)); // NOI18N
        jLabel4.setText("Choose the toppings:");

        jLabel5.setBackground(new java.awt.Color(102, 255, 102));
        jLabel5.setFont(new java.awt.Font("Tw Cen MT", 0, 20)); // NOI18N
        jLabel5.setText("Pizza Information: ");

        viewInformation.setBackground(new java.awt.Color(164, 51, 49));
        viewInformation.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        viewInformation.setForeground(new java.awt.Color(255, 255, 255));
        viewInformation.setText("View Information");
        viewInformation.setBorder(null);
        viewInformation.setEnabled(false);
        viewInformation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewInformationActionPerformed(evt);
            }
        });

        newOrder.setBackground(new java.awt.Color(164, 51, 49));
        newOrder.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        newOrder.setForeground(new java.awt.Color(255, 255, 255));
        newOrder.setText("New Order");
        newOrder.setBorder(null);
        newOrder.setEnabled(false);
        newOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newOrderActionPerformed(evt);
            }
        });

        confirmTheOrder.setBackground(new java.awt.Color(164, 51, 49));
        confirmTheOrder.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        confirmTheOrder.setForeground(new java.awt.Color(255, 255, 255));
        confirmTheOrder.setText("Confirm the order");
        confirmTheOrder.setBorder(null);
        confirmTheOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmTheOrderActionPerformed(evt);
            }
        });

        jList1.setFont(new java.awt.Font("Tw Cen MT", 0, 17)); // NOI18N
        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Mozzerlla Cheese", "Tomatoes", "Garlic", "Onion", "Pizza Sauce", "Oregano", "Olives", "Red Peppers" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList1);

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("Hint: use ctrl key to select multiple choices");

        jProgressBar1.setForeground(new java.awt.Color(204, 0, 0));

        progressVal.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        progressVal.setText("0%");

        jLabel7.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        jLabel7.setText("Customize your pizza");
        jLabel7.setToolTipText("");

        backBtn.setBackground(new java.awt.Color(252, 236, 180));
        backBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/arrow-left.png"))); // NOI18N
        backBtn.setBorder(null);
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(backBtn)
                        .addGap(119, 119, 119)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(progressVal)))
                .addContainerGap(37, Short.MAX_VALUE))
            .addComponent(jSeparator2)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(confirmTheOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(viewInformation, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(newOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(deepDish)
                    .addComponent(jLabel3)
                    .addComponent(pan)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(meduim)
                    .addComponent(small)
                    .addComponent(large)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(backBtn)
                        .addGap(13, 13, 13))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(small)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(meduim)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(large)
                        .addGap(7, 7, 7)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(deepDish)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pan))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(2, 2, 2)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(progressVal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jProgressBar1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(confirmTheOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewInformation, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 700, Short.MAX_VALUE)
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
//        if(ordered)
            jTextArea1.setText(s);
//        else
//            showMessage("you must confirm your order first");
    }//GEN-LAST:event_viewInformationActionPerformed

    private void confirmTheOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmTheOrderActionPerformed
       if(Pizza.getCount() == 0){
           log("MACHINE TURNED ON\n****************************************");
       }
        jProgressBar1.setVisible(false);
        progressVal.setVisible(false);
        int size = GUIgetSize();
        int type = GUIgetType();       
        initToppings(size);
        
        getSelectedToppings();
        
        if(size == 0){
            showMessage("please specify the size of the pizza");
        }
        else if(type == 0){
            showMessage("please specify the type of the pizza");
        }
        else if(selectedToppingsIndecies.length == 0){
            showMessage("please select at least one topping");
        }
        else{
            ordered = true;
            Pizza pizza = new Pizza(size, type, logger);
            
            //checking if enough dough Ingredients are available
            ArrayList<Ingredient> doughArr = pizza.getPan().getDough().getDoughArray();
            boolean isEnough = compare(DoughTotalIng, doughArr);
            
            if(isEnough){
                //checking if enough toppings are available
                isEnough = compare(totalToppings, Selectedtoppings);
                if(isEnough){
                    for(int i = 0, n = selectedToppingsIndecies.length; i < n; i++){
                        pizza.getPan().addTopping(Selectedtoppings.get(i));
                    }
                    
                    jProgressBar1.setVisible(true);
                    progressVal.setVisible(true);
                    try {
                        log("baking the pizza\n");
                        for(int i = 0; i <= 100; i++){
                            pizza.getPan().bake();
                            progressVal.setText(i + "%");
                            jProgressBar1.setValue(i);
                        }
                   } catch (InterruptedException ex) {
                       log(ex.getMessage());
                   }

                    s = pizza.getInfo(); 
                    log("Pizza delivered\n****************************************");
                    size = type = 0;
                    viewInformation.setEnabled(true);
                    newOrder.setEnabled(true);
                    confirmTheOrder.setEnabled(false);
    //                clearSelections();
                }
            }
       }
    }//GEN-LAST:event_confirmTheOrderActionPerformed

    private void newOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newOrderActionPerformed
        // TODO add your handling code here:
        //if this botton is enabled then the screen will be cleared... //I GUESS THERE IS A BETTER WAY TO DO THIS
        clearSelections();
        viewInformation.setEnabled(false);
        newOrder.setEnabled(false);
        confirmTheOrder.setEnabled(true);
        
    }//GEN-LAST:event_newOrderActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        viewInformation.setEnabled(false);
        newOrder.setEnabled(false);
        confirmTheOrder.setEnabled(true);
        clearSelections();
        setVisible(false);
        new Start().setVisible(true);
    }//GEN-LAST:event_backBtnActionPerformed
    
    private void clearSelections() {
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
        
    }
    
    private boolean compare(ArrayList<Ingredient> availableArr, ArrayList<Ingredient> wantedArr){
        int i = 0, n = wantedArr.size();
            boolean isEnough = true;
            while(i < n && isEnough){
                    double wanted = 0;
                    wanted += wantedArr.get(i).getWeight();
                    double available = availableArr.get(i).getWeight();
                    try{
                        if(wanted > available){
                            clearSelections();
                            isEnough = false;
                            throw new AmountNotAvailableException(wantedArr.get(i).getName());
                        }
                        else{
                            availableArr.get(i).setWeight(available - wanted);
                            i++;
                        }
                    }
                    catch (AmountNotAvailableException ex) {
                        showMessage(ex.getMessage());
                        log(ex.getMessage());
                    }
            }
        return isEnough;
    }

    private int GUIgetSize(){
       int size = 0;
       if(small.isSelected())
           size = 1;
       else if(meduim.isSelected())
           size = 2;
       else if(large.isSelected())
           size = 3;
       return size;
   }
    
    private int GUIgetType() {
           int type = 0;
       // getting pan type
       if(pan.isSelected())
           type = 1;
       else if(deepDish.isSelected())
           type = 2;
       return type;
    }
    
    private void initToppings(int size){
        toppings.add(new Ingredient("Mozzarella Cheese", 170 * size, 476 * size)); // index : 0
        toppings.add(new Ingredient("Tomatoes", 120 * size, 22 * size));
        toppings.add(new Ingredient("Garlic", 7 * size, 4 * size));
        toppings.add(new Ingredient("Onion", 115 * size, 44 * size));
        toppings.add(new Ingredient("Pizza Sauce", 56 * size, 28 * size));
        toppings.add(new Ingredient("Oregano ", 10 * size, 31 * size));
        toppings.add(new Ingredient("Olives ", 10 * size, 31 * size));
        toppings.add(new Ingredient("Red Peppers", 10 * size, 31 * size)); 
    }
    
    private void getSelectedToppings() {
        selectedToppingsIndecies = jList1.getSelectedIndices();

        for(int i = 0, n = selectedToppingsIndecies.length; i < n; i++){
            Ingredient e = toppings.get(selectedToppingsIndecies[i]);
            Selectedtoppings.add(e);
        }
    }
    
    private void showMessage(String message){
        JOptionPane.showMessageDialog(this, message);
    }
    
    private void log(String s){
        logger.log(s);
    }
       
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
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
    private javax.swing.JLabel jLabel7;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
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
