package state.exemplo1;

public interface SessionContext {
	SessionState getState();
	void changeState(SessionState state);
	
	void save();
	void delete();
	void evict();
}
