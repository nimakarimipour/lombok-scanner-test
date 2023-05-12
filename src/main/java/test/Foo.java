package test;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
public class Foo {
   @AllArgsConstructor
   @EqualsAndHashCode
   public static class Bar{

    private final String f0;
    private final String f1;
    private final String f2;

    public Bar(String f0){
        this.f0 = null;
        this.f1 = null;
        this.f2 = null;
    }

    public Bar(String f0, String f1){
        this.f0 = null;
        this.f1 = null;
        this.f2 = null;
    }
   }
}
