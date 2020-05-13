package assemblyline;

import plc.PLC;
import plc.PLCMode;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class AssemblyLineStartupAlgorithm {
	public Integer countPLCsInRunMode(Integer numberOfPLCs, Integer numberOfEmployees) {
		List<PLC> allPLCs = runAllPLCs(numberOfPLCs);

		IntStream.range(2, numberOfEmployees + 1).forEach(employeeIndex -> {
			IntStream.range(1, numberOfPLCs).forEach(plcIndex -> {
				if((plcIndex + 1)%employeeIndex == 0) allPLCs.get(plcIndex).changeMode();
			});
		});

		int cnt = 0;
		for(PLC x : allPLCs) {
			if(x.getPlcMode() == PLCMode.RUN) cnt++;
		}

		return cnt;
	}

	private List<PLC> runAllPLCs(Integer numberOfPLCs) {
		return Stream
				.generate(() -> new PLC(PLCMode.RUN))
				.limit(numberOfPLCs)
				.collect(Collectors.toList());
	}
}
