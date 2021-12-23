import com.skillbox.airport.Aircraft;
import com.skillbox.airport.Airport;

import java.util.ArrayList;
import java.util.List;

public class Loader
{
    public static void main(String[] args)
    {
        // урок 1 - создание 5 кошек
        List<Cat> cats = new ArrayList<Cat>();
        for (int i = 0; i < 5; i++) {
           cats.add(new Cat());
        }

        // урок 1 - покормить кошку, распечатать вес и убедиться, что он изменился
        for (int i = 0; i <= 1; i++) {
            Cat currentCat = cats.get(i);
            System.out.println("weight before feeding = " + currentCat.getWeight());
            currentCat.feed(100.0);
            System.out.println("weight after feeding = " + currentCat.getWeight());
        }

        // урок 1 - перекорм кошки
        CatKiller exploder = new CatKiller(cats.get(2));
        exploder.explode();

        // урок 1 - замяукать кошку
        CatKiller meower = new CatKiller(cats.get(3));
        meower.overMeow();

        Cat catForTestingAmountOfFeed = cats.get(4);
        catForTestingAmountOfFeed.feed(150.0);
        catForTestingAmountOfFeed.pee();
        catForTestingAmountOfFeed.pee();
        catForTestingAmountOfFeed.pee();
        System.out.println("AmountOfFeed = " + catForTestingAmountOfFeed.getAmountOfFeed());

        // урок 3 - кол-во кошек
        System.out.println(Cat.getCount());

        // урок 8
        Airport airport = Airport.getInstance();
        List<Aircraft> aircrafts = airport.getAllAircrafts();
        System.out.println("Aircraft's count at the airport is " + aircrafts.size());
    }

    // урок 5
    public static Cat getKitten() {
        return new Cat(1100.0);
    }
}
