class Car2 {
   String color;
   String geartype;
   int door;
   
   Car2 () {}
   
   Car2(String c, String g, int d) {
      color = c;
      geartype = g;
      door = d;
   }
}

class Car {
   public static void main(String[] args) {
      Car2 c1 = new Car2();
      c1.color = "white";
      c1.geartype = "auto";
      c1.door = 4;
      
      Car2 c2 = new Car2("white", "auto", 4);
      
      System.out.println(c2.color);
      System.out.println(c1.door);
   }
}