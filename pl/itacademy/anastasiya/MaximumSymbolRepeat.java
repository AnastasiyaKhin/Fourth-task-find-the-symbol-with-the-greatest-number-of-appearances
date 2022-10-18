package pl.itacademy.anastasiya;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MaximumSymbolRepeat {
    public static int maxCountSymbolRepeat(String str) {
        Pattern symb = Pattern.compile("(?=(.))\\1{2,}");
        Matcher matcher = symb.matcher(str);
        int count = 0;
        while (matcher.find()) {
            String repeatSymbol = matcher.group();
            System.out.println(repeatSymbol);
            if (repeatSymbol.length() > count) {
                count = repeatSymbol.length();
            }
        }
        return count;
    }
}
