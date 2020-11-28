package panels;

import main.App;
import retas.Ponto;
import transformacoes.Imagem;
import transformacoes.Transformacoes2D;

import java.awt.HeadlessException;
import java.awt.geom.Rectangle2D;
import java.io.File;
import java.util.Stack;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

import auxiliares.TransformacoesEnum;

/**
 * Representa o menu para manipula��o das transforma��es de imagem.
 */
public final class PanelMenuImagem extends javax.swing.JPanel {

    private static PanelMenuImagem instance;
    public static Imagem imagem;
    public Stack<double[][]> listaDeTransformacoes;

    private Rectangle2D.Double rect;
    private double valorX, valorY; // usando na translacao, escala, cisalhamento
    private Ponto ponto;
    private double angulo; // usado na  rotacao
    private String eixo; // usado na reflexao

    private TransformacoesEnum tipoAlgoritimo;
    private final DefaultListModel<String> modelList;
    private int[][] imagemMatriz;

    public static synchronized PanelMenuImagem getInstance() {
        if (instance == null) {
            instance = new PanelMenuImagem();
        }
        return instance;
    }

    /**
     * Construtor
     */
    private PanelMenuImagem() {
        modelList = new DefaultListModel();
        listaDeTransformacoes = new Stack<>();

        initComponents();

        panelDados2.setVisible(false);
    }

    public Ponto getPonto() {
        return ponto;
    }

    public void setPonto(Ponto ponto) {
        this.ponto = ponto;
    }

    public double getValorX() {
        return valorX;
    }

    public void setValorX(double valorX) {
        this.valorX = valorX;
    }

    public double getValorY() {
        return valorY;
    }

    public void setValorY(double valorY) {
        this.valorY = valorY;
    }

    public double getAngulo() {
        return angulo;
    }

    public void setAngulo(double raio) {
        this.angulo = raio;
    }

    public Rectangle2D.Double getRect() {
        return rect;
    }

    public void setRect(Rectangle2D.Double rect) {
        this.rect = rect;
    }

    public String getEixo() {
        return eixo;
    }

    public void setEixo(String eixo) {
        this.eixo = eixo;
    }

    public TransformacoesEnum getTipoAlgoritimo() {
        return tipoAlgoritimo;
    }

