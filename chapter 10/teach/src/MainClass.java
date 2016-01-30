import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class MainClass {

    public static void main(String[] args) throws IOException {
        String stringFile = "";
        String dataFile = "test.txt";
        String encriptedFile = "encripted.txt";
        BufferedReader inputFile = null;
        String encriptedWord = "";
        int key = 1;

        //Read from file to string
        try {
            inputFile = new BufferedReader(new FileReader(dataFile));
        } catch (FileNotFoundException e) {
            System.out.println("File \"" + dataFile + "\" not found");
            return;
        }
        List<String> list = new ArrayList<String>();
        try {
            while ((stringFile = inputFile.readLine()) != null)
                list.add(stringFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (String tmp : list) {
            stringFile = tmp;
        }
        System.out.println(stringFile);

        //Encripted string from file
        Caesar caesar = new Caesar();
        for (int i = 0; i < stringFile.length(); i++) {
            char c = stringFile.charAt(i);
            caesar.Caesar(c, key);
            c = caesar.encriptedChar;
            encriptedWord = encriptedWord + c;
        }
        System.out.println("Encripted word = " + encriptedWord);


     //Save encripted string to new file
        try(FileWriter writer = new FileWriter(encriptedFile, false))
        {
            writer.write(encriptedWord);
            writer.append('\n');
            writer.append('E');
            writer.flush();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }


    }
}

