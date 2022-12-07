package okulYonetimi;

import java.util.Map;

public class Ogretmen extends Okul implements OrtakMethod{

    public Ogretmen(String ad, String soyad, String bolum, String sicilNo, int yas) {
        super(ad, soyad, bolum, sicilNo, yas);
    }

    public Ogretmen() {
    }

    @Override
    public String toString() {
        return "Ogretmen{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", yas=" + yas +
                ", bolum='" + bolum + '\'' +
                ", sicilNo='" + sicilNo + '\'' +
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
        System.out.println("Lutfen bolumunuzu giriniz: ");
        bolum=input.next();
        System.out.println("Lutfen sicil numaranizi giriniz: ");
        sicilNo=input.next();
        ogretmenListesi.put(getKimlikNo(),new Ogretmen(ad,soyad,bolum,sicilNo,yas));
        System.out.println("Ogretmen bilgileri sisteme yuklendi...");

    }

    @Override
    public void arama() {

        System.out.println("Lutfen arama yapilacak ogretmenin kimlik numarasini giriniz: ");
        String kimlik=input.next();

        for (Map.Entry<String,Ogretmen> w:ogretmenListesi.entrySet()){
            if (w.getKey().equals(kimlik)){
                System.out.println(kimlik+" nolu ogretmene ait bilgiler: "+w.getValue());
            }
        }

//        if (ogretmenListesi.containsKey(kimlik)){
//            System.out.println(ogrenciListesi.get(kimlik));
//        }

    }

    @Override
    public void listeleme() {

        for (Map.Entry<String, Ogretmen> w:ogretmenListesi.entrySet()){
            System.out.println(w);
        }

    }

    @Override
    public void silme() {

        System.out.println("Lutfen silinecek ogretmenin kimlik numarasini giriniz: ");
        String kimlik=input.next();
        ogretmenListesi.remove(kimlik);
        System.out.println(getKimlikNo()+" kimlik numarasina sahip ogretmen silindi");

    }

    @Override
    public void islemler() {

        System.out.println("Ogretmen Panelindeki Islemler: \n" +
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
