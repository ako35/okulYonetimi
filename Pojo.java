package okulYonetimi;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Pojo {

    Map<String, Ogrenci> ogrenciListesi=new HashMap<>();
    Map<String, Ogretmen> ogretmenListesi=new HashMap<>();
    Scanner input=new Scanner(System.in);
    String ad;
    String soyad;
    private String kimlikNo;
    int yas;
    String bolum;
    String sicilNo;
    String numara;
    String sinif;

    public String getKimlikNo() {
        return kimlikNo;
    }

    public void setKimlikNo(String kimlikNo) {
        this.kimlikNo = kimlikNo;
    }

    public Pojo(String ad, String soyad, String bolum, String sicilNo, int yas) {
        this.ad = ad;
        this.soyad = soyad;
        this.bolum = bolum;
        this.sicilNo = sicilNo;
        this.yas = yas;
    }

    public Pojo(int yas, String ad, String soyad, String numara, String sinif) {
        this.yas = yas;
        this.ad = ad;
        this.soyad = soyad;
        this.numara = numara;
        this.sinif = sinif;
    }

    public Pojo() {
    }



}
