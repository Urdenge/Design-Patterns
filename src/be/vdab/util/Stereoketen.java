package be.vdab.util;

import be.vdab.StereoCDspeler;
import be.vdab.StereoEqualizer;
import be.vdab.StereoGeluidsbron;
import be.vdab.StereoRadio;
import be.vdab.StereoVersterker;

public class Stereoketen {

    private StereoVersterker versterker = new StereoVersterker();
    private StereoEqualizer equalizer = new StereoEqualizer();
    private StereoRadio radio = new StereoRadio();
    private StereoCDspeler cdSpeler = new StereoCDspeler();
    private StereoGeluidsbron huidigeGeluidsbron;
    private boolean gestart;

    public void start() {
        versterker.start();
        equalizer.start();
        if (huidigeGeluidsbron != null) {
            huidigeGeluidsbron.start();
        }
        gestart = true;
    }
    
    public void stop() {
        versterker.stop();
        equalizer.stop();
        if (huidigeGeluidsbron != null) {
            huidigeGeluidsbron.stop();
            }
        gestart = false;
        }
    
    public void startRadio() {
        if (gestart) {
            if (huidigeGeluidsbron != null) {
                huidigeGeluidsbron.stop();
            }
            radio.start();
            huidigeGeluidsbron = radio;
        }
    }
    
    public void startCDSpeler() {
        if (gestart) {
            if (huidigeGeluidsbron != null) {
                huidigeGeluidsbron.stop();
            }
            cdSpeler.start();
            huidigeGeluidsbron = cdSpeler;
        }
    }
}