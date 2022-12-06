import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Bai1 extends JFrame{
    private JPanel Bai1;
    private JLabel tuSo;
    private JTextField tuSoField;
    private JLabel mauSo;
    private JTextField mauSoField;
    private JLabel hienThi;

    void setBai1(){
        mauSoField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (mauSoField.getText().equals("0")){
                    hienThi.setText("Mau so khong the la 0");
                }
                else hienThi.setText("OK");
            }
        });
    }

    public static void main(String[] args) {
        Bai1 bai  = new Bai1();
        bai.setContentPane(bai.Bai1);
        bai.setTitle("Bai 1");
        bai.setSize(300,300);
        bai.setVisible(true);
        bai.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        bai.setBai1();
    }
}
