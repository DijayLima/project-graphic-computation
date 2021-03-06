/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package computacaografica.filtros;

/**
 *
 * @author jouwee
 */
public class FiltroReducao extends FiltroTodosPixeis implements FiltroLimiarizado {

    private ThresholdRange thresholdRange;
    private Threshold threshold;
    
    
    public FiltroReducao() {
        super(3);
        threshold = new Threshold(0);
        thresholdRange = new ThresholdRange(-255, 255);
    }

    
    
    @Override
    public int calcula(int[][] pixels) {
        int maior = thresholdRange.getFloor();
        for (int i = 0; i < getTamanho(); i++) {
            for (int j = 0; j < getTamanho(); j++) {
                int r = pixels[i][j] + threshold.getThreshold();
                if(r > maior) {
                    maior = r;
                }
            }
        }
        return maior;
    }

    @Override
    public Threshold getThreshold() {
        return threshold;
    }

    @Override
    public void setThreshold(Threshold threshold) {
        this.threshold = threshold;
    }

    @Override
    public ThresholdRange getThresholdRange() {
        return thresholdRange;
    }
    
}
