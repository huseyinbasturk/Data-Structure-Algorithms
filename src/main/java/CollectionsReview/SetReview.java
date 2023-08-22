package CollectionsReview;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetReview {

    public static void main(String[] args) {
        //create a set
        Set<CollectionsReview.Student> set = new LinkedHashSet<>();
        set.add(new CollectionsReview.Student(1,"Jack"));
        set.add(new CollectionsReview.Student(2,"Julia"));
        set.add(new CollectionsReview.Student(3,"Mike"));
        set.add(new CollectionsReview.Student(4,"Marry"));

        System.out.println(set);

        String string = "Java Developer";
        System.out.println(firstRepeatingCharacter(string));

    }

    public static Character firstRepeatingCharacter(String str){
        //create a hashset
        Set<Character> set = new HashSet<>();
        //iterate over the char array and add chars into hashset
        char[] array = str.toCharArray();
        for (char c : array) {
            //if add ops is false return that char
            if ((!set.add(c))) return c;
        }
        return null;
    }
}
