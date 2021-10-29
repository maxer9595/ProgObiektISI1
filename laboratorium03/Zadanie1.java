package pl.edu.uwm.wmii.marcelmrozowski.laboratorium03;

public class Zadanie1 {
    public static int countChar(String str, char c)
    {
        int wynik=0;
        for(int i=0; i<str.length(); i++)
        {
            if(str.charAt(i)==c)
            {
                wynik++;
            }
        }
        return  wynik;
    }
    public static int countSubStr(String str, String subStr)
    {
        int wynik=0;

        for(int i=0; i<str.length(); i++)
        {
            if(str.charAt(i)==subStr.charAt(0))
            {
                int plus=1;
                for(int j=0; j<subStr.length(); j++)
                {
                    if(subStr.charAt(j)!=str.charAt(i+j)) {
                        plus = 0;
                        break;
                    }
                }
                wynik+=plus;
            }
        }
        return wynik;
    }
    public static String middle(String str)
    {
        String wynik="";
        if(str.length()%2==0)
        {
            wynik+=str.charAt(str.length()/2-1);
            wynik+=str.charAt(str.length()/2);
        }
        else
            wynik+=str.charAt(str.length()/2);

        return wynik;

    }
    public static String repeat(String str, int n)
    {
        String wynik="";
        for(int i=0; i<n; i++)
        {
            wynik+=str;
        }
        return wynik;
    }
    public static int[] where(String str, String subStr)
    {
        int n=Zadanie1.countSubStr(str, subStr);
        int[] tab=new int[n];
        int aktualny=0;
        for(int i=0; i<n; i++)
        {
           if(str.charAt(i)==subStr.charAt(0))
           {
               boolean jest=true;
               for(int j=0; j<subStr.length(); j++)
               {
                   if(str.charAt(i+j)!=subStr.charAt(j))
                       jest=false;
               }
               tab[aktualny]=i;
               aktualny++;
           }
        }
        return tab;
    }
    public static String change(String str){
        StringBuffer buffer = new StringBuffer("");
        for(int i = 0; i<str.length(); i++){
            if((int)str.charAt(i) < 97)
                buffer.append(Character.toLowerCase(str.charAt(i)));
            else
                buffer.append(Character.toUpperCase(str.charAt(i)));
        }

        return buffer.toString();
    }

    public static String nice(String str, char sep, int interval){
        StringBuffer buffer = new StringBuffer("");
        for(int i = 0; i<str.length(); i++){
            if((str.length()-i)%interval == 0 && i != 0)
                buffer.append(sep);
            buffer.append(str.charAt(i));
        }
        buffer.append(sep);

        return buffer.toString();
    }
}