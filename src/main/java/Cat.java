public class Cat implements Cloneable
{
    private double originWeight;
    private double weight;
    private double amountOfFeed;
    private CatColor catColor;

    private static final double MIN_WEIGHT = 1000.0;
    private static final double MAX_WEIGHT = 9000.0;
    public static final int EYES_COUNT = 2;

    private static int count = 0;

    public Cat()
    {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        count++;
    }

    public Cat(double originWeight) {
        this.weight = originWeight;
        this.originWeight = originWeight;
        count++;
    }

    public void meow()
    {
        if (isAlive()) {
            weight = weight - 1;
            System.out.println("Meow");
        } else {
            System.out.println("Cat is dead!");
        }
    }

    public void feed(Double amount)
    {
        if (isAlive()) {
            weight = weight + amount;
            amountOfFeed = amountOfFeed + amount;
        } else {
            System.out.println("Cat is dead!");
        }
    }

    public void drink(Double amount)
    {
        if (isAlive()) {
            weight = weight + amount;
        } else {
            System.out.println("Cat is dead!");
        }
    }

    public Double getWeight()
    {
        return weight;
    }

    public String getStatus()
    {
        if(weight < MIN_WEIGHT) {
            return "Dead";
        }
        else if(weight > MAX_WEIGHT) {
            return "Exploded";
        }
        else if(weight > originWeight) {
            return "Sleeping";
        }
        else {
            return "Playing";
        }
    }

    public double getAmountOfFeed() {
        return amountOfFeed;
    }

    public void pee() {
        if (isAlive()) {
            weight = weight - 1000 * Math.random();
            System.out.println("I just make a pee");
        } else {
            System.out.println("Cat is dead!");
        }
    }

    public static int getCount() {
        return count;
    }

    private Boolean isAlive() {
        return !(weight < MIN_WEIGHT) && !(weight > MAX_WEIGHT);
    }

    public CatColor getCatColor() {
        return catColor;
    }

    public void setCatColor(CatColor catColor) {
        this.catColor = catColor;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
