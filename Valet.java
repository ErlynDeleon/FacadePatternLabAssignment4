public class Valet implements HotelService {
    @Override
    public void pickUpVehicle(String plateNumber) {
        System.out.println("Picked up vehicle: " + plateNumber);
    }

    @Override
    public void cleanRoom(int roomNumber) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void requestCart(int numberOfCarts) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}