package state.exemplo1;

public interface SessionState {
	void save(SessionContext context);
	void delete(SessionContext context);
	void evict(SessionContext context);
}
