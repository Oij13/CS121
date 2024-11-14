package weekThirteen.stacksAndQueues;

public class Test {
    public static void main(String[] args) {
        ValidParenthesis valid = new ValidParenthesis();
        RecentCounter counter =  new RecentCounter();

        System.out.println(valid.isValid("({{}})"));
        System.out.println(valid.isValid("([)]"));
        System.out.println(counter.ping(1));
        System.out.println(counter.ping(100));
        System.out.println(counter.ping(3001));
        System.out.println(counter.ping(3002));

    }
}
