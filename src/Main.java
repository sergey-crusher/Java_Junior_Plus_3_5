public class Main {
    public static void main(String[] args)
    {
        Monster mnstr1 = new Monster();
        Monster mnstr2 = new Monster(4);
        Monster mnstr3 = new Monster(8,4,6);

        mnstr1.voice();
        mnstr3.voice(1, "I feel like a monster");
        mnstr2.voice(2);
    }
}