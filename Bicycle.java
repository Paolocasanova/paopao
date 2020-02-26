package bisekleta;

public class Bicycle extends Bisekleta {
	
	public Bicycle (String BikeType,String Frame, String Fork,String Headset,
			int WheelSize, String Rim,String SpokesandNipples,double Tire,
			String Hub,String Speed,String Pedal,String Stem,int StemLength,
			String Brake,int Sprocket,String Handlebar,int Crank,String Chain,
			double SeatPost,String Saddle,String Grip,String SeatClamp) {
		
		super(BikeType + "\n", Frame + "\n", Fork + "\n", Headset, WheelSize,"\n" + Rim + "\n", SpokesandNipples, Tire,"\n" +
				Hub + "\n", Speed + "\n", Pedal + "\n", Stem, StemLength,"\n" + Brake + "\n", Sprocket,"\n" + Handlebar,
				Crank,"\n" + Chain + "\n", SeatPost,"\n" + Saddle + "\n", Grip + "\n", SeatClamp);
	}
public void print() {
	System.out.println("Bike");
	super.print();
}
}
