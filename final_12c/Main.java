package final_12c;

class PT extends Thread{
    volatile boolean running =  true;
    long click = 0;
    PT (int P) {
        super.setPriority(P);
        start ();
    }
    public void run () {
        while (running) click++;
    }
    public void stopT () {
        running = false;
    }
}

class Main{
    public static void main(String[] args){
        Thread.currentThread ().setPriority(Thread.MAX_PRIORITY);
        PT lo=new PT (Thread.MIN_PRIORITY);
        PT hi=new PT (Thread.MAX_PRIORITY);
        try{
            Thread.sleep(1000);
        }
        catch(Exception ignored){}
        lo.stopT ();
        hi.stopT ();
        try{
            lo.join();
            hi.join();
        }
        catch (Exception ignored){}
        System.out.println("Low Priority value  :"+lo.click);
        System.out.println("High Priority value :"+hi.click);
    }
}
