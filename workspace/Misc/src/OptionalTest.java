import java.util.Optional;


public class OptionalTest {

	public static void main(String[] args) {
		
		Optional<Long> val = Optional.ofNullable(123L);
		System.out.println(val.isPresent());
	}
}
