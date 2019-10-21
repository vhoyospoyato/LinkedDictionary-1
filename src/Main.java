import java.io.*;
import java.util.Collections;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) throws IOException {
        File file = new File("unsorteddict.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        LinkedList<String> dictionary = new LinkedList<String>();
        String line;

        while ((line = br.readLine()) != null) {
            dictionary.add(line);
        }
        System.out.println(dictionary.getLast());

        Collections.sort(dictionary);
        FileWriter fr = new FileWriter("sortededdict.txt");
        fr.write(dictionary.toString());


    }
}
