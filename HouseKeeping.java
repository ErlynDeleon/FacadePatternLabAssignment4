public class HouseKeeping implements HotelService {
    @Override
    public void cleanRoom(int roomNumber) {
        System.out.println("Cleaning room #" + roomNumber);
    }

    @Override
    public void pickUpVehicle(String plateNumber) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void requestCart(int numberOfCarts) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}