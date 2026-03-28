public class RoomArea {
    public static void main(String[] args) {
        Room room1 = new Room();
        room1.setValues(12.5, 10.0);
        double area1 = room1.getArea();

        Room room2 = new Room();
        room2.setValues(15.0, 8.0);
        double area2 = room2.getArea();

        System.out.println("Room 1:");
        System.out.println("Length: " + room1.length);
        System.out.println("Width: " + room1.width);
        System.out.println("Area: " + area1 + " sq. units\n");

        System.out.println("Room 2:");
        System.out.println("Length: " + room2.length);
        System.out.println("Width: " + room2.width);
        System.out.println("Area: " + area2 + " sq. units");
    }
}

class Room {
    double length;
    double width;

    void setValues(double l, double w) {
        length = l;
        width = w;
    }

    double getArea() {
        return length * width;
    }
}

