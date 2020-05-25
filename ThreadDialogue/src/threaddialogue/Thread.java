
package threaddialogue;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gulla.davide
 */
public class Thread {
     Thread T;
    private char nome;

    Thread(char nome) {
        T = new Thread(this);
        T.start();
        this.nome = nome;
    }

    public char getNome() {
        return nome;
    }

    public void thread1() throws InterruptedException {
        System.out.println("1");
        Thread.sleep(4000);
        System.out.println("3");
        Thread.sleep(4000);
        System.out.println("5");
        Thread.sleep(4000);
        System.out.println("7");
        Thread.sleep(4000);
        System.out.println("9");
        Thread.sleep(4000);
        System.out.println("11");
        Thread.sleep(4000);
        System.out.println("13");
        Thread.sleep(4000);
        System.out.println("15");
        Thread.sleep(4000);
        System.out.println("17");
        Thread.sleep(4000);
        System.out.println("19");
        Thread.sleep(4000);
        System.out.println("21");
        Thread.sleep(3000);
    }

    
    
    public void thread2() throws InterruptedException {
        Thread.sleep(3000);
        System.out.println("2");
        Thread.sleep(4000);
        System.out.println("4");
        Thread.sleep(4000);
        System.out.println("6");
        Thread.sleep(4000);
        System.out.println("8");
        Thread.sleep(4000);
        System.out.println("10");
        Thread.sleep(4000);
        System.out.println("12");
        Thread.sleep(4000);
        System.out.println("14");
        Thread.sleep(4000);
        System.out.println("16");
        Thread.sleep(4000);
        System.out.println("18");
        Thread.sleep(4000);
        System.out.println("20");
        Thread.sleep(4000);
        System.out.println("22");
    }

    @Override
    public void run() {
        try {
            if (getNome() == 'a') {
                thread1();
            } else if (getNome() == 'b') {
                thread2();
            }

        } catch (InterruptedException ex) {
            Logger.getLogger(Thread.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
