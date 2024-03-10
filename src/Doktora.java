public class Doktora extends Ogrenci{
    String tezkonusu;
    String danısman;
    boolean yeterlimi;
    public Doktora(String tezkonusu, String danısman, boolean yeterlimi){
        super("Onur", "Kara", "Bilgisayar mühendisliği", 5432);
        this.tezkonusu=tezkonusu;
        this.danısman=danısman;
        this.yeterlimi=false;
    }
}
