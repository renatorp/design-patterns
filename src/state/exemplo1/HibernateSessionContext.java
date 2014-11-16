package state.exemplo1;

public class HibernateSessionContext implements SessionContext{

	private SessionState state;
	
	public HibernateSessionContext() {
		state = TransientState.instance;
	}
	
	@Override
	public SessionState getState() {
		return state;
	}

	@Override
	public void changeState(SessionState state) {
		this.state = state;
		System.out.println("State set to " + state);
	}

	@Override
	public void save() {
		state.save(this);
	}

	@Override
	public void delete() {
		state.delete(this);
	}

	@Override
	public void evict() {
		state.evict(this);
	}

}
