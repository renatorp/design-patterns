package state.exemplo1;

public class PersistentState implements SessionState {

	static PersistentState intance = new PersistentState();
	
	@Override
	public void save(SessionContext context) {
	}

	@Override
	public void delete(SessionContext context) {
		context.changeState(TransientState.instance);
	}

	@Override
	public void evict(SessionContext context) {
		context.changeState(DetachedState.instance);
	}
	
	@Override
	public String toString() {
		return "PERSISTENT";
	}

}
