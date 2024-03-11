import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class App {
    public static void copyContent(File a, File b) throws Exception 
    { 

        FileInputStream in = new FileInputStream(a); 
        FileOutputStream out = new FileOutputStream(b); 
        try { 
  
            int n; 
  
            while ((n = in.read()) != -1) { 
         
                out.write(n); 
            } 
        } 
        finally { 
            if (in != null) { 
  
                in.close(); 
            } 

            if (out != null) { 
                out.close(); 
            } 
        } 
        System.out.println("File Copied"); 
    } 

    public static void main(String[] args) throws Exception 
    { 
        Scanner sc = new Scanner(System.in); 
  
        System.out.println( 
            "starter.txt"); 
        String a = sc.nextLine(); 

        File x = new File(a); 
  
        System.out.println( 
            "ender.txt"); 
        String b = sc.nextLine(); 
  
        File y = new File(b); 

        copyContent(x, y); 
    } 

}