public class iPhoneFifteen implements Phone {
    private String  model;
    private int     memory;
    private int     ram;
    private int     battery;

    iPhoneFifteen () {

    }
    iPhoneFifteen (String model, int memory, int ram, int battery) {
        this.model = model;
        this.memory = memory;
        this.ram = ram;
        this.battery = battery;
    }

    @Override
    public void interduce() {
        System.out.println("Phone Model: " + this.model);
        System.out.println("Phone Memory: " + this.memory);
        System.out.println("Phone Ram: " + this.ram);
        System.out.println("Phone Battery: " + this.battery);
    }

    public void setModel(String model) {
        this.model = model;
    }
    public String   getModel() {
        return (this.model);
    }
    public void setMemory(int memory) {
        this.memory = memory;
    }
    public int  getMemroy() {
        return(this.memory);
    }
    public void     setRam(int ram) {
        this.ram = ram;
    }
    public int      getRam() {
        return (this.ram);
    }
    public void     setBattery(int batter) {
        this.battery = batter;
    }
    public int      getBattery() {
        return (this.battery);
    }
}