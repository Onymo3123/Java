import java.io.*;

public class task1 {
    /*
    Написать программу, которая принимает на вход два целых числа (a и b)
    и совершает с ними следующие действия:
- сравнивает эти два числа и возвращает результат сравнения путем вывода в
консоль одного из вариантов: "a > b", "a < b" или "a = b";
- совершает с этими числами операции сложения, вычитания,
деления и умножения и результат выводит в консоль.

    */
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        int a = 0, b = 0;
        try {
            System.out.println("Введите значение а:");
            String valueA = bufferedReader.readLine(); //читаем значение с клавиатуры
            a = Integer.parseInt(valueA); // пробуем его парсить в число
        } catch (IOException e) {
            System.err.println("Некорректный ввод");
            return;
        } catch (NumberFormatException e){
            System.err.println("Требуется ввести число"); // в случае ошибки выводим сообщение
            return; // и завершаем с ошибкой программу
        }
        try {
            System.out.println("Введите значение b:");
            String valueB = bufferedReader.readLine(); //читаем значение с клавиатуры
            b = Integer.parseInt(valueB); // пробуем его парсить в число
        } catch (IOException e) {
            System.err.println("Ошибка ввода");
            return;
        } catch (NumberFormatException e){
            System.err.println("Требуется ввести число"); // в случае ошибки выводим сообщение
            return; // и завершаем с ошибкой программу
        }
        if(a > b){
            System.out.println("a > b");
        }else if(a < b){
            System.out.println("a < b");
        }else{
            System.out.println("a = b");
        }
    }
}