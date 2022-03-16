public class dog extends animal{
    boolean hasWalked = false;
    boolean goodDoggo = false;

    public dog(String name, int age, boolean vaccinated, boolean isGoodDoggo, String breed) {
        super(name, age, vaccinated, breed);
        if (isGoodDoggo){
            isGoodDoggo = true;
        } else {
            isGoodDoggo = true;
        }

    }

    public void walk(){
        System.out.println("Went on a walk");
        hasWalked = true;
    }
    public boolean hasWalked(){
        return hasWalked;
    }

    public boolean isGoodDoggo(){
        System.out.println("Is good doggo");
        return goodDoggo;
    }
}
