public class Activator implements BundleActivator  {
	
	private ServiceRegistration serviceRegistration;
	
    public void start(BundleContext context) throws Exception {
    	
    	serviceRegistration  = context.registerService(Example.class.getName(), new ExampleImpl(), null);	
    }
    
    public void stop(BundleContext context) throws Exception {

    	environmentServiceReg.unregister();
    }
    
}