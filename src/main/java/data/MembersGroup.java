package data;

import lombok.Data;

import java.util.List;

@Data//аннотация @Data библиотеки lombok создаёт конструкторы без аргументов, со всеми аргументами, а также геттеры и сеттеры
     //помогает сокращать количество шаблонного кода
public class MembersGroup {
 private final String groupName;
 private final List<Member> members;
}