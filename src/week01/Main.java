package week01;

/**
 * Created by waps12b on 2016. 1. 9..
 */
public class Main {
    public static void main(String[] args)
    {

        Fighter fighter = new Fighter();

        Fighter fighter1 = new Fighter();

        Fighter fighter2 = new Fighter(true);

        Fighter fighter3 = new Fighter(true);

        Fighter.makeFriend(fighter1, fighter2);

        String str = String.format("[%d]\n", 1);

    }
}
