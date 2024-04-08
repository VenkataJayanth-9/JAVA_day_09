public class Main {
    public static void main(String[] args){
        Computercase theCase = new Computercase("3000", "Dell", "65");
        Monitor theMonitor = new Monitor("3000, 15.6 based", "Dell", 27, "2540 x 1440");
        Motherboard theMotherboard = new Motherboard("3000", "Dell", 16, 6, "v2,44");
        PersonalComputer thePC = new PersonalComputer("3000", "Dell", theCase, theMonitor, theMotherboard);

//        thePC.getMonitor().drawPixelAt(10, 10, "red");
//        thePC.getMotherboard().loadProgram("Windows OS");
//        thePC.getComputercase().pressPowerButton();

        thePC.powerUp();
    }
}
