//class VoisOne implements Runnable{
//    VoisOne voisOne;
//    Thread thread;
//    String name;
//    VoisOne(String name) {
//        voisOne = this;
//        name = name;
//         thread = new Thread(this, name);
//        System.out.println(Thread.currentThread().getName()+ " конструктор");
//         thread.start();
////        System.out.println(Thread.currentThread().getId());
//
//    }
//
//    @Override
//    public void run() {
// //       System.out.println(Thread.currentThread().getId());
//        String n =Thread.currentThread().getName();
//        System.out.println(n + " run");
//
//        for (int i = 0; i < 5; i++){
//            while (true) {
//                print(i, n);
//            }
//        }
//    }
//
//   synchronized private void print(int i, String name1) {
//    try {
//        System.out.println("в try " + name1);
//        voisOne.notify();
//        System.out.println("Это поток " + name1 + " в середине for "+ i);
//        voisOne.wait();
//        System.out.println("Это поток " + name1 + " после Wite "+ i);
//    } catch (InterruptedException e) {
//        System.out.println(e.toString()+ "Прерыванее работы");
//    }
//    }
//
//}
//
//
//class Main {
//
//    public static void main(String[] args) throws InterruptedException {
//        System.out.println("перед1");
//       VoisOne one =  new VoisOne("One");
// //       System.out.println(Thread.currentThread().getId()+ " main1");
//        System.out.println("перед2");
//
//        VoisOne tue = new VoisOne("Tue");
////        System.out.println(Thread.currentThread().getId()+ " main2");
////        System.out.println(Thread.currentThread().getId());
//
//
//
//        System.out.println("Окончание работы основного потока");
//    }
//}
