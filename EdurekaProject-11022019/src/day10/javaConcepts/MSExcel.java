package day10.javaConcepts;

public class MSExcel implements MsOffice {

	@Override
	public void start() {
		System.out.println("Start method");
		
	}

	@Override
	public void stop() {
		System.out.println("Stop method");
		
	}

	@Override
	public void restart() {
		System.out.println("Restart method");
		
	}
	
	public void save(){
		System.out.println("Save method");
	}

}
