/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package coba1;
import java.util.Scanner; /*digunakan agar bisa malakukan inputan*/

public class PBO_Gaji {
    public String nama;
    public String alamat;
    public String pengalaman;
    public String skill;
    public String departemen;
    
    /*parameter*/
    public PBO_Gaji (String nama, String alamat, String pengalaman, String skill, String departemen){
        this.nama=nama;
        this.alamat=alamat;
        this.pengalaman=pengalaman;
        this.skill=skill;
        this.departemen=departemen;
    }
    public int hitung_gaji(){
        int hitung_gaji=0; /*gaji awal = 0*/
        switch (departemen){
            case "IT": hitung_gaji+=8000000;
            break;
            
            case "HRD": hitung_gaji+=5000000;
            break;
            
            case "Finance": hitung_gaji +=4000000;
            break;
        }
        switch (pengalaman){
            case "Pemula":hitung_gaji+=500000;
            break;
            
            case "Menengah": hitung_gaji+=1000000;
            break;
            
            case "Expert":hitung_gaji+=2000000;
            break;
        }
        
        switch (skill){
            case "web":hitung_gaji+=1000000;
            break;
            
            case "mobile": hitung_gaji+=2000000;
            break;
            
            case "desktop": hitung_gaji+=2500000;
            break;
        }
        return hitung_gaji;
    }
    
    
    
    public static void main(String[] args) {
        Scanner input = new
Scanner (System.in);

    System.out.print("Nama:");
    String nama = input.nextLine();

    System.out.print ("Alamat:");
    String alamat = input.nextLine();

    System.out.print ("Pengalaman:");
    String pengalaman = input.nextLine();

    System.out.print ("Skill:");
    String skill = input.nextLine();

    System.out.print ("Departemen:");
    String departemen = input.nextLine();

    PBO_Gaji data = new PBO_Gaji (nama, alamat, pengalaman, skill, departemen);
    System.out.println ("Gaji yang didapatkan = " + data.hitung_gaji());
    }
    
}


