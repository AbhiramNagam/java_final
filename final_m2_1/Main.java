package final_m2_1;
public class Main {
    static void floodFillUtil(int[][] screen, int x, int y, int prevC, int c,int M,int N)
    {
        if (x < 0 || x >= M || y < 0 || y >= N)
            return ;
        if (screen[x][y] != prevC)
            return ;

        screen[x][y] = c;

        floodFillUtil(screen, x+1, y, prevC, c,M,N);
        floodFillUtil(screen, x-1, y, prevC, c,M,N);
        floodFillUtil(screen, x, y+1, prevC, c,M,N);
        floodFillUtil(screen, x, y-1, prevC, c,M,N);
    }
    public static void floodFill(int[][] screen,int x, int y, int c,int a,int b){
        int prevC = screen[x][y];
        if(prevC==c){
            return;
        }
        floodFillUtil(screen, x, y, prevC, c,a,b);
    }
    public static void main(String[] args){

        int[][] screen={
                {1,1,1,1},
                {1,1,3,1},
                {1,0,1,1}
        };
        int x = 1, y = 1, c = 2;
        int a=screen.length;
        int b=screen[0].length;
        floodFill(screen, x, y, c,a,b);

        System.out.println("---------------------------------");
        for (int[] i:screen){
            for (int j : i){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
