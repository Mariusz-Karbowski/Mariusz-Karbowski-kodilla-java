package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {

    public final List<ForumUser> theForumUsersList = new ArrayList<>();

    public Forum() {
        theForumUsersList.add(new ForumUser(1, "user01", 'F', LocalDate.of(1990,1,1), 0));
        theForumUsersList.add(new ForumUser(2, "user02", 'M', LocalDate.of(1990,2,2), 1));
        theForumUsersList.add(new ForumUser(3, "user03", 'F', LocalDate.of(1990,3,3), 2));
        theForumUsersList.add(new ForumUser(4, "user04", 'M', LocalDate.of(1990,4,4), 3));
        theForumUsersList.add(new ForumUser(5, "user05", 'M', LocalDate.of(1990,5,5), 4));
        theForumUsersList.add(new ForumUser(6, "user06", 'M', LocalDate.of(1990,6,6), 0));
        theForumUsersList.add(new ForumUser(7, "user07", 'F', LocalDate.of(1990,7,7), 6));
        theForumUsersList.add(new ForumUser(8, "user08", 'F', LocalDate.of(1990,8,8), 7));
        theForumUsersList.add(new ForumUser(9, "user09", 'M', LocalDate.of(1990,9,9), 8));
        theForumUsersList.add(new ForumUser(10, "user10", 'F', LocalDate.of(1990,10,10), 9));

    }

    public List<ForumUser> getList() {
        return new ArrayList<>(theForumUsersList);
    }
}
