
/**
 * 
 * @author 
 * NAMA  : Ikrar Anugrah Bastary
 * KELAS : PBO1
 * NIM   : 10118033
 * Deskripsi Program : Program ini berisi program untuk menampilkan Nilai
 *                     Mahasiswa.
 *  
 */

package pbo1.pkg10118033.latihan47;

public class PBO110118033Latihan47 {
    public static void main(String[] args) {
        NilaiMhs nilai = new NilaiMhs();
        nilai.setQuiz(100);
        nilai.setUts(100);
        nilai.setUas(100);
        nilai.hitungNA();
        nilai.indeksNilai();
        nilai.ketNilai();
        nilai.tampilNilai();
    }
}