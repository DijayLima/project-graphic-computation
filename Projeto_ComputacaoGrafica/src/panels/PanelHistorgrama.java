package panels;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;

import processamentodeimagens.EqualizarImagem;
import processamentodeimagens.HistogramaGrafico;

/**
 * Representa panel par aprocessar filtros em imagens
 *
 */
public class PanelHistorgrama extends javax.swing.JPanel {

    private static PanelHistorgrama instance;
    private static BufferedReader imagem;
    private BufferedImage imgT;
    private int[][] imagemMatriz;
    private int imgWidth;
    private int imgHeight;
    private int imgValorMaximo;

    public static synchronized PanelHistorgrama getInstance() {
        if (instance == null) {
            instance = new PanelHistorgrama();
        }
        return instance;
    }

    /**
     * Construtor
     */
    private PanelHistorgrama() {
        initComponents();
    }

    public void setTitle(String text) {
        lbTitle.setText(text);
    }

    public int[][] getImagemMatriz() {
        return imagemMatriz;
    }

    public void setImagemMatriz(int[][] imagemMatriz) {
        this.imagemMatriz = imagemMatriz;
    }

    public int getImgWidth() {
        return imgWidth;
    }

    public void setImgWidth(int imgWidth) {
        this.imgWidth = imgWidth;
    }

    public int getImgHeight() {
        return imgHeight;
    }

