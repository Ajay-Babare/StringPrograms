final class ImmuEx {
	int i;
	ImmuEx(int i){
		this.i=i;
	}
	public ImmuEx modify(int i) {
		if(this.i==i) {
			return this;
		}
		else {
			return new ImmuEx(i);
		}
	}
}
public class Demo{

	public static void main(String[] args) {
		ImmuEx obj1 = new ImmuEx(1);
		ImmuEx obj2 = obj1.modify(1);
		ImmuEx obj3 = obj1.modify(100);
		ImmuEx obj4 = obj3.modify(100);
		
		System.out.println(obj1==obj2);//true
		System.out.println(obj1==obj3);//false
		System.out.println(obj2==obj3);//false
		System.out.println(obj3==obj4);//true

	}
}
