
public class EnumTest {

	public static void main(String[] args) {
		Size s=Size.SMALL;
		Size t=Size.LARGE;
		//s和t引用同一个对象？
		System.out.println(s==t);  //
		//是原始数据类型吗？
		System.out.println(s.getClass().isPrimitive());
		//从字符串中转换
		Size u=Size.valueOf("SMALL");
		System.out.println(s==u);  //true
		//列出它的所有值
		for(Size value:Size.values()){
			System.out.println(value);
		}
	}

}
 enum Size{SMALL,MEDIUM,LARGE};
