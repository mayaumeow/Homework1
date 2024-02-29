 public class Animal {
     int runLimit;
     int swimLimit;

     public void run(int distance) {
         if (distance <= runLimit) {
             System.out.println("Animal is running " + distance + " meters.");
         } else {
             System.out.println("Animal can't run that far.");
         }
     }

     public void swim(int distance) {
         if (swimLimit == 0) {
             System.out.println("Animal can't swim.");
         } else if (distance <= swimLimit) {
             System.out.println("Animal is swimming " + distance + " meters.");
         } else {
             System.out.println("Animal can't swim that far.");
         }
     }
 }
 class Dog extends Animal {
     Dog() {
         runLimit = 500;
         swimLimit = 10;
     }
 }

 class Cat extends Animal {
     Cat() {
         runLimit = 200;
         swimLimit = 0;
     }
 }
 class Run {
     static int dogCount = 0;
     static int catCount = 0;

     public static void main(String[] args) {
         Dog dog1 = new Dog();
         Dog dog2 = new Dog();
         Cat cat1 = new Cat();

         dog1.run(400);
         dog1.swim(5);

         dog2.run(600);
         dog2.swim(15);

         cat1.run(150);
         cat1.swim(5);

         dogCount += 2;
         catCount += 1;

         System.out.println("Total Dogs: " + dogCount);
         System.out.println("Total Cats: " + catCount);
         System.out.println("Total Animals: " + (dogCount + catCount));
     }
 }
