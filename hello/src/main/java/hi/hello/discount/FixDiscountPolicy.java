package hi.hello.discount;

import hi.hello.member.Grade;
import hi.hello.member.Member;

public class FixDiscountPolicy implements DiscountPolicy{

    private int goldDiscount = 3000;
    private int silverDiscount = 2000;
    private int bronzeDiscount = 1000;

    @Override
    public int discount(Member member, int moviePrice) {
        if(member.getGrade() == Grade.GOLD) {
            return goldDiscount;
        } else if(member.getGrade() == Grade.SILVER) {
            return silverDiscount;
        } else {
            return bronzeDiscount;
        }
    }
    
}
