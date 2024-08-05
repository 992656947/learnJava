package chapter01.src.com.new7_15;

import java.util.Random;

//AD B B C AC
//1
public class HomeWork7_15 {
//    public class Computer {
//        private String brand;   // 品牌
//        private String cpu;// CPU
//        private String memory; // 内存
//        private String hardDisk;// 硬盘
//        private String screen;// 显示器
//        private String battery;// 电池
//        // 开机
//        public void powerOn() {
//            System.out.println("开机");
//        }
//        // 关机
//        public void powerOff() {
//            System.out.println("关机");
//        }
//    }

//2
//    public class Hero {
//        public String name;//名称
//        public String type;//类型
//        public int price;//价格
//        public String skin; //皮肤
//        public void show() {
//            System.out.println("英雄名称：" + name + "英雄类型：" + type + "英雄价格：" + price + "英雄皮肤：" + skin);
//        }
//
//        public static void main(String[] args) {
//            Hero hero = new Hero();
//            hero.name = "孙尚香";
//            hero.type = "战士";
//            hero.price = 1000;
//            hero.skin = "这个杀手不太冷";
//            hero.show();
//        }
//    }

//3
//    public class Student {
//
//        public Long id;
//        public String classId;
//        public String name;
//        public int age;
//        public String sex;
//
//        public void getStudentInfo() {
//            Scanner scanner = new Scanner(System.in);
//            System.out.println("请输入学生id：");
//            this.id = scanner.nextLong();
//            System.out.println("请输入学生班级：");
//            this.classId = scanner.next();
//            System.out.println("请输入学生姓名：");
//            this.name = scanner.next();
//            do {
//                System.out.println("请输入学生年龄：");
//                this.age = scanner.nextInt();
//            } while (this.age < 0 || this.age > 100);
//            do {
//                System.out.println("请输入学生性别：");
//                this.sex = scanner.next();
//            } while (!this.sex.equals("男") && !this.sex.equals("女"));
//        }
//
//        @Override
//        public String toString() {
//            return "Student{" +
//                    "id=" + id +
//                    ", classId='" + classId + '\'' +
//                    ", name='" + name + '\'' +
//                    ", age=" + age +
//                    ", sex='" + sex + '\'' +
//                    '}';
//        }
//
//        public static void main(String[] args) {
//            Student student = new Student();
//            student.getStudentInfo();
//            System.out.println(student);
//        }
//    }

//4
//    public class Person {
//        public String name;
//        public int age;
//        public String sex;
//
//        public Person(String name, int age, String sex) {
//            this.name = name;
//            this.age = age;
//            this.sex = sex;
//        }

//        public static void main(String[] args) {
//            Person[] persons = new Person[3];
//            persons[0] = new Person("张三", 18, "男");
//            persons[1] = new Person("李四", 20, "女");
//            persons[2] = new Person("王五", 23, "男");
//
//            // 随机挑选两个人
//            Random random = new Random();
//            int index1 = random.nextInt(persons.length);
//            int index2 = random.nextInt(persons.length);
//            System.out.println("随机挑选两个人：" + persons[index1].name + " " + persons[index2].name);
//            while (index1 == index2) {
//                index2 = random.nextInt(persons.length);
//            }
//            // 是否可以结婚
//            if (persons[index1].sex.equals(persons[index2].sex)) {
//                System.out.println("不可以结婚");
//                return;
//            }
//            Person man = persons[index1].sex.equals("男") ? persons[index1] : persons[index2];
//            Person woman = persons[index1].sex.equals("男") ? persons[index2] : persons[index1];
//            if (man.age >= 23 && woman.age >= 20) {
//                System.out.println("可以结婚");
//            } else {
//                System.out.println("不可以结婚");
//            }
//        }
//    }


//5
//    public class App {
//        public static void main(String[] args) {
//            System.out.println(MyMath.add(1, 2));
//            System.out.println(MyMath.sub(1, 2));
//            System.out.println(MyMath.mul(1, 2));
//            System.out.println(MyMath.div(1, 2));
//        }
//    }
//
//    class MyMath {
//        public static int add(int a, int b) {
//            return a + b;
//        }
//        public static int sub(int a, int b) {
//            return a - b;
//        }
//        public static int mul(int a, int b) {
//            return a * b;
//        }
//        public static int div(int a, int b) {
//            return a / b;
//        }
//    }

//6

//    public class Vehicle {
//        public int speed;// 速度
//        public int size;// 体积
//        public String color;// 颜色
//
//        public void init(int speed, int size, String color) {
//            this.speed = speed;
//            this.size = size;
//            this.color = color;
//            System.out.println("当前速度：" + this.speed + "km/h" + " 体积：" + this.size + " 体积：" + this.color);
//        }
//
//        public void move() {
//            System.out.println("移动");
//        }
//
//        public void setSpeed(int speed) {
//            this.speed = speed;
//        }
//
//        public void speedUp() {
//            this.speed = Math.min(this.speed + 10, 100);
//            System.out.println("加速,当前速度：" + this.speed);
//        }
//
//        public void speedDown() {
//            this.speed = Math.max(this.speed - 10, 0);
//            System.out.println("减速,当前速度：" + this.speed);
//        }
//
//        public static void main(String[] args) {
//            Vehicle vehicle = new Vehicle();
//            vehicle.init(40, 100, "red");
//            vehicle.move();
//            vehicle.speedUp();
//            vehicle.speedDown();
//        }
//    }

}
