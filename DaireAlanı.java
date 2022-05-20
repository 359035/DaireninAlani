/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dairealaný;

/**
 *
 * @author Samsung
 */
import java.util.*;

public class DaireAlaný {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    int r;
    double pi=3.14;
    Scanner input=new Scanner(System.in);
        System.out.print("Dairenin Yarýçapýný Giriniz:");
        r=input.nextInt();
        double alan=pi*r*r;
        double cevre=2*pi*r;
        System.out.print("Merkez Açýnýn Ölçüsünü Giriniz:");
        int a=input.nextInt();
        double acý=pi*r*r*a/360;
        System.out.println("Dairenin Alaný:"+alan);
        System.out.println("Dairenin Çevresi:"+cevre);
        System.out.println("Merkez Açýnýn Alaný:"+acý);
        
        
                
        
    }
    
}
