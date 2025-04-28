import java.io.*;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        Dati dati = new Dati();
        try(PrintWriter pw = new PrintWriter(new FileWriter(new File("src/Report.csv")))){
            pw.write(dati.getInit()+"\n");
            for(int i=0;i< dati.getDatiOrganizzati().size();i++){
                pw.write(dati.getDatiOrganizzati().get(i).toString()+"\n");
            }
        }catch (IOException e){}
    }
}