package di2zhangqixiangzhan;

public class CurrentConditionsDisplay implements Observer,DisplayElement{

	private float temperature;
	private float humidity;
	private Subject weatherData;
	public CurrentConditionsDisplay(Subject weatherData){
		this.weatherData=weatherData;
		weatherData.registerObserver(this);
	}
	@Override
	public void Display() {
		// TODO Auto-generated method stub
		System.out.println("Current coiditions:"+temperature+"F degrees and"+humidity+humidity+"%humidity");
	}

	@Override
	public void update(float temp, float humidity, float pressure) {
		// TODO Auto-generated method stub
		this.temperature=temp;
		this.humidity=humidity;
	    Display();
		
	}
	

}
