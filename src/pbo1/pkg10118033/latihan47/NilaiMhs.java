package pbo1.pkg10118033.latihan47;

public class NilaiMhs {
    private double NA, quiz, uts, uas;
    private String ket;
    private char index;

    public double getNA() {
        return NA;
    }

    public double getQuiz() {
        return quiz;
    }

    public double getUts() {
        return uts;
    }

    public double getUas() {
        return uas;
    }

    public String getKet() {
        return ket;
    }

    public char getIndex() {
        return index;
    }

    public void setQuiz(double quiz) {
        this.quiz = quiz;
    }

    public void setUts(double uts) {
        this.uts = uts;
    }

    public void setUas(double uas) {
        this.uas = uas;
    }
    
    public double hitungNA(){
        NA = 0.2*quiz+0.3*uts+0.5*uas;
        return NA;
    }
    
    public double indeksNilai(){
        if((80<NA)&&(NA<=100)){
            index = 'A';
        } else if((68<NA)&&(NA<=80)){
            index = 'B';
        } else if((56<NA)&&(NA<=68)){
            index = 'C';
        } else if((45<NA)&&(NA<=56)){
            index = 'D';
        } else if((0<NA)&&(NA<=45)){
            index = 'E';
        }
        return index;
    }
    
    public String ketNilai(){
        switch(index){
            case 'A':
                ket = "Sangat Baik";
                break;
            case 'B':
                ket = "Baik";
                break;
            case 'C':
                ket = "Cukup";
                break;
            case 'D':
                ket = "Kurang";
                break;
            case 'E':
                ket = "Sangat Kurang";
                break;
        }
        return ket;
    }
    
    public void  tampilNilai(){
        System.out.println("QUIZ\t  = "+quiz);
        System.out.println("UTS\t  = "+uts);
        System.out.println("UAS\t  = "+uas);
        System.out.println("\nNilaiAkhir = "+NA);
        System.out.println("\nIndex = "+index);
        System.out.println("Keterangan = "+ket);
    }
}