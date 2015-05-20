serviceReference = context.getServiceReferences(Example.class.getName(), "(Name=ExampleBundle)");
service          = (Example) context.getService(serviceReference[0]);