


/**
 *
 * @author
 * Nama : Fauzi Sunarya
 * Kelas : IF-3
 * NIM : 10117110
 * Deskripsi Program : Program Jenis ini Berisi Program Untuk Menampilkan
 * Gaji Karyawan Dengan Menggunakan Konsep OOP inheritance dan polymorphism
 */


package pbo3.pkg10117110.latihan51.gajikaryawan;

import java.util.Scanner;


public class PBO310117110Latihan51GajiKaryawan {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("====Program Perhitungan Gaji Karyawan====");
        Manager obj = new Manager();
        System.out.print("Masukan NIK : ");
        obj.setNik(scan.nextLine());
        System.out.print("Masukan Nama : ");
        obj.setNama(scan.nextLine());
        System.out.print("Masukan Golongan (1/2/3) : ");
        obj.setGolongan(scan.nextInt());
        System.out.print("Masukan Jabatan (Manager/Kabag) : ");
        obj.setJabatan(scan.next());
        System.out.print("Masukan Jumlah Kehadiran : ");
        obj.setKehadiran(scan.nextInt());
        
        
        System.out.println("");
        System.out.println("");
        
        System.out.println("=====Hasil Perhitungan=====");
        System.out.println("NIK\t:"+obj.getNik());
        System.out.println("NAMA\t:"+obj.getNama());
        System.out.println("GOLONGAN:"+obj.getGolongan());
        System.out.println("JABATAN\t:"+obj.getJabatan());
        
        System.out.println("");
        System.out.println("");
        
        System.out.println("TUNJANGAN GOLONGAN\t:"+obj.tunjanganGolongan(obj.getGolongan()));
        System.out.println("TUNJANGAN JABATAN\t:"+obj.tunjanganJabatan(obj.getJabatan()));
        System.out.println("TUNJANGAN KEHADIRAN\t:"+obj.tunjanganKehadiran(obj.getKehadiran()));
        
        System.out.println("");
        System.out.println("");
        
        System.out.println("Gaji Total\t: "+obj.gajiTotal());
    }
    
}
