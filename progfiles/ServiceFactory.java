public class ExampleServiceFactory implements ServiceFactory {
	
    public Object getService(Bundle bundle, ServiceRegistration registration) {
  
        Example example = new ExampleImpl();
        
        return example;
    }
    
    
    public void ungetService(Bundle bundle, ServiceRegistration registration,Object service) {

    }
}