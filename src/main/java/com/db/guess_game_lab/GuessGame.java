package com.db.guess_game_lab;

import javax.swing.*;
import java.util.Random;

public class GuessGame {
    Score topScore;
    Random random;


    public GuessGame(){
        random = new Random();
        topScore = new Score("", 0);
    }

    public void play(int max){
        int numberToGuess = random.nextInt(max)
                , userNumber = -1
                , counter = 0;
        double currScore = 0;
        String input = JOptionPane.showInputDialog("Я загадал число от 0 до " + max + ". \nПопробуйте его угадать. Введите число.");

        do{
            userNumber = Integer.parseInt(input);
            counter++;

            if (userNumber == numberToGuess){
                currScore = max/counter;

                if (currScore > topScore.getScore()) {
                    input = JOptionPane.showInputDialog("Поздравляю! Вы выграли. Ваш счёт " + currScore + "\nВы побили рекорд. Введите имя для внесения в таблицу результатов: ");
                    topScore.setNameAndScore(input, currScore);
                } else {
                    JOptionPane.showMessageDialog(null, "Поздравляю! Вы выграли. \nВаш счёт " + currScore);
                }
                return;
            }

            if (userNumber > numberToGuess){
                input = JOptionPane.showInputDialog("Твое число больше моего. \nПопробуй еще раз.");
            } else {
                input = JOptionPane.showInputDialog("Твое число меньше моего. \nПопробуй еще раз.");
            }
        }
        while(userNumber != numberToGuess);

    }

    public Score printBestScore(){
        JOptionPane.showMessageDialog(null, "Лучший счёт: " + topScore);
        return topScore;
    }
}
