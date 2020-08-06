package Workshop.Workshop01;

public class VehicleTest
{
   public static void main(String[] args)
   {
      // create two Vehicle objects car and truck using contructor1 Vehicle()
      // add your code here
      Vehicle veh1 = new Vehicle();
      Vehicle veh2 = new Vehicle();

      // create one Vehicle object van using construcor2 Vehicle( String col, String ty)
      // add your code here
      Vehicle veh3 = new Vehicle("Green","Van");

      // set initial type and colour for car and truck
      // add your code here
      veh1.setColour("Red");
      veh1.setType("Car");
      veh2.setColour("Blue");
      veh2.setType("Truck");

      // display initial values for each Vehicle
      // add your code here
      System.out.println("Vehicle:"+veh1.getId()+"\tColor:"+veh1.getColour()+"\tType:"+veh1.getType());
      System.out.println("Vehicle:"+veh2.getId()+"\tColor:"+veh2.getColour()+"\tType:"+veh2.getType());
      System.out.println("Vehicle:"+veh3.getId()+"\tColor:"+veh3.getColour()+"\tType:"+veh3.getType());

   }
}