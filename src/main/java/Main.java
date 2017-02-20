import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Regular Expression Java Example project
public class Main {
    public static void main(String[] args){
        Pattern pattern = Pattern.compile("(\\d+)",Pattern.DOTALL);
        Matcher matcher = pattern.matcher("I am 26 Years Old in 2017 !");

        //matches entire string
        if(matcher.matches()){
            System.out.println("I am Matched");
        }

        //Finds matches and iterates over the result set
        while(matcher.find()){
            System.out.println("I Found ");
            System.out.println(matcher.groupCount());
            System.out.println(matcher.group(0));
        }
    }
}
