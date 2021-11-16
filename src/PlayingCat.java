public class PlayingCat {
//    public static boolean isCatPlaying (boolean summer , int tempature){
//        if (tempature <= 45 && tempature >= 25) {
//            return true;}
//    else if (summer == false && tempature <= 35 && tempature >= 25){
//                return true;
//  }else return false;  !!!!burda false,45 neden true çıkıyor anlamadım????

    public static boolean isCatPlaying(boolean summer, int temperature) {
        int upperLimit = summer ? 45 : 35;
        return temperature >= 25 && temperature <= upperLimit;
    }


}

