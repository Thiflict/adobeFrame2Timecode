import java.util.Scanner;

public class calc {
    public static void main(String[] args) {
        int seconds;
        int minutes = 0;
        int hours = 0;
        int frames = 0;

        Scanner scanner = new Scanner(System.in);
        int frameInp = scanner.nextInt(); // Ввод нужного кол-ва кадров

        int frameRate = 60; // Обозначение фреймрейта

        seconds = frameInp / frameRate; // Получаем секунды
        while (seconds > 60) {
            if (seconds > 60) {
                minutes = seconds / 60;
                seconds = seconds-minutes*60;
             }
        }
        frames = frameInp / frameRate;
        frames = frames * frameRate;
        frames = frameInp - frames;
        while (minutes > 60) {
            if (minutes > 60) {
                hours = minutes / 60;
                minutes = minutes-hours*60;
            }
        }
        System.out.println(hours + ":" + minutes + ":" + seconds + ":" + frames);
    }
}