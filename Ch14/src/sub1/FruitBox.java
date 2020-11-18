package sub1;

public class FruitBox<T> { // <> 제너릭 클래스

	private T fruit;

	public T getFruit() {
		return fruit;
	}

	public void setFruit(T fruit) {
		this.fruit = fruit;
	}
}
