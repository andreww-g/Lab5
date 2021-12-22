import java.awt.*;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

public class App extends JFrame {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private Random r = new Random();
    float x = r.nextFloat();
    float y = r.nextFloat();
    float z = r.nextFloat();
    public JButton btnAdd1 = new JButton("Polygon");
    public JButton btnAdd2 = new JButton("Square");
    public JButton btnAdd3 = new JButton("Ellipse");
    public JButton btnAnimate = new JButton("Animate");

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    final App frame = new App();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public App() {
        this.setTitle("Figures");
        ImageIcon image = new ImageIcon("smile.png");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        setResizable(false);
        this.setIconImage(image.getImage());
        int ww = 470, wh = 310;

        setBounds((screen.width-ww)/2, (screen.height-wh)/2, ww, wh);
        contentPane = new JPanel();
        setContentPane(contentPane);
        contentPane.setLayout(null);

        AnimPanel kanwa = new AnimPanel();
        kanwa.setBounds(10, 11, 422, 219);
        contentPane.add(kanwa);
        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
                kanwa.initialize();
            }
        });


        btnAdd1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                kanwa.addPolygon();
            }
        });
        btnAdd1.setBounds(10, 239, 120, 23);
        contentPane.add(btnAdd1);



        btnAdd2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                kanwa.addSquare();
            }
        });
        btnAdd2.setBounds(145, 239, 80, 23);
        contentPane.add(btnAdd2);


        btnAdd3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                kanwa.addEllipse();
            }
        });
        btnAdd3.setBounds(240, 239, 80, 23);
        contentPane.add(btnAdd3);


        btnAnimate.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                kanwa.animate();
                String clickedButton = e.getActionCommand();
                System.out.println("Button " + clickedButton + " clicked");

            }

        });
        btnAnimate.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                btnAnimate.setBackground(Color.GREEN);
            }

            @Override
            public void mousePressed(MouseEvent e) {
                btnAnimate.setBackground(Color.GREEN);
            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {
                btnAnimate.setBackground(null);
            }

        });
        btnAdd1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == btnAdd1) {
                    btnAdd1.setBackground(new Color(x,y,z));
                }

            }
        });
        btnAdd2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == btnAdd2) {
                    btnAdd2.setBackground(new Color(x,y,z));
                }

            }
        });
        btnAdd3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == btnAdd3) {
                    btnAdd3.setBackground(new Color(x,y,z));
                }

            }
        });
        btnAnimate.setBounds(335, 239, 100, 23);
        contentPane.add(btnAnimate);

    }



    }


