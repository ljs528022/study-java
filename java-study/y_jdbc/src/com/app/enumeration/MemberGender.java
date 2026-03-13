package com.app.enumeration;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public enum MemberGender {
//   enum은 Enum<E extends Enum<E>>을 상속받은 class이다.
//   컴파일되면 아래와 같이 필드에 할당된다.
//   상수만 관리하는 객체이며, 직접 작성해야하는 문자열들을 상수화하여 컴파일 단계에 오타를 방지할 수 있다.
//   public static final MemberGender MAN = new MemberGender("남");
//   public static final MemberGender WOMAN = new MemberGender("여");
//   public static final MemberGender NONE = new MemberGender("선택안함");
   
   MAN("남"), WOMAN("여"), NONE("선택안함");
   
   private final String value;
   private static final Map<String, MemberGender> MEMBER_GENDER_MAP = 
         Stream.of(MemberGender.values())
         .collect(Collectors.toMap(MemberGender::getValue, Function.identity()));
   
   private MemberGender(String value) {
      this.value = value;
   }

   public String getValue() {
      return value;
   }
   
   @Override
   public String toString() {
      return value;
   }
   
   public static MemberGender getEnum(String value) {
      return MEMBER_GENDER_MAP.get(value);
   }
}









