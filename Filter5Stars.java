package Functions_As_Paramter;

public class Filter5Stars implements FilteringCondition {
           @Override
           public boolean test(Hotel hotel){
            return hotel.getHotelType()==HotelType.FIVE_STAR;
           } 
}
