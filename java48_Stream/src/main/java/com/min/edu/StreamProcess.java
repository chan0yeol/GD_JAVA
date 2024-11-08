package com.min.edu;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

import com.min.edu.beans.Cars;
import com.min.edu.beans.Person;
import com.min.edu.beans.PersonDTO;
import com.min.edu.mockdata.MockData;

/* Stream 이란?
 * JCF의 객체를 탐색/추출/제거 등의 일괄처리를 하기 위한 메소드이다.
 * stream() 첫번째 stream 문법을 사용하겠다.
 * map 추출하겠다. , filter 
 * collect 추출된 결과를 모으는 방법이다.
 */
public class StreamProcess {

	//TODO 006 JSON 읽어온 데이터를 정제하자.
	public static void main(String[] args) throws IOException {
		List<Person> persons = MockData.getPeople();
		
		// TODO 007 기본추출 문법 메소드 전달 방식
		/*
		 *  시나리오 : people 데이터에서 email만 추출하여 새로운 List<String>으로 만들어 주겠다.
		 */
//		List<String> emails = 
//				MockData.getPeople() // JCF의 리스트 형태의 원본 객체를 가져온다.
//				.stream() // stream으로 만들어준다.
//				.map(Person::getEmail) // 메소드 전달 방식 | people은 Person이 여러개 들어 있다. Person getEmail을 통해 멤버필드 email을 값을 가져올 수 있다.
//				.collect(
////						ArrayList::new,
////						ArrayList::add,
////						ArrayList::addAll
//						Collectors.toList()
//						);
//		emails.forEach(System.out::println);
//		System.out.println("--0---------------");
		/*
		 * 시나리오 반환. filter를 통해서 조건에 맞는 값을 찾는다
		 */
//		System.out.println(
//		List<Double> prices = MockData.getCars().stream()
//				// 1) price가 10000이 넘는 자동차를 출력
//				.filter(car -> {
////					System.out.println("filter car" + car);
//					return car.getPrice() > 85000;
//				})
//				.map(car -> {
//					return car.getPrice();
//				})
//				//3 추출된 가격에서 .14를 곱한 값을 반환해보자.
//				.map(price -> {
//					return price + (price*.14);
//				})
//				.collect(Collectors.toList());
//		prices.forEach(System.out::println);
//				);
//		List<Cars> cars = MockData.getCars().stream()
//				// 1) price가 10000이 넘는 자동차를 출력
//				.filter(car -> {
////					System.out.println("filter car" + car);
//					return car.getPrice() > 85000;
//				})
//				.map(Cars::getPrice)
//				.collect(Collectors.toList());
//		cars.forEach(System.out::println);
		
		List<PersonDTO> dtos = MockData.getPeople().stream().map(dto -> new PersonDTO(dto.getId(), dto.getFirstName(), dto.getAge())).collect(Collectors.toList());
		dtos.forEach(System.out::println);
//		List<PersonDTO> personDTO = new ArrayList<>();
//		for (Person person : persons) {
//			PersonDTO dto = new PersonDTO(person.getId(), person.getFirstName(), person.getAge());
//			personDTO.add(dto);
//		}
//		for (PersonDTO personDTO2 : personDTO) {
//			System.out.println(personDTO2);
//		}
//		List<Cars> cars = MockData.getCars();
//		for (int i = 0; i < 10; i++) {
//			System.out.println(cars.get(i).getModel()); 
//		}
//		System.out.println("-----");
	}

}
