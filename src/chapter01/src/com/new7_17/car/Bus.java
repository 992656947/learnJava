package chapter01.src.com.new7_17.car;

public class Bus extends MotoVehicle  {
    private int SeatNumber;

    public Bus(String No, String Brand, String Color, int Mileage, int seatNumber) {
        super(No, Brand, Color, Mileage);
        SeatNumber = seatNumber;
    }

    public int getSeatNumber() {
        return SeatNumber;
    }
    public void setSeatNumber(int seatNumber) {
        SeatNumber = seatNumber;
    }

    public int calcRent(int day){
        if(SeatNumber<=16){
            return 800*day;
        }else{
            return 1500*day;
        }
    }
}
