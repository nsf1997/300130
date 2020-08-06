package Workshop.Workshop01;

public class Vehicle{
	private int id;
  	private String colour;
  	private String type;
  	private static int nextId =1;

  	public Vehicle(){
		//add your code here, setting its id to nextId and incrementing nextId
		this.id = nextId;
		nextId++;
		};

    public Vehicle(String col,String ty){
		        //add your code here,initialising its id, colour and type
		this();
		this.colour = col;
		this.type = ty;
		     };

	public int getId() {
		return id;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
