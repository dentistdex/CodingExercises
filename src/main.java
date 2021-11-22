public class main {
    public static void main(String[] args) {

        SpeedConverter.printConversion(45);
        SpeedConverter.printConversion(78);
        SpeedConverter.printConversion(-45);
        SpeedConverter.printConversion(-12);
        SpeedConverter.printConversion(5);
        SpeedConverter.printConversion(16.4);

        MegaBytesConverter.printMegaBytesAndKiloBytes(8000);

        BarkingDog.shouldWakeUp(true , 6);
        AreaCalculator.area(6);
        MinutesToYearsAndDays.printYearsAndDays(561600);
        PlayingCat.isCatPlaying(false,45);
    }
}
