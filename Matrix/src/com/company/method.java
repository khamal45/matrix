package com.company;

public class method {
    public static void cetak_array (int[] array,int a){
        int c = 0;
        for (int x = 0 ; x < a; x++){
            System.out.printf("{");
            for (int y = 0;y < a;y++){
                System.out.print(" "+ array[c]);
                c++;
            }
            System.out.println(" }");
        }
        System.out.println();
    }
    public static void penjumlahan_array (int[] array1,int[] array2,int a){
       int c = 0;
        for (int x =0;x<a;x++){
            System.out.printf("{");
        for (int y =0;y<a;y++){
            System.out.print(" "+ (array1[c]+array2[c]));
            c++;
        }
            System.out.println(" }");

        }
        System.out.println();
    }

    public static void pengurangan_array (int[] array1,int[] array2,int a){
        int c = 0;
        for (int x =0;x<a;x++){
            System.out.printf("{");
            for (int y =0;y<a;y++){
                System.out.print(" "+ (array1[c]-array2[c]));
                c++;
            }
            System.out.println(" }");

        }
        System.out.println();
    }

    public static void perkalian_array (int[] array1,int[] array2,int a){
        int c = 0,d=0,e=0,tambah =0;


        for (int x =0;x<a;x++){
            d=0;
            System.out.printf("{ ");
for (int g =0;g<a;g++){
    if (d > array2.length){
        d -= a;
    }
            for (int y =0;y<a;y++){

                int kali = array1[c] * array2[d];
                d += a;
                c++;
                tambah += kali;
            }
            d = d - (a*a) + 1;
            c -= a;

            System.out.print(tambah+ " ");
            tambah =0;
}
            c += a;
            System.out.println("}");}

        }


}
