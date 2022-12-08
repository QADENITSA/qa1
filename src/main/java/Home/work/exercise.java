package Home.work;

public class exercise {
    public static void main(String[] args) {
        Dog sharpei = new Dog();
        Dog sharpei2 = new Dog();

        Dog.breedgroup = "Lazy";
        sharpei.age = 8;
        sharpei.name = "Bucksy ";
        sharpei.sex = "male";
        sharpei2.age = 3;
        sharpei2.name = "Bimba ";
        sharpei2.sex = "female";
        System.out.println("Data for" + "  " + sharpei.name + "  " + sharpei.age + "  " + sharpei.sex + "  " + " " + Dog.breedgroup);
        System.out.println("Data for" + "  " + sharpei2.name + "  " + sharpei2.age + "  " + sharpei2.sex + "  " + " " + Dog.breedgroup);

    }
}




