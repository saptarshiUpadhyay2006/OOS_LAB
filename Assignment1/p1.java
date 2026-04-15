import java.util.*;
class Room{
    double height,width,breadth;
    double volume(){
        return height*width*breadth;
    }
}

class RoomDemo{
    public static void main(String[] args) {
        Room r=new Room();
        r.height=5;
        r.breadth=6;
        r.width=2;
        System.out.println("Volume of room:"+r.volume());
    }
}