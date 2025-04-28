package kadai_015;

public class Car_Chapter15 {

	private int gear = 1;
	private int speed = 10;
	
	public Car_Chapter15 () {
		this.gear = 1;
		this.speed = 10;
	}
	
	public void gearChange(int afterGear) {
		
		if (afterGear >= 1  && afterGear <= 5) {
			this.gear = afterGear;
			this.speed = afterGear * 10;
			
			System.out.println("ギア1から"+afterGear+"に切り替えました");
			
		}else {
			this.gear = 1;
			this.speed = 10;
			
			System.out.println("Resetting to default gear.");
		}
	}
	
	public void run() {
		System.out.println("速度は時速" +this.speed+ "kmです");
	}
}
