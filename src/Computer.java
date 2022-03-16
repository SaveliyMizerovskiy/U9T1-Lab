public class Computer {
    int screensize = 0;
    int memory = 0;

    public Computer(int screenSize, int memory){
        this.screensize = screenSize;
        this.memory = memory;
    }

    public void installOperatingSystem()
    {
        System.out.println("installing OS...");
    }
}
