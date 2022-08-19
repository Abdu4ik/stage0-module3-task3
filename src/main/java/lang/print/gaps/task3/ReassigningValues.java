package lang.print.gaps.task3;

public class ReassigningValues {
    public static void main(String[] args) {
        int first = 1;
        int second = 10;
        int third = 100;
        
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
        
        int linkToFirst = first;
        int linkToSecond = second;
        int linkToThird = third;
        
        int first = 15;
        int second = 6;
        int third = 4;
        
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
        System.out.println(linkToFirst);
        System.out.println(linkToSecond);
        System.out.println(linkToThird);
    }
}
