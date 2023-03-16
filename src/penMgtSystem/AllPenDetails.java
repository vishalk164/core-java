package penMgtSystem;

public class AllPenDetails {
	
	public PenBox allpenDetails() {
		
		PenBox box = new PenBox();
		
		box.pouch.p1.noOfRefiles=2;
		box.pouch.p1.color="Red";
	    box.pouch.p2.noOfRefiles=4;
	    box.pouch.p2.color="Black";
	    box.pouch.p3.noOfRefiles=7;
	    box.pouch.p3.color="Blue";
	    box.pouch2.p1.noOfRefiles=3;
	    box.pouch2.p1.color="yellow";
	    box.pouch2.p2.noOfRefiles=8;
	    box.pouch2.p2.color="pink";
	    box.pouch2.p3.noOfRefiles=6;
	    box.pouch2.p3.color="green";
		
		return box;
	}

}
