import java.util.*;
public class Panagram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String pattern="abcdefghijklmnopqrstuvwxyz";
        
        String s=sc.nextLine();
        s=s.toLowerCase();
        for(int i=0;i<pattern.length();i++){
            if(s.indexOf(pattern.charAt(i))==-1){
                System.out.println("Not a panagram");
                return;
            }
        }
        System.out.println("Panagram");
      

       
        
    }
    
}
