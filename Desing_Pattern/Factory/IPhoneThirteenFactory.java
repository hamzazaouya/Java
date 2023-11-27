public class IPhoneThirteenFactory extends PhoneFactory {
    @Override
    public Phone createPhone() {
        return (new iPhoneThirteen());
    }
}