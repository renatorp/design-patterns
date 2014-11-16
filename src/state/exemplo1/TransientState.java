package state.exemplo1;

public class TransientState implements SessionState {

	static TransientState instance = new TransientState();
	
	@Override
	public void save(SessionContext context) {
		context.changeState(PersistentState.intance);
	}

	@Override
	public void delete(SessionContext context) {
	}

	@Override
	public void evict(SessionContext context) {
	}

	@Override
	public String toString() {
		return "TRANSIENT";
	}
}
