package ua.lviv.iot.datesRecorder;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DateRecorder {
    private static final String DATE_REGEX = "(?:(?:31(\\/|\\.)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)(\\/|\\.)(?:0?[13-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/|\\.)0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])(\\/|\\.)(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})";
    private static final String TEXT = """
            28/2/2004\s
            29.2.2003\s
            31-1-2010\s
            31.1.2010""";


    public static String recordDates() {
        Pattern p = Pattern.compile(DATE_REGEX);
        Matcher m = p.matcher(TEXT);
        StringBuilder sb = new StringBuilder();

        while(m.find()){
            sb.append(m.group());
            sb.append("\n");
        }

        return sb.toString();
    }
}