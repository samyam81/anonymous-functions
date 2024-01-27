package Functions_As_Paramter;

import java.util.ArrayList;
import java.util.List;

public class HotelService {
    List <Hotel> hotels= new ArrayList<>();
    public HotelService(){
      hotels.add(new Hotel(2000, 2,HotelType.THREE_STAR));  
      hotels.add(new Hotel(1000, 1,HotelType.THREE_STAR));
        hotels.add(new Hotel(6000, 4,HotelType.FIVE_STAR));
    }
    public List<Hotel> filterHotels(FilteringCondition filteringCondition)
    {
        List<Hotel> filterHotels=new ArrayList<>();

        for(Hotel hotel:hotels){
            if(filteringCondition.test(hotel))
                filterHotels.add(hotel);
        }
        return filterHotels;
    }
}

