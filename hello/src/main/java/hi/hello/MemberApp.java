package hi.hello;

import hi.hello.member.Grade;
import hi.hello.member.Member;
import hi.hello.member.MemberService;
import hi.hello.member.MemberServiceImpl;

public class MemberApp {

    public static void main(String[] args) {
        MemberService memberService = new MemberServiceImpl();

        Member member = new Member(1L, "memberA", Grade.GOLD);
        memberService.join(member);

        Member foundMember = memberService.findMember(1L);
        System.out.println(member.getUsername());
        System.out.println(foundMember.getUsername());
    }
}
