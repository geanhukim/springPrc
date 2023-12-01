package hi.hello;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import hi.hello.member.Grade;
import hi.hello.member.Member;
import hi.hello.member.MemberService;
import hi.hello.member.MemberServiceImpl;
import hi.hello.order.Order;
import hi.hello.order.OrderService;
import hi.hello.order.OrderServiceimpl;

public class OrderTest {
    MemberService memberService = new MemberServiceImpl();
    OrderService orderService = new OrderServiceimpl();

    @Test
    void createOrder() {
        Long memberId = 1L;
        Member member = new Member(memberId, "memberA", Grade.GOLD);
        memberService.join(member);

        Order order = orderService.createOrder(memberId, "Titanic", 10000);
        Assertions.assertThat(order.getDiscountPrice()).isEqualTo(3000);
    }
}
