package beans;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Owner {

	private final Cat cat;

	public Owner(@Qualifier("cat2") Cat cat) {
		this.cat = cat;
	}

	public Cat getCat() {
		return cat;
	}

	@Override
	public String toString() {
		return "Owner: {Cat: " + this.getCat().getName() + "}";
	}
}
