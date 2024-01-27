package Functions_As_Paramter;

public class FilterHotelLessThan implements FilteringCondition{

    @Override
    public boolean test(Hotel hotel) {
        return hotel.getPricePerNight()<=2000;
    }
   
    
}
