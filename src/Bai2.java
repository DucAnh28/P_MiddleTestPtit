import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Bai2 extends JFrame {

    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JLabel name;
    private JLabel age;
    private JLabel id;
    private JButton xuatFileButton;
    private JPanel baiTap2;

    void setXuatFileButton() {
        xuatFileButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String data = "Ten:" + textField1.getText() + " /Tuoi: " + textField2.getText() + " /Ma SV: " + textField3.getText();
                try {
                    FileWriter fileWriter = new FileWriter("sinhvien.txt");
                    BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                    bufferedWriter.write(data);
                    bufferedWriter.close();
                    fileWriter.close();
                } catch (IOException exception) {
                    System.err.println(exception.getMessage());
                }
            }
        });
    }

    public static void main(String[] args) {
        Bai2 baitap = new Bai2();
        baitap.setContentPane(baitap.baiTap2);
        baitap.setTitle("Bai 2");
        baitap.setSize(300, 300);
        baitap.setVisible(true);
        baitap.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        baitap.setXuatFileButton();
    }
}
