import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
public class Dati {
    private String temp="";
    private String init="";
    private ArrayList<Data> dati = new ArrayList<Data>();
    private ArrayList<String> datiOrganizzati = new ArrayList<String>();
    public Dati(){
        try(BufferedReader br = new BufferedReader(new FileReader("src/Grado-diffusione-del-PC-nelle-imprese-con-meno-di-10-addetti.csv"))){
            init=br.readLine();
            temp=br.readLine();
            do{
                dati.add(new Data(temp));
                temp=br.readLine();
            }while(temp!=null);
        }catch (
                IOException e){}
        for(int i=0;i<20;i++){
            datiOrganizzati.add(dati.get(i).getRegione());
            for(int j=0;j< dati.size();j++){
                if(dati.get(i).getRegione().equals(dati.get(j).getRegione()))
                    datiOrganizzati.add(dati.get(j).getAnno()+";"+dati.get(j).getPercentuale());
            }
        }
    }
    public ArrayList<String> getDatiOrganizzati() {
        return datiOrganizzati;
    }

    public void setDatiOrganizzati(ArrayList<String> datiOrganizzati) {
        this.datiOrganizzati = datiOrganizzati;
    }

    public String getInit() {
        return init;
    }

    public void setInit(String init) {
        this.init = init;
    }

    public ArrayList<Data> getDati() {
        return dati;
    }

    public void setDati(ArrayList<Data> dati) {
        this.dati = dati;
    }
}

