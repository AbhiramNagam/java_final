package final_12b;


class Caller{
    synchronized public void callme(String msg){
        System.out.print("[ " + msg);
        try{
            Thread.sleep(1000);
        }catch(InterruptedException e) {e.printStackTrace();}
        System.out.print(" ] ");
        System.out.println ();
    }
}

class NT implements Runnable{
    Thread t;
    Caller c;
    String msg;
    NT (Caller c1,String msg1){
        t = new Thread(this);
        c = c1;
        msg = msg1;
        t.start ();
    }
    public void run(){
        c.callme (msg);
    }
}
class Main {
    public static void main (String[] Args){
        Caller c =new Caller();
        NT t1 = new NT (c,"I love");
        NT t2 = new NT (c,"Java");
//        NT t3 = new NT (c,"Hello");
        try{
            t1.t.join();
            t2.t.join();
//            t3.t.join();
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
