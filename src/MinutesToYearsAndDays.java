public class MinutesToYearsAndDays {
    public static void printYearsAndDays (long minutes) {
        if (minutes < 0 ) {
            System.out.println("İnvalid Value");
        }else {
            long years = minutes / 525600 ;
            long days = (minutes - years * 525600) / 1440;
            System.out.println(minutes + " min " + "= " + years + " y and " + days + " d");
        }
    }
}
