public class FootballMatchReports {    
    public static String onField(int shirtNum) {
        String value = " ";
        switch (shirtNum) {
            case 1:
                value =  "goalie";
                break;
            case 2:
                value =  "left back";
                break;
            case 3, 4:
                value =  "center back";
                break;
            case 5:
                value = "right back";
                break;
            case 6, 7, 8:
                value = "midfielder";
                break;
            case 9:
                value = "left wing";
                break;
            case 10:
                value = "striker";
                break;
            case 11:
                value = "right wing";
                break;
            default:
                value = "invalid";
                break;
        }
        return value;
    }
}
