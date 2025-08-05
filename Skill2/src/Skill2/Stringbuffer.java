package Skill2;

public class Stringbuffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        System.out.println("Original: " + sb);
        System.out.println("Capacity: " + sb.capacity());
        sb.append(" World");
        System.out.println("After append: " + sb);
        sb.insert(5, ",");
        System.out.println("After insert: " + sb);
        sb.replace(7, 12, "Java");
        System.out.println("After replace: " + sb);
        sb.delete(5, 6);
        System.out.println("After delete: " + sb);
        sb.setCharAt(0, 'h');
        System.out.println("After setCharAt: " + sb);
        System.out.println("charAt(1): " + sb.charAt(1));
        sb.reverse();
        System.out.println("After reverse: " + sb);
        System.out.println("Final capacity: " + sb.capacity());
    }
}