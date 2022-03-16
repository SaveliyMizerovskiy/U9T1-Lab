public class animal {
    String name = "";
    int age = 0;
    boolean vaccinated = false;
    String breed = "";

    public animal(String name, int age, boolean vaccinated, String breed) {
        this.age = age;
        this.name = name;
        this.vaccinated = vaccinated;
        this.breed = breed;
    }

    public void adopt(){
        System.out.println("Has been adopted");
    }

    public void feed(){
        System.out.println("Has been fed");
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public boolean isVaccinated(){
        return vaccinated;
    }

    public void giveHug(){
        System.out.println("Has been hugged");
    }

    public String getBreed(){
        return breed;
    }

}