    public void setTipoAlgoritimo(TransformacoesEnum tipoAlgoritimo) {
        this.tipoAlgoritimo = tipoAlgoritimo;
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
        buttonGroupReflexao = new javax.swing.ButtonGroup();
        buttonGroupObjetos = new javax.swing.ButtonGroup();
        jPanel4 = new javax.swing.JPanel();
        rbTranslacao = new javax.swing.JRadioButton();
        rbRotacao = new javax.swing.JRadioButton();
        rbEscala = new javax.swing.JRadioButton();
        rbReflexao = new javax.swing.JRadioButton();
        rbCisalhamento = new javax.swing.JRadioButton();
        btResolve = new javax.swing.JButton();
        panelDados1 = new javax.swing.JPanel();
        valorDado1 = new javax.swing.JSpinner();
        lbDado1 = new javax.swing.JLabel();
        lbDado2 = new javax.swing.JLabel();
        valorDado2 = new javax.swing.JSpinner();
        panelDados2 = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        panelObjeto = new javax.swing.JPanel();
        btSelctImage1 = new javax.swing.JButton();
        btSelctImage2 = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();

        setMaximumSize(new java.awt.Dimension(240, 779));
        setMinimumSize(new java.awt.Dimension(240, 779));
        setPreferredSize(new java.awt.Dimension(240, 779));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Tipos de Transforma��es"));

        buttonGroupAlgoritmos.add(rbTranslacao);
        rbTranslacao.setSelected(true);
        rbTranslacao.setText("Transla��o");
        rbTranslacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectedTransformacao(evt);
            }
        });

        buttonGroupAlgoritmos.add(rbRotacao);
        rbRotacao.setText("Rota��o");
        rbRotacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectedTransformacao(evt);
            }
        });

        buttonGroupAlgoritmos.add(rbEscala);
        rbEscala.setText("Escala");
        rbEscala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectedTransformacao(evt);
            }
        });

        buttonGroupAlgoritmos.add(rbReflexao);
        rbReflexao.setText("Reflex�o");
        rbReflexao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectedTransformacao(evt);
            }
        });

        buttonGroupAlgoritmos.add(rbCisalhamento);
        rbCisalhamento.setText("Cisalhamento");
        rbCisalhamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectedTransformacao(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbTranslacao)
                    .addComponent(rbRotacao)
                    .addComponent(rbEscala)
                    .addComponent(rbReflexao)
                    .addComponent(rbCisalhamento))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rbTranslacao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbEscala)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbRotacao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbReflexao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbCisalhamento))
        );

        btResolve.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btResolve.setText("Aplicar Transforma��o");
        btResolve.setPreferredSize(new java.awt.Dimension(61, 30));
        btResolve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aplicaTransformacao(evt);
            }
        });

        panelDados1.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados"));
        panelDados1.setMaximumSize(new java.awt.Dimension(220, 80));
        panelDados1.setMinimumSize(new java.awt.Dimension(220, 80));
        panelDados1.setPreferredSize(new java.awt.Dimension(220, 80));

        valorDado1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        valorDado1.setModel(new javax.swing.SpinnerNumberModel(0.0d, null, null, 1.0d));
        valorDado1.setMaximumSize(new java.awt.Dimension(30, 25));
        valorDado1.setMinimumSize(new java.awt.Dimension(30, 25));
        valorDado1.setPreferredSize(new java.awt.Dimension(30, 25));

        lbDado1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbDado1.setText("X");

        lbDado2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbDado2.setText("Y");

        valorDado2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        valorDado2.setModel(new javax.swing.SpinnerNumberModel(0.0d, null, null, 1.0d));
        valorDado2.setMaximumSize(new java.awt.Dimension(30, 25));
        valorDado2.setMinimumSize(new java.awt.Dimension(30, 25));
        valorDado2.setPreferredSize(new java.awt.Dimension(30, 25));

        javax.swing.GroupLayout panelDados1Layout = new javax.swing.GroupLayout(panelDados1);
        panelDados1.setLayout(panelDados1Layout);
        panelDados1Layout.setHorizontalGroup(
            panelDados1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDados1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(valorDado1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(27, 27, 27)
                .addComponent(valorDado2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
            .addGroup(panelDados1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(lbDado1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbDado2)
                .addGap(63, 63, 63))
        );
        panelDados1Layout.setVerticalGroup(
            panelDados1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDados1Layout.createSequentialGroup()
                .addGroup(panelDados1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbDado1)
                    .addComponent(lbDado2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDados1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(valorDado1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valorDado2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelDados2.setBorder(javax.swing.BorderFactory.createTitledBorder("Eixo"));

        buttonGroupReflexao.add(jRadioButton1);
        jRadioButton1.setSelected(true);
        jRadioButton1.setText("Reflex�o em X");

        buttonGroupReflexao.add(jRadioButton2);
        jRadioButton2.setText("Reflex�o em Y");

        buttonGroupReflexao.add(jRadioButton3);
        jRadioButton3.setText("Reflex�o em X e Y");

        javax.swing.GroupLayout panelDados2Layout = new javax.swing.GroupLayout(panelDados2);
        panelDados2.setLayout(panelDados2Layout);
        panelDados2Layout.setHorizontalGroup(
            panelDados2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDados2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDados2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2)
                    .addComponent(jRadioButton3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelDados2Layout.setVerticalGroup(
            panelDados2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDados2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jRadioButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jRadioButton3))
        );

        panelObjeto.setBorder(javax.swing.BorderFactory.createTitledBorder("Selecionar Imagem"));
        panelObjeto.setMaximumSize(new java.awt.Dimension(220, 106));

        btSelctImage1.setText("Selecionar Imagem");
        btSelctImage1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btSelctImage1.setPreferredSize(new java.awt.Dimension(121, 30));
        btSelctImage1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carregarImagem(evt);
            }
        });

        btSelctImage2.setText("Resetar Imagem");
        btSelctImage2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btSelctImage2.setPreferredSize(new java.awt.Dimension(121, 30));
        btSelctImage2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetarImagem(evt);
            }
        });

        javax.swing.GroupLayout panelObjetoLayout = new javax.swing.GroupLayout(panelObjeto);
        panelObjeto.setLayout(panelObjetoLayout);
        panelObjetoLayout.setHorizontalGroup(
            panelObjetoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelObjetoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelObjetoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btSelctImage1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btSelctImage2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelObjetoLayout.setVerticalGroup(
            panelObjetoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelObjetoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btSelctImage1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btSelctImage2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelObjeto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator3)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelDados2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btResolve, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelDados1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelObjeto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelDados1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelDados2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btResolve, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(251, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Aplica a transforma��o selecionada.
     *
     * @param evt
     */
    private void aplicaTransformacao(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aplicaTransformacao

        /**
         * Seta o tipo de algoritmo selecionado e seus parametros necess�rios
         */
        if (rbTranslacao.isSelected()) {
            setTipoAlgoritimo(TransformacoesEnum.TRANSLACAO);
            setValorX((double) valorDado1.getValue());
            setValorY((double) valorDado2.getValue());
        } else if (rbEscala.isSelected()) {
            setTipoAlgoritimo(TransformacoesEnum.ESCALA);
            setValorX((double) valorDado1.getValue());
            setValorY((double) valorDado2.getValue());

        } else if (rbRotacao.isSelected()) {
            setTipoAlgoritimo(TransformacoesEnum.ROTACAO);
            setAngulo((double) valorDado1.getValue());

        } else if (rbReflexao.isSelected()) {
            setTipoAlgoritimo(TransformacoesEnum.REFLEXAO);
            if (jRadioButton1.isSelected()) {
                setEixo("x");
            } else if (jRadioButton2.isSelected()) {
                setEixo("y");
            } else if (jRadioButton3.isSelected()) {
                setEixo("xy");
            }
        } else if (rbCisalhamento.isSelected()) {
            setTipoAlgoritimo(TransformacoesEnum.CISALHAMENTO);
            setValorX((double) valorDado1.getValue());
            setValorY((double) valorDado2.getValue());
        }

        if (imagem == null) {
            JOptionPane.showMessageDialog(this.getRootPane(), "N�o h� imagem no plano cartesiano!\nPor favor, selecione a imagem primeiro...", "Aplicar Transforma��o?", JOptionPane.WARNING_MESSAGE);
        } else {
            App.runResult(this);
        }
    }//GEN-LAST:event_aplicaTransformacao

    /**
     * Prepara o menu de acordo com o tipo de transforma��o selecionada
     *
     * @param evt
     */
    private void selectedTransformacao(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectedTransformacao
        panelDados1.setVisible(true);
        panelDados2.setVisible(false);

        valorDado1.setValue(0D);
        valorDado2.setValue(0D);

        if (rbRotacao.isSelected()) {
            lbDado1.setText("�ngulo");
            lbDado2.setVisible(false);
            valorDado2.setVisible(false);
        } else if (rbReflexao.isSelected()) {
            panelDados1.setVisible(false);
            panelDados2.setVisible(true);
        } else if (rbEscala.isSelected()) {
            valorDado1.setValue(1D);
            valorDado2.setValue(1D);
            lbDado1.setText("X");
            lbDado2.setVisible(true);
            valorDado2.setVisible(true);
        } else {
            lbDado1.setText("X");
            lbDado2.setVisible(true);
            valorDado2.setVisible(true);
        }
    }//GEN-LAST:event_selectedTransformacao

    private void carregarImagem(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carregarImagem
        try {
            JFileChooser file = new JFileChooser();
            file.setCurrentDirectory(new File("src/br/edu/uepb/cg/assets/images/"));
            FileNameExtensionFilter filter = new FileNameExtensionFilter("PGM Images", "pgm");
            file.setFileFilter(filter);

            int returnVal = file.showOpenDialog(btSelctImage1);
            if (returnVal == JFileChooser.APPROVE_OPTION) {
                imagem = Imagem.criaImagem(file.getSelectedFile());

                // seta a posição atual da imagem
                imagem.setPonto2D(0, 0);

                PanelPlanoCartesiano.getInstance().drawImage(imagem);
            }
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, "OPS! N�o foi possivel carregar a imagem.");
        }
    }//GEN-LAST:event_carregarImagem

    private void resetarImagem(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetarImagem
        PanelPlanoCartesiano.getInstance().drawImage(imagem);
    }//GEN-LAST:event_resetarImagem


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btResolve;
    private javax.swing.JButton btSelctImage1;
    private javax.swing.JButton btSelctImage2;
    private javax.swing.ButtonGroup buttonGroupAlgoritmos;
    private javax.swing.ButtonGroup buttonGroupObjetos;
    private javax.swing.ButtonGroup buttonGroupReflexao;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lbDado1;
    private javax.swing.JLabel lbDado2;
    private javax.swing.JPanel panelDados1;
    private javax.swing.JPanel panelDados2;
    private javax.swing.JPanel panelObjeto;
    private javax.swing.JRadioButton rbCisalhamento;
    private javax.swing.JRadioButton rbEscala;
    private javax.swing.JRadioButton rbReflexao;
    private javax.swing.JRadioButton rbRotacao;
    private javax.swing.JRadioButton rbTranslacao;
    private javax.swing.JSpinner valorDado1;
    private javax.swing.JSpinner valorDado2;
    // End of variables declaration//GEN-END:variables
}
