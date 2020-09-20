public class Test {

    volatile static int state=0;

    public static void main(String[] args) {
        Thread t1=new Thread(){
            @Override
            public void run() {
                while (true) {

                    if (state == 0) {
                        System.out.println("a" + " " + state);
                        state++;
                    }
                }
            }
        };

        Thread t2=new Thread(){
            @Override
            public void run() {
                if(state==0)
                {
                    System.out.println("a"+" "+state);
                    state++;
                }
            }
        };

        Thread t3=new Thread(){
            @Override
            public void run() {
                if(state==0)
                {
                    System.out.println("a"+" "+state);
                    state++;
                }

            }
        };

        t1.start();
        t2.start();
        t3.start();
    }
}
