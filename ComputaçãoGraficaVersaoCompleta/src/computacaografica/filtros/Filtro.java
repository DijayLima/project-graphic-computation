/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package computacaografica.filtros;

import computacaografica.Imagem;

/**
 *
 * @author jouwee
 */
public abstract class Filtro extends GenericFiltro {
    
    public Filtro(int tamanho) {
        super(tamanho);
    }
    
    /**
     * 
     * @param pixels
     * @return 
     */
    public abstract int calcula(int[][] pixels);
    
    /**
     * 
     * @param imagem 
     * @return  
     */
    @Override
    public Imagem aplica(Imagem imagem) {

        Imagem novaImagem = new Imagem(imagem.getWidth(), imagem.getHeight());
        
        int metadeTamanho = (int) Math.floor((float)getTamanho() / 2);
        
        for(int x = metadeTamanho; x < imagem.getWidth() - metadeTamanho; x++) {
            for(int y = metadeTamanho; y < imagem.getHeight() - metadeTamanho; y++) {
                int[][] pixels = new int[getTamanho()][getTamanho()];
                
                for(int x2 = 0; x2 < getTamanho(); x2++) {
                    for(int y2 = 0; y2 < getTamanho(); y2++) {
                        pixels[x2][y2] = imagem.getPixel(x + x2 - metadeTamanho, y + y2 - metadeTamanho);
                    }
                }
                
                novaImagem.setPixel(x, y, Math.max(Math.min(calcula(pixels), 255), 0));
            }
        }
        return novaImagem;
        
        
    }

    
}
