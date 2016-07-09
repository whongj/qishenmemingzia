package di2zhangqixiangzhan;

import java.util.*;

public class WeatherData implements Subject{
	private ArrayList observers;
	private float temperature;
	private float humidity;
	private float pressure;
	
	public WeatherData(){
		observers=new ArrayList();
		
	}
	
	@Override
	public void registerObserver(Observer o) {
		// TODO Auto-generated method stub
		observers.add(o);
		
	}

	@Override
	public void remoceObserver(Observer o) {
		// TODO Auto-generated method stub
		int i =observers.indexOf(o);
		if(i>=0){
			observers.remove(i);
		}
	}

	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		for(int i=0;i<observers.size();i++)
		{
			Observer observer =(Observer)observers.get(i);//
			observer.update(temperature, humidity, pressure);
		}
	}
	public void meaurementsChanged(){
		this.notifyObservers();
		
	}
	public void setMeasurements(float temperature,float humidity,float pressure)
	{
		this.temperature=temperature;
		this.humidity=humidity;
		this.pressure=pressure;
		meaurementsChanged();
	}
	
	
	
	
	
	
	
	
	
	
	

}
