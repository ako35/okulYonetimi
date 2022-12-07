package okulYonetimi;

import java.util.Map;

public class Ogrenci extends Okul implements OrtakMethod{

    public Ogrenci(int yas, String ad, String soyad, String numara, String sinif) {
        super(yas, ad, soyad, numara, sinif);
    }

    public Ogrenci() {
    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", yas=" + yas +
                ", numara='" + numara + '\'' +
                ", sinif='" + sinif + '\'' +
                '}';
    }

    @Override
    public void ekleme() {

        System.out.println("Lutfen adinizi giriniz: ");
        ad=input.next();
        System.out.println("Lutfen soyadinizi giriniz: ");
        soyad=input.next();
        System.out.println("Lutfen kimlik numaranizi giriniz: ");
        setKimlikNo(input.next());
        System.out.println("Lutfen yasinizi giriniz: ");
        yas=input.nextInt();
        System.out.println("Lutfen numaranizi giriniz: ");
        numara=input.next();
        System.out.println("Lutfen sinifinizi giriniz: ");
        sinif=input.next();
        ogrenciListesi.put(getKimlikNo(),new Ogrenci(yas,ad,soyad,numara,sinif));
        System.out.println("Ogrenci bilgileri sisteme yuklendi...");

    }

    @Override
    public void arama() {

        System.out.println("Lutfen arama yapilacak ogrencinin kimlik numarasini giriniz: ");
        String kimlik=input.next();
//        for (Map.Entry<String,Ogrenci> w:ogrenciListesi.entrySet()){
//            if (w.getKey().equals(kimlik)){
//                System.out.println(kimlik+" nolu ogrenciye ait bilgiler: "+w.getValue());
//            }
//        }

        if (ogrenciListesi.containsKey(kimlik)){
            System.out.println(ogrenciListesi.get(kimlik));
        }

    }

    @Override
    public void listeleme() {

        for (Map.Entry<String, Ogrenci> w:ogrenciListesi.entrySet()){
            System.out.println(w);
        }

    }

    @Override
    public void silme() {

        System.out.println("Lutfen silinecek ogrencinin kimlik numarasini giriniz: ");
        String kimlik=input.next();
        ogrenciListesi.remove(kimlik);
        System.out.println(getKimlikNo()+" kimlik numarasina sahip ogrenci silindi");

    }



    @Override
    public void islemler() {

        System.out.println("Ogrenci Panelindeki Islemler: \n" +
                "1-) Ekleme\n" +
                "2-) Arama\n" +
                "3-) Listeleme\n" +
                "4-) Silme\n" +
                "5-) Ana Menu\n" +
                "6-) Cikis");
        System.out.println("Lutfen yapmak istediginiz islemi seciniz: ");
        String secim=input.next();
        boolean flag=true;
        do {
            switch (secim){
                case "1":
                    ekleme();
                    islemler();
                    flag=false;
                    break;
                case "2":
                    arama();
                    islemler();
                    flag=false;
                    break;
                case "3":
                    listeleme();
                    islemler();
                    flag=false;
                    break;
                case "4":
                    silme();
                    islemler();
                    flag=false;
                    break;
                case "5":
                    okulAnaSayfasi();
                    flag=false;
                    break;
                case "6":
                    System.out.println("Program sonlandiriliyor...");
                    break;
                default:
                    System.out.println("Yanlis bir secim yaptiniz");
                    System.out.println("1,2,3,4,5 ve 6 secimlerini kullanmalisiniz");
            }
        } while (flag);
    }

}
