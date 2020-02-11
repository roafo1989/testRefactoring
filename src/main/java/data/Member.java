package data;

import lombok.Data;

@Data//аннотация @Data библиотеки lombok создаёт конструкторы без аргументов, со всеми аргументами, а также геттеры и сеттеры
     //помогает сокращать количество шаблонного кода
public class Member {
 private final String name;
 private final Integer age;

}