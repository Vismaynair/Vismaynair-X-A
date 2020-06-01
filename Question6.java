public class Question6
{
    public static void main(String args[])
    {
        String s="Java is an easy programming language";
        String[] word=s.split(" ");
        String rts=" ";
        for(int i=0;i<word.length;i++)
        {
            if(word[i].length()>=rts.length())
            {
             rts=word[i];
            }
       }
       System.out.println(rts);
       System.out.println(rts.length());
}
}