public class IPhoneFourteenFactory extends PhoneFactory {
    @Override
    public Phone createPhone() {
        return (new iPhoneFourteen());
    }
}