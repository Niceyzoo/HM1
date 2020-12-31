package ru.geekbrains.hm1;

import com.sun.org.apache.xerces.internal.dom.PSVIAttrNSImpl;

import java.util.Random;
import java.util.Scanner;

public class HomeWork04 {
    //задаем переменные, которые не будут меняться
    public static final int SIZE = 3; //размер массива
    public static final char[][] BOARD = new char[SIZE][SIZE]; //сам двумерный массив
    public static final char DOT_EMPTY = '.';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';
    public static final Scanner SCANNER = new Scanner(System.in); //хода игрока, чтобы он мог воодить данные + передаем поток считать данные с консоли
    public static final Random RANDOM = new Random(); //рандомный хода компьютера

    //делаем поле
    //заполняем массив точками (пустые клетки)
    public static void init() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                BOARD[i][j] = DOT_EMPTY;
            }
        }
    }

    //вывести на экран доску и смотреть состояние
    public static void printBoard() {
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(BOARD[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    //ход игрока
    public static void playerTurn() {
        int x, y; //задали пременные для координат поля
        //добавляем цикл: игрок вводит занчения пока не вернется условие true (не введет валидные данные)
        do {
            System.out.println("твой ход:");
            x = SCANNER.nextInt() - 1; //-1 потому что массив от 0 до 3
            y = SCANNER.nextInt() - 1;
            System.out.println("Ты сходил на: x = " + (x + 1) + ", y = " + (y + 1));
        } while (!isValid(x, y)) ;
        BOARD[x][y] = DOT_X; //присвоили координаты для доски, указали, что игрок ходит крестиками
    }

    //ход компа
    public static void aiTurn() {
        int x, y;
        //добавляем цикл: рандомить занчения пока не вернется условие true
        do {
            x = RANDOM.nextInt(SIZE); //указываем лимит до которого можем рандомить - SIZE
            y = RANDOM.nextInt(SIZE);
            System.out.println("AI сходил на: x = " + (x + 1) + ", y = " + (y + 1));
        } while (!isValid(x, y));
        BOARD[x][y] = DOT_O; //комп ходит ноликами
    }

    //метод для ввода существующих значений и незанятых координат
    public static boolean isValid (int x, int y) {
        if (x > SIZE || x < 0 || y > SIZE || y < 0) {   //если координата не меньше нуля и не больше размера массива
            return false;
        }
        if (BOARD [x][y] == DOT_EMPTY) {   //если координата не знатята, т.е. занята символом "."
            return true;
        }
        else {
            return false;
        }
    }


    //проверка "ничьи"
    public static boolean checkDraw() {
        for (int i = 0; i < BOARD.length; i++) {
            for (int j = 0; j < BOARD[i].length; j++) {
                if (BOARD[i][j] == DOT_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }

    //проверка на победу
    public static boolean checkWin(char symb) {
        int countV;
        int countH;
        int countDiagonalA = 0;
        int countDiagonalB = 0;
        for (int i = 0; i <= SIZE - 1; i++) {
            countV = 0;
            countH = 0;
            for (int j = 0; j <= SIZE - 1; j++) {
                //горизонталь
                if (BOARD[i][j] == symb) {
                    countH++;
                    if (countH == SIZE) return true;
                }

                //вертикаль
                if (BOARD[j][i] == symb) {
                    countV++;
                    if (countV == SIZE) return true;
                }
            }

            // диагональ "\"
            if (BOARD[i][i] == symb) {
                countDiagonalA++;
                if (countDiagonalA == SIZE) return true;
            } else countDiagonalA = 0;

            // диагональ "/"
            if (BOARD[i][SIZE - 1 - i] == symb) {
                countDiagonalB++;
                if (countDiagonalB == SIZE) return true;
            } else countDiagonalB = 0;
        }
        return false;
    }


    public static void main(String[] args) {

        //чтобы вывести на экран доску прописать методы:
        init();
        printBoard();

        //ход игры
        while (true) {
            playerTurn(); //ход игрока
            printBoard(); //печать доски
            if (checkWin(DOT_X)) {  //проверка на победу ход игрока
                System.out.println("Ура! Победа!");
                break;
            }
            if (checkDraw()) {  //проверка на ничью
                System.out.println("Ничья!");
                break;
            }

            //если игрок не победил - ходит комп
            aiTurn();
            printBoard();
            if (checkWin(DOT_O)) {
                System.out.println("Ой...победитель AI");
                break;
            }
            if (checkDraw()) {  //проверка на ниью
                System.out.println("Ничья!");
                break;
            }
        }
    }
}



