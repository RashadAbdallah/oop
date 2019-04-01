package oop;
import java.util.Scanner;
public class Oop {
public  static int aria(int l,int w)
{
    int x= l*w;
return x;
}
    
    public static void main(String[] args) {
      
        int g=5;
        Scanner input=new Scanner(System.in);
        
        System.out.println(g*3);
        g=input.nextInt();
        int k=input.nextInt();
        int r =aria(g,k);
        System.out.println(r);
    }
    
}
