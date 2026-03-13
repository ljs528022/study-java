package com.app.enumeration;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public enum Status {
   ENABLE("enable"), DISABLE("disable");
   
   private final String value;
   private static final Map<String, Status> STATUS_MAP = 
         Stream.of(Status.values()).collect(Collectors.toMap(Status::getValue, Function.identity()));

   private Status(String value) {
      this.value = value;
   }

   public String getValue() {
      return value;
   }
   
   @Override
   public String toString() {
      return value;
   }
   
   public static Status getEnum(String value) {
      return STATUS_MAP.get(value);
   }
}