import data.Member;
import data.MembersGroup;
import service.Finder;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        List<Member> members1 = Arrays.asList(
                new Member("ivan",16),
                new Member( "oleg", 19),
                new Member( "dima", 21),//
                new Member( "petr",36)//
                );
        List<Member> members2 = Arrays.asList(
                new Member("roma",28),//
                new Member( "max", 20),
                new Member( "leha", 15)
        );
        List<Member> members3 = Arrays.asList(
                new Member("roma1",55),//
                new Member( "max1", 29),//
                new Member( "leha1", 11)
        );
        List<MembersGroup> groups = Arrays.asList(
                new MembersGroup("first", members1),
                new MembersGroup( "second", members2),
                new MembersGroup( "third", members3)
        );

        Finder finder = new Finder();
        Set<String> names = finder.findOldMembers(groups,20);

        for(String name : names){
            System.out.println(name);
        }
    }
}