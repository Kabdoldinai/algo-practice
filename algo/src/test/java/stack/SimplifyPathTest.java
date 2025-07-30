package stack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.practice.stack.SimplifyPath;

public class SimplifyPathTest {

    @Test
    public void shouldSimplifyPathWhenGivingMultipleSlashesAndWords() {
        SimplifyPath simplifyPath = new SimplifyPath();
        String input = "/home/user/Documents/../Pictures";
        Assertions.assertEquals("/home/user/Pictures", simplifyPath.simplifyPath(input));
    }


    @Test
    public void shouldSimplifyPathTillOneSlashWhenGivingNoWords() {
        SimplifyPath simplifyPath = new SimplifyPath();
        String input = "/../";
        Assertions.assertEquals("/", simplifyPath.simplifyPath(input));
    }

}
