package regex;

/**
 * @author Imildo Sitoe
 * */
public class Regex {
    public static void main(String[] args) {
        boolean e;

        //Modificadores
        String s="Imildo";
        boolean b=s.matches("Imildo"); //return TRUE
        boolean c=s.matches("imildo"); //return FALSE
        boolean d=s.matches("(?i)imildo"); //return TRUE(Match Ignoring Case)

        //Metacaracteres
        e = "#".matches("."); //return TRUE
        e = "3 ".matches("\\d\\s"); //return TRUE [Se forem 5 dígitos tem que por 5 regex's]

        //Quantificadores
        e = "12".matches("\\d{2}"); //return TRUE (Search 2 ocorrences)
        e = "12345".matches("\\w{2,5}");
        e = "ABCD".matches(".*"); // 0 ou +

        //Validar e-mail
        e = "poisonshade@gmail.com".matches("\\w{3,}@(?i)\\w{1,5}mail.co.+");
        //Validar data
        e="29/06/1810".matches("\\d{2}/\\d{2}/\\d{4}");
        System.out.println(e);
    }
}
