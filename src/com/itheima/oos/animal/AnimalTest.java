package com.itheima.oos.animal;

import com.itheima.oos.person.Person;
import com.itheima.oos.person.Student;

/***************************
 *@Description
 *@Author yangkunlin
 *@Date 2023/3/26 16:45
 ***************************/
public class AnimalTest {

    public static void main(String[] args) {

        playAnimal(new Animal() {
            @Override
            public void eat() {
                System.out.println("是个动物就得吃");
            }
        });
        Animal bird = new Bird();
        playAnimal(bird);

        Cat cat = new Cat();
        cat.eat();
        cat.sleep();
        cat.jump();

        Animal animal = new Animal() {
            @Override
            public void eat() {
                System.out.println("这是一个匿名内部类");
            }
        };
        animal.eat();

        bird.eat();
        Person student = new Student();
        student.setName("yang");

        playPerson(student);
    }

    public static class Bird extends Animal {
        @Override
        public void eat() {
            System.out.println("这是一个内部类");
        }
    }

    public static void playAnimal(Animal animal) {
        animal.eat();
    }


    public static void playPerson(Person student) {
        System.out.println("这是一个: " + student.getName() + "喜欢动物");
    }

}
