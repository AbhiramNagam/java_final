package final_m2_1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static void floodFill_(ArrayList<ArrayList<Integer> > arr, int x, int y, int prevC, int c,int M,int N)
    {
        if (x < 0 || x >= M || y < 0 || y >= N)
            return ;
        if (arr.get(x).get(y) != prevC)
            return ;

        arr.get(x).set(y, c);

        floodFill_(arr, x+1, y, prevC, c,M,N);
        floodFill_(arr, x-1, y, prevC, c,M,N);
        floodFill_(arr, x, y+1, prevC, c,M,N);
        floodFill_(arr, x, y-1, prevC, c,M,N);
    }
    public static void floodFill(ArrayList<ArrayList<Integer>> arr, int x, int y, int c, int a, int b){
        int prevC = arr.get(x).get(y);
        if(prevC==c){
            return;
        }
        floodFill_(arr, x, y, prevC, c,a,b);
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        ArrayList<ArrayList<Integer> > arr
                = new ArrayList<ArrayList<Integer> >();
        arr.add(new ArrayList<Integer>());

        System.out.print("Enter the number of rows : ");
        int a=sc.nextInt();
        System.out.print("Enter the number of rows : ");
        int b=sc.nextInt();
        System.out.println("Enter data");
        for(int i=0;i<a;i++){
            arr.add(new ArrayList<Integer>());
            for(int j=0;j<b;j++){
                int x=sc.nextInt();
                arr.get(i).add(x);
            }
        }
        System.out.println("++++++++++++++++++++++++++++++++");
        for(int i=0;i<a;i++){
            for (int j=0;j<b;j++){
                System.out.print(arr.get(i).get(j)+" ");
            }
            System.out.println();
        }
        System.out.println("++++++++++++++++++++++++++++++++");

        // for(int i=1;i<=4;i++)
        //     arr.get(0).add(1);

        // arr.add(new ArrayList<Integer>());
        // arr.get(1).add(1,1,3,1);
        // arr.add(new ArrayList<Integer>());
        // arr.get(2).add(1,0,1,1);

//          int[][] arr={
//                  {1,1,1,1},
//                  {1,1,3,1},
//                  {1,0,1,1}
//          };
        int x = 1, y = 1, color = 2;
        // // int a=arr.length;
        // // int b=arr[0].length;

        floodFill(arr, x, y, color,a,b);

        System.out.println("---------------------------------");
        for(int i=0;i<a;i++){
            for (int j=0;j<b;j++){
                System.out.print(arr.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }
}
