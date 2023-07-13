package app;

import io.netty.handler.codec.socks.SocksAuthRequest;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int glass;
        glass = 5;
        double ddd;
        String line;
        char j = 'j';
        var variable = 4; // принимает тип того значения, которое стоит после =
        variable = 5;
        final String FOO = "milk"; // эту ппеременную нельзя изменить, она финальная , она константа
        //FOO = "rgrg";
        boolean tip = true;
        boolean tip1 = !true;
        boolean tip2 = true || false; // правда или ложь
        boolean tip3 = true && false;
        boolean tip4 = glass >= 3;
        boolean tip5 = (glass >= 3) && (j == 'j');
        glass += 7; // glass = glass + 7
        glass -= 7; // glass = glass - 7
        glass *= 7; // glass = glass * 7
        glass /= 7; // glass = glass / 7 - елое число
        glass %= 7; // glass = glass % 7 - остаток от деления
        glass = tip ? 3 : 88; // правда ли, что tip = true, если да, то выводим 3, если нет то 88

        ddd = 6.44;
        line = "hfufjg";
        System.out.println("Hello world!!!");
        System.out.println(glass);
        System.out.println(line);
        System.out.println(ddd);
        System.out.println(j);
        System.out.println(variable);
        System.out.println(FOO);
        System.out.println(tip);
        System.out.println(tip1);
        System.out.println(tip2);
        System.out.println(tip3);
        System.out.println(tip4);
        System.out.println(tip5);


        public static Main name1(){
        Scanner input = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = input.toString();
        System.out.println(name);
        }
}
