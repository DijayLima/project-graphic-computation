package processamentodeimagens;

import java.awt.image.BufferedImage;

/**
 * Aplica a função transferência de intensidade geral.
 * 
 * @author Samuel Rufino
 */
public class IntensidadeGeral {

    private int[][] imagem;
    private int width;
    private int height;
    private int r;
    private int w;
    private float largura;

    /**
     * Construtor padrão.
     */
    public IntensidadeGeral(int[][] imagem, int width, int height, int w, int largura) {
        this.imagem = imagem;
        this.width = width;
        this.height = height;
        this.w = w;
        this.largura = largura;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public float getLargura() {
        return largura;
    }

    public void setLargura(int largura) {
        this.largura = largura;
    }

    public int getE() {
        return w;
    }

    public void setE(int w) {
        this.w = w;
    }

    /**
     * Aplica a função transferência de intensidade geral.
     */
    public BufferedImage run() {
        int matrizImagem[][] = new int[width][height];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                matrizImagem[i][j] = (int) (255 * (1 / (1 + Math.pow(Math.E, - ((imagem[i][j] - w) / largura)))));
            }
        }
        return Normalizacao.normalizaImage(matrizImagem);
    }
}