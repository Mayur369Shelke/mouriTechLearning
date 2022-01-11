import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class TeatAnnotation {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		// TODO Auto-generated method stub
		annotationExample a = new annotationExample();
		Method m = a.getClass().getMethod("ankitInfo");
		
		customAnnotation ca = m.getAnnotation(customAnnotation.class);
		System.out.println("data supplied using annotation = " + ca.salary());
		System.out.println("data supplied using annotation = " + ca.roll());
		Annotation[] all = a.getClass().getAnnotations();
		System.out.println(all.toString());
		

	}

}
