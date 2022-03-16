public class main {
    public static void main(String[] args) {
        dog doggo = new dog("loki", 3, true,true,"Husky");
        System.out.println(doggo.getAge());
        System.out.println(doggo.getBreed());
        System.out.println(doggo.getName());
        System.out.println(doggo.hasWalked());
        System.out.println(doggo.isVaccinated());
        doggo.adopt();
        doggo.feed();
        doggo.giveHug();
        doggo.isGoodDoggo();

        cat kittie = new cat("Tabi", 2, true, "TAAABBBBBEEEEEE", "6 Pawed");
        System.out.println(kittie.getAge());
        System.out.println(kittie.getBreed());
        System.out.println(kittie.getName());
        System.out.println(kittie.getNickname());
        System.out.println(kittie.isVaccinated());
        kittie.adopt();
        kittie.feed();
        kittie.giveHug();
        kittie.getNickname();
    }
}
