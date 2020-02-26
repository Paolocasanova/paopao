package bisekleta;

public class Bisekleta {
	private String BikeType;
	private String Frame;
	private String Fork;
	private String Headset;
	private int WheelSize;
	private String Rim;
	private String SpokesandNipples;
	private double Tire;
	private String Hub;
	private String Speed;
	private String Pedal;
	private String Stem;
	private int StemLength;
	private String Brake;
	private String Handlebar;
	private int Sprocket;
	private int Crank;
	private String Chain;
	private double SeatPost;
	private String Saddle;
	private String Grip;
	private String SeatClamp;


	
	public Bisekleta(String BikeType,String Frame,String Fork,String Headset,
			int WheelSize, String Rim,String SpokesandNipples,double Tire,
			String Hub,String Speed,String Pedal,String Stem,int StemLength,
			String Brake,int Sprocket,String Handlebar,int Crank,String Chain,
			double SeatPost,String Saddle,String Grip,String SeatClamp) {
		
		
		this.BikeType = BikeType;
		this.Frame = Frame;
		this.Fork = Fork;
		this.Headset = Headset;
		this.WheelSize = WheelSize;
		this.Rim = Rim;
		this.SpokesandNipples = SpokesandNipples;
		this.Tire = Tire;
		this.Hub = Hub;
		this.Speed = Speed;
		this.Pedal = Pedal;
		this.Stem = Stem;
		this.StemLength = StemLength;
		this.Brake = Brake;
		this.Handlebar = Handlebar;
		this.Sprocket = Sprocket;
		this.Crank = Crank;
		this.Chain = Chain;
		this.SeatPost = SeatPost;
		this.Saddle = Saddle;
		this.Grip = Grip;
		this.SeatClamp = SeatClamp;
}
	public void print() {
		System.out.println(BikeType + "" + Frame + "" + Fork + "" +
	Headset + "" + WheelSize + "" + Rim + "" + SpokesandNipples + "" + Tire + "" +
	Hub + "" +  Speed + "" + Pedal + "" + Stem + "" +  StemLength + "" + Brake + "" + 
	Sprocket + "" + Handlebar + "" + Crank + "" + Chain + "" + SeatPost + "" + 
	Saddle + "" + Grip + "" + SeatClamp);
		
	}
}
