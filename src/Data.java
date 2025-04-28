public class Data {
    private String[] rawData;
    private int anno;
    private String regione;
    private double percentuale;
    public Data(String d){
        rawData=d.split(";");
        anno= Integer.parseInt(rawData[0]);
        regione=rawData[1];
        percentuale= Double.parseDouble(rawData[2]);
    }
    public double getPercentuale() {
        return percentuale;
    }

    public void setPercentuale(double percentuale) {
        this.percentuale = percentuale;
    }

    public int getAnno() {
        return anno;
    }

    public void setAnno(int anno) {
        this.anno = anno;
    }

    public String getRegione() {
        return regione;
    }

    public void setRegione(String regione) {
        this.regione = regione;
    }
}
