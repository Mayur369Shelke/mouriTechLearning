import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Documented
@Retention(RUNTIME)
@Target(METHOD)
@Inherited
/**
 * 
 */

/**
 * @author mayurs
 *
 */
public @interface customAnnotation {
	// only use for to give extra information to compiler

	int salary() default 10000;
	String roll() default "Jr software developer";
}
