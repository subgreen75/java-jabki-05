/**
 * Поля: owner (private), money (private).
 * Конструктор с параметрами owner, money.
 * Геттеры и сеттеры с валидацией: money не может быть отрицательным.
 * Метод spend(int amount), уменьшающий money.
 */
public class Wallet {
    private String owner;
    private double money;

    public Wallet(String owner, double money) {
        this.owner = owner;
        this.money = money;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setMoney(double money) {
        if (money < 0) {
            System.out.println("Сумма в кошельке не может быть отрицательной");
        } else {
            this.money = money;
        }
    }

    public String getOwner() {
        return this.owner;
    }

    public double getMoney() {
        return this.money;
    }

    // выводит на дисплей информацию о владельце и сумме в кошельке
    public void displayWalletInfo() {
        System.out.printf("Владелец : %s, Сумма в кошелке %s\n", this.owner, this.money);
    }

    /**
     * метод уменьшающий сумму в кошельке
     *
     * @param amount сумма затрат
     */
    public void spend(int amount) {
        if (amount < 0) {
            System.out.println("Сумма затрат не может быть отрицательной");
        } else {
            this.money -= amount;
        }
    }
}