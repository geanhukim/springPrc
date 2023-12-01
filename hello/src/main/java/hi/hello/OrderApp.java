package hi.hello;

import hi.hello.member.Grade;
import hi.hello.member.Member;
import hi.hello.member.MemberService;
import hi.hello.member.MemberServiceImpl;
import hi.hello.order.Order;
import hi.hello.order.OrderService;
import hi.hello.order.OrderServiceimpl;

public class OrderApp {
    public static void main(String[] args) {
        MemberService memberService = new MemberServiceImpl();
        OrderService orderService = new OrderServiceimpl();

        Long memberId = 1L;
        Member member = new Member(memberId, "memberA", Grade.GOLD);
        memberService.join(member);

        Order order = orderService.createOrder(memberId, "Titanic", 10000);
        System.out.println(order);
        
    }
}
