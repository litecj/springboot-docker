package net.litecj702.UserService.dish;

public class PoliteRestaurant {

    public static void main(String... args){
        PoliteServer server =
                new PoliteServer(new KitchenService());

        server.doingMyjob().subscribe(
                dish -> System.out.println("Consuming"+dish),
                throwable -> System.out.println(throwable));}
}
