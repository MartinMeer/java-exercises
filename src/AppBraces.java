/*
public class App {

    */
/*Реализуйте метод isBalanced(), который принимает на вход строку, состоящую только из открывающих и закрывающих круглых скобок,
    и проверяет, является ли эта строка корректной. Пустая строка (отсутствие скобок) считается корректной.

    Строка считается корректной (сбалансированной), если содержащаяся в ней скобочная структура соответствует требованиям:

    Скобки — это парные структуры. У каждой открывающей скобки должна быть соответствующая ей закрывающая скобка.
    Закрывающая скобка не должна идти впереди открывающей. Такой вариант недопустим )(, а вот такой допустим ()().*//*



    public static void main(String[] args) {

        if(getSquare.isBalanced("(())") == true) {
           System.out.println(getSquare.isBalanced("This string is balanced."));
       } else {
           System.out.println("This string is NOT balanced.");
       }
    }

    public static boolean isBalanced(String str) {
        char braceL = '(';
        char braceR = ')';
        int countBL = 0;
        int countBR = 0;

        while (str.indexOf(braceL) < str.indexOf(braceR)) {

        }

            */
/*for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == braceL) {
                countBL++;
                }
                if (str.charAt(i) == braceR) {
                countBR++;
                }
                if (str.indexOf(braceL) < str.indexOf(braceR)); {
                return true;
                }
            }*//*

        return false;
        }
        public static int getIndex (String str, char letter) {
            int index = str.indexOf(letter);
            for (int i = 0; i < str.length(); i++) {
                }
            return index;
        }
    }*/
