package assemblyline;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class AssemblyLineStartupAlgorithmTest {
	private static final AssemblyLineStartupAlgorithm assemblyLineStartupAlgorithm = new AssemblyLineStartupAlgorithm();

	@Test
	void numberOfRunPLCs_correctValue() {
		assertEquals(2, assemblyLineStartupAlgorithm.countPLCsInRunMode(5, 5));
		assertEquals(27, assemblyLineStartupAlgorithm.countPLCsInRunMode(750, 750));
		assertEquals(33, assemblyLineStartupAlgorithm.countPLCsInRunMode(1100, 1100));
	}

}
