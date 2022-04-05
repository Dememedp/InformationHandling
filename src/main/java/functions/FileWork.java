package functions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FileWork {
    private ArrayList<String> str = new ArrayList<>();
    private ArrayList<Character> text = new ArrayList<>();

    public void openFile(String filePath){
        try(BufferedReader br = new BufferedReader(new FileReader(filePath)))
        {
            String s;
            while((s=br.readLine()) != null){
                str.add(s);
            }
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }

        try(BufferedReader br = new BufferedReader (new FileReader(filePath)))
        {
            int c;
            while((c=br.read())!=-1){
                text.add((char)c);
            }
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }

    public ArrayList<Character> getText(){
        openFile("src/main/resources/text.txt");
        return text;
    }
}
