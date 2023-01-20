package aljob_추천이벤트;

import java.util.ArrayList;

public class One {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> aList =new ArrayList<ArrayList<Integer>>();

        ArrayList<Integer> a1= new ArrayList<>();
        a1.add(1);
        a1.add(2);
        aList.add(a1);

        ArrayList<Integer> a2= new ArrayList<>();
        a2.add(3);
        aList.add(a2);

        for(int i=0; i<aList.size();i++){
            for(int j=0; j< aList.get(i).size();j++){
                System.out.println(aList.get(j)+ " ");
            }
            System.out.println();
        }
    }
}
