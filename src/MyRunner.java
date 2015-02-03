
import org.junit.runner.notification.RunNotifier;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.junit.runners.model.InitializationError;


public class MyRunner extends BlockJUnit4ClassRunner {
	public MyRunner(Class<?> cls) throws InitializationError {
		super(cls);
	}
	@Override
	public void run(RunNotifier notifier) {
		notifier.addListener(new MyListener());
		super.run(notifier);
	}
}
