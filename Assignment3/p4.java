package Assignment3;

import java.lang.reflect.*;
class TestSubject {
    private String secretValue = "Initial";
    public int number = 10;
    public TestSubject() {}
    public TestSubject(String secretValue) {
        this.secretValue = secretValue;
    }
    public void publicAction() {
        System.out.println("Public action executed.");
    }
    private void hiddenAction() {
        System.out.println("Hidden action executed.");
    }
}
class p4{
    public static void main(String[] args) throws Exception {
        TestSubject instance = new TestSubject();
        Class<?> targetClass = instance.getClass();
        System.out.println(targetClass.getName());
        Method[] allPublicMethods = targetClass.getMethods();
    for (Method m : allPublicMethods) {
        System.out.println(m.getName());
    }
    Constructor<?>[] constructors = targetClass.getConstructors();
    for (Constructor<?> c : constructors) {
        System.out.println(c.getName() + " params: " + c.getParameterCount());
    }
    Method privateMethod = targetClass.getDeclaredMethod("hiddenAction");
    System.out.println(privateMethod.getName());
    Field privateField = targetClass.getDeclaredField("secretValue");
    System.out.println(privateField.getName());
    privateField.setAccessible(true);
    System.out.println(privateField.get(instance));
    privateField.set(instance, "Modified");
    System.out.println(privateField.get(instance));
    privateMethod.setAccessible(true);
    privateMethod.invoke(instance);
    }
}