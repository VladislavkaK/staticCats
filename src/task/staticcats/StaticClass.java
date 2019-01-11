package task.staticcats;

import java.util.ArrayList;

public class StaticClass {
    public static ArrayList<StaticClass> cats = new ArrayList<>();//инициализируем список cats

    // пустой конструктор
    public StaticClass() {

    }

    public static void main(String[] args) {
        for(int i = 0; i < 10; i++) {
            // записывам 10 ссылок новосозданных обеъктов в массив cats
            StaticClass.cats.add(new StaticClass());
        }
        printCats();
    }

    public static void printCats() {
        //перебираем массив cats
        for(int i = 0; i < StaticClass.cats.size(); i++){
            //вытаскиваем значения из массив
            StaticClass cats = StaticClass.cats.get(i);
            System.out.println(cats);
        }
    }
}
