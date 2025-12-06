public class LogLevels {
    
    public static String message(String logLine) {
        String msg = logLine.split("]:")[1];
        String trimText = msg.trim();
        return trimText;
    }

    public static String logLevel(String logLine) {
        String info = logLine.split("]:")[0];
        String formatedText = info.replace("[", "");
        String infoText = formatedText.toLowerCase();
        return infoText;
    }

    public static String reformat(String logLine) {
        String msg = message(logLine);
        String info = logLevel(logLine);
        return msg + " (" + info + ")";
    }
}
