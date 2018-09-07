单利模式(Singleton Pattern)是java中最简单的设计模式(没有之一)，这种类型的设计模式属于创建型模型，它提供一种创建对象的最佳的方式
这种模式涉及到一个单一的类，该类负责创建自己的对象，同时确保只有单个对象呗创建，这个类提供了一种访问其唯一的对象的方式，可以直接访问，不需要实例化该类的对象

LazyMan：懒汉式
	1、懒汉式，线程不安全
	是否 Lazy 初始化：是
	是否多线程安全：否
	实现难度：易
	描述：这种方式是最基本的实现方式，这种实现最大的问题是不支持多线程，因为没有加锁synchronized,所以严格意义上来说它不算单例模式
这种方式 lazy loading 很明显，不要求线程安全，在多线程不能正常工作。

HungryMan：饿汉式
	2、懒汉式，线程安全
	是否 Lazy 初始化：是
	是否多线程安全：是
	实现难度：易
	描述：这种方式具备很好的 lazy loading，能够在多线程中很好的工作，但是，效率很低，99% 情况下不需要同步。
优点：第一次调用才初始化，避免内存浪费。
缺点：必须加锁 synchronized 才能保证单例，但加锁会影响效率。
getInstance() 的性能对应用程序不是很关键（该方法使用不太频繁）。