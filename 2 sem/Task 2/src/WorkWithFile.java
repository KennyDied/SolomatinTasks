import java.io.*;
import java.util.*;

public class WorkWithFile {

    public String[] fileToString(String nameFile) throws FileNotFoundException {
        FileReader fileReader = new FileReader(nameFile);
        Scanner scanFile = new Scanner(fileReader);
        List<String> listArray = new ArrayList<>();
        while (scanFile.hasNextLine()) {
            listArray.add(scanFile.nextLine());
        }
        return listArray.toArray(new String[0]);
    }

    public static MyLinkedList fileToMyLinkesList(String path) throws FileNotFoundException {
        FileReader fileReader = new FileReader(path);
        Scanner scanFile = new Scanner(fileReader);
        MyLinkedList list = new MyLinkedList();
        String[] numbers =  scanFile.nextLine().split(" ");
        for(int i = 0; i < numbers.length; i++){
            list.addLast(Integer.parseInt(numbers[i]));
        }
        return list;
    }

    public static void saveMyLinkedList(MyLinkedList list) throws IOException {
        FileWriter fileWriter = new FileWriter("./file.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        int counter = 0;

        for(Double value : list){
            bufferedWriter.write(value.toString());
            if(counter != list.size()){
                bufferedWriter.write(" ");
            }
            counter++;
        }

        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
