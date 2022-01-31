package JavaAssignments.Assignment11;
import java.io.*;
import java.util.*;
public class Assignment11 {
    private HashMap<Character,Integer> wordFreq;
    FileReader filereader;
    FileWriter filewriter;
    Assignment11()
    {
        wordFreq=new HashMap<Character,Integer>();
    }
    public void getFrequency(String filepath)  {
        try
        {
            File file=new File(filepath);
            filereader = new FileReader(file);

            int content;
            while ((content = filereader.read()) != -1)
            {
                char currChar=(char) content;
                if(wordFreq.containsKey(currChar))
                {
                    int freq=wordFreq.get(currChar);
                    wordFreq.put(currChar,freq+1);
                }
                else
                {
                    wordFreq.put(currChar,1);
                }
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
    public void savingResultsIntoFile(String filepath){
        try {
            filewriter = new FileWriter(filepath);
            for (char character : wordFreq.keySet()) {
                filewriter.write("\n" + character + "\t" + wordFreq.get(character));
            }
            filewriter.close();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
    public void readResultFromFile(String filepath) {
        try {
            filereader = new FileReader(filepath);
            int content;
            while ((content = filereader.read()) != -1) {
                System.out.print((char) content);
            }
        }
        catch(IOException exception)
        {
            exception.printStackTrace();
        }
    }
    public static void main(String args[]) throws IOException {
        Assignment11 object=new Assignment11();
        //args[0]->Inputfile  args[1]->File to save the result
        object.getFrequency(args[0]);
        object.savingResultsIntoFile(args[1]);
        object.readResultFromFile(args[1]);
    }
}
