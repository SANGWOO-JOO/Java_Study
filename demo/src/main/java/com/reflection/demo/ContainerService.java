package com.reflection.demo;
import java.lang.reflect.Field;
import java.util.Arrays;

public class ContainerService {

      // 클래스 타입이 들어오면, 해당 클래스의 인스턴스를 리턴하도록 Generic 타입으로 정의함
    public static <T> T getObject(Class<T> classType) {

        T instance = createInstance(classType); // 클래스 타입에 맞는 (리플렉션을 이용하여) 인스턴스를 생성한다.  //https://yangbengdictionary.tistory.com/5

      /*
        1. getDeclaredFields 메소드로 모든 필드를 불러온다.
        2. private static <T> T createInstance(Class<T> classType) { // 리플렉션 이용-> 생성자를 만들어 리턴해준다.
       */

        for(Field fields : classType.getDeclaredFields()){ //

          /*
            1. getAnnotation: 지정한 어노테이션이 적용되어 있으면 어노테이션을 리턴하고 그렇지 않다면 null을 리턴한다. 상위클래스 적용시에도 리턴
            2. Autowired.class : class를 순회하면서 autowired가 붙어 잇는지를 조건으로 함
           */
        if (fields.getAnnotation(Autowired.class) != null);
          Object fieldInstance = createInstance(fields.getType()); // 만약 해당 필드에 Autowired가 붙어있으면 fieldInstance를 생성해준다.
          /*
            1.setAccessible()은 필드나 메서드의 접근제어 지시자에 의한 제어를 변경한다. // https://tyboss.tistory.com/entry/Java-%EC%9E%90%EB%B0%94-%EB%A6%AC%ED%94%8C%EB%A0%89%EC%85%98-reflection-setAccessible
            2. 해당 필드가 private 일수도 있으므로  setAccessible을 true로 설정
            3. createInstance로 fieldInstance 인스턴스 생성할때 return classType.getConstructor(null).newInstance(); 에서 getConstructor 의해 접근제어자가 public인 속성만 가져올 수 있다. // 그래서 true로 설정

           */
          fields.setAccessible(true);
          try {
              /*
                1. 위에서 만든 fieldInstance는 해당 필드에 Autowired가 붙어있으면 (fieldInstance)인스턴스를 생성해주는 것
                2. fields.set(instance, fieldInstance);는 fieldInstance 라는 boolean 객체 (필드)에서 instance 객체(필드)에 주입
               */
              fields.set(instance, fieldInstance);
          }
          catch (IllegalAccessException e) {
              throw new RuntimeException(e);
          }
        }
        return instance;
    }

    private static <T> T createInstance(Class<T> classType) { // 리플렉션 이용-> 생성자를 만들어 리턴해준다.
        try {
            /*
             1. getConstructor(null)의 경우 기본생성자를 만드는 것 .
             2. getConstructor(null).newInstance(); 로 기본 생성자 생성
             */
            return classType.getConstructor(null).newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}