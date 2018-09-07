package top.inson.design.singleton.hungry;

public class HungryMan {
	private static HungryMan instance = new HungryMan();
	
	private HungryMan(){}
	
	public static HungryMan getInstance(){
		return instance;
	}
}
