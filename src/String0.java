public class String0 {
    public static void main(String[] args) {
        char c1='\u27F6';
        char c2='\u2915';
        System.out.println(c1);
        System.out.println(c2);
        String s=""+c1+c2;
        System.out.println(s);

        //сравнение
        String s1="first";
        String s2="first1";
        int i = s1.compareTo(s2);
        System.out.println(i);

        //конкатенация
        s1=s1.concat(s2);
        System.out.println(s1);

        //проверка наличия цифр и букв или букв
        s1= "123a";
        System.out.println(isContainsOnlyDigits(s1));
        // содержит ли строка заданную подстроку
        s1= "good";
        s2="oob";
        System.out.println(s1.contains(s2));

        //заменить символ '.' на ',' в строке
        s1="Why.";
        int pos=s1.indexOf('.');
        System.out.println(pos);

        s1=s1.replace('.','?');
        System.out.println(s1);
        //извлечь подстроку "JVM"
        s1="JDK vs JRE vs JVM";
        //Runtime environment
        String jvm=s1.substring(14);
        System.out.println(jvm);

    }

    private static boolean isContainsOnlyDigits(String s){
boolean result = true;
for (int i=0; i<s.length();i++)
{
    char c = s.charAt(i);
    if (!Character.isDigit(c))result=false;
}
return result;
    }



}



