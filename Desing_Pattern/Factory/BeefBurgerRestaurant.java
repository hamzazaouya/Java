public class BeefBurgerRestaurant extands Restaurant {
    @Override
    public Burger createBurger() {
        return (new BeefBurger());
    }
}