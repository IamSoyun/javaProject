package practice.p0311;

class Tv {}

class Car {}

public class Product<T, M>{
	
	T kind; // 종류
	M model; // 모델명
	
	public void setKind(T kind) {
		this.kind = kind;
	}
	
	public T getKind() {
		return kind;
	}
	
	public void setModel(M model) {
		this.model = model;
	}
	
	public M getModel() {
		return model;
	}

}
