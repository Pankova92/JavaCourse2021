package Lesson20;

import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) {
        ArrayList <String> list = new ArrayList<>();
        list.add("poka");
        list.add("privet");
        list.add("ok");
        list.add(1,"hello");
        for(String s : list){
            System.out.print(s+" ");
        }
        System.out.println();
        System.out.println(list.get(3));            // выводит на экран элемент 3
        list.set(1,"!!!");

        }


    }

