import javax.swing.*;
import java.awt.*;

public class Palette extends JFrame{
    private Vue po;
    class Vue extends JFrame{
        Vue(){
            Container c = this.getContentPane();
            JPanel panneauChoix = new JPanel();
            JPanel panneauColore = new JPanel();
            c.add (panneauChoix);
            GridLayout gg = new GridLayout(0,2);
            c.setLayout(gg);
            panneauChoix.setBackground(Color.GREEN);
            panneauColore.setBackground(Color.BLUE);
            c.add(panneauChoix);
            c.add(panneauColore);


            JSlider slider [] = new JSlider[3];
            slider[0] = new JSlider(JSlider.HORIZONTAL, 0, 100, 25);
            slider[1] = new JSlider(JSlider.HORIZONTAL, 0, 400, 25);
            slider[2] = new JSlider(JSlider.HORIZONTAL, 0, 800, 25);

            // Configurer le composant
            slider[0].setMaximum(100);
            slider[0].setMinimum(0);
            slider[0].setValue(30);
            slider[0].setPaintTicks(true);
            slider[0].setPaintLabels(true);
            slider[0].setMinorTickSpacing(5);
            slider[0].setMajorTickSpacing(25);

            // Utiliser le label numérique standard pour ce JSlider
            slider[0].setLabelTable(slider[0].createStandardLabels(10));
            panneauChoix.add(slider[0], BorderLayout.CENTER);
            panneauChoix.add(slider[1], BorderLayout.CENTER);
            panneauChoix.add(slider[2], BorderLayout.CENTER);
        }
    }
    public Palette(){
        po = new Vue();
        po.setTitle("Ca marche");
        po.setSize(600, 300);
        po.setLocationRelativeTo(null);
        po.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        po.setVisible(true);
    }
}
