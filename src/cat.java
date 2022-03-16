public class cat extends animal{
    boolean hasPlayed = false;
    String nickname = "";

    public cat(String name, int age, boolean vaccinated, String nickname, String breed) {
        super(name, age, vaccinated, breed);
        this.nickname = nickname;
    }

    public void play(){
        System.out.println("Has played");
        hasPlayed = true;
    }

    public boolean hasPlayed(){
        return hasPlayed;
    }

    public String getNickname(){
        System.out.println(nickname);
        return nickname;
    }
}
