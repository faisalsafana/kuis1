package walet;


import java.util.Scanner;

class isi{
    private double in;
    private double out;
    private double sum;
    private String nama;
    private String nik;

    public isi(){
        this.nama = nama;
        this.nik = nik;
        this.in = in;
        this.out = out;
        this.sum = sum;

    }

    public double getIn() {
        return in;
    }

    public void setIn(double in) {
        this.in = in;
    }

    public double getOut() {
        return out;
    }

    public void setOut(double out) {
        this.out = out;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }
}

public class walet {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        isi data = new isi();
        int x,y;
        do{
            System.out.println("1. Input Data");
            System.out.println("2. Cek Saldo");
            System.out.println("3. Setor Uang");
            System.out.println("4. Tarik Uang");
            System.out.println("5. Informasi Akun");
            System.out.println("6. Exit");
            System.out.print("Pilih Menu :");
            x = scan.nextInt();
            switch(x){
                case 1:
                    String a,b;
                    if (data.getNama()==null && data.getNik()==null) {
                        System.out.print("Nama : ");
                        a = scan.next();
                        data.setNama(a);
                        System.out.print("NIK : ");
                        b = scan.next();
                        data.setNik(b);
                    }
                    else if (data.getNama() != null && data.getNik() != null){
                        System.out.println("Data sudah ada");
                    }
                    break;
                case 2:
                    double saldo;
                    System.out.println("INFORMASI SALDO");
                    System.out.println("Nama : " + data.getNama());
                    System.out.println("NIK : " + data.getNik());
                    saldo = data.getSum();
                    System.out.println("Sisa Saldo : " + saldo);
                    break;
                case 3:
                    double setor;
                    System.out.println("SETOR UANG");
                    System.out.print("Masukkan Nominal: ");
                    setor = scan.nextInt();
                    data.setIn(setor);
                    data.setSum(data.getSum()+setor);
                    break;
                case 4:
                    double tarik;
                    System.out.println("TARIK UANG");
                    System.out.print("Masukkan Nominal: ");
                    tarik = scan.nextInt();
                    data.setOut(tarik);
                    data.setSum(data.getSum()-tarik);
                    break;
                case 5:
                    System.out.println("INFORMASI AKUN");
                    System.out.println("Nama : " + data.getNama());
                    System.out.println("NIK : " + data.getNik());
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Menu Tidak Tersedia");
                    break;
            }System.out.println("Ingin kembali ke menu? (1=Ya / 2=Tidak)");
            y = scan.nextInt();
    }while(y==1);

    }
}