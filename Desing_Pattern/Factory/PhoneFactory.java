public abstract class PhoneFactory {
    PhoneFactory () {}
    public Phone orderPhone() {
        Phone phone = createPhone();
        phone.interduce();
        return (phone);
    }

    public abstract Phone createPhone();
}