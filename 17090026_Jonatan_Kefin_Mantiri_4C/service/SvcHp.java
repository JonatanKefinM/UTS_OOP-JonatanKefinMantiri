package service;

import java.util.*;
import headphone.*;

public class SvcHp {

    private static List<Hp> data = new LinkedList<Hp>();

    public void addData(Hp hp) {
        data.add(hp);
        System.out.println("|-------------------|");
        System.out.println("|Data Telah Tersimpan");
        System.out.println("|-------------------|");
        System.out.println("\n");
    }

    public void updateData(Hp hp) {
        int index = data.indexOf(hp);
        if (index >= 0) {
            data.set(index, hp);
            System.out.println("|--------------------|");
            System.out.println("| Data Telah DI Ubah |");
            System.out.println("|--------------------|");
            System.out.println("\n");
        }
    }

    public void deleteData(String id) {
        int idx = data.indexOf(new Hp(id, "", "", ""));
        if(idx >= 0) {
            data.remove(idx);
            System.out.println("|-------------------|");
            System.out.println("|Data Telah Di Hapus|");
            System.out.println("|-------------------|");
            System.out.println("\n");
        }
    }

    public void showAllData() {
        int i=1;
        System.out.println("|------------------|");
        System.out.println("| Data Anda Kosong |");
        System.out.println("|------------------|");
        System.out.println("\n");
        for(Hp hp : data) {
            System.out.println("data ke-" + i++);
            System.out.println("ID Service     : " + hp.getId());
            System.out.println("Nana Pelanggan : " + hp.getNama());
            System.out.println("Merek          : " + hp.getMerek());
            System.out.println("Tipe           : " + hp.getTipe());
            System.out.println("\n");
        }
    }
}