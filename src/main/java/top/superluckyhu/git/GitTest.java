package top.superluckyhu.git;

import java.util.UUID;

/**
 * @ClassName GitTest
 * @Description TODO
 * @Author Superluckyhu
 * @Date 2022/11/27 0:51
 * @Version 1.0
 **/
public class GitTest {
    public static void main(String[] args) {
        String uuId = UUID.randomUUID().toString();
        System.out.println(uuId);
        System.out.println("Hello Git!!!");
        System.out.println("switch version test!");
    }
}
