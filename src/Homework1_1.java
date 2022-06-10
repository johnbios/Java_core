import static java.lang.String.*;

public class Homework1_1 {

    public static void main(String[] args) {
        //Базовый уровень
        //Задача №1
        //Дано (их менять нельзя)
        String hi = "                Hello ";
        String world = " WoRld!";
        char newLine = '\n';
      //  System.out.println("Первая задача");
        //Создать из трех переменных единую строку,
        String rez = hi + world + newLine;
        //Привести к правильному виду (Ниже), убрать лишние слова,
        rez =(rez.trim());
       // System.out.println(rez);//Проверка правильности вида
        //затроить (Можно вызвать тольку одну команду System.out.print())
        rez = rez+newLine;//Вынужден использовать переменную для перевода строки \n
        System.out.print(rez.repeat(3));
        //Убрать лишние пробелы в начале и в конце строки
        //Результат вывода на экран:
        //Hello world!
        //Hello world!
        //Hello world!

        //Задача №2
        //Создать переменные с ростом (!в метрах), весом.
        double weightValue = 75f;
        double heightValue = 1.79f;
     //   System.out.println("Вторая задача");
        //Произвести расчет индекса массы тела (вес) / (рост * рост) используя переменные, вывести на экран
       double imt =  weightValue/(heightValue*heightValue);
        System.out.printf("%.1f\n",imt);
        //Пример результата вывода на экран:
        //21.0

        //Задача №3
        //Создать из массива букв a,b,c,d,e, строку,вывести на экран , поменять в массиве 4 букву по счету на h,
        //и снова создать строку, вывести на экран



//test
        char [] myArray = new char[5];
        myArray[0] = 'a';
        myArray[1]  = 'b';
        myArray[2]= 'c';
        myArray[3]= 'd';
        myArray[4]= 'e';
        System.out.println(myArray);
        myArray[3]='h';
        System.out.println(myArray);


    }
}