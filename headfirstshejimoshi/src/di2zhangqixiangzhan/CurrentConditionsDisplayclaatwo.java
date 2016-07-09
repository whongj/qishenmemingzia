package di2zhangqixiangzhan;

import java.util.Observable;
import java.util.Observer;
public class CurrentConditionsDisplayclaatwo implements Observer,DisplayElement{
	Observable observable;
	private float temperature;
	private float humidity;
	public CurrentConditionsDisplayclaatwo(Observable observable){
		this.observable=observable;
		observable.addObserver(this);
	}
	@Override
	public void Display() {
		// TODO Auto-generated method stub
		System.out.println("Current conditions:"+temperature+"F degrees and"+humidity+"%humidity");
	}

	@Override
	public void update(float temp, float humidity, float pressure) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void update(Observable obs, Object arg) {
		// TODO Auto-generated method stub
		if(obs instanceof weatherDataclaatwo){
			weatherDataclaatwo weatherDataxxx = (weatherDataclaatwo)obs;
			this.temperature=weatherDataxxx.getTemperature();
			this.humidity=weatherDataxxx.getHumidity();
			Display();//为什么两种都没有pressure的事情？
			
		}
	}
	
}
