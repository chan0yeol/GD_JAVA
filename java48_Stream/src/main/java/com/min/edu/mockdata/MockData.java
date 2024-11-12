package com.min.edu.mockdata;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.IOUtils;

import com.google.common.io.Resources;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.min.edu.beans.Cars;
import com.min.edu.beans.Person;

// TODO 005 peopel.json, cars.json를 commons-io를 통해서 읽어 오는 클래스 => java List<T>
public class MockData {

	public static List<Person> getPeople() throws IOException {
		// 1. 파일을 inputStream을 읽는다.
		InputStream inputStream = Resources.getResource("com/min/edu/resources/people.json").openStream();
		// 2. 읽어낸 binary code를 String 문자열로 변경. Encoding은 문서의 인코딩과 맞춘다.
		String json = IOUtils.toString(inputStream, StandardCharsets.UTF_8);
		// 3. 변경할(Casting)될 타입을 선언한다.
		Type listType = new TypeToken<ArrayList<Person>>() {
		}.getType();
		// 4. Json 객체로 변경해 주는 Gson 라이브러리를 사용해서 읽은 Json 형태의 문자열을 타입에 맞춰 리스트 변경한다.
		return new Gson().fromJson(json, listType);
	}

	public static List<Cars> getCars() throws IOException {
		// cars.json 읽음
		InputStream inputStream = Resources.getResource("com/min/edu/resources/cars.json").openStream();
		String json = IOUtils.toString(inputStream, StandardCharsets.UTF_8);

		return new Gson().fromJson(json,
				new TypeToken<ArrayList<Cars>>() {
		}.getType());
	}
}
