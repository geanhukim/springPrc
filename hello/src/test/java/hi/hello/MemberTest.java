package hi.hello;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import hi.hello.member.Grade;
import hi.hello.member.Member;
import hi.hello.member.MemberService;
import hi.hello.member.MemberServiceImpl;

public class MemberTest {
    MemberService memberService = new MemberServiceImpl();

    @Test
    void join() {
        // given
        Member member = new Member(1L, "memberA", Grade.BRONZE);

        // when
        memberService.join(member);
        Member foundMember = memberService.findMember(1L);

        // then
        Assertions.assertThat(member).isEqualTo(foundMember);
    }

}
