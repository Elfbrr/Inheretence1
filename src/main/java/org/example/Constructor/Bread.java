package org.example.Constructor;

public class Bread extends Flour {
        public Bread() {
            super("black");
            System.out.println("Default");
        }

        public Bread(String type) {
            super("brown");
            System.out.println("This bread is " + type);

        }

        public static void main(String[] args) {
            //Flour f1 = new Flour(9);

            //Bread b1 = new Bread();


            Bread b2 = new Bread("whole wheat");
        }

    }



