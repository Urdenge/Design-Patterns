package be.vdab.util;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class AdapVenster extends JFrame {
    private static final long serialVersionUID = 1L;

    public AdapVenster() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        addMouseListener(new MuisAdapter());
    }

    private class MuisAdapter extends MouseAdapter {

    @Override
    public void mouseClicked(MouseEvent event) {
        JOptionPane.showMessageDialog(AdapVenster.this, String.valueOf(event.getX()));
    }
    }
}