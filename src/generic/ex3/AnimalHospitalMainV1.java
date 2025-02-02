package generic.ex3;

import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMainV1 {
	public static void main(String[] args) {
		AnimalHospitalV1 dogHospital = new AnimalHospitalV1();
		AnimalHospitalV1 catHospital = new AnimalHospitalV1();

		Dog dog = new Dog("멍멍이1", 100);
		Cat cat = new Cat("냐옹이1", 300);

		dogHospital.set(dog);
		dogHospital.checkup();

		catHospital.set(cat);
		catHospital.checkup();

		//dogHospital.checkup(cat); // 다른 타입 입력: 컴파일 오류

		dogHospital.set(dog);
		Dog biggerDog = (Dog) dogHospital.getBigger(new Dog("멍멍이2", 200)); //casting
		System.out.println("biggerDog = " + biggerDog);
	}
}
