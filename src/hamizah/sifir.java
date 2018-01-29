package hamizah;


import java.util.*;
public class sifir {
    public static void main(String[] args){
    
        int a;
        int b;
        int c;
        int jawapan;
        
        Scanner input=new Scanner(System.in);
        
        do{
       System.out.println("Masukkan nombor anda: ");
        b=input.nextInt();
        
        for(a=1; a<13; a++){
        c=a*b;
         System.out.println(a+"x"+b+"="+c);
        }
       System.out.println("Adakah anda ingin teruskan \n Jika ya taip (1) dan Jika tidak taip (2): ");
       jawapan=input.nextInt();
        }
        while(jawapan==1);
        System.out.println("Tamat");
    }
}
