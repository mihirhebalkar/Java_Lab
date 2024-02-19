public class WrapperAssignment {
    public static void main(String[] args) {
        
        int intValue = 22;
        char charValue = 'M';
        double doubleValue = 45.67;

        
        Integer integerObject = Integer.valueOf(intValue);
        Character charObject = Character.valueOf(charValue);
        Double doubleObject = Double.valueOf(doubleValue);

        
        System.out.println("Integer Object: " + integerObject);
        System.out.println("Character Object: " + charObject);
        System.out.println("Double Object: " + doubleObject);
    }
}
