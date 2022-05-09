package Interfaces;

public class MainView extends javax.swing.JFrame {

    public MainView() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jdpMainView = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        Customers = new javax.swing.JMenuItem();
        Brand = new javax.swing.JMenuItem();
        Categories = new javax.swing.JMenuItem();
        Specification = new javax.swing.JMenuItem();
        Cars = new javax.swing.JMenuItem();
        CarsImages = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        Rentals = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("VR SOFTWARE CHALLENGE");

        javax.swing.GroupLayout jdpMainViewLayout = new javax.swing.GroupLayout(jdpMainView);
        jdpMainView.setLayout(jdpMainViewLayout);
        jdpMainViewLayout.setHorizontalGroup(
            jdpMainViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jdpMainViewLayout.setVerticalGroup(
            jdpMainViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 280, Short.MAX_VALUE)
        );

        jMenu1.setText("Registrations");

        Customers.setText("Customers");
        Customers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CustomersActionPerformed(evt);
            }
        });
        jMenu1.add(Customers);

        Brand.setText("Brand");
        Brand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BrandActionPerformed(evt);
            }
        });
        jMenu1.add(Brand);

        Categories.setText("Categories");
        Categories.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CategoriesActionPerformed(evt);
            }
        });
        jMenu1.add(Categories);

        Specification.setText("Specification");
        Specification.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SpecificationActionPerformed(evt);
            }
        });
        jMenu1.add(Specification);

        Cars.setText("Cars");
        Cars.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CarsActionPerformed(evt);
            }
        });
        jMenu1.add(Cars);

        CarsImages.setText("Cars Images");
        CarsImages.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CarsImagesActionPerformed(evt);
            }
        });
        jMenu1.add(CarsImages);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Rentals");
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });

        Rentals.setText("Rentals");
        Rentals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RentalsActionPerformed(evt);
            }
        });
        jMenu2.add(Rentals);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdpMainView)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdpMainView)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CustomersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CustomersActionPerformed
       Customers objCustomers = new Customers();
       jdpMainView.add(objCustomers);
       objCustomers.setVisible(true);
    }//GEN-LAST:event_CustomersActionPerformed

    private void BrandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BrandActionPerformed
       Brand objBrand = new Brand();
       jdpMainView.add(objBrand);
       objBrand.setVisible(true);
    }//GEN-LAST:event_BrandActionPerformed

    private void CategoriesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CategoriesActionPerformed
       Categories objCategories = new Categories();
       jdpMainView.add(objCategories);
       objCategories.setVisible(true);
    }//GEN-LAST:event_CategoriesActionPerformed

    private void SpecificationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SpecificationActionPerformed
        Specification objSpecification = new Specification();
        jdpMainView.add(objSpecification);
        objSpecification.setVisible(true);
    }//GEN-LAST:event_SpecificationActionPerformed

    private void CarsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CarsActionPerformed
        Cars objCars = new Cars();
        jdpMainView.add(objCars);
        objCars.setVisible(true);
    }//GEN-LAST:event_CarsActionPerformed

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed

    }//GEN-LAST:event_jMenu2ActionPerformed

    private void RentalsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RentalsActionPerformed
        Rentals objRentals = new Rentals();
        jdpMainView.add(objRentals);
        objRentals.setVisible(true);
    }//GEN-LAST:event_RentalsActionPerformed

    private void CarsImagesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CarsImagesActionPerformed
        CarsImages objCarsImages = new CarsImages();
        jdpMainView.add(objCarsImages);
        objCarsImages.setVisible(true);
    }//GEN-LAST:event_CarsImagesActionPerformed

    public static void main(String args[]) {            
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }      
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Brand;
    private javax.swing.JMenuItem Cars;
    private javax.swing.JMenuItem CarsImages;
    private javax.swing.JMenuItem Categories;
    private javax.swing.JMenuItem Customers;
    private javax.swing.JMenuItem Rentals;
    private javax.swing.JMenuItem Specification;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JDesktopPane jdpMainView;
    // End of variables declaration//GEN-END:variables
}
