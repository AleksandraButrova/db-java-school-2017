package com.db.guess_game_lab;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        GuessGame game = new GuessGame();
        String input;

        String[] buttons = {"Играть", "Вывести счет"};

        while (true) {


            int rc = JOptionPane.showOptionDialog(null, "Что хотите сделать?", "Угадай число",
                    JOptionPane.WARNING_MESSAGE, 0, null, buttons, buttons[1]);

            if (rc == -1) {
                return;
            } else if (rc == 0) {
                input = JOptionPane.showInputDialog("Выберите сложности: ");
                game.play(Integer.parseInt(input));
            } else if (rc == 1) {
                game.printBestScore();
            }

        }
    }
}
