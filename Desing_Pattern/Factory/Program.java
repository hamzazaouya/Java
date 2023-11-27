public class Program {
    public static void main(String [] arg) {

        IPhoneThirteenFactory iPhoneThirteenFactory = new IPhoneThirteenFactory();
        IPhoneFourteenFactory iPhoneFourteenFactory = new IPhoneFourteenFactory();
        IPhoneFifteenFactory iPhoneFifteenFactory = new IPhoneFifteenFactory();

        Phone iPhoneThirteenMini = iPhoneThirteenFactory.createPhone();
        Phone iPhoneFourteenMax = iPhoneFourteenFactory.createPhone();
        Phone iPhoneFifteen = iPhoneFifteenFactory.createPhone();

        iPhoneThirteenMini.setModel("iPhone 13 Mini");
        iPhoneThirteenMini.setMemory(128);
        iPhoneThirteenMini.setRam(4);
        iPhoneThirteenMini.setBattery(2438);
        iPhoneThirteenMini.interduce();

        iPhoneFourteenMax.setModel("iPhone 14 Max");
        iPhoneFourteenMax.setMemory(128);
        iPhoneFourteenMax.setRam(6);
        iPhoneFourteenMax.setBattery(3000);
        iPhoneFourteenMax.interduce();

        iPhoneFifteen.setModel("iPhone 15 Pro");
        iPhoneFifteen.setMemory(128);
        iPhoneFifteen.setRam(6);
        iPhoneFifteen.setBattery(4000);
        iPhoneFifteen.interduce();
    }
}