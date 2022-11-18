package Task2;

import Task2.service.impl.ApplianceServiceImplTest;
import Task2.service.validation.ValidatorTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@Suite.SuiteClasses({ApplianceServiceImplTest.class, ValidatorTest.class})
@RunWith(Suite.class)
public class TestSuite {
}

