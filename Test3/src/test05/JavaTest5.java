package test05;

/*
 * ��¥ : 2020/11/19
 * �̸� : �̽���
 * ���� : �̱��� ��ü ��������
 */

public class JavaTest5 {
	
	public static void main(String[] args) {
		
		CarFactory factory = new CarFactory();
		
		Car avante = factory.createCar("�ƹݶ�", 2500);
		Car sonata = factory.createCar("�ҳ�Ÿ", 3000);
		
		avante.info();
		sonata.info();
	}

}