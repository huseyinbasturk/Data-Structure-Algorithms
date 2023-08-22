package CollectionsReview;

import java.util.*;

public class ArrayListReview {
    public static void main(String[] args) {
        //create arraylist
        List<CollectionsReview.Student> students = new ArrayList<>();

        //add elements to arraylist
        students.add(new CollectionsReview.Student(1,"Jack"));
        students.add(new CollectionsReview.Student(2,"Julia"));
        students.add(new CollectionsReview.Student(3,"Mike"));
        students.add(new CollectionsReview.Student(4,"Marry"));

        //iteration on arraylist
        //for loop
        System.out.println("Printing with legacy for loop");
        for(int i =0; i< students.size(); i++){
            System.out.println(students.get(i));
        }

        //Iterator
        //forward iteration
        System.out.println("Printing with iterator....");
        Iterator<CollectionsReview.Student> iterator = students.listIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        //backward iteration
        System.out.println("Printing backwards with iterator....");
        while (((ListIterator<?>) iterator).hasPrevious()){
            System.out.println(((ListIterator<?>) iterator).previous());
        }

        //for each loop
        System.out.println("Printing with for each lopp.....");
        for(CollectionsReview.Student student: students){
            System.out.println(student);
        }

        //lambda
        System.out.println("Printing with lambda");
        students.forEach(System.out::println);

        //sorting elements
        System.out.println("Sorting with Comparator Interface by id");
        Collections.sort(students, new sortByIdDesc() );
        students.forEach(student -> System.out.println(student));

        System.out.println("Sorting with Comparator Interface by name");
        Collections.sort(students, new sortByNameDesc() );
        students.forEach(student -> System.out.println(student));
    }

    //implementation of Comparator
    static class sortByIdDesc implements Comparator<CollectionsReview.Student>{

        @Override
        public int compare(CollectionsReview.Student o1, CollectionsReview.Student o2) {
            return o2.getId() - o1.getId();
        }
    }

    static class sortByNameDesc implements Comparator<CollectionsReview.Student>{

        @Override
        public int compare(CollectionsReview.Student o1, CollectionsReview.Student o2) {
            return o2.getName().compareToIgnoreCase(o1.getName());
        }
    }
}
