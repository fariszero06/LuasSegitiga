import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author faris
 */

// Nama     : Faris Syahluthfi
// NIM      : 312010034
// Kelas    : TI.20.A1

// Class
public class MenghitungLuasSegitiga{
  public double  alas;
  public double  tinggi;
  public double  luas;

// Construktur
  public MenghitungLuasSegitiga(double  alas, double  tinggi, double luas){
     System.out.println ("Menghitung luas Segitiga");
     this.alas = alas;
     this.tinggi = tinggi;
     this.luas = luas;
}

//ini method setter

   public void setAlas(double  alas){
      this.alas = alas;
}

   public void setTinggi(double  tinggi){
      this.tinggi = tinggi;
}

public void setLuas(double  luas){
   this.luas = luas;
}

 // ini method getter
   public double getAlas (){
      return this.alas; 
}

    public double getTinggi (){
      return this.tinggi; 
}

public double getLuas (){
   return this.luas; 
}



public static void main(String[] args) {
   Scanner input=new Scanner(System.in);
   int a, t;
   double luas;
   
   System.out.print("Masukan Alas : ");
   a=input.nextInt();
   System.out.print("Masukan Tinggi : ");
   t=input.nextInt();
   
   luas=0.5*a*t;
   System.out.println("Luas Segitiga : "+luas);
}  
}


