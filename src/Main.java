import java.io.*;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        String temp="";
        String init="";
        ArrayList<Data> dati = new ArrayList<Data>();
        ArrayList<Data> datiOrganizzati = new ArrayList<Data>();
        try(BufferedReader br = new BufferedReader(new FileReader("src/Grado-diffusione-del-PC-nelle-imprese-con-meno-di-10-addetti.csv"))){
            init=br.readLine();
            temp=br.readLine();
            do{
                dati.add(new Data(temp));
                temp=br.readLine();
            }while(temp!=null);
        }catch (IOException e){}
        for(int i=0;i<20;i++){
            datiOrganizzati.add(dati.get(i));
            for(int j=0;j< dati.size();j++){
                if(dati.get(i).getRegione().equals(dati.get(j).getRegione()))
                datiOrganizzati.add(dati.get(j));
            }
        }
        try(PrintWriter pw = new PrintWriter(new FileWriter(new File("src/Report.csv")))){
            pw.write(init+"\n");
            for(int i=0;i< datiOrganizzati.size();i++){
                pw.write(datiOrganizzati.get(i).toString()+"\n");
            }
        }catch (IOException e){}
    }
}