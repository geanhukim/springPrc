package hi.hello.discount;

import hi.hello.member.Member;

public interface DiscountPolicy {
    int discount(Member member, int moviePrice);
}
