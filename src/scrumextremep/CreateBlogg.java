/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scrumextremep;

import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;
import oru.inf.InfException;

/**
 *
 * @author Linda
 */
public class CreateBlogg extends javax.swing.JFrame {

    /**
     * Creates new form CreateBlogg
     */
    private String anvID;
    public CreateBlogg(String anvandarID) {
        initComponents();
        setLocationRelativeTo(null);
        fyllBloggar(); 
        fyllAnvandarnamn();
        fyllSubkategori();
        anvID = anvandarID;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TFTitle = new javax.swing.JTextField();
        CbUser = new javax.swing.JComboBox<>();
        spBlogFlow = new javax.swing.JScrollPane();
        TaCreateBlog = new javax.swing.JTextArea();
        cbBlog = new javax.swing.JComboBox<>();
        BtnBack = new javax.swing.JButton();
        CbCategory = new javax.swing.JComboBox<>();
        LbCreateCategory = new javax.swing.JLabel();
        TfNewCategory = new javax.swing.JTextField();
        BtNewCategory = new javax.swing.JButton();
        BtAddFile = new javax.swing.JButton();
        BtCreateBlog = new javax.swing.JButton();
        lblRubrik = new java.awt.Label();
        lblBakgrundVit = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1227, 774));
        setMinimumSize(new java.awt.Dimension(1227, 774));
        getContentPane().setLayout(null);

        TFTitle.setText("Titel");
        getContentPane().add(TFTitle);
        TFTitle.setBounds(240, 130, 220, 30);

        getContentPane().add(CbUser);
        CbUser.setBounds(780, 140, 130, 30);

        TaCreateBlog.setColumns(20);
        TaCreateBlog.setRows(5);
        spBlogFlow.setViewportView(TaCreateBlog);

        getContentPane().add(spBlogFlow);
        spBlogFlow.setBounds(240, 170, 510, 390);

        cbBlog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbBlogActionPerformed(evt);
            }
        });
        getContentPane().add(cbBlog);
        cbBlog.setBounds(780, 190, 130, 30);

        BtnBack.setText("Tillbaka ");
        BtnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBackActionPerformed(evt);
            }
        });
        getContentPane().add(BtnBack);
        BtnBack.setBounds(843, 20, 130, 40);

        getContentPane().add(CbCategory);
        CbCategory.setBounds(780, 250, 130, 30);

        LbCreateCategory.setText("Skapa ny kategori");
        getContentPane().add(LbCreateCategory);
        LbCreateCategory.setBounds(780, 310, 110, 20);
        getContentPane().add(TfNewCategory);
        TfNewCategory.setBounds(780, 340, 130, 30);

        BtNewCategory.setText("Lägg till kategori");
        BtNewCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtNewCategoryActionPerformed(evt);
            }
        });
        getContentPane().add(BtNewCategory);
        BtNewCategory.setBounds(780, 390, 110, 20);

        BtAddFile.setText("Bifoga fil");
        getContentPane().add(BtAddFile);
        BtAddFile.setBounds(800, 430, 73, 23);

        BtCreateBlog.setText("Skapa blogginlägg");
        BtCreateBlog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtCreateBlogActionPerformed(evt);
            }
        });
        getContentPane().add(BtCreateBlog);
        BtCreateBlog.setBounds(780, 510, 119, 40);

        lblRubrik.setAlignment(java.awt.Label.CENTER);
        lblRubrik.setBackground(new java.awt.Color(255, 255, 255));
        lblRubrik.setFont(new java.awt.Font("Impact", 0, 52)); // NOI18N
        lblRubrik.setText("Informatikblogg");
        getContentPane().add(lblRubrik);
        lblRubrik.setBounds(260, 0, 480, 120);

        lblBakgrundVit.setBackground(java.awt.Color.white);
        lblBakgrundVit.setForeground(new java.awt.Color(255, 255, 255));
        lblBakgrundVit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/scrumextremep/Namnlös.jpg"))); // NOI18N
        lblBakgrundVit.setText("jLabel1");
        getContentPane().add(lblBakgrundVit);
        lblBakgrundVit.setBounds(0, -10, 1000, 620);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtNewCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtNewCategoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtNewCategoryActionPerformed

    private void BtCreateBlogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtCreateBlogActionPerformed
     
        
        try {
        String blogText = TaCreateBlog.getText();
        String blogType = cbBlog.getSelectedItem().toString();
        String user = CbUser.getSelectedItem().toString(); 
        String sub = CbCategory.getSelectedItem().toString();
        String titel = TFTitle.getText();
        
        // skriva ComboBox för subKategorier, skriva kod för att lägga till kategori samt uppdatera och rensa textfield  
      
        String CbBlog = "SELECT B_ID FROM BLOGG WHERE BLOGGNAMN = '"+ blogType +"'";
        CbBlog = Databas.getDatabas().fetchSingle(CbBlog);
        //String subC = "SELECT SK_ID FROM SUBKATEGORI WHERE SUBKATEGORI.NAMN = '" + sub + "'";
       // subC = Databas.getDatabas().fetchSingle(subC);
        String userC = "SELECT A_ID FROM ANVANDARE WHERE ANVNAMN = '" + user + "'";
        userC = Databas.getDatabas().fetchSingle(userC);
        String BiID = Databas.getDatabas().getAutoIncrement("Blogginlagg" , "BI_ID");
        
        String sql = "INSERT INTO BLOGGINLAGG values ('" + BiID +  "', '" + titel + "' , '" + blogText + "','"+"fil"+"', "+ userC +", "+ 3 +" ," + CbBlog + ")";
        Databas.getDatabas().insert(sql);
                
        JOptionPane.showMessageDialog(null, "Blogg inlägget har skapats");
        
      } catch (InfException ex) {
                JOptionPane.showMessageDialog(null, "Något gick visst fel: " + ex);
            }
      
    }//GEN-LAST:event_BtCreateBlogActionPerformed

    private void BtnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBackActionPerformed
       new InloggadSida(anvID).setVisible(true);
       dispose();
       
    }//GEN-LAST:event_BtnBackActionPerformed

    private void cbBlogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbBlogActionPerformed
       try
        {
        CbCategory.removeAllItems();
        fyllSubkategori();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_cbBlogActionPerformed

    
  


    public void fyllBloggar()
    {
        try{
        String fyll = "SELECT BLOGGNAMN FROM BLOGG";
        ArrayList<HashMap<String, String>> bloggarna = Databas.getDatabas().fetchRows(fyll);
        for (int i = 0; i < bloggarna.size(); i++){
            cbBlog.addItem(bloggarna.get(i).get("BLOGGNAMN"));
                                                  }
           }
        catch(Exception e){
            System.out.println(e);
        }
    }
    
    public void fyllAnvandarnamn()
    {
        try{
        String fyll = "SELECT ANVNAMN FROM ANVANDARE";
        ArrayList<HashMap<String, String>> bloggarna = Databas.getDatabas().fetchRows(fyll);
        for (int i = 0; i < bloggarna.size(); i++){
            CbUser.addItem(bloggarna.get(i).get("ANVNAMN"));
                                                  }
           }
        catch(Exception e){
            System.out.println(e);
        }
    }
    
    public void fyllSubkategori()
    {
        try{
            String bloggnamn = cbBlog.getSelectedItem().toString();
        String fyll = "SELECT NAMN FROM SUBKATEGORI WHERE B_ID = (SELECT B_ID FROM BLOGG WHERE BLOGGNAMN = '" + bloggnamn + "')";
        ArrayList<HashMap<String, String>> bloggarna = Databas.getDatabas().fetchRows(fyll);
        if(bloggarna != null){
        for (int i = 0; i < bloggarna.size(); i++)
        {
            CbCategory.addItem(bloggarna.get(i).get("NAMN"));
        }
        }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    
    public void skapaInlagg(String text, String titel, String bloggid, String subkategori, String inloggad){
        try{
            titel = TFTitle.getText();
            text = TaCreateBlog.getText();
            String bloggNamn = cbBlog.getSelectedItem().toString();
            bloggid = "SELECT B_ID FROM BLOGGNAMN WHERE BLOGGNAMN = '" + bloggNamn + "'";
            String subkategoriNamn = CbCategory.getSelectedItem().toString();
            subkategori = "SELECT SK_ID FROM SUBKATEGORI WHERE NAMN = '" + subkategoriNamn + "'";
        String increment = Databas.getDatabas().getAutoIncrement("BLOGGINLAGG","B_ID");
        String sql = "INSERT INTO BLOGGINLAGG VALUES('" + increment + "' , '" + titel + "' , '" + text + "' , " + inloggad + " , " + subkategori + " , " + bloggid + ")";
        Databas.getDatabas().insert(sql);
        JOptionPane.showMessageDialog(null, titel + " har nu lagts in!");
           }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtAddFile;
    private javax.swing.JButton BtCreateBlog;
    private javax.swing.JButton BtNewCategory;
    private javax.swing.JButton BtnBack;
    private javax.swing.JComboBox<String> CbCategory;
    private javax.swing.JComboBox<String> CbUser;
    private javax.swing.JLabel LbCreateCategory;
    private javax.swing.JTextField TFTitle;
    private javax.swing.JTextArea TaCreateBlog;
    private javax.swing.JTextField TfNewCategory;
    private javax.swing.JComboBox<String> cbBlog;
    private javax.swing.JLabel lblBakgrundVit;
    private java.awt.Label lblRubrik;
    private javax.swing.JScrollPane spBlogFlow;
    // End of variables declaration//GEN-END:variables
}
