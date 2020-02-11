package service;

import data.MembersGroup;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Finder {
 /**
 * Поиск групп людей старше определенного возраста.
 *
 * @param groups группы
 * @param targetAge возраст для поиска
 * @return список имен групп из списка групп старше возраста targetAge
 */
/*    public Set<String> findOldMembers(List<MembersGroup> groups, int targetAge) {

     Set<String> groupsNames = new HashSet<>();

     for (MembersGroup membersGroup : groups) {
         for (Member member : membersGroup.getMembers()) {
             if (member.getAge() > targetAge) {
                 String name = member.getName();
                 groupsNames.add(name);
             }
         }
     }
     return groupsNames;
    }*/
    public Set<String> findOldMembers(List<MembersGroup> groups, int targetAge) {
        Set<String> groupsNames = new HashSet<>();
        groups.forEach(memberGroup -> memberGroup.getMembers()
                        .stream()
                        .filter(member -> member.getAge() > targetAge)
                        .forEach(c -> groupsNames.add(c.getName()))
                );
        return groupsNames;
    }

}