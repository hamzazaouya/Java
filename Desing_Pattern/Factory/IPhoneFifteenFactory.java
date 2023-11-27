public class IPhoneFifteenFactory extends PhoneFactory {
    @Override
    public Phone createPhone() {
        return (new iPhoneFifteen());
    }
}