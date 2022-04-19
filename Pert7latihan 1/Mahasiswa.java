/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan7latihan01;

/**
 *
 * @Sultan Ade Ramadhani 20104221
 */
public class Mahasiswa {
    private String NIM, NAMA;
    public void datamhs(){
        System.out.println("========================");
        System.out.println("MENAMPILKAN DATA MAHASISWA");
   }
    public void datamhs(String N){
        this.NIM = N ;
        System.out.println("DATA MAHASISWA");
        System.out.println("========================");
        System.out.println("NAMA :"+this.NIM);
    }
    public void datamhs(String N1, String N2){
        this.NIM = N1;
        this.NAMA = N2;
        System.out.println("DATA MAHASISWA");
        System.out.println("NIM     :"+this.NIM);
        System.out.println("NAMA    :"+this.NAMA);
    }
}
    

