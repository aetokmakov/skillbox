public class CatKiller {

    private Cat cat;

    public CatKiller(Cat cat) {
        this.cat = cat;
    }

    public void explode() {
        while(!cat.getStatus().equals("Exploded")) {
            cat.feed(10.0);
        }
        System.out.println(cat.getStatus());
    }

    public void overMeow() {
        while(!cat.getStatus().equals("Dead")) {
            cat.meow();
        }
        System.out.println(cat.getStatus());
    }
}
