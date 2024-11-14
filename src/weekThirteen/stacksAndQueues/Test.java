package weekThirteen.stacksAndQueues;

public class Test {
    public static void main(String[] args) {
        ValidParenthesis valid = new ValidParenthesis();

        System.out.println(valid.isValid("({{}})"));
        System.out.println(valid.isValid("([)]"));

    }
}
