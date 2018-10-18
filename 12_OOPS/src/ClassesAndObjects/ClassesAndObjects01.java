package classesAndObjects;
class Box{
	double depth;
	double width;
	double height;
	Box(double w,double h, double d){
		width = w;;
		height = h;
		depth = d;
	}
	double FindVolume() {
		return (width*height*depth);
	}
}
public class ClassesAndObjects01 {
	public static void main(String[] args) {
		Box b1 = new Box(10, 20, 30);
		System.out.println("The dimension of the box is\nWidth= "+b1.width+"\nHeight= "+b1.height+"\nDepth= "+b1.depth);
		System.out.println("The volume of the Box is "+b1.FindVolume());
	}

}
