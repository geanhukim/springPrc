package hi.hello.order;

public class Order {

    @Override
    public String toString() {
        return "Order{" +
                "memberId=" + memberId +
                ", movie='" + movie + '\'' +
                ", moviePrice=" + moviePrice +
                ", discountPrice=" + discountPrice +
                '}';
    }

    private Long memberId;
    private String movie;
    private int moviePrice;
    private int discountPrice;

    public Order(Long memberId, String movie, int moviePrice, int discountPrice) {
        this.memberId = memberId;
        this.movie = movie;
        this.moviePrice = moviePrice;
        this.discountPrice = discountPrice;
    }

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public String getMovie() {
        return movie;
    }

    public void setMovie(String movie) {
        this.movie = movie;
    }

    public int getMoviePrice() {
        return moviePrice;
    }

    public void setMoviePrice(int moviePrice) {
        this.moviePrice = moviePrice;
    }

    public int getDiscountPrice() {
        return discountPrice;
    }

    public void setDiscountPrice(int discountPrice) {
        this.discountPrice = discountPrice;
    }

}
