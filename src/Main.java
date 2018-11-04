import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        String text = "Mam na imie Lukasz i mieszkam w Polsce.  Moj adres email to lukaszdusza280@gmail.com";


        Pattern pattern = Pattern.compile("Lukasz");
        Matcher matcher = pattern.matcher(text);

     //   System.out.println(matcher.find());
     //   System.out.println(matcher.matches());

        //  find() - metoda zwraca true jeśli w łańcuchu znaków znajduje się coś co pasuje do wyrażenia regularnego,
        //  matches() - metoda zwraca true jeśli łańcuch znaków pasuje w całości do wyrażenia regularnego.

        Pattern patternEmail = Pattern.compile("([a-z0-9])+@+([a-z])+(\\.)+([a-z]{3}$)");
        Matcher matcher2 = patternEmail.matcher(text);

        if(matcher2.find()) {
            System.out.println(matcher2.group());
        } else {
            System.out.println("not found");
        }



    }


}
