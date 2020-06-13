package state.exemplo1;

public class HibernateClient {

	public static void main(String[] args) {
		HibernateSessionContext context = new HibernateSessionContext();
		
		context.save();
		context.delete();
		context.save();
		context.save();
		context.evict();
		context.delete();
		context.save();
		context.delete();
		context.evict();
	}

}
