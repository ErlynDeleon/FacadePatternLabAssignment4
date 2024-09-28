public class Cart implements HotelService {
    @Override
    public void requestCart(int numberOfCarts) {
        System.out.println(numberOfCarts + " luggage cart requested");
    }
    
    @Override
    public void cleanRoom(int roomNumber) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void pickUpVehicle(String plateNumber) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}