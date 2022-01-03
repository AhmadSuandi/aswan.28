package com.suandi.project;

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner masuk = new Scanner(System.in);
    int jk;
    float berat, tinggi, bmi, meter;
    double broca;

    System.out.println("coding by: Ahmad Suandi");
    System.out.println(" ");
    System.out.println("MENGHITUNG BERAT BADAN IDEAL (BMI) ");
    System.out.println(" ");

    System.out.println("jangan makan terlalu banyak sebelum melakukan");
    System.out.println("pengecekan ini. karena berat tahi anda");
    System.out.println("bisa sangat berpengaruh pada hasilnya");
    System.out.println("____________________________________________");
    
    System.out.print("ketik 1 atau 2 untuk memilih jenis kelamin");
    System.out.println(" ");
    System.out.println(" ");
    System.out.println("1) Laki-laki");
    System.out.println("2) Perempuan");
    System.out.println(" ");
     System.out.print(":");
      jk = masuk.nextInt();

    System.out.print("masukkan berat badan(kg): ");
    berat = masuk.nextFloat();
    
    System.out.print("tinggi badan(cm): ");
    tinggi = masuk.nextFloat();
    meter = tinggi / 100;

    bmi = (berat / (meter * meter));

    System.out.println("____________________________________________");
    System.out.print("BMI : " + bmi + " ");

    if (bmi < 18.5) {
      System.out.println("(Kurus)");
    } else if (bmi <= 22.9) {
      System.out.println("(Normal)");
    } else if (bmi < 24.9) {
      System.out.println("(kelebihan berat)");
    } else {
      System.out.println("(Obesitas)");
    }

    switch (jk) {
      case 1:
        broca = ((tinggi - 100) - (0.10 * (tinggi - 100)));
        break;
      case 2:
        broca = ((tinggi - 100) - (0.15 * (tinggi - 100)));
        break;
      default:
        broca = 0;
    }

  int hasil = (int) broca;

System.out.println("____________________________________________");
    System.out.println(" ");
    System.out.println("Berat ideal badan anda adalah : " + hasil + " Kg");
    System.out.println("(dihitung dengan rumus broca!)");
  }
}
