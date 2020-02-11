package data;

import lombok.Data;

import java.util.List;
@Data
public class MembersGroup {
 private final String groupName;
 private final List<Member> members;
}