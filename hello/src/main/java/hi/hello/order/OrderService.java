package hi.hello.order;

public interface OrderService {
    Order createOrder(Long memberId, String movie, int moviePrice);
}
