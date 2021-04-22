import java.io.*;
import java.util.*;

public class OptionalTasks {

    static ArrayList<File> file = new ArrayList<>();

    public void firstOptionalTask(){
        List<String> myString = new ArrayList<>();
        try{
            File fileName = new File("D:/File.txt");
            Scanner reader = new Scanner(fileName);
            while(reader.hasNextLine()){
                String data = reader.nextLine();
                myString.add(data);
            }

        }catch (FileNotFoundException ex){
            ex.printStackTrace();
        }
        System.out.println("Text before: " + myString);

        Collections.reverse(myString);
        try(FileWriter writer = new FileWriter("D:/File.txt", false)){
            writer.write(myString + "\n");
            System.out.println("Text after: " + myString.toString());
            writer.close();
        }
        catch(IOException exception){
            System.out.println(exception.getMessage());
        }
    }

    public void sixthOptionalTask(){
        ArrayList<String> myListOfString = new ArrayList<>();
        try{
            File fileName = new File("D:/File2.txt");
            Scanner reader = new Scanner(fileName);
            while(reader.hasNextLine()){
                String data = reader.nextLine();
                myListOfString.add(data);
            }

        }catch (FileNotFoundException ex){
            ex.printStackTrace();
        }

        System.out.println("List before using sort: " + myListOfString);
        Collections.sort(myListOfString);
        System.out.println("List after using sort:" + myListOfString);
    }

    public void fourthOptionalTask(){
        List<String> myListOfString = new ArrayList<>();
        try{
            File fileName = new File("D:/File3.txt");
            Scanner reader = new Scanner(fileName);
            while(reader.hasNextLine()){
                String data = reader.nextLine();
                myListOfString.add(data);
            }

        }catch (FileNotFoundException ex){
            ex.printStackTrace();
        }
        System.out.println("List before using sort: " + myListOfString);
        myListOfString.sort((a,b) -> a.length() - b.length());
        System.out.println("List after using sort:" + myListOfString);
    }

    public void thirdOptionalTask(){
        File myDirectory = new File("D:/Ccleaner");
        try{
            file = list(myDirectory);

        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }

        int lengthOfMyDerictory =   file.size();

        for(int i = 0; i < lengthOfMyDerictory; i++){
            System.out.println("Catalogs and subcatalogs: " + file.get(i).getPath());
        }

    }

    public static ArrayList<File> list(File fileName) throws IOException{
        File[] currentDirectory = fileName.listFiles();
        for(int i = 0; i < currentDirectory.length; i++){
            if(currentDirectory[i].isDirectory()){
                file.add(currentDirectory[i]);
                list(currentDirectory[i]);
            }
        }

        return file;
    }

}

