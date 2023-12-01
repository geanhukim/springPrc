package hi.hello.order;

import hi.hello.discount.DiscountPolicy;
import hi.hello.discount.FixDiscountPolicy;
import hi.hello.member.Member;
import hi.hello.member.MemberRepository;
import hi.hello.member.MemoryMemberRepository;

public class OrderServiceimpl implements OrderService{

    private MemberRepository memberRepository = new MemoryMemberRepository();
    private DiscountPolicy discountPolicy = new FixDiscountPolicy();

    @Override
    public Order createOrder(Long memberId, String movie, int moviePrice) {
        Member member = memberRepository.findById(memberId);
        int discountPrice = discountPolicy.discount(member, moviePrice);

    return new Order(memberId, movie, moviePrice, discountPrice);
    }
    
}
