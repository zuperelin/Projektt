
package scrumextremep;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import oru.inf.InfException;

/**
 *
 * @author Ola Vognild
 */
public class Calendar extends javax.swing.JFrame {

    private String anvID;
    /**
     * Creates new form CalendarReal
     */
    public Calendar(String anvandarID) {
        initComponents();
        anvID = anvandarID;
        fillTblMoten2();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnDate = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMoten2 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblMoten1 = new javax.swing.JTable();
        dateChooser = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        createBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        BtnShowAllMeetings = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnDate.setText("Välj datum");
        btnDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDateActionPerformed(evt);
            }
        });

        tblMoten2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Möte", "Datum", "Tid"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblMoten2);
        if (tblMoten2.getColumnModel().getColumnCount() > 0) {
            tblMoten2.getColumnModel().getColumn(0).setResizable(false);
            tblMoten2.getColumnModel().getColumn(1).setResizable(false);
            tblMoten2.getColumnModel().getColumn(2).setResizable(false);
        }

        tblMoten1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Möte", "Datum", "Tid"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblMoten1);
        if (tblMoten1.getColumnModel().getColumnCount() > 0) {
            tblMoten1.getColumnModel().getColumn(0).setResizable(false);
            tblMoten1.getColumnModel().getColumn(1).setResizable(false);
            tblMoten1.getColumnModel().getColumn(2).setResizable(false);
        }

        jLabel1.setText("Meeting");

        jButton2.setText("Redigera möte");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        createBtn.setText("Skapa möte");
        createBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createBtnActionPerformed(evt);
            }
        });

        backBtn.setText("Tillbaka");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        BtnShowAllMeetings.setText("Visa alla möte");
        BtnShowAllMeetings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnShowAllMeetingsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDate)
                .addGap(28, 28, 28)
                .addComponent(createBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BtnShowAllMeetings, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(dateChooser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnDate, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(createBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(backBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(BtnShowAllMeetings, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(235, 235, 235))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDateActionPerformed

        clearTblMoten1();
        
         try {
            SimpleDateFormat dFormat = new SimpleDateFormat("yyyy-MM-dd");
            String date = dFormat.format(dateChooser.getDate());
           
            // Showing all meetings on a specific date
            String sql = "SELECT MOTE.NAMN, MOTE.DATUM, MOTE.STARTTID \n" +
                         "from MOTE where MOTE.DATUM = '"+date+"'";
                     

           ArrayList<HashMap<String, String>> Database = Database = Databas.getDatabas().fetchRows(sql);
                for(int i = 0; i < Database.size(); i++) {
                String name = Database.get(i).get("NAMN");
                String time = Database.get(i).get("DATUM");
                String Date = Database.get(i).get("STARTTID");

                DefaultTableModel dmt = (DefaultTableModel)tblMoten1.getModel();
                dmt.addRow(new Object[] {name, time, Date});
            }
               
         }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btnDateActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void createBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createBtnActionPerformed
        new Motesforslag(anvID).setVisible(true);
        dispose();
    }//GEN-LAST:event_createBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        new InloggadSida(anvID).setVisible(true);
        dispose();
    }//GEN-LAST:event_backBtnActionPerformed

    private void BtnShowAllMeetingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnShowAllMeetingsActionPerformed
           clearTblMoten1();
        
         try {
             
            // Showing all meetings
            String allaMoten = "SELECT mote.NAMN, mote.DATUM, mote.STARTTID from mote";
                     

           ArrayList<HashMap<String, String>> Database = Databas.getDatabas().fetchRows(allaMoten);
                for(int i = 0; i < Database.size(); i++) {
                String name = Database.get(i).get("NAMN");
                String time = Database.get(i).get("DATUM");
                String Date = Database.get(i).get("STARTTID");

                DefaultTableModel dmt = (DefaultTableModel)tblMoten1.getModel();
                dmt.addRow(new Object[] {name, time, Date});
            }
               
         }catch (InfException e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_BtnShowAllMeetingsActionPerformed

    private void clearTblMoten1() {
 
        DefaultTableModel dm = (DefaultTableModel) tblMoten1.getModel();

        for (int i = 0; i < dm.getRowCount(); i++) {
            for (int j = 0; j < dm.getColumnCount(); j++) {
                dm.setRowCount(0);
            }
        }
    }
    
    private void fillTblMoten2(){
        
    try {
         String mSql = "select mote.NAMN, mote.DATUM, mote.STARTTID\n" +
                       "from MOTE\n" +
                       "join ANVINBJUDENMOTE\n" +
                       "on mote.M_ID = ANVINBJUDENMOTE.M_ID\n" +
                       "join ANVANDARE\n" +
                       "on ANVINBJUDENMOTE.A_ID = ANVANDARE.A_ID\n" +
                       "where ANVANDARE.a_ID = '" + anvID + "'";
                
                ArrayList<HashMap<String, String>> meetings = Databas.getDatabas().fetchRows(mSql);
                
                for(int i = 0; i < meetings.size(); i++) {
                         String name = meetings.get(i).get("NAMN");
                         String time = meetings.get(i).get("DATUM");
                         String Date = meetings.get(i).get("STARTTID");

                DefaultTableModel dmt = (DefaultTableModel)tblMoten2.getModel();
                dmt.addRow(new Object[] {name, time, Date});
    }
    } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnShowAllMeetings;
    private javax.swing.JButton backBtn;
    private javax.swing.JButton btnDate;
    private javax.swing.JButton createBtn;
    private com.toedter.calendar.JDateChooser dateChooser;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblMoten1;
    private javax.swing.JTable tblMoten2;
    // End of variables declaration//GEN-END:variables
}
