/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dairealan�;

/**
 *
 * @author Samsung
 */
import java.util.*;

public class DaireAlan� {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    int r;
    double pi=3.14;
    Scanner input=new Scanner(System.in);
        System.out.print("Dairenin Yar��ap�n� Giriniz:");
        r=input.nextInt();
        double alan=pi*r*r;
        double cevre=2*pi*r;
        System.out.print("Merkez A��n�n �l��s�n� Giriniz:");
        int a=input.nextInt();
        double ac�=pi*r*r*a/360;
        System.out.println("Dairenin Alan�:"+alan);
        System.out.println("Dairenin �evresi:"+cevre);
        System.out.println("Merkez A��n�n Alan�:"+ac�);
        
        
                
        
    }
    
}
