import javax.swing.JOptionPane;

import org.junit.runner.Result;
import org.junit.runner.notification.RunListener;

/*
 * http://howtodoinjava.com/2012/12/12/how-to-add-listner-in-junit-testcases/
 * http://stackoverflow.com/questions/10537495/how-can-i-use-a-junit-runlistener-in-eclipse
 */
public class MyListener extends RunListener {
	@Override
	public void testRunFinished(Result result) throws Exception {
		int run = result.getRunCount();
		int failure = result.getFailureCount();
		int ignore = result.getIgnoreCount();
		String format = "テストが終わりました.%nテスト: %d, 失敗: %d, 無視: %d%n";
		String message = String.format(format, run, failure, ignore);
		JOptionPane.showMessageDialog(null, message);
	}
}