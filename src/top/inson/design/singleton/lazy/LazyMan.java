package top.inson.design.singleton.lazy;

public class LazyMan {
	private static LazyMan instance;
	
	private LazyMan(){}
	
	public static LazyMan getInstance(){
		if(instance == null) {
			instance = new LazyMan();
		}
		return instance;
	}
	
}
