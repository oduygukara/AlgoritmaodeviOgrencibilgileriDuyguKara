public class Ogrenci {
    private String ad;
    private String soyad;
    private String bolum;
    private int numara;

    public Ogrenci(String ad, String soyad, String bolum, int numara){
        this.ad=ad;
        this.soyad=soyad;
        this.bolum=bolum;
        this.numara=numara;
    }
    public String getAd(){
        return ad;
    }
    public void setAd(String ad){
        this.ad=ad;
    }
    public String getSoyad(){
        return soyad;
    }
    public void setSoyad(String soyad){
        this.soyad=soyad;
    }
    public String getBolum(){
        return bolum;
    }
    public void setBolum(String  bolum){
        this.bolum=bolum;
    }
    public int getNumara(){
        return numara;
    }
    public void setNumara(int numara){
        this.numara=numara;
    }

}
