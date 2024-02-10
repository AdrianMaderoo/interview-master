import java.io.BufferedReader;
//import java.io.FileNotFoundException;
import java.io.FileReader;

public class HandleCSV {
    private BufferedReader reader; //Read the file
    private String line; //get every line
    private String part[]=null; //keep read line

    public void readFile(String readFile) throws Exception {
        try {
            reader =new BufferedReader(new FileReader(readFile));
            while ((line=reader.readLine()) !=null){
                part=line.split(",");
                printLine();
                System.out.println();
            }
            reader.close();
            line=null;
            part=null;
        } catch (Exception e) {
            throw new Exception(e);
        }
    }

    private void printLine() {
        for (int i = 0; i < part.length; i++) {
            System.out.print(part[i]+"  |  "); //print (in the same lane) with spaces
        }
    }
}
