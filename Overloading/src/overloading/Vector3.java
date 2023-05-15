package overloading;

import java.util.Scanner;

public class Vector3 {
    public int[] number = new int[3];
    
    public Vector3(int x, int y, int z){
        this.number[0] = x;
        this.number[1] = y;
        this.number[2] = z;
    }
    
    public int getHasil(int elemen){
        return this.number[elemen];
    }
    
    public void setHasil(int elemen, int hasil){
        this.number[elemen] = hasil;
    }
    
    public void printVector(){
        System.out.println("[ "+this.getHasil(0)+", "+this.getHasil(1)+", "+this.getHasil(2)+" ]");
    }
    
    public Vector3 perkalian(int hitungSkalar){
        Vector3 hasil = new Vector3(0,0,0);
        for(int a= 0; a< 3; a++){
            hasil.setHasil(a, this.getHasil(a) * hitungSkalar);
        }
        return hasil;
    }
    
    public int perkalian(Vector3 hitungVector){
        int hasil=0;
        for(int a= 0; a< 3; a++){
            hasil += this.getHasil(a) * hitungVector.getHasil(a);
        }
        return hasil;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("OVERLOADING");
        
        Vector3 vectorPertama = new Vector3(1, 2, 3);
        Vector3 vectorKedua = new Vector3(4, 5, 6);

        System.out.println("vector Pertama : ");
        vectorPertama.printVector();
        System.out.println("vector Kedua : ");
        vectorKedua.printVector();
        

        System.out.println("");
        System.out.print("Masukkan angka (skalar) : "  );
        int skalar = input.nextInt();
        System.out.println("perkalian dengan skalar");
        System.out.print("Hasil : ");
        vectorPertama.perkalian(skalar).printVector();
        System.out.println("");
        System.out.println("perkalian dengan vector");
        vectorPertama.printVector();
        System.out.print(" * ");
        System.out.println("");
        vectorKedua.printVector();
        System.out.println("Hasil : "+vectorPertama.perkalian(vectorKedua));
    }
    
}
