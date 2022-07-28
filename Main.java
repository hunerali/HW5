package com.company;

public class Main {
    public static void main(String[] args) {
        Human mother = new Human("Aylin", "Aliyeva", 1980);
        Human father = new Human("Ali", "Aliyev", 1978);

        Pet pet = new Pet("cat", "Mestan", 1, 30, new String[]{"eating", "sleeping"});


        Family aliyevFamily = new Family(mother, father);

        Human child1 = new Human("Veli", "Aliyev", 2000,
                95,
                new String[][]{{"Sunday", "play football"}},aliyevFamily
        );
        Human child2 = new Human("Niyaz", "Aliyev", 2002,
                100, new String[][]{{"monday", "go to school"}},aliyevFamily);
        Human child3 = new Human("Ayla", "Aliyeva", 2004,
                87,
                new String[][]{{"saturday", "playing piano"}},aliyevFamily
        );

        aliyevFamily.setPet(pet);

        aliyevFamily.addChild(child1);
        aliyevFamily.addChild(child2);
        aliyevFamily.addChild(child3);

        aliyevFamily.deleteChild(1);
        System.out.println(aliyevFamily + " " + aliyevFamily.countFamily());


        Family testFamily = new Family(mother, father);
        System.out.println(testFamily.equals(aliyevFamily));

        System.out.println(child1.getFamily());


    }
}
