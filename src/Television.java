/**
 * Класс «Телевизор»:
 * Поля: currentChannel (private), volume (private).
 * Геттеры и сеттеры:
 * volume может быть от 0 до 100.
 * currentChannel от 1 до 50.
 * Метод nextChannel() увеличивает канал на 1.
 */
public class Television {
    private int currentChannel; // текущий канал
    private int volume; // громкость

    public Television(int channel, int volume) {
        if (isBetween(channel, 1, 50) && isBetween(volume, 0, 100)) {
            this.currentChannel = channel;
            this.volume = volume;
        }
    }

    public int getCurrentChannel() {
        return this.currentChannel;
    }

    public int getVolume() {
        return this.volume;
    }

    public void setCurrentChannel(int channel) {
        this.currentChannel = channel;
    }

    // выводит на дисплей информацию о канале и громкости
    public void displayTVInfo() {
        System.out.printf("Канал : %s, Громкость %s\n", this.currentChannel, this.volume);
    }

    public void nextChannel() {
        if (this.currentChannel == 50) {
            this.currentChannel = 1;
        } else {
            this.currentChannel++;
        }
    }

    /**
     * Проверяет , находится ли число в заданном диапазоне
     *
     * @param number число
     * @param min    - нижняя граница диапазона
     * @param max    - верхняя граница диапазона
     * @return возвращает true, если число находится внутри диапазона, и false в противном случае
     */
    public static boolean isBetween(int number, int min, int max) {
        return number >= min && number <= max;
    }
}