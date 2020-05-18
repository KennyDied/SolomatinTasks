import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class MainFrame extends JFrame{
    private JTable inputTable;
    private JPanel mainPanel;
    private JButton sumButton;
    private JButton saveButton;
    private JButton openButton;
    private JLabel numberMaximum;
    private JLabel amount;
    private JLabel numberMinimum;

    private MyLinkedList list;

    public MainFrame(){
        this.setTitle("Task 2");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
        this.add(mainPanel);
        setMinimumSize(new Dimension(500,500));
        JTableUtils.initJTableForArray(inputTable,30,true,true,false,true);
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    WorkWithFile.saveMyLinkedList(list);
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null,"Ошибка сохранения файла", "Output",JOptionPane.PLAIN_MESSAGE);
                }
            }
        });
        openButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser();
                int ret = fileChooser.showDialog(null,"Открыть файл");
                if(ret == JFileChooser.APPROVE_OPTION){
                    File file = fileChooser.getSelectedFile();
                    String path = file.getPath();
                    try {
                        list = WorkWithFile.fileToMyLinkesList(path);
                        JTableUtils.writeMyLinkedListToJTable(inputTable,list);
                    } catch (FileNotFoundException | NumberFormatException ex) {
                        JOptionPane.showMessageDialog(null,"Ошибка загрузки файла", "Output",JOptionPane.PLAIN_MESSAGE);
                    }
                }
            }
        });
        sumButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                list = JTableUtils.readMyLinkedListToJTable(inputTable);

                int[] result = list.MinMaxResult();

                numberMinimum.setText("Min: " + result[1]);
                numberMaximum.setText("Max: " + result[2]);
                amount.setText("Sum: " + result[0]);
            }
        });
    }
}
