package aljob_문자열;

import cs.list.list;

import java.util.*;


/*
    alalgogalgoorithm
    algo
 */
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String s = scan.nextLine(); // 문자열 s
        String p = scan.nextLine(); // 문자열 p

        List<String> str = Arrays.asList(s.split("")); // 문자열 split 후 List에 넣기

        System.out.println(p);
        System.out.println(str);
        System.out.println(s);


//        List<String> remove =  Arrays.asList(p.split(""));

        int cnt = 0;

        for(int i=0 ; i<str.size();i++){

            if(s==p){

            }


        }



//        Iterator iter = str.iterator();
//        while (iter.hasNext() == true) { // 읽어올 요소가 남아있는지 확인하는 메서드, 요소가 있으면 true, 없으면 false
//            String num = (String) iter.next();
//            if (num == p) {
//                iter.remove();
//            }
//            cnt ++ ;
//        }



        System.out.println(cnt);


    }
}
