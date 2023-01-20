package com.collection.arrayList;

import com.collection.Member;

import java.util.ArrayList;

public class MemberArrayList {
    private ArrayList<Member> arrayList;

    public MemberArrayList(){
        arrayList =new ArrayList<>();
    }

    public void addMember(Member member){
        arrayList.add(member);
    }

    public boolean removeMember(int memberId) {
        for (int i = 0; i < arrayList.size(); i++) {
            Member member = arrayList.get(i);
            int tempId = member.getMemberId();
            if (memberId == tempId) {
                arrayList.remove(i);
                return true;
            }
        }
        System.out.println(memberId + "존재하지않습니다");
        return false;
    }

    public void showAll(){
        for(Member member : arrayList){
            System.out.println(member);
        }
        System.out.println(arrayList);
    }
}
