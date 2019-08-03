
package pdi;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;

public class tela extends javax.swing.JFrame {
    
    File arquivo;

    /**
     * Creates new form tela
     */

    public tela() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    public int checkMinMax (double input) {
        int output;
        if (Math.round(input) > 255) {
            output = 255;
        } else if (Math.round(input) < 0) {
            output = 0;
        } else {
            output = (int) Math.round(input);
        }

         return output;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnNegativo = new javax.swing.JButton();
        btnNegativoR = new javax.swing.JButton();
        btnNegativoG = new javax.swing.JButton();
        btnNegativoB = new javax.swing.JButton();
        btnNegativoY = new javax.swing.JButton();
        btnBandaR = new javax.swing.JButton();
        btnBandaG = new javax.swing.JButton();
        btnBandaB = new javax.swing.JButton();
        foto = new javax.swing.JLabel();
        btnTrocarFoto = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnNegativo.setText("Negativo RGB");
        btnNegativoR.setText("Negativo R");
        btnNegativoG.setText("Negativo G");
        btnNegativoB.setText("Negativo B");
        btnNegativoY.setText("Negativo Y");
        btnBandaR.setText("Banda R");
        btnBandaG.setText("Banda G");
        btnBandaB.setText("Banda B");

        btnNegativo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNegativoActionPerformed(evt);
            }
        });
        btnNegativoR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNegativoRActionPerformed(evt);
            }
        });
        btnNegativoG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNegativoGActionPerformed(evt);
            }
        });
        btnNegativoB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNegativoBActionPerformed(evt);
            }
        });
        btnNegativoY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNegativoYActionPerformed(evt);
            }
        });
        btnBandaR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBandaRActionPerformed(evt);
            }
        });
        btnBandaG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBandaGActionPerformed(evt);
            }
        });
        btnBandaB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBandaBActionPerformed(evt);
            }
        });

        foto.setBorder(new javax.swing.border.MatteBorder(null));

        btnTrocarFoto.setText("Trocar foto");
        btnTrocarFoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTrocarFotoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(foto, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67)
                        .addComponent(btnNegativo)
                        .addComponent(btnNegativoR)
                        .addComponent(btnNegativoG)
                        .addComponent(btnNegativoB)
                        .addComponent(btnNegativoY)
                        .addComponent(btnBandaR)
                        .addComponent(btnBandaG)
                        .addComponent(btnBandaB))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(btnTrocarFoto)))
                .addContainerGap(259, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(foto, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(btnNegativo)
                        .addComponent(btnNegativoR)
                        .addComponent(btnNegativoG)
                        .addComponent(btnNegativoB)
                        .addComponent(btnNegativoY)
                        .addComponent(btnBandaR)
                        .addComponent(btnBandaG)
                        .addComponent(btnBandaB)))
                .addGap(18, 18, 18)
                .addComponent(btnTrocarFoto)
                .addGap(0, 29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTrocarFotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTrocarFotoActionPerformed
        JFileChooser fc = new JFileChooser(".");
        
        fc.showOpenDialog(jPanel1);
        this.arquivo = fc.getSelectedFile();

        ImageIcon imagem = new ImageIcon(arquivo.getAbsolutePath());
        foto.setIcon(new ImageIcon(imagem.getImage().getScaledInstance(foto.getWidth(),foto.getHeight(), Image.SCALE_DEFAULT)));
        
        foto.repaint();
        
        this.revalidate();
        
        
    }//GEN-LAST:event_btnTrocarFotoActionPerformed
    private void btnNegativoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNegativoActionPerformed

        BufferedImage img = null;
        File input = null;
        File output = null;
        File maskText = null;

        try {
            input = this.arquivo;
            img = ImageIO.read(input);
            maskText = new File("C:\\silver-barnacle-master\\img\\mask.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }

        int width = img.getWidth();
        int height = img.getHeight();

        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                int pixel = img.getRGB(i, j);

                int r = 255 - (pixel >> 16) & 0xff;
                int g = 255 - (pixel >> 8) & 0xff;
                int b = 255 - pixel & 0xff;

                pixel = (r << 16) | (g << 8) | b;
                img.setRGB(i, j, pixel);
            }
        }

        try {
            output = new File("C:\\silver-barnacle-master\\img\\negativo.jpg");
            ImageIO.write(img, "jpg", output);
            ImageIcon imagem = new ImageIcon(output.getAbsolutePath());
            foto.setIcon(new ImageIcon(imagem.getImage().getScaledInstance(foto.getWidth(), foto.getHeight(), Image.SCALE_DEFAULT)));

            foto.repaint();

            this.revalidate();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void btnNegativoRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNegativoActionPerformed
        
        
        BufferedImage img = null;
        File input = null;
        File output = null;
        File maskText = null;

        try {
            input = this.arquivo;
            img = ImageIO.read(input);
            maskText = new File ("C:\\silver-barnacle-master\\img\\mask.txt");
        } catch (IOException e){
            e.printStackTrace();
        }

        int width = img.getWidth();
        int height = img.getHeight();

        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                int pixel = img.getRGB(i,j);

                int r = 255 - (pixel>>16) & 0xff;
                int g = (pixel>>8) & 0xff;
                int b = pixel & 0xff;

                pixel = (r<<16)| (g<<8) | b;
                img.setRGB(i, j, pixel);
            }
        }

        try {
            output = new File ("C:\\silver-barnacle-master\\img\\negativo.jpg");
            ImageIO.write(img, "jpg", output);
            ImageIcon imagem = new ImageIcon(output.getAbsolutePath());
            foto.setIcon(new ImageIcon(imagem.getImage().getScaledInstance(foto.getWidth(),foto.getHeight(), Image.SCALE_DEFAULT)));
        
            foto.repaint();
        
            this.revalidate();
            
        } catch (IOException e) {
            e.printStackTrace();
        }


        //System.out.println("asd");
    }//GEN-LAST:event_btnNegativoActionPerformed

    //GEN-FIRST:event_btnNegativoActionPerformed


    private void btnNegativoGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNegativoActionPerformed

        BufferedImage img = null;
        File input = null;
        File output = null;
        File maskText = null;

        try {
            input = this.arquivo;
            img = ImageIO.read(input);
            maskText = new File("C:\\silver-barnacle-master\\img\\mask.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }

        int width = img.getWidth();
        int height = img.getHeight();

        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                int pixel = img.getRGB(i, j);

                int r = (pixel>>16) & 0xff;
                int g = 255 - (pixel >> 8) & 0xff;
                int b = pixel & 0xff;

                pixel = pixel = (r<<16)| (g<<8) | b;
                img.setRGB(i, j, pixel);
            }
        }

        try {
            output = new File("C:\\silver-barnacle-master\\img\\negativo.jpg");
            ImageIO.write(img, "jpg", output);
            ImageIcon imagem = new ImageIcon(output.getAbsolutePath());
            foto.setIcon(new ImageIcon(imagem.getImage().getScaledInstance(foto.getWidth(), foto.getHeight(), Image.SCALE_DEFAULT)));

            foto.repaint();

            this.revalidate();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void btnNegativoBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNegativoActionPerformed

        BufferedImage img = null;
        File input = null;
        File output = null;
        File maskText = null;

        try {
            input = this.arquivo;
            img = ImageIO.read(input);
            maskText = new File("C:\\silver-barnacle-master\\img\\mask.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }

        int width = img.getWidth();
        int height = img.getHeight();

        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                int pixel = img.getRGB(i, j);

                int r = (pixel>>16) & 0xff;
                int g = (pixel>>8) & 0xff;
                int b = 255 - pixel & 0xff;

                pixel = (r<<16)| (g<<8) | b;
                img.setRGB(i, j, pixel);
            }
        }

        try {
            output = new File("C:\\silver-barnacle-master\\img\\negativo.jpg");
            ImageIO.write(img, "jpg", output);
            ImageIcon imagem = new ImageIcon(output.getAbsolutePath());
            foto.setIcon(new ImageIcon(imagem.getImage().getScaledInstance(foto.getWidth(), foto.getHeight(), Image.SCALE_DEFAULT)));

            foto.repaint();

            this.revalidate();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void btnNegativoYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNegativoActionPerformed

        BufferedImage img = null;
        File input = null;
        File output = null;
        File maskText = null;

        try {
            input = this.arquivo;
            img = ImageIO.read(input);
            maskText = new File("C:\\silver-barnacle-master\\img\\mask.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }

        int width = img.getWidth();
        int height = img.getHeight();

        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                int pixel = img.getRGB(i, j);

                int r = (pixel >> 16) & 0xff;
                int g = (pixel >> 8) & 0xff;
                int b = pixel & 0xff;

                double valorY = 0.299*r + 0.587*g + 0.114*b;
                double valorI = 0.596*r - 0.274*g - 0.322*b;
                double valorQ = 0.211*r - 0.523*g + 0.312*b;

                double negativoY = 255 - valorY;

                r = checkMinMax(negativoY + 0.956*valorI + 0.621*valorQ);
                g = checkMinMax(negativoY - 0.272*valorI - 0.647*valorQ);
                b = checkMinMax(negativoY - 1.106*valorI + 1.703*valorQ);

                pixel = (r << 16) | (g << 8) | b;
                img.setRGB(i, j, pixel);
            }
        }

        try {
            output = new File("C:\\silver-barnacle-master\\img\\negativo.jpg");
            ImageIO.write(img, "jpg", output);
            ImageIcon imagem = new ImageIcon(output.getAbsolutePath());
            foto.setIcon(new ImageIcon(imagem.getImage().getScaledInstance(foto.getWidth(), foto.getHeight(), Image.SCALE_DEFAULT)));

            foto.repaint();

            this.revalidate();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void btnBandaRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNegativoActionPerformed

        BufferedImage img = null;
        File input = null;
        File output = null;
        File maskText = null;

        try {
            input = this.arquivo;
            img = ImageIO.read(input);
            maskText = new File("C:\\silver-barnacle-master\\img\\mask.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }

        int width = img.getWidth();
        int height = img.getHeight();

        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                int pixel = img.getRGB(i, j);

                int r = 255 - (pixel >> 16) & 0xff;
                int g = 0;
                int b = 0;

                pixel = (r<<16) | (g << 8) | b;
                img.setRGB(i, j, pixel);
            }
        }

        try {
            output = new File("C:\\silver-barnacle-master\\img\\negativo.jpg");
            ImageIO.write(img, "jpg", output);
            ImageIcon imagem = new ImageIcon(output.getAbsolutePath());
            foto.setIcon(new ImageIcon(imagem.getImage().getScaledInstance(foto.getWidth(), foto.getHeight(), Image.SCALE_DEFAULT)));

            foto.repaint();

            this.revalidate();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void btnBandaGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNegativoActionPerformed

        BufferedImage img = null;
        File input = null;
        File output = null;
        File maskText = null;

        try {
            input = this.arquivo;
            img = ImageIO.read(input);
            maskText = new File("C:\\silver-barnacle-master\\img\\mask.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }



        int width = img.getWidth();
        int height = img.getHeight();

        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                int pixel = img.getRGB(i, j);

                int r = 0;
                int g = 255 - (pixel >> 8) & 0xff;
                int b = 0;

                pixel = (r << 16) | (g<<8) | b;
                img.setRGB(i, j, pixel);
            }
        }

        try {
            output = new File("C:\\silver-barnacle-master\\img\\negativo.jpg");
            ImageIO.write(img, "jpg", output);
            ImageIcon imagem = new ImageIcon(output.getAbsolutePath());
            foto.setIcon(new ImageIcon(imagem.getImage().getScaledInstance(foto.getWidth(), foto.getHeight(), Image.SCALE_DEFAULT)));

            foto.repaint();

            this.revalidate();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void btnBandaBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNegativoActionPerformed

        BufferedImage img = null;
        File input = null;
        File output = null;
        File maskText = null;

        try {
            input = this.arquivo;
            img = ImageIO.read(input);
            maskText = new File("C:\\silver-barnacle-master\\img\\mask.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }

        int width = img.getWidth();
        int height = img.getHeight();

        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                int pixel = img.getRGB(i, j);

                int r = 0;
                int g = 0;
                int b = 255 - pixel & 0xff;

                pixel = (r << 16) | (g << 8) | b;
                img.setRGB(i, j, pixel);
            }
        }

        try {
            output = new File("C:\\silver-barnacle-master\\img\\negativo.jpg");
            ImageIO.write(img, "jpg", output);
            ImageIcon imagem = new ImageIcon(output.getAbsolutePath());
            foto.setIcon(new ImageIcon(imagem.getImage().getScaledInstance(foto.getWidth(), foto.getHeight(), Image.SCALE_DEFAULT)));

            foto.repaint();

            this.revalidate();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    //System.out.println("asd");


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
            java.util.logging.Logger.getLogger(tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNegativo;
    private javax.swing.JButton btnNegativoR;
    private javax.swing.JButton btnNegativoG;
    private javax.swing.JButton btnNegativoB;
    private javax.swing.JButton btnNegativoY;
    private javax.swing.JButton btnBandaR;
    private javax.swing.JButton btnBandaG;
    private javax.swing.JButton btnBandaB;
    private javax.swing.JButton btnTrocarFoto;
    private javax.swing.JLabel foto;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
