package cs.stringbuilder;

import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        StringBuilder stringBuilder = new StringBuilder();
        ArrayList<String> list = new ArrayList<>();
        list.add("첫 번째, ");
        list.add("두 번째, ");
        list.add("세 번째, ");
        list.add("네 번째, ");
        list.add("다섯 번째");
        for (int i = 0; i < list.size(); i++)
        {
            stringBuilder.append(list.get(i));
        }


        System.out.println(stringBuilder);


        for (int i = 0; i < list.size(); i++)
        {
            stringBuilder.delete(0, 6);
        }

        System.out.println(stringBuilder);

    }

}