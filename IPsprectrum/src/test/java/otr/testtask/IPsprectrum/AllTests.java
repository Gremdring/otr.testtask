package otr.testtask.IPsprectrum;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ ASpectrum.class, BSpectrum.class, CSpectrum.class, DefaulReverse.class, Default.class, EqualIPs.class,
		IncorrectInput.class, NonIPButInFormat.class })
public class AllTests {

}
