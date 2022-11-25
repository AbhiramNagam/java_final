
package final_m2_2;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string : ");

//        String s= "Java is an object-oriented programming language is ";
        String s= sc.nextLine();
        String[] arr=s.split(" ");
        HashMap <String,Integer> mp = new HashMap<>();
        for(String i : arr){
            if(mp.containsKey(i)){
                int var=mp.get(i);
                var++;
                mp.put(i,var);
            }
            else{
                mp.put(i,1);
            }
        }
        
        for(String i: mp.keySet()){
            System.out.println(i+" : "+mp.get(i));
        }
    }
}
