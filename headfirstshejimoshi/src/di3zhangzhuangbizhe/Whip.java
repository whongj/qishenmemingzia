package di3zhangzhuangbizhe;

public class Whip extends CondimentDecorator{
	Beverage beverage;
	public Whip(Beverage beverage){
		this.beverage=beverage;
	}
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return beverage.getDescription()+",mocha";
	}
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return .4+beverage.cost();
	}
	
}
