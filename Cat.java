import java.util.Random;
import java.util.Scanner;

public class Cat {
    private int age = -1;           //Setting default values of a completely unknown cat.
    private char sex = 'u';         //u for unknown.
    private String name = "Stray";
    private boolean stray = true;

    enum FemaleNames{
        Luna, Bella, Lucy, Sophie, Stella, Lily, Lola, Ginger, Oreo, Olive, Mank, Molly, Cocoa, Fluffy, Glados;

        public static String generateRandomName() {
            FemaleNames[] values = FemaleNames.values();
            int length = values.length;
            int randIndex = new Random().nextInt(length);
            return values[randIndex].toString();
        }
    }
    enum MaleNames{
        Charlie, Leo, Max, Simon, Oscar, Shadow, Milo, Jack, Oliver, Cookie, Oreo, Smokey, Buddy, George, Demon;

        public static String generateRandomName() {
            MaleNames[] values = MaleNames.values();
            int length = values.length;
            int randIndex = new Random().nextInt(length);
            return values[randIndex].toString();
        }
    }
                        //There are many constructors since we may know any combination of the cat's properties.
    public Cat(){       //We may even know nothing about the cat.
    }

    public Cat(int age, char sex, String name){
        this.age = age;
        this.sex = sex;
        this.name = name;
        this.stray = false;
    }

    public Cat(char sex, String name){
        this.sex = sex;
        this.name = name;
        this.stray = false;
    }

    public Cat(int age, String name){
        this.age = age;
        this.name = name;
        this.stray = false;
    }

    public Cat(int age, char sex){
        this.age = age;
        this.sex = sex;
        this.stray = false;
    }

    public Cat(int age){
        this.age = age;
        this.stray = false;
    }

    public Cat(char sex){
        this.sex = sex;
        this.stray = false;
    }

    public Cat(String name){
        this.name = name;
        this.stray = false;
    }
                        //This method assigns values to the cat's attributes based on the information it already has.
    public void investigateKitty(){
        System.out.println("Investigating Kitty...\n");
        Random rand = new Random();

        if (stray){                                                     //If cat is stray.

            System.out.println("This kitty is a stray!");

            this.age = rand.nextInt(15);        //Random Age.
            System.out.println("I'm " + age + " years old!");
            if(age>11){
                System.out.println("I'm getting pretty old :3");
            }

            if(rand.nextBoolean()){                   //Random Sex and name.
                this.sex = 'f';
                this.name = FemaleNames.generateRandomName();
                System.out.println("I'm a female and my name is " + name + "!");
            }
            else {
                this.sex = 'm';
                this.name = MaleNames.generateRandomName();
                System.out.println("I'm a male and my name is " + name + "!");
            }

        }else{                                                          //If cat is not stray.

            System.out.println("This kitty isn't a stray!");
            if(age != -1) {                                     //The default value for age is -1, meaning it's unknown.
                System.out.println("I'm " + age + " years old!");
            }else{
                this.age = rand.nextInt(15);
                System.out.println("I don't know my age? Maybe I'm " + age + " years old.");
            }
            if(age>11){
                System.out.println("I'm getting pretty old :3");
            }
            switch (sex) {
                case 'u' -> {                   //If the sex has the default value, assign one at random.
                    String randomSex;
                    if (rand.nextBoolean()) {
                        this.sex = 'f';
                        randomSex = "female";
                    } else {
                        this.sex = 'm';
                        randomSex = "male";
                    }
                    System.out.println("I don't know my sex! Maybe I'm a " + randomSex + ".");
                }
                case 'f' -> System.out.println("I'm a female!");
                case 'm' -> System.out.println("I'm a male!");
            }
            if(name.equals("Stray")){           //If the cat has no name, then the user can name it.
                Scanner keyboard = new Scanner(System.in);
                System.out.println("I don't know my name! Can you name me? :3\n");
                this.name = keyboard.nextLine();
                System.out.print("Okay! My name is " + name);

            }else{
                System.out.print("My name is " + name + "!");
            }
        }
        System.out.println("\n");
    }
    //In this method the cat simply does something cat-like.
    public void silly(){
        Random rand = new Random();
        int x = rand.nextInt(10);
        switch (x) {
            case 0 -> System.out.println(name + " plays with a yarn ball!");
            case 1 -> System.out.println(name + " falls asleep...");
            case 2 -> System.out.println(name + " eats some food!");
            case 3 -> System.out.println(name + " does a backflip!");
            case 4 -> System.out.println(name + " meows really loud!");
            case 5 -> System.out.println(name + " chases nothing for a bit.");
            case 6 -> System.out.println(name + " begs for treats.");
            case 7 -> System.out.println(name + " makes biscuits on you!");
            case 8 -> System.out.println(name + " stares at the cats outside for a while.");
            case 9 -> System.out.println(name + " jumps on your keyboarsedcrtwsedcrtwsedcrtwsedcr");
        }
    }
    //Getters and Setters.
    public int getAge(){return age;}

    public void setAge(int age){this.age = age;}

    public char getSex(){return sex;}

    public void setSex(char sex){this.sex = sex;}

    public String getName(){return name;}

    public void setName(String name){
        this.name = name;
        System.out.print("You've named me! Now I'm not a stray anymore :3\n");
        this.stray = false;
    }

    public boolean getStray(){return this.stray;}

    public void setStray(boolean stray){this.stray = stray;}

}
