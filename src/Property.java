public class Property {
    Address addresses;
    private int roomsNumber;
    private float price;
    private String propertyType;
    private boolean isForRent;
    private int houseNumber;
    private int floorNumber;
    private String postedUser;

    public Property(Address addresses, int roomsNumber, float price, String propertyType,
                    boolean isForRent, int houseNumber, int floorNumber, String postedUser) {
        this.addresses = addresses;
        this.roomsNumber = roomsNumber;
        this.price = price;
        this.propertyType = propertyType;
        this.isForRent = isForRent;
        this.houseNumber = houseNumber;
        this.floorNumber = floorNumber;
        this.postedUser = postedUser;
    }

}
