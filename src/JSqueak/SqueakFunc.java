package JSqueak;

import java.lang.annotation.*;

@Target({ElementType.METHOD})
@Retention(RetentionPolicy.SOURCE)
public @interface SqueakFunc {

    String name();
}
