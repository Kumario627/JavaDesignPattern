package memento.game;


import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Gamer gamer = new Gamer(100);
        Memento memento = gamer.createMemento();

        for(int i = 0; i < 100; i++) {
            System.out.println("==== " + i);
            System.out.println("現状:" + gamer);

            gamer.bet();
            System.out.println("所持金は" + gamer.getMoney() + "円になりました。");

            if(gamer.getMoney() > memento.getMoney()) {
                System.out.println("セーブ！");
                memento = gamer.createMemento();
            }

            if(gamer.getMoney() < memento.getMoney() / 2) {
                System.out.println("リストア！");
                gamer.restoreMemento(memento);
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println();

        }
    }
}

