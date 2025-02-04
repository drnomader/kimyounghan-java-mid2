package generic.ex3;

import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMainV3 {
	public static void main(String[] args) {
		AnimalHospitalV3<Dog> dogHospital = new AnimalHospitalV3();
		AnimalHospitalV3<Cat> catHospital = new AnimalHospitalV3();

		Dog dog = new Dog("멍멍이1", 100);
		Cat cat = new Cat("냐옹이1", 300);

		dogHospital.set(dog);
		dogHospital.checkup();

		catHospital.set(cat);
		catHospital.checkup();

		//dogHospital.checkup(cat); // 다른 타입 입력: 컴파일 오류

		dogHospital.set(dog);
		Dog biggerDog = (Dog) dogHospital.getBigger(new Dog("멍이2", 200)); //casting
		System.out.println("biggerDog = " + biggerDog);
	}
}
