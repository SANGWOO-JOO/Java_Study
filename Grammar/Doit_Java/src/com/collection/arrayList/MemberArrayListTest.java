package com.collection.arrayList;


import com.collection.Member;

public class MemberArrayListTest {
    public static void main(String[] args) {

        MemberArrayList memberArrayList = new MemberArrayList();

        Member memberLee = new Member(101, "이순신");
        Member memberKim = new Member(101, "김유신");
        Member memberShin = new Member(101, "신사임당");

        memberArrayList.addMember(memberLee);
        memberArrayList.addMember(memberKim);
        memberArrayList.addMember(memberShin);

        memberArrayList.showAll();
    }
}
