package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        method method = new method();
        Scanner input = new Scanner(System.in);
        int ordo = 0, baris = 0, colom = 0;
        boolean a = true;
        while (a) {
            System.out.print("Berapa jumlah ordo matrix? (ex: masukan 2 untuk ordo 2x2) : ");
           ordo = input.nextInt();
            System.out.println();
            if (ordo >= 2){
                a = false;
            }
            else {
                System.out.println("Matrix minimal 2x2");
            }
        }
	int[] array_pertama = new int[ordo * ordo];
        int[] array_kedua = new int[ordo * ordo];

    for (int i = 0; i < ordo; i++){
        for (int j = 0; j < ordo; j++){
            System.out.print("Masukan nilai matrix pada indexs ("+ baris+","+j+") : ");
            array_pertama[colom] = input.nextInt();
            colom++;
        }

        baris++;
    }
    method.cetak_array(array_pertama,ordo);
    baris = 0;
    colom = 0;
        for (int i = 0; i < ordo; i++){
            for (int j = 0; j < ordo; j++){
                System.out.print("Masukan nilai matrix pada indexs ("+ baris+","+j+") : ");
                array_kedua[colom] = input.nextInt();
                colom++;
            }

            baris++;
        }
        method.cetak_array(array_kedua,ordo);

        System.out.println("Matrix pertama : ");
        method.cetak_array(array_pertama,ordo);

        System.out.println("Matrix kedua : ");
        method.cetak_array(array_kedua,ordo);

        System.out.println("Hasil Penjumlahan matrix pertama dan matrix kedua");
        method.penjumlahan_array(array_pertama,array_kedua,ordo);

        System.out.println("Hasil Pengurangan matrix pertama dan matrix kedua");
        method.pengurangan_array(array_pertama,array_kedua,ordo);

        System.out.println("Hasil Perkalian matrix pertama dan matrix kedua");
        method.perkalian_array(array_pertama,array_kedua,ordo);
    }

}
