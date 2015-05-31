public class RandomAgentServiceFactory implements ServiceFactory {
	
    private static final Logger logger = Logger.getLogger(RandomAgentServiceFactory.class.getSimpleName());
    private int usageCounter = 0;
    
    public Object getService(Bundle bundle, ServiceRegistration registration) {
     
        usageCounter++;
    	
        logger.log(Level.INFO,"Create object of RandomAgent for " + bundle.getSymbolicName());
        logger.log(Level.INFO,"Number of bundles using service " + usageCounter);
        
        Agent agent = new RandomAgent();
        
        return agent;
    }
    
    public void ungetService(Bundle bundle, ServiceRegistration registration,Object service) {
    
    	usageCounter--;
    	
        logger.log(Level.INFO,"Release object of RandomAgent for " + bundle.getSymbolicName());
        logger.log(Level.INFO,"Number of bundles using service " + usageCounter;
    }
}