package exercisez;

public class Sadness {
    public static void main(String[] args) {

        printStatus(8);
        printStatus(5);
        printStatus(12);

    }
    //young dog from 0 to 2
    //adult dog from 3 to 8
    //old dog from 9 to 15

    public static void printStatus (int age){
        if (age >= 0 && age <=2){
            System.out.printf("the dog is young with age %d \n",age);
        }else if (age >=3 && age <=8){
            System.out.printf("the dog is adult with age %d \n", age);
        }else if (age >=9 && age <=15){
            System.out.printf("the dog is old with age %d \n", age);
        }else {
            System.out.println("invalid age");
        }
    }
}
