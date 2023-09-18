package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i<3) {
                System.out.println("안녕하세요. " + i + "교시입니다.");
            } else if (i<5) {
                System.out.println("이제 절반입니다. " + i + "교시입니다.");
            } else
            System.out.println("거의 다왔습니다! " + i + "교시입니다.");
        }
    }
}