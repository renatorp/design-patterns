package state.exemplo1;

public class DetachedState implements SessionState {

	static DetachedState instance = new DetachedState();
	
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
		return "DETACHED";
	}

}
