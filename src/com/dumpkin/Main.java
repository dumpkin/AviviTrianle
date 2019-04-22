// class Triangle , в якому буде описано поля: довжина, ширина.
// Описати дані поля в конструкторі. Створити конструктор з параметрами і без параметрів.
// Написати методи, які будуть розраховувати площу та периметр.
// В Main класі продемонструвати створення об’єктів використовуючи два конструктори.
// Вивести на консоль площу і периметр прямокутника. Вивід на консолі повинен мати наступний вигляд:
// «Площа прямокутника = тут буде площа », «Периметр прямокутника = тут буде периметр».

package com.dumpkin;

public class Main {

    public static void main(String[] args) {
        // create object

        float katet1 = 34.4f;
        float katet2 = 94.1f;

        Triangle triangle1 = new Triangle();
        Triangle triangle2 = new Triangle();
        triangle1.setKatets(48.3, 16.8);

        System.out.println("Площа першого трикутника = " + triangle1.getSquareTr());
        System.out.println("Периметр першого трикутника = " + triangle1.getPerimetrTr());
        System.out.println("\n____________________________________________");
        System.out.println("Площа другого трикутника = " + triangle2.calculatSquareTr(katet1, katet2));
        System.out.println("Периметр другого трикутника = " + triangle2.calculatePerimeter(katet1, katet2));


    }
}
