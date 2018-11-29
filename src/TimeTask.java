import java.lang.reflect.Method;

public class TimeTask implements Runnable {
    @Override
    public void run() {
        try {
            // 每次都创建出一个新的类加载器
            HotswapCL cl = new HotswapCL("./swap", new String[]{"Foo"});
            Class cls = cl.loadClass("Foo");
            Object foo = cls.newInstance();

            Method m = foo.getClass().getMethod("sayHello", new Class[]{});
            m.invoke(foo, new Object[]{});

        }  catch(Exception ex) {
            ex.printStackTrace();
        }
    }
}
