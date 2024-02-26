
/*Допишите публичный статический метод getWeekends(),
который возвращает массив из двух элементов – названий выходных дней на английском.
Метод принимает на вход параметр – формат возврата в виде строки. Всего есть два возможных значения:
"long" (по умолчанию) – массив содержит строки "saturday" и "sunday"
"short" – массив содержит строки "sat" и "sun"*/

import java.util.Arrays;

class App {

    public static void main(String[] args) {
        String inputFormat = "long";
        String[] weekend = getWeekends(inputFormat);
        System.out.println(Arrays.toString(weekend));
    }

    public static String[] getWeekends(String str) {
        if (str == "short") {
            return new String[]{"sat", "sun"};
        } else {
            return new String[]{"Saturday", "Sunday"};
        }
    }
}
