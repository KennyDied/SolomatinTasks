package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.company.tests.TestHashMapJava;
import com.company.tests.TestMyHashMap;
import com.company.tests.TestMyTreeMap;
import com.company.tests.TestTreeMapJava;

import org.jfree.chart.ChartPanel;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

import static demo.NormalDistributionDemo2.createChart;

public class VisualiseMapCompare extends JDialog{
    private JComboBox boxOfDataType;

    private JComboBox boxOfActions;
    private JComboBox boxOfRealisationType;
    private JButton buttonComplete;
    private JScrollPane scrollChartArea;
    private JPanel chartArea;
    private JPanel contentPane;

    private JTextField inputLenOfKey;

    private XYSeriesCollection series = new XYSeriesCollection();
    public VisualiseMapCompare(){
        setContentPane(contentPane);
        setModal(true);

        ChartPanel panel = new ChartPanel(createChart(series));
        panel.setBorder(BorderFactory.createEmptyBorder(15,15,15,15));
        panel.setBackground(Color.white);
        chartArea.setLayout(new FlowLayout());
        chartArea.add(panel);




        boxOfDataType.addItem("Integer");
        boxOfDataType.addItem("Double");


        boxOfActions.addItem("Add");
        boxOfActions.addItem("Search");
        boxOfActions.addItem("Delete");
        boxOfActions.addItem("Add and delete");
        boxOfActions.addItem("Delete and Add");

        boxOfRealisationType.addItem("HashMap Java");
        boxOfRealisationType.addItem("TreeMap Java");
        boxOfRealisationType.addItem("My HashMap");
        boxOfRealisationType.addItem("My TreeMap");


        buttonComplete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                series.removeAllSeries();
                int lenOfKey = Integer.parseInt(inputLenOfKey.getText());
                int countOfEl[] = {100, 500, 1000, 1500, 2000, 2500, 3000, 3500, 4000, 4500, 5000};
                MapInfo exp;


                switch (boxOfActions.getSelectedItem().toString()){
                    case "Add":
                        //копировать
                        switch (boxOfRealisationType.getSelectedItem().toString()){
                            case "HashMap Java":
                                if (boxOfDataType.getSelectedItem() == "Integer"){
                                    XYSeries s = new XYSeries("HashMapJava");
                                    for (int i = 0; i < countOfEl.length; i++) {
                                        exp = TestHashMapJava.addInfo(Generator.makeKey(lenOfKey, countOfEl[i]), Generator.makeValueInt(countOfEl[i]));;
                                        s.add(exp.getTimeMs(), countOfEl[i]);
                                    }
                                    series.addSeries(s);
                                } else {
                                    XYSeries s = new XYSeries("HashMapJava");
                                    for (int i = 0; i < countOfEl.length; i++) {
                                        exp = TestHashMapJava.addInfo(Generator.makeKey(lenOfKey, countOfEl[i]), Generator.makeValueDouble(countOfEl[i]));
                                        s.add(exp.getTimeMs(), countOfEl[i]);
                                    }
                                    series.addSeries(s);

                                }
                                break;
                            case "TreeMap Java":
                                if (boxOfDataType.getSelectedItem() == "Integer"){
                                    XYSeries s = new XYSeries("TreeMapJava");
                                    for (int i = 0; i < countOfEl.length; i++) {
                                        exp = TestTreeMapJava.addInfo(Generator.makeKey(lenOfKey, countOfEl[i]), Generator.makeValueInt(countOfEl[i]));
                                        s.add(exp.getTimeMs(), countOfEl[i]);
                                    }
                                    series.addSeries(s);

                                } else {
                                    XYSeries s = new XYSeries("TreeMapJava");
                                    for (int i = 0; i < countOfEl.length; i++) {
                                        exp = TestTreeMapJava.addInfo(Generator.makeKey(lenOfKey, countOfEl[i]), Generator.makeValueDouble(countOfEl[i]));
                                        s.add(exp.getTimeMs(), countOfEl[i]);
                                    }
                                    series.addSeries(s);

                                }
                                break;
                            case "My HashMap":
                                if (boxOfDataType.getSelectedItem() == "Integer"){
                                    XYSeries s = new XYSeries("TreeMapJava");
                                    for (int i = 0; i < countOfEl.length; i++) {
                                        exp = TestMyHashMap.addInfo(Generator.makeKey(lenOfKey, countOfEl[i]), Generator.makeValueInt(countOfEl[i]));
                                        s.add(exp.getTimeMs(), countOfEl[i]);
                                    }
                                    series.addSeries(s);
                                } else {
                                    XYSeries s = new XYSeries("TreeMapJava");
                                    for (int i = 0; i < countOfEl.length; i++) {
                                        exp = TestMyHashMap.addInfo(Generator.makeKey(lenOfKey, countOfEl[i]), Generator.makeValueDouble(countOfEl[i]));
                                        s.add(exp.getTimeMs(), countOfEl[i]);
                                    }
                                    series.addSeries(s);                                }
                                break;
                            case "My TreeMap":
                                if (boxOfDataType.getSelectedItem() == "Integer"){
                                    XYSeries s = new XYSeries("TreeMapJava");
                                    for (int i = 0; i < countOfEl.length; i++) {
                                        exp = TestMyTreeMap.addInfo(Generator.makeKey(lenOfKey, countOfEl[i]), Generator.makeValueInt(countOfEl[i]));
                                        s.add(exp.getTimeMs(), countOfEl[i]);
                                    }
                                    series.addSeries(s);
                                } else {
                                    XYSeries s = new XYSeries("TreeMapJava");
                                    for (int i = 0; i < countOfEl.length; i++) {
                                        exp = TestMyTreeMap.addInfo(Generator.makeKey(lenOfKey, countOfEl[i]), Generator.makeValueDouble(countOfEl[i]));
                                        s.add(exp.getTimeMs(), countOfEl[i]);
                                    }
                                    series.addSeries(s);                                }
                                break;
                        }
                        //копировать
                        break;

                    case "Search":
                        //копировать
                        switch (boxOfRealisationType.getSelectedItem().toString()){
                            case "HashMap Java":
                                if (boxOfDataType.getSelectedItem() == "Integer"){
                                    XYSeries s = new XYSeries("HashMapJava");
                                    for (int i = 0; i < countOfEl.length; i++) {
                                        exp = TestHashMapJava.findInfo(Generator.makeKey(lenOfKey, countOfEl[i]), Generator.makeValueInt(countOfEl[i]));
                                        s.add(exp.getTimeMs(), countOfEl[i]);
                                    }
                                    series.addSeries(s);
                                } else {
                                    XYSeries s = new XYSeries("HashMapJava");
                                    for (int i = 0; i < countOfEl.length; i++) {
                                        exp = TestHashMapJava.findInfo(Generator.makeKey(lenOfKey, countOfEl[i]), Generator.makeValueDouble(countOfEl[i]));
                                        s.add(exp.getTimeMs(), countOfEl[i]);
                                    }
                                    series.addSeries(s);

                                }
                                break;
                            case "TreeMap Java":
                                if (boxOfDataType.getSelectedItem() == "Integer"){
                                    XYSeries s = new XYSeries("TreeMapJava");
                                    for (int i = 0; i < countOfEl.length; i++) {
                                        exp = TestTreeMapJava.findInfo(Generator.makeKey(lenOfKey, countOfEl[i]), Generator.makeValueInt(countOfEl[i]));
                                        s.add(exp.getTimeMs(), countOfEl[i]);
                                    }
                                    series.addSeries(s);

                                } else {
                                    XYSeries s = new XYSeries("TreeMapJava");
                                    for (int i = 0; i < countOfEl.length; i++) {
                                        exp = TestTreeMapJava.findInfo(Generator.makeKey(lenOfKey, countOfEl[i]), Generator.makeValueDouble(countOfEl[i]));
                                        s.add(exp.getTimeMs(), countOfEl[i]);
                                    }
                                    series.addSeries(s);

                                }
                                break;
                            case "My HashMap":
                                if (boxOfDataType.getSelectedItem() == "Integer"){
                                    XYSeries s = new XYSeries("TreeMapJava");
                                    for (int i = 0; i < countOfEl.length; i++) {
                                        exp = TestMyHashMap.findInfo(Generator.makeKey(lenOfKey, countOfEl[i]), Generator.makeValueInt(countOfEl[i]));
                                        s.add(exp.getTimeMs(), countOfEl[i]);
                                    }
                                    series.addSeries(s);
                                } else {
                                    XYSeries s = new XYSeries("TreeMapJava");
                                    for (int i = 0; i < countOfEl.length; i++) {
                                        exp = TestMyHashMap.findInfo(Generator.makeKey(lenOfKey, countOfEl[i]), Generator.makeValueDouble(countOfEl[i]));
                                        s.add(exp.getTimeMs(), countOfEl[i]);
                                    }
                                    series.addSeries(s);                                }
                                break;
                            case "My TreeMap":
                                if (boxOfDataType.getSelectedItem() == "Integer"){
                                    XYSeries s = new XYSeries("TreeMapJava");
                                    for (int i = 0; i < countOfEl.length; i++) {
                                        exp = TestMyTreeMap.findInfo(Generator.makeKey(lenOfKey, countOfEl[i]), Generator.makeValueInt(countOfEl[i]));
                                        s.add(exp.getTimeMs(), countOfEl[i]);
                                    }
                                    series.addSeries(s);
                                } else {
                                    XYSeries s = new XYSeries("TreeMapJava");
                                    for (int i = 0; i < countOfEl.length; i++) {
                                        exp = TestMyTreeMap.findInfo(Generator.makeKey(lenOfKey, countOfEl[i]), Generator.makeValueDouble(countOfEl[i]));
                                        s.add(exp.getTimeMs(), countOfEl[i]);
                                    }
                                    series.addSeries(s);                                }
                                break;
                        }
                        //копировать
                        break;
                    case "Delete":
                        //копировать
                        switch (boxOfRealisationType.getSelectedItem().toString()){
                            case "HashMap Java":
                                if (boxOfDataType.getSelectedItem() == "Integer"){
                                    XYSeries s = new XYSeries("HashMapJava");
                                    for (int i = 0; i < countOfEl.length; i++) {
                                        exp = TestHashMapJava.deleteInfo(Generator.makeKey(lenOfKey, countOfEl[i]), Generator.makeValueInt(countOfEl[i]));
                                        s.add(exp.getTimeMs(), countOfEl[i]);
                                    }
                                    series.addSeries(s);
                                } else {
                                    XYSeries s = new XYSeries("HashMapJava");
                                    for (int i = 0; i < countOfEl.length; i++) {
                                        exp = TestHashMapJava.deleteInfo(Generator.makeKey(lenOfKey, countOfEl[i]), Generator.makeValueDouble(countOfEl[i]));
                                        s.add(exp.getTimeMs(), countOfEl[i]);
                                    }
                                    series.addSeries(s);

                                }
                                break;
                            case "TreeMap Java":
                                if (boxOfDataType.getSelectedItem() == "Integer"){
                                    XYSeries s = new XYSeries("TreeMapJava");
                                    for (int i = 0; i < countOfEl.length; i++) {
                                        exp = TestTreeMapJava.deleteInfo(Generator.makeKey(lenOfKey, countOfEl[i]), Generator.makeValueInt(countOfEl[i]));
                                        s.add(exp.getTimeMs(), countOfEl[i]);
                                    }
                                    series.addSeries(s);

                                } else {
                                    XYSeries s = new XYSeries("TreeMapJava");
                                    for (int i = 0; i < countOfEl.length; i++) {
                                        exp = TestTreeMapJava.deleteInfo(Generator.makeKey(lenOfKey, countOfEl[i]), Generator.makeValueDouble(countOfEl[i]));
                                        s.add(exp.getTimeMs(), countOfEl[i]);
                                    }
                                    series.addSeries(s);

                                }
                                break;
                            case "My HashMap":
                                if (boxOfDataType.getSelectedItem() == "Integer"){
                                    XYSeries s = new XYSeries("TreeMapJava");
                                    for (int i = 0; i < countOfEl.length; i++) {
                                        exp = TestMyHashMap.deleteInfo(Generator.makeKey(lenOfKey, countOfEl[i]), Generator.makeValueInt(countOfEl[i]));
                                        s.add(exp.getTimeMs(), countOfEl[i]);
                                    }
                                    series.addSeries(s);
                                } else {
                                    XYSeries s = new XYSeries("TreeMapJava");
                                    for (int i = 0; i < countOfEl.length; i++) {
                                        exp = TestMyHashMap.deleteInfo(Generator.makeKey(lenOfKey, countOfEl[i]), Generator.makeValueDouble(countOfEl[i]));
                                        s.add(exp.getTimeMs(), countOfEl[i]);
                                    }
                                    series.addSeries(s);                                }
                                break;
                            case "My TreeMap":
                                if (boxOfDataType.getSelectedItem() == "Integer"){
                                    XYSeries s = new XYSeries("TreeMapJava");
                                    for (int i = 0; i < countOfEl.length; i++) {
                                        exp = TestMyTreeMap.deleteInfo(Generator.makeKey(lenOfKey, countOfEl[i]), Generator.makeValueInt(countOfEl[i]));
                                        s.add(exp.getTimeMs(), countOfEl[i]);
                                    }
                                    series.addSeries(s);
                                } else {
                                    XYSeries s = new XYSeries("TreeMapJava");
                                    for (int i = 0; i < countOfEl.length; i++) {
                                        exp = TestMyTreeMap.deleteInfo(Generator.makeKey(lenOfKey, countOfEl[i]), Generator.makeValueDouble(countOfEl[i]));
                                        s.add(exp.getTimeMs(), countOfEl[i]);
                                    }
                                    series.addSeries(s);                                }
                                break;
                        }
                        //копировать
                        break;
                    case "Add and delete":
                        //копировать
                        switch (boxOfRealisationType.getSelectedItem().toString()){
                            case "HashMap Java":
                                if (boxOfDataType.getSelectedItem() == "Integer"){
                                    XYSeries s = new XYSeries("HashMapJava");
                                    for (int i = 0; i < countOfEl.length; i++) {
                                        exp = TestHashMapJava.addDeleteInfo(Generator.makeKey(lenOfKey, countOfEl[i]), Generator.makeValueInt(countOfEl[i]));
                                        s.add(exp.getTimeMs(), countOfEl[i]);
                                    }
                                    series.addSeries(s);
                                } else {
                                    XYSeries s = new XYSeries("HashMapJava");
                                    for (int i = 0; i < countOfEl.length; i++) {
                                        exp = TestHashMapJava.addDeleteInfo(Generator.makeKey(lenOfKey, countOfEl[i]), Generator.makeValueDouble(countOfEl[i]));
                                        s.add(exp.getTimeMs(), countOfEl[i]);
                                    }
                                    series.addSeries(s);

                                }
                                break;
                            case "TreeMap Java":
                                if (boxOfDataType.getSelectedItem() == "Integer"){
                                    XYSeries s = new XYSeries("TreeMapJava");
                                    for (int i = 0; i < countOfEl.length; i++) {
                                        exp = TestTreeMapJava.addDeleteInfo(Generator.makeKey(lenOfKey, countOfEl[i]), Generator.makeValueInt(countOfEl[i]));
                                        s.add(exp.getTimeMs(), countOfEl[i]);
                                    }
                                    series.addSeries(s);

                                } else {
                                    XYSeries s = new XYSeries("TreeMapJava");
                                    for (int i = 0; i < countOfEl.length; i++) {
                                        exp = TestTreeMapJava.addDeleteInfo(Generator.makeKey(lenOfKey, countOfEl[i]), Generator.makeValueDouble(countOfEl[i]));
                                        s.add(exp.getTimeMs(), countOfEl[i]);
                                    }
                                    series.addSeries(s);

                                }
                                break;
                            case "My HashMap":
                                if (boxOfDataType.getSelectedItem() == "Integer"){
                                    XYSeries s = new XYSeries("TreeMapJava");
                                    for (int i = 0; i < countOfEl.length; i++) {
                                        exp = TestMyHashMap.addDeleteInfo(Generator.makeKey(lenOfKey, countOfEl[i]), Generator.makeValueInt(countOfEl[i]));
                                        s.add(exp.getTimeMs(), countOfEl[i]);
                                    }
                                    series.addSeries(s);
                                } else {
                                    XYSeries s = new XYSeries("TreeMapJava");
                                    for (int i = 0; i < countOfEl.length; i++) {
                                        exp = TestMyHashMap.addDeleteInfo(Generator.makeKey(lenOfKey, countOfEl[i]), Generator.makeValueDouble(countOfEl[i]));
                                        s.add(exp.getTimeMs(), countOfEl[i]);
                                    }
                                    series.addSeries(s);                                }
                                break;
                            case "My TreeMap":
                                if (boxOfDataType.getSelectedItem() == "Integer"){
                                    XYSeries s = new XYSeries("TreeMapJava");
                                    for (int i = 0; i < countOfEl.length; i++) {
                                        exp = TestMyTreeMap.addDeleteInfo(Generator.makeKey(lenOfKey, countOfEl[i]), Generator.makeValueInt(countOfEl[i]));
                                        s.add(exp.getTimeMs(), countOfEl[i]);
                                    }
                                    series.addSeries(s);
                                } else {
                                    XYSeries s = new XYSeries("TreeMapJava");
                                    for (int i = 0; i < countOfEl.length; i++) {
                                        exp = TestMyTreeMap.addDeleteInfo(Generator.makeKey(lenOfKey, countOfEl[i]), Generator.makeValueDouble(countOfEl[i]));
                                        s.add(exp.getTimeMs(), countOfEl[i]);
                                    }
                                    series.addSeries(s);                                }
                                break;
                        }
                        //копировать
                        break;
                    case "Delete and Add":
                        //копировать
                        switch (boxOfRealisationType.getSelectedItem().toString()){
                            case "HashMap Java":
                                if (boxOfDataType.getSelectedItem() == "Integer"){
                                    XYSeries s = new XYSeries("HashMapJava");
                                    for (int i = 0; i < countOfEl.length; i++) {
                                        exp = TestHashMapJava.deleteAddInfo(Generator.makeKey(lenOfKey, countOfEl[i]), Generator.makeValueInt(countOfEl[i]));
                                        s.add(exp.getTimeMs(), countOfEl[i]);
                                    }
                                    series.addSeries(s);
                                } else {
                                    XYSeries s = new XYSeries("HashMapJava");
                                    for (int i = 0; i < countOfEl.length; i++) {
                                        exp = TestHashMapJava.deleteAddInfo(Generator.makeKey(lenOfKey, countOfEl[i]), Generator.makeValueDouble(countOfEl[i]));
                                        s.add(exp.getTimeMs(), countOfEl[i]);
                                    }
                                    series.addSeries(s);

                                }
                                break;
                            case "TreeMap Java":
                                if (boxOfDataType.getSelectedItem() == "Integer"){
                                    XYSeries s = new XYSeries("TreeMapJava");
                                    for (int i = 0; i < countOfEl.length; i++) {
                                        exp = TestTreeMapJava.deleteAddInfo(Generator.makeKey(lenOfKey, countOfEl[i]), Generator.makeValueInt(countOfEl[i]));
                                        s.add(exp.getTimeMs(), countOfEl[i]);
                                    }
                                    series.addSeries(s);

                                } else {
                                    XYSeries s = new XYSeries("TreeMapJava");
                                    for (int i = 0; i < countOfEl.length; i++) {
                                        exp = TestTreeMapJava.deleteAddInfo(Generator.makeKey(lenOfKey, countOfEl[i]), Generator.makeValueDouble(countOfEl[i]));
                                        s.add(exp.getTimeMs(), countOfEl[i]);
                                    }
                                    series.addSeries(s);

                                }
                                break;
                            case "My HashMap":
                                if (boxOfDataType.getSelectedItem() == "Integer"){
                                    XYSeries s = new XYSeries("TreeMapJava");
                                    for (int i = 0; i < countOfEl.length; i++) {
                                        exp = TestMyHashMap.deleteAddInfo(Generator.makeKey(lenOfKey, countOfEl[i]), Generator.makeValueInt(countOfEl[i]));
                                        s.add(exp.getTimeMs(), countOfEl[i]);
                                    }
                                    series.addSeries(s);
                                } else {
                                    XYSeries s = new XYSeries("TreeMapJava");
                                    for (int i = 0; i < countOfEl.length; i++) {
                                        exp = TestMyHashMap.deleteAddInfo(Generator.makeKey(lenOfKey, countOfEl[i]), Generator.makeValueDouble(countOfEl[i]));
                                        s.add(exp.getTimeMs(), countOfEl[i]);
                                    }
                                    series.addSeries(s);                                }
                                break;
                            case "My TreeMap":
                                if (boxOfDataType.getSelectedItem() == "Integer"){
                                    XYSeries s = new XYSeries("TreeMapJava");
                                    for (int i = 0; i < countOfEl.length; i++) {
                                        exp = TestMyTreeMap.deleteAddInfo(Generator.makeKey(lenOfKey, countOfEl[i]), Generator.makeValueInt(countOfEl[i]));
                                        s.add(exp.getTimeMs(), countOfEl[i]);
                                    }
                                    series.addSeries(s);
                                } else {
                                    XYSeries s = new XYSeries("TreeMapJava");
                                    for (int i = 0; i < countOfEl.length; i++) {
                                        exp = TestMyTreeMap.deleteAddInfo(Generator.makeKey(lenOfKey, countOfEl[i]), Generator.makeValueDouble(countOfEl[i]));
                                        s.add(exp.getTimeMs(), countOfEl[i]);
                                    }
                                    series.addSeries(s);
                                }
                                    break;
                        }
                        //копировать
                        break;

                }

            }
        });




    }
}

