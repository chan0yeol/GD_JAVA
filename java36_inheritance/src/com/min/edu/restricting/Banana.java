package com.min.edu.restricting;

/*
 * Banana 클래스는 상위 부모 클래스인 Fruit에서 permits를 하지 않았기 때문에 implements가 되지 않음
 * 만약 fruit의 클래슨느 부모클래스는 사용하기 위해서
 * 1) Fruit에 permits에 Banana를 선언해 줘야 한다.
 * 2) Banana 클래스에 final 혹은 non-sealed를 선언해줘야 한다.
 */
// TODO 00304 Lemon은 non-sealed 되어 있기 때문에 extends가 된다.
/*
 * 하지만 Orange는 final되어 있기 때문에 extends 되지 않는다.
 */

//public class Banana extends Orange{}
public class Banana extends Lemon{
	
}
