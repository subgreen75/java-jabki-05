/**
 * Игра «Угадай число»:
 * Создайте класс Game с полем secretNumber (private, случайное число от 1 до 100).
 * Добавьте метод checkGuess(int guess), возвращающий "Больше", "Меньше" или "Угадал".
 */
public class Game {
    private int secretNumber = 37; // загаданное число

    /**
     * метод , возвращающий "Больше", "Меньше" или "Угадал".
     * * @param guess число
     */
    public String checkGuess(int guess) {
        if (secretNumber == guess) {
            return "Угадал";
        } else if (secretNumber > guess) {
            return "Меньше";
        } else {
            return "Больше";
        }
    }
}