//https://habr.com/ru/post/440436/
//        8.1. Синхронизация потоков
//        Задача:
//        Напишите программу, в которой создаются два потока, которые выводят на консоль своё имя по очереди.


public class Main {
    public static void main(String[] args) {
        Object lock = new Object();
        new StepThread(lock).start();
        new StepThread(lock).start();
    }
}
