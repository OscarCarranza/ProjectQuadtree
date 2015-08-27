/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quadtree;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.GraphicsConfiguration;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Oscar
 */
public class Frame extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Frame() {
        initComponents();
        this.setLocationRelativeTo(null);
        tree = new QuadTree();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImgSUCC = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        ImgERROR = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        Accept = new javax.swing.JDialog();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        Celebrate = new javax.swing.JDialog();
        jPanel6 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Button_SI = new javax.swing.JLabel();
        Button_accept = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        sp_depth = new javax.swing.JSpinner();
        jLabel12 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        photoframe = new javax.swing.JLabel();

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Your Image has been successfully ");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setText(" selected");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quadtree/like.png"))); // NOI18N

        jButton2.setText("Accept");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel7)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(jLabel6)))
                .addContainerGap(34, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(127, 127, 127))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel7)))
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout ImgSUCCLayout = new javax.swing.GroupLayout(ImgSUCC.getContentPane());
        ImgSUCC.getContentPane().setLayout(ImgSUCCLayout);
        ImgSUCCLayout.setHorizontalGroup(
            ImgSUCCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        ImgSUCCLayout.setVerticalGroup(
            ImgSUCCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setText("File selected is NOT an image ");

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quadtree/dislike.png"))); // NOI18N

        jButton1.setText("Accept");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addGap(53, 53, 53))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(jButton1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel10)))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout ImgERRORLayout = new javax.swing.GroupLayout(ImgERROR.getContentPane());
        ImgERROR.getContentPane().setLayout(ImgERRORLayout);
        ImgERRORLayout.setHorizontalGroup(
            ImgERRORLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        ImgERRORLayout.setVerticalGroup(
            ImgERRORLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ImgERRORLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel9.setText("No image selected");

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quadtree/dislike.png"))); // NOI18N

        jButton3.setText("Accept");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel11)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel9))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jButton3)))
                .addContainerGap(86, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel11)))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout AcceptLayout = new javax.swing.GroupLayout(Accept.getContentPane());
        Accept.getContentPane().setLayout(AcceptLayout);
        AcceptLayout.setHorizontalGroup(
            AcceptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        AcceptLayout.setVerticalGroup(
            AcceptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quadtree/celebrate.png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel4.setText("SUCCESS!");

        jButton4.setText("OK");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel3)
                .addGap(32, 32, 32)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(188, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addGap(123, 123, 123))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addComponent(jButton4)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout CelebrateLayout = new javax.swing.GroupLayout(Celebrate.getContentPane());
        Celebrate.getContentPane().setLayout(CelebrateLayout);
        CelebrateLayout.setHorizontalGroup(
            CelebrateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        CelebrateLayout.setVerticalGroup(
            CelebrateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("LCD", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Bitmap Converter");

        Button_SI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quadtree/bSI2.png"))); // NOI18N
        Button_SI.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button_SIMouseClicked(evt);
            }
        });

        Button_accept.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quadtree/bSI.png"))); // NOI18N
        Button_accept.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button_acceptMouseClicked(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quadtree/depth.png"))); // NOI18N

        sp_depth.setFont(new java.awt.Font("Clarendon Lt BT", 1, 18)); // NOI18N
        sp_depth.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quadtree/depth.png"))); // NOI18N

        photoframe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quadtree/file.png"))); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(photoframe)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(photoframe)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sp_depth, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Button_accept)
                            .addComponent(Button_SI, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(221, 221, 221)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(jLabel1)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(Button_SI, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel12)
                            .addComponent(sp_depth, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Button_accept)))
                .addGap(153, 153, 153)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 450, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    void TreeDivision(BufferedImage image, int depth, nodo root) {
        try {
            int last_pixel = image.getRGB(image.getWidth() - 1, image.getHeight() - 1);
            boolean lastPixReached = false;
            for (int i = 0; i < image.getWidth(); i++) {
                for (int j = 0; j < image.getHeight(); j++) {
                    System.out.println("for1");
                    if (image.getRGB(i, j) != last_pixel) {
                        lastPixReached = true;
                        break;
                    }
                }
                if(lastPixReached == true)
                    break;
            }
            
            if (lastPixReached && depth <= (int)sp_depth.getValue()) {
                root.setPartition(true);
                TreeDivision(image.getSubimage(image.getWidth() / 2, 0, image.getWidth() / 2, image.getHeight() / 2), depth + 1, root.getSon(0));
                System.out.println("Partition1");
                TreeDivision(image.getSubimage(0, 0, image.getWidth() / 2, image.getHeight() / 2), depth + 1, root.getSon(1));
                System.out.println("Partition2");
                TreeDivision(image.getSubimage(0, image.getHeight() / 2, image.getWidth() / 2, image.getHeight() / 2), depth + 1, root.getSon(2));
                System.out.println("Partition3");
                TreeDivision(image.getSubimage(image.getWidth() / 2, image.getHeight() / 2, image.getWidth() / 2, image.getHeight() / 2), depth + 1, root.getSon(3));
            }
        } 
        catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Depth to Big");
        }
    
    }
    
    public Icon imageToIcon(Image image){
        ImageIcon imgIcon=new ImageIcon(image);
        Icon iconReturn=(Icon)imgIcon;
        return iconReturn;

    }
    
    public Image imageIconToImage(ImageIcon imageIcon){
        Image imgReturn=(Image)imageIcon.getImage();
        return imgReturn;
    }
    
     public ImageIcon bufferedImageToImageIcon(BufferedImage bufferImage){
        ImageIcon imgIconReturn = new ImageIcon(bufferImage);
        return imgIconReturn;
    }
    
    private Image Resize(Image img, int h, int w){
        BufferedImage resized = new BufferedImage(w,h,BufferedImage.TYPE_INT_RGB);
        
        Graphics2D g2 = resized.createGraphics();
        g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION,RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        g2.drawImage(img,0,0,w,h,null);
        
        return resized;
    }
     
    private void ColorTree(BufferedImage gray_scale, int C_RGB, nodo Cuadrante){
        if (Cuadrante.isRoot()) {
            for (int i = 0; i < this.gray_scale.getWidth(); i++) {//subdividir imagen en cuatro
                this.gray_scale.setRGB(i, this.gray_scale.getHeight()/2, C_RGB);
            }
            for (int i = 0; i < this.gray_scale.getHeight(); i++) {
                this.gray_scale.setRGB(this.gray_scale.getWidth()/2, i, C_RGB);
            }
        }
        try {
            if (Cuadrante.getSon(1).isRoot()) {
                ColorTree(gray_scale.getSubimage(gray_scale.getWidth()/2, 0, gray_scale.getWidth()/2, gray_scale.getHeight()/2), C_RGB, Cuadrante.getSon(1));
            }
            if (Cuadrante.getSon(2).isRoot()) {
                ColorTree(gray_scale.getSubimage(0, 0, gray_scale.getWidth()/2, gray_scale.getHeight()/2), C_RGB, Cuadrante.getSon(2));
            }
            if (Cuadrante.getSon(3).isRoot()) {
                ColorTree(gray_scale.getSubimage(0,gray_scale.getHeight()/2, gray_scale.getWidth()/2, gray_scale.getHeight()/2), C_RGB, Cuadrante.getSon(3));
            }
            if (Cuadrante.getSon(4).isRoot()) {
                ColorTree(gray_scale.getSubimage(gray_scale.getWidth()/2,gray_scale.getHeight()/2, gray_scale.getWidth()/2, gray_scale.getHeight()/2), C_RGB, Cuadrante.getSon(4));
            }
        } catch (Exception e) {
        }
    }
    
     
    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        //File selected is not image
        ImgERROR.setVisible(false);
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        //File selected is an image
        ImgSUCC.setVisible(false);
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
       Accept.setVisible(false);
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        Celebrate.setVisible(false);
    }//GEN-LAST:event_jButton4MouseClicked

    private void Button_acceptMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_acceptMouseClicked
        if(ext.equals("")){
            Accept.pack();
            Accept.setTitle("Error");
            Accept.setLocationRelativeTo(null);
            Accept.setModal(true);
            Accept.setVisible(true);
        }

        //Image found ready to bitmap
        else{
            BufferedImage image = null;
            File f = new File(ext);
            try {
                image = ImageIO.read(f);
            } catch (IOException ex) {
                System.out.println("");
            }

            int width = image.getWidth();
            int height = image.getHeight();

            //Convertir a gray scale
            for(int i = 0; i < height; i++){
                for(int j = 0; j < width; j++){
                    int p = image.getRGB(j,i);

                    int a = (p>>24)&0xff;
                    int r = (p>>16)&0xff;
                    int g = (p>>8)&0xff;
                    int b = p&0xff;

                    int avg = (r+g+b)/3;

                    p = (a<<24) | (avg<<16) | (avg<<8) | avg;
                    image.setRGB(j, i, p);
                }
            }
            
            gray_scale = image;
            
            if((int)sp_depth.getValue() == 0){
                JOptionPane.showMessageDialog(this, "Depth must be greater than cero");
            }
            
            else{
                TreeDivision(gray_scale,1,tree.getRaiz());
                System.out.println("Dividio el arbol");
                ColorTree(gray_scale,Color.BLACK.getRGB(),tree.getRaiz());
                System.out.println("Coloreo el arbol");
                photoframe.setIcon(imageToIcon(Resize(gray_scale,photoframe.getWidth(),photoframe.getHeight())));
                
                try{
                f = new File("./output.jpg");
                int cont = 0;
                while(f.exists()){
                    f = new File("./output" + cont + ".jpg");
                    cont++;
                }

                ImageIO.write(image, "jpg", f);
                gray_scale = image;
                }    
                
                catch(IOException e){
                    System.out.println(e);
                }

                photoframe.setIcon(imageToIcon(Resize(imageIconToImage(bufferedImageToImageIcon(gray_scale)),photoframe.getWidth(),photoframe.getHeight())));

                Celebrate.pack();
                Celebrate.setTitle("Wohoo");
                Celebrate.setLocationRelativeTo(null);
                Celebrate.setModal(true);
                Celebrate.setVisible(true);
            }
            

            

        }
    }//GEN-LAST:event_Button_acceptMouseClicked

    private void Button_SIMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_SIMouseClicked
        JFileChooser fChooser = new JFileChooser();
        fChooser.showOpenDialog(this);
        fChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        try{
            File f = fChooser.getSelectedFile();
            ext = f.getAbsolutePath();
        }
        catch(Exception e){

        }

        ImageIcon RealImg = new ImageIcon(ext);
        photoframe.setIcon(imageToIcon(Resize(imageIconToImage(RealImg),photoframe.getWidth(),photoframe.getHeight())));

        try{
            ImageIcon icon = (ImageIcon)RealImg;
            BufferedImage img = (BufferedImage)((Image) icon.getImage());
        }

        catch(Exception e){

        }

        if(ext.endsWith(".jpg") || ext.endsWith(".png") || ext.endsWith(".jpeg")){
            ImgSUCC.pack();
            ImgSUCC.setTitle("Succes");
            ImgSUCC.setLocationRelativeTo(null);
            ImgSUCC.setModal(true);
            ImgSUCC.setVisible(true);

        }

        else{
            ImgERROR.pack();
            ImgERROR.setTitle("Error");
            ImgERROR.setLocationRelativeTo(null);
            ImgERROR.setModal(true);
            ImgERROR.setVisible(true);
        }
    }//GEN-LAST:event_Button_SIMouseClicked

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
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog Accept;
    private javax.swing.JLabel Button_SI;
    private javax.swing.JLabel Button_accept;
    private javax.swing.JDialog Celebrate;
    private javax.swing.JDialog ImgERROR;
    private javax.swing.JDialog ImgSUCC;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel photoframe;
    private javax.swing.JSpinner sp_depth;
    // End of variables declaration//GEN-END:variables
    String ext = "";
    BufferedImage gray_scale;
    QuadTree tree;
}
