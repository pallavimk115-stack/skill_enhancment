class OverCapacityException extends Exception {
    public OverCapacityException(String message) {
        super(message);
    }
}

class Bus {
    private String busNo;
    private int capacity;
    private int bookedSeats;

    public Bus(String busNo, int capacity) {
        this.busNo = busNo;
        this.capacity = capacity;
        this.bookedSeats = 0;
    }

    public void bookSeat(int seats) throws OverCapacityException {
        if (bookedSeats + seats > capacity) {
            throw new OverCapacityException("Error: Seats are full!");
        }
        bookedSeats += seats;
        System.out.println(seats + " seat(s) booked successfully.");
    }

    public void cancelSeat(int seats) {
        if (seats > bookedSeats) {
            System.out.println("Error: You cannot cancel more seats than booked!");
        } else {
            bookedSeats -= seats;
            System.out.println(seats + " seat(s) cancelled successfully.");
        }
    }

    public void showAvailableSeats() {
        System.out.println("Available Seats: " + (capacity - bookedSeats));
    }
}

public class BusSeatCheck {
    public static void main(String[] args) {
        try {
            Bus b = new Bus("KA01 AB 1234", 40);

            b.bookSeat(10);
            b.showAvailableSeats();

            b.bookSeat(30);
            b.showAvailableSeats();

            b.cancelSeat(5);
            b.showAvailableSeats();

            // This will throw exception
            b.bookSeat(10); 
        }
        catch (OverCapacityException e) {
            System.out.println(e.getMessage());
        }
    }
}
