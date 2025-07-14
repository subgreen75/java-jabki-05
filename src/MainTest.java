import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    void walletTest() {
        System.out.println("***   Тестирование класса wallet   ***");
        Wallet wallet = new Wallet();
        System.out.println("Создали объект");
        wallet.displayWalletInfo();
        System.out.println("set owner Паша");
        wallet.setOwner("Паша");
        wallet.displayWalletInfo();
        System.out.println("set money 50000");
        wallet.setMoney(50000);
        wallet.displayWalletInfo();
        System.out.println("set negative money");
        wallet.setMoney(-100);
        System.out.println("set money 10000");
        wallet.setMoney(10000);
        wallet.displayWalletInfo();
        System.out.println("get owner");
        System.out.printf("Владелец: %s\n", wallet.getOwner());
        System.out.println("get money");
        System.out.printf("Сумма: %s\n", wallet.getMoney());
        System.out.println("spend 1000");
        wallet.spend(1000);
        wallet.displayWalletInfo();
    }

    @Test
    void gameTest() {
        System.out.println("***   Тестирование checkGuess   ***");
        Game game = new Game();
        String answerGame; // ответ игры
        int guessedNumber; // мое число
        guessedNumber = 20;
        answerGame = game.checkGuess(guessedNumber);
        System.out.printf("Попробуем наудачу. Число %s. Ответ: %s\n", guessedNumber, answerGame);
        guessedNumber = 90;
        answerGame = game.checkGuess(guessedNumber);
        System.out.printf("Попробуем наудачу. Число %s. Ответ: %s\n", guessedNumber, answerGame);
        System.out.println("перебором пробуем угадать");
        for (int i = 1; i <= 100; i++) {
            if (game.checkGuess(i) == "Угадал") {
                System.out.printf("Загаданное число: %s\n", i);
                break;
            }
        }
    }

    @Test
    void televisionTest() {
        System.out.println("***   Тестирование класса Television   ***");
        System.out.println("Создали первый канал");
        Television tv1 = new Television(1, 20);
        tv1.displayTVInfo();
        System.out.println("Создали второй канал");
        Television tv2 = new Television(2, 15);
        tv2.displayTVInfo();
        System.out.println("Переключим канал");
        tv2.nextChannel();
        tv2.displayTVInfo();
    }

    @Test
    void orderTest() {
        System.out.println("***   Тестирование класса Order   ***");
        Order order = new Order();
        System.out.printf("OrderId: %s\n", order.getOrderID());
        OrderItem item1 = new OrderItem("Молоко", 100);
        OrderItem item2 = new OrderItem("Хлеб", 25);
        OrderItem item3 = new OrderItem("Конфеты", 340);
        order.addItemToOrder(item1);
        order.addItemToOrder(item2);
        order.addItemToOrder(item3);
        order.displayOrderInfo();
    }
}