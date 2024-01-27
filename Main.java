package Functions_As_Paramter;

import java.util.List;


public class Main {
    public static void main(String[] args) {
            HotelService hotelService=new HotelService();
            List<Hotel> hotels=hotelService.filterHotels(new FilterHotelLessThan());
            System.out.println("list of hotels price less than 2000"+hotels);
}
}
