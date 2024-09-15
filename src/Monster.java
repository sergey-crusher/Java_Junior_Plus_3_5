import java.io.Console;

public class Monster {
    int eyes;
    int hands;
    int legs;

    Monster()
    {
        this(2);
    }

    Monster(int count)
    {
        this(count, count, count);
    }

    Monster(int eyes, int hands, int legs)
    {
        this.eyes = eyes;
        this.hands = hands;
        this.legs = legs;
    }

    void voice()
    {
        this.voice(1);
    }

    void voice(int count)
    {
        this.voice(count, "Brrrrrr...");
    }

    void voice (int count, String word)
    {
        for (int i = 0; i < count; i++)
        {
            System.out.println(word);
        }
    }
}
