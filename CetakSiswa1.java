public class CetakSiswa1{

    public static void main(String [] args){
        Siswa1 sis = new Siswa1(12345, "Jonowati");
        System.out.println("Nis : "+sis.getNis());
        System.out.println("Nama : "+sis.getNama());
    }
}

/**
*pendeklarasian objek pada baris 4 harus menggunakan parameter
*karena method construktor pada class siswa1 memiliki parameter
*/