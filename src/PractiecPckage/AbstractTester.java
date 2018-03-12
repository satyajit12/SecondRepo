package PractiecPckage;

public  class AbstractTester extends AbstractClass{

	
	public void xyz() {
		// TODO Auto-generated method stub
		System.out.println("hello baby");
		//return 0;
	}
	
	public int bubu(int x ,int y){
		int z = x+y;
		//return z;
		System.out.println(z);
		return z;
	}
	
	public static void main(String[] args){
		
	AbstractTester cv = new AbstractTester();
	cv.xyz();
    cv.bubu(1, 3);
    cv.bubu();
	}
 
}
