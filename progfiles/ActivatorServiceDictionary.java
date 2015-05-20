public class Activator implements BundleActivator  {
	
	private ServiceRegistration serviceRegistration;
	
    public void start(BundleContext context) throws Exception {

    	Hashtable<String, String> dictionary = new Hashtable<String, String>();
        
        dictionary.put(Constants.SERVICE_DESCRIPTION, "This is a Bundle");
        dictionary.put("Name", "ExampleBundle");
        
    	serviceRegistration  = context.registerService(Example.class.getName(), new ExampleImpl(), dictionary);	
    }
    
    public void stop(BundleContext context) throws Exception {

    	environmentServiceReg.unregister();
    }
    
}