import java.util.ArrayList;
import java.util.List;

public class Loader
{
    public static void main(String[] args)
    {
        List<Cat> cats = new ArrayList<Cat>();
        for (int i = 0; i < 5; i++) {
           cats.add(new Cat());
        }

        for (int i = 0; i <= 1; i++) {
            Cat currentCat = cats.get(i);
            System.out.println("weight before feeding = " + currentCat.getWeight());
            currentCat.feed(100.0);
            System.out.println("weight after feeding = " + currentCat.getWeight());
        }

        Cat catForOverFeeding = cats.get(2);

        while(!catForOverFeeding.getStatus().equals("Exploded")) {
            catForOverFeeding.feed(10.0);
        }
        System.out.println(catForOverFeeding.getStatus());

        Cat catForOverMeowing = cats.get(3);
        while(!catForOverMeowing.getStatus().equals("Dead")) {
            catForOverMeowing.meow();
        }
        System.out.println(catForOverMeowing.getStatus());

        Cat catForTestingAmountOfFeed = cats.get(4);
        catForTestingAmountOfFeed.feed(150.0);
        catForTestingAmountOfFeed.pee();
        catForTestingAmountOfFeed.pee();
        catForTestingAmountOfFeed.pee();
        System.out.println("AmountOfFeed = " + catForTestingAmountOfFeed.getAmountOfFeed());

        System.out.println(Cat.getCount());
    }

    public static Cat getKitten() {
        return new Cat(1100.0);
    }
}
