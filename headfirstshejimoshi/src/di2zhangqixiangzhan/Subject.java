package di2zhangqixiangzhan;

public interface Subject {
	public void registerObserver(Observer o);
	public void remoceObserver(Observer o);
	public void notifyObservers();
	
}
