package exec.study.thread.demo;

/**
 * @author liul
 * @version 1.0 2019/10/18
 */
public class Test {

    static Object lock = new Object();

    public static void main(String[] args){
//        for (int  i=1;i<=10000;i++) {
//            final int num = i;
//            ThreadPoolManager.addBaseTask(() -> printNum(num));
//            ThreadPoolManager.addEmergencyTask(() -> printWord("aaaaaa" + num));
//        }

        ThreadPoolManager.addInTimeTask(() -> printWord("aaa"));
        printWord("bbb");
        ThreadPoolManager.addInTimeTask(() -> printWord("ccc"));
    }

    public static void printNum(int num){
        synchronized (lock){
            System.out.println(num);
            try{
                Thread.sleep(1000);
            }catch (Exception e) {

            }
        }
    }

    private static void printWord(String word){
        System.out.println(word);
    }
}
