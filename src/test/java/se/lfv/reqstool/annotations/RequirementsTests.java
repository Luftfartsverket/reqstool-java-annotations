// Copyright © LFV
package se.lfv.reqstool.annotations;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import java.lang.annotation.Annotation;
import org.junit.jupiter.api.Test;

class RequirementsTests {

	@Test
	void testOneRequirement() {

		Requirements requirements = new Requirements() {

			@Override
			public String[] value() {
				return new String[] { "VALUE" };
			}

			@Override
			public Class<? extends Annotation> annotationType() {
				return Requirements.class;
			}
		};

		assertThat(requirements.value()[0], is("VALUE"));
	}

	@Test
	void testMultipleRequirements() {

		Requirements requirements = new Requirements() {

			@Override
			public String[] value() {
				return new String[] { "VALUE1", "VALUE2" };
			}

			@Override
			public Class<? extends Annotation> annotationType() {
				return Requirements.class;
			}
		};

		assertThat(requirements.value(), is(new String[] { "VALUE1", "VALUE2" }));
	}

}
