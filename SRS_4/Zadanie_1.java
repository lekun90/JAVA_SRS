import java.util.Stack;
public class Zadanie_1 {
    public static void main(String[] args) {
        String str = "/home/";
        //String str = "/../";
        //String str = "/home//foo/";
        String res =  simplifyPath(str);
        System.out.println(res);
    }
    public static String simplifyPath(String path) {
        final String[] dirs = path.split("/");
        Stack<String> stack = new Stack<>();
        for (final String dir : dirs) {
            if (dir.isEmpty() || dir.equals(".")) {
                continue;
            }
            if (dir.equals("..")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                stack.push(dir);
            }
        }
        return "/" + String.join("/", stack);
    }
}
