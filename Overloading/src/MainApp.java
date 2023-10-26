import com.package1.BaseClass;
import com.package1.DerivedClass;
import com.package2.AnotherDerivedClass;

public class MainApp {
    public static void main(String[] args) {
        // Within the same package
        BaseClass baseObj = new BaseClass();
        baseObj.display(); // Output: BaseClass display method

        DerivedClass derivedObj = new DerivedClass();
        derivedObj.display(); // Output: DerivedClass display method

        // Across different packages
        AnotherDerivedClass anotherDerivedObj = new AnotherDerivedClass();
        anotherDerivedObj.display(); // Output: AnotherDerivedClass display method
    }
}
