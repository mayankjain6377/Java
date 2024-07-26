
// class A implements Runnable {
//     public void  run()
//     {
//         for(int i=0;i<100;i++)
//         {

//         System.out.println("Hii..");
//          try {
//             Thread.sleep(20);
//         } catch (InterruptedException e) {

//             e.printStackTrace();
//         }
//         }

//     }
// }

// class B implements Runnable{
//     public void run()
//     {
//         for(int i=0;i<100;i++)
//         {
//         System.out.println("Hello..");
//         try {
//             Thread.sleep(20);
//         } catch (InterruptedException e) {

//             e.printStackTrace();
//         } 
//         }

//     }
// }

// public class java5_Threads {
//     public static void main(String[] args) {
//         Runnable obj1=new A();
//         // obj1.start();
//         Runnable obj2=new B();
//         // obj2.start();
//         Thread t1=new Thread(obj1);
//         Thread t2=new Thread(obj2);
//         t1.start();
//         t2.start();

//     }
// }



// ******** second method using lambda expression ***********
// As we know that Runnable is a Functional Interface so we can use 
// lambda expression here 
// class A implements Runnable {
//     public void run() {
//         for (int i = 0; i < 100; i++) {

//             System.out.println("Hii..");
//             try {
//                 Thread.sleep(20);
//             } catch (InterruptedException e) {

//                 e.printStackTrace();
//             }
//         }

//     }
// }

// class B implements Runnable {
//     public void run() {
//         for (int i = 0; i < 10; i++) {
//             System.out.println("Hello..");
//             try {
//                 Thread.sleep(20);
//             } catch (InterruptedException e) {

//                 e.printStackTrace();
//             }
//         }

//     }
// }

public class java5_Threads {
    public static void main(String[] args) {

        Runnable obj1 = ()-> {
                for (int i = 0; i < 10; i++) {

                    System.out.println("Hii..");
                    try {
                        Thread.sleep(20);
                    } catch (InterruptedException e) {

                        e.printStackTrace();
                    }
                }

            
        };
        // obj1.start();
        Runnable obj2 = ()-> {
                for (int i = 0; i < 10; i++) {
                    System.out.println("Hello..");
                    try {
                        Thread.sleep(20);
                    } catch (InterruptedException e) {
        
                        e.printStackTrace();
                    }
                }
        
            
        };
        // obj2.start();
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        t1.start();
        t2.start();

    }
}
