public class HotelApp {
    public static void main(String[] args) {
        HotelService valet = new Valet();
        HotelService houseKeeping = new HouseKeeping();
        HotelService cart = new Cart();
        
        FrontDesk facade = new FrontDesk(valet, houseKeeping, cart);

        facade.requestValetService("ABC123");
        facade.requestHouseKeepingService(505);
        facade.requestCartService(2);
    }
}