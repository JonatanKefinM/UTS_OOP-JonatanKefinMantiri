import service.*;
import headphone.*;
import java.util.*;

public class Aplikasi {

    private static SvcHp service;
    private static Scanner scanner;

    public static void main(String[] args) {
        service = new SvcHp();
        scanner = new Scanner(System.in);

        int pil = 5;
        do {
            showMenu();
            try {
                scanner = new Scanner(System.in);
                pil = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.err.println("Pilihan yang anda masukan salah, pilih 1 - 5!");
                pil = 0;
            } catch (NoSuchElementException nsee) {

            }
            prosesPil(pil);
        }while (pil != 5);
    }

    //Inputan 1 sampai 5
    private static void prosesPil(int pilihan) {
        switch (pilihan) {
            case 1:
                showMenuTambahData();
                break;
            case 2:
                showMenuEditData();
                break;
            case 3:
                showDeleteData();
                break;
            case 4:
                service.showAllData();
                break;
            case 5:
                System.out.println("\n");
                System.out.println("Terima Kasih :) ");
        }
    }

    //Untuk Tambah Data
    private static void showMenuTambahData() {

        scanner = new Scanner(System.in);
        String id, nama, merek, tipe;

        System.out.println("\n|-| Menu Tambah Data |-|");
        System.out.println("ID Service      : ");
        id = scanner.nextLine();
        System.out.println("Nama Pelanggan  : ");
        nama = scanner.nextLine();
        System.out.println("Merek Hp        : ");
        merek = scanner.nextLine();
        System.out.println("Tipe Hp         : ");
        tipe = scanner.nextLine();
        service.addData(new Hp(id, nama, merek, tipe));
    }

    //Untuk Edit Data
    private static void showMenuEditData() {

        scanner = new Scanner(System.in);
        String id, nama, merek, tipe;

        System.out.println("\n |-| Menu Edit Data |-|");
        System.out.println("ID Service      : ");
        id = scanner.nextLine();
        System.out.println("Nama Pelanggan  : ");
        nama = scanner.nextLine();
        System.out.println("Merek Hp        : ");
        merek = scanner.nextLine();
        System.out.println("Tipe Hp         : ");
        tipe = scanner.nextLine();
        service.updateData(new Hp(id, nama, merek, tipe));
    }

    //Untuk Delete Data
    private static void showDeleteData() {
        scanner = new Scanner(System.in);
        System.out.println("\n |-| Delete Data |-|");
        System.out.println("\n Masukan ID Service yang akan di hapus");
        System.out.println("ID Service      : ");
        String id = scanner.nextLine();
        service.deleteData(id);
    }

    //Menampilkan Menu Utama
    private static void showMenu() {
        System.out.println("|-| Aplikasi Service Hp |-|");
        System.out.println("|1. Tambah Data Pelanggan");
        System.out.println("|2. Ubah Data Pelanggan");
        System.out.println("|3. Hapus Data Pelanggan");
        System.out.println("|4. Tampilkan Data Pelanggan");
        System.out.println("|5. Keluar");
        System.out.println("|-------------------------|");
        System.out.print  ("\nPilih 1 - 5 : ");
    }
}