    public void setImgHeight(int imgHeight) {
        this.imgHeight = imgHeight;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupAlgoritmos = new javax.swing.ButtonGroup();
        jPanel4 = new javax.swing.JPanel();
        lbTitle = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        panelImgInput = new javax.swing.JPanel();
        panelHistogramaOri = new javax.swing.JPanel();
        btSelctImage = new javax.swing.JButton();
        panelImgEqualizada = new javax.swing.JPanel();
        panelHistogramaEqua = new javax.swing.JPanel();

        setMaximumSize(new java.awt.Dimension(240, 32767));
        setMinimumSize(new java.awt.Dimension(240, 0));
        setPreferredSize(new java.awt.Dimension(240, 779));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        lbTitle.setFont(new java.awt.Font("Tahoma", 1, 26)); // NOI18N
        lbTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitle.setText("Equaliza��o da imagem");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(lbTitle)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        panelImgInput.setBackground(new java.awt.Color(255, 255, 255));
        panelImgInput.setPreferredSize(new java.awt.Dimension(256, 256));

        javax.swing.GroupLayout panelImgInputLayout = new javax.swing.GroupLayout(panelImgInput);
        panelImgInput.setLayout(panelImgInputLayout);
        panelImgInputLayout.setHorizontalGroup(
            panelImgInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelImgInputLayout.setVerticalGroup(
            panelImgInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        panelHistogramaOri.setBackground(new java.awt.Color(255, 255, 255));
        panelHistogramaOri.setBorder(javax.swing.BorderFactory.createTitledBorder("Histograma da imagem original"));
        panelHistogramaOri.setPreferredSize(new java.awt.Dimension(300, 390));

        javax.swing.GroupLayout panelHistogramaOriLayout = new javax.swing.GroupLayout(panelHistogramaOri);
        panelHistogramaOri.setLayout(panelHistogramaOriLayout);
        panelHistogramaOriLayout.setHorizontalGroup(
            panelHistogramaOriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 244, Short.MAX_VALUE)
        );
        panelHistogramaOriLayout.setVerticalGroup(
            panelHistogramaOriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 233, Short.MAX_VALUE)
        );

        btSelctImage.setText("Selecionar Imagem");
        btSelctImage.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btSelctImage.setPreferredSize(new java.awt.Dimension(121, 30));
        btSelctImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectImage(evt);
            }
        });

        panelImgEqualizada.setBackground(new java.awt.Color(255, 255, 255));
        panelImgEqualizada.setBorder(javax.swing.BorderFactory.createTitledBorder("Imagem Equalizada"));
        panelImgEqualizada.setPreferredSize(new java.awt.Dimension(256, 256));

        javax.swing.GroupLayout panelImgEqualizadaLayout = new javax.swing.GroupLayout(panelImgEqualizada);
        panelImgEqualizada.setLayout(panelImgEqualizadaLayout);
        panelImgEqualizadaLayout.setHorizontalGroup(
            panelImgEqualizadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 244, Short.MAX_VALUE)
        );
        panelImgEqualizadaLayout.setVerticalGroup(
            panelImgEqualizadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 233, Short.MAX_VALUE)
        );

        panelHistogramaEqua.setBackground(new java.awt.Color(255, 255, 255));
        panelHistogramaEqua.setBorder(javax.swing.BorderFactory.createTitledBorder("Histograma da Imagem Equalizada"));
        panelHistogramaEqua.setPreferredSize(new java.awt.Dimension(256, 256));

        javax.swing.GroupLayout panelHistogramaEquaLayout = new javax.swing.GroupLayout(panelHistogramaEqua);
        panelHistogramaEqua.setLayout(panelHistogramaEquaLayout);
        panelHistogramaEquaLayout.setHorizontalGroup(
            panelHistogramaEquaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 244, Short.MAX_VALUE)
        );
        panelHistogramaEquaLayout.setVerticalGroup(
            panelHistogramaEquaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 233, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btSelctImage, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                    .addComponent(panelImgInput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(panelHistogramaOri, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(panelImgEqualizada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelHistogramaEqua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelHistogramaEqua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(panelHistogramaOri, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                            .addComponent(panelImgInput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btSelctImage, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panelImgEqualizada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(344, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void selectImage(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectImage
        try {
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setCurrentDirectory(new File("src/imagens"));
            FileNameExtensionFilter filter = new FileNameExtensionFilter("PGM Images", "pgm");
            fileChooser.setFileFilter(filter);

            int returnVal = fileChooser.showOpenDialog(btSelctImage);
            if (returnVal == JFileChooser.APPROVE_OPTION) {
                /**
                 * Coloca a imagem no panel e gera o histograma
                 */
                populaImgInPanel(criaImagem(fileChooser.getSelectedFile()), panelImgInput);
                
                HistogramaGrafico histogramaGrafico = new HistogramaGrafico(imagemMatriz, getImgWidth(), getImgHeight());

                int heigth = getImgHeight();
                if (heigth != 256) {
                    heigth = 256 - heigth;
                } else {
                    heigth = 0;
                }
                
                panelHistogramaOri.getGraphics().drawImage(histogramaGrafico.run(), 0, heigth, null);
                
                /**
                 * Equaliza a imagem, coloca no panel e gera o histograma
                 */
                int[][] imagemEqualizadaMatriz = new EqualizarImagem(imagemMatriz, getImgWidth(), getImgHeight()).run();
                populaImgInPanel(imagemEqualizadaMatriz, panelImgEqualizada);
                
                histogramaGrafico = new HistogramaGrafico(imagemEqualizadaMatriz, getImgWidth(), getImgHeight());
                panelHistogramaEqua.getGraphics().drawImage(histogramaGrafico.run(), 0, heigth, null);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "OPS! N�o foi possivel carregar a imagem.");
        }
    }//GEN-LAST:event_selectImage

    /**
     * Ler o arquivo pgm e monta a popula a matriz imagem
     *
     * @param file
     * @return
     */
    public int[][] criaImagem(File file) {
        FileInputStream fileInputStream = null;
        Scanner scan = null;
        try {
            fileInputStream = new FileInputStream(file);
            scan = new Scanner(fileInputStream);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(PanelHistorgrama.class.getName()).log(Level.SEVERE, null, ex);
        }

        // Descarta a primeira linha
        scan.nextLine();

        // Read pic width, height and max value
        imgWidth = scan.nextInt();
        imgHeight = scan.nextInt();
        imgValorMaximo = scan.nextInt();

        /**
         * Monta a matriz imagem com os pixels da imagem selecionada
         */
        imagemMatriz = new int[imgHeight][imgWidth];
        for (int row = 0; row < imgHeight; row++) {
            for (int col = 0; col < imgWidth; col++) {
                // Popula a matriz com os pixels da imagem
                imagemMatriz[row][col] = scan.nextInt();
            }
        }

        try {
            fileInputStream.close();
        } catch (IOException ex) {
            Logger.getLogger(PanelHistorgrama.class.getName()).log(Level.SEVERE, null, ex);
        }
        return imagemMatriz;
    }

    /**
     * Exibe a imagem no jPanel
     *
     * @param img
     * @param imgPanel
     */
    public void populaImgInPanel(int[][] img, JPanel imgPanel) {
        /**
         * Monta a matriz imagem com os pixels da imagem selecionada
         */
        BufferedImage imagemInput = new BufferedImage(imgWidth, imgHeight, BufferedImage.TYPE_INT_RGB);
        for (int row = 0; row < img.length; row++) {
            for (int col = 0; col < img[0].length; col++) {
                // Prepara a imagem para ser desenhada no jpanel
                imagemInput.setRGB(col, row, getCorPixel(img[row][col]));
            }
        }
        imgT = imagemInput;

        /**
         * Exibe a imagem no jpanel
         */
        imgPanel.getGraphics().drawImage(imagemInput, 0, 0, null);
    }

    /**
     * Retorna o valor em RGB de acordo com o valor do pixel
     *
     * @param corRGB
     * @return
     */
    private int getCorPixel(int corRGB) {
        return new Color(corRGB, corRGB, corRGB).getRGB();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btSelctImage;
    private javax.swing.ButtonGroup buttonGroupAlgoritmos;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    public javax.swing.JLabel lbTitle;
    private javax.swing.JPanel panelHistogramaEqua;
    private javax.swing.JPanel panelHistogramaOri;
    private javax.swing.JPanel panelImgEqualizada;
    private javax.swing.JPanel panelImgInput;
    // End of variables declaration//GEN-END:variables
}
