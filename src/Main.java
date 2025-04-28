import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        String temp="";
        ArrayList<Data> dati = new ArrayList<Data>();
        try(BufferedReader br = new BufferedReader(new FileReader("src/Grado-diffusione-del-PC-nelle-imprese-con-meno-di-10-addetti.csv"))){
            temp=br.readLine();
            do{
                dati.add(new Data(temp));
                temp=br.readLine();
            }while(temp!=null);
        }catch (IOException e){};

    }
}