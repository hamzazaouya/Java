public class VeggieRestaurant extands Restaurant {
    @Override
    public Burger createBurger() {
        return (new VeggieBurger());
    }
